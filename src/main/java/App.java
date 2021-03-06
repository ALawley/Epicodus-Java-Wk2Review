import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      model.put("template", "templates/word-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/words", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      String word = request.queryParams("word");
      Word newWord = new Word(word);
      model.put("words", Word.all());

      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      model.put("words", Word.all());

      model.put("template", "templates/words.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/:id", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);

      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


    get("/words/:id/definitions/new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      Word word = Word.find(Integer.parseInt(request.params(":id")));
      model.put("word", word);

      model.put("template", "templates/definition-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/definition-new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      String meaning = request.queryParams("definition");
      String part = request.queryParams("part");
      String sentence = request.queryParams("sentence");
      Sentence newSentence = new Sentence(sentence);
      Word word = Word.find(Integer.parseInt(request.queryParams("wordId")));
      Definition newDefinition = new Definition(meaning, part);
      newDefinition.addSentence(newSentence);
      Word.find(word.getId()).addDefinition(newDefinition);
      model.put("word", word);

      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/words/:id/:id2/sentences/new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      Word word = Word.find(Integer.parseInt(request.params(":id")));
      Definition definition =Definition.find(Integer.parseInt(request.params(":id2")));
      model.put("word", word);
      model.put("definition", definition);

      model.put("template", "templates/sentence-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/sentence-new", (request,response) -> {
      HashMap<String,Object> model = new HashMap<String,Object>();

      String sentence = request.queryParams("sentence");
      Sentence newSentence = new Sentence(sentence);
      Word word = Word.find(Integer.parseInt(request.queryParams("wordId")));
      Definition definition = Definition.find(Integer.parseInt(request.queryParams("definitionId")));
      Definition.find(definition.getId()).addSentence(newSentence);
      model.put("word", word);

      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }


}

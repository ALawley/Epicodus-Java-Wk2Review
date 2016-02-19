import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Definition testDefinition = new Definition("test", "noun", "This is a sentence");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithMeaning() {
    Definition testDefinition = new Definition("test", "noun", "This is a sentence");
    assertEquals("test", testDefinition.getMeaning());
  }

  @Test
  public void definition_instantiatesWithPartofSpeech() {
    Definition testDefinition = new Definition("test", "noun", "This is a sentence");
    assertEquals("noun", testDefinition.getPart());
  }

  @Test
  public void definition_instantiatesWithSentence() {
    Definition testDefinition = new Definition("test", "noun", "This is a sentence");
    assertEquals("This is a sentence", testDefinition.getSentence());
  }

}

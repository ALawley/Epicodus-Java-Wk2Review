import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getMeaning_returnsMeaning_test() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals("test", testDefinition.getMeaning());
  }

  @Test
  public void getPart_returnsPartofSpeech_noun() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals("noun", testDefinition.getPart());
  }

  @Test public void all_returnsAllDefinitions() {
    Definition testDefinition = new Definition("test", "noun");
    Definition testDefinition2 = new Definition("testing", "verb");
    assertTrue(Definition.all().contains(testDefinition));
    assertTrue(Definition.all().contains(testDefinition2));
  }

  @Test
  public void getId_returnsIdOfDefinition_id() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals(Definition.all().size(), testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionBasedOffId_testDefinition() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals(testDefinition, Definition.find(testDefinition.getId()));
  }
  @Test
  public void find_throwsExceptionWhenIdOutOfBounds_null() {
    Definition testDefinition = new Definition("test", "noun");
    assertTrue(Definition.find(999) == null);
  }
  @Test
  public void clear_clearsAllDefinitions() {
    Definition testDefinition = new Definition("test", "noun");
    Definition testDefinition2 = new Definition("testing", "verb");
    Definition.clear();
    assertEquals(0, Definition.all().size());
  }

  @Test
  public void getSentences_initiallyReturnsEmptyArrayList() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals(true, testDefinition.getSentences() instanceof ArrayList);
  }

  @Test
  public void addSentence_addSentenceObjectToSentenceArrayList() {
    Definition testDefinition = new Definition("test", "noun");
    Sentence testSentence = new Sentence("This is a test");
    testDefinition.addSentence(testSentence);
    assertTrue(testDefinition.getSentences().contains(testSentence));
  }
}

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void getMeaning_returnsMeaning_test() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals("test", testDefinition.getMeaning());
  }

  @Test
  public void getPart_returnsPartofSpeech_noun() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals("noun", testDefinition.getPart());
  }

  @Test
  public void getSentence_returnsSentence_thisIsATest() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals("This is a test", testDefinition.getSentence());
  }

  @Test public void all_returnsAllDefinitions() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    Definition testDefinition2 = new Definition("testing", "verb", "I am testing this");
    assertTrue(Definition.all().contains(testDefinition));
    assertTrue(Definition.all().contains(testDefinition2));
  }

  @Test
  public void getId_returnsIdOfDefinition_id() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals(Definition.all().size(), testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionBasedOffId_testDefinition() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertEquals(testDefinition, Definition.find(testDefinition.getId()));
  }
  @Test
  public void find_throwsExceptionWhenIdOutOfBounds_null() {
    Definition testDefinition = new Definition("test", "noun", "This is a test");
    assertTrue(Definition.find(999) == null);
  }
}

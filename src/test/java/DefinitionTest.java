import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithMeaning() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals("test", testDefinition.getMeaning());
  }

  @Test
  public void definition_instantiatesWithPart() {
    Definition testDefinition = new Definition("test", "noun");
    assertEquals("noun", testDefinition.getPart());
  }
}

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void word_instantiatesCorrectly() {
    Word testWord = new Word("test");
    assertEquals(true, testWord instanceof Word);
  }
  
  @Test
  public void word_instantiatesWithName() {
    Word testWord = new Word("test");
    assertEquals("test", testWord.getWord());
  }
}

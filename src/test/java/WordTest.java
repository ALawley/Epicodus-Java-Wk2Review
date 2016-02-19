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

  @Test
  public void all_returnsAllWords() {
    Word testWord = new Word("test");
    Word testWord2 = new Word("test2");
    assertEquals(2, Word.all().size());
  }
}

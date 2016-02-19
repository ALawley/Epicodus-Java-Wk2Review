import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

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

  @Test
  public void getId_returnsIdNumberofWord_2() {
    Word testWord = new Word("test");
    Word testWord2 = new Word("test2");
    assertEquals(Word.all().size(), testWord2.getId());
  }

  @Test
  public void find_returnsWordWithMatchingId_testWord() {
    Word testWord = new Word("test");
    assertEquals(testWord, Word.find(testWord.getId()));
  }

  @Test
  public void find_throwsExceptionWhenIdOutOfBounds_null_testWord() {
    Word testWord = new Word("test");
    assertTrue(Word.find(999) == null);
  }

  @Test
  public void clear_clearsAllWords() {
    Word testWord = new Word("test");
    Word testWord2 = new Word("test2");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

  @Test public void getDefinitions_initiallyReturnsEmptyArrayList() {
    Word testWord = new Word("test");
    assertEquals(true, testWord.getDefinitions() instanceof ArrayList);
  }
}

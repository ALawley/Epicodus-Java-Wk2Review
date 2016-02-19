import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SentenceTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly() {
    Sentence testSentence = new Sentence("This is a test");
    assertEquals(true, testSentence instanceof Sentence);
  }

  @Test
  public void getSentence_returnsSentence_thisIsATest() {
    Sentence testSentence = new Sentence("This is a test");
    assertEquals("This is a test", testSentence.getSentence());
  }

  @Test public void all_returnsAllSentences() {
    Sentence testSentence = new Sentence("This is a test");
    Sentence testSentence2 = new Sentence("I am testing this");
    assertTrue(Sentence.all().contains(testSentence));
    assertTrue(Sentence.all().contains(testSentence2));
  }

  @Test
  public void getId_returnsIdOfSentence_id() {
    Sentence testSentence = new Sentence("This is a test");
    assertEquals(Sentence.all().size(), testSentence.getId());
  }

  @Test
  public void find_returnsSentenceBasedOffId_testSentence() {
    Sentence testSentence = new Sentence("This is a test");
    assertEquals(testSentence, Sentence.find(testSentence.getId()));
  }
  @Test
  public void find_throwsExceptionWhenIdOutOfBounds_null() {
    Sentence testSentence = new Sentence("This is a test");
    assertTrue(Sentence.find(999) == null);
  }
  @Test
  public void clear_clearsAllSentences() {
    Sentence testSentence = new Sentence("This is a test");
    Sentence testSentence2 = new Sentence("I am testing this");
    Sentence.clear();
    assertEquals(0, Sentence.all().size());
  }
}

import java.util.ArrayList;

public class Sentence {
  private static ArrayList<Sentence> instances = new ArrayList<Sentence>();
  private String mSentence;
  private int mId;

  public Sentence(String sentence) {
    mSentence = sentence;
    instances.add(this);
    mId = instances.size();
  }

  public String getSentence() {
    return mSentence;
  }

  public static ArrayList<Sentence> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Sentence find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}

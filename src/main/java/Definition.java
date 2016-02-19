import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mMeaning;
  private String mPart;
  private int mId;
  private ArrayList<Sentence> mSentences;

  public Definition(String meaning, String part) {
    mMeaning = meaning;
    mPart = part;
    instances.add(this);
    mId = instances.size();
    mSentences = new ArrayList<Sentence>();
  }

  public String getMeaning() {
    return mMeaning;
  }

  public String getPart() {
    return mPart;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

  public ArrayList<Sentence> getSentences() {
    return mSentences;
  }

  public void addSentence(Sentence sentence) {
    mSentences.add(sentence);
  }
}

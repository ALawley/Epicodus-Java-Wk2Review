import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances  = new ArrayList<Word>();
  private String mName;
  private int mId;

  public Word(String word) {
    mName = word;
    instances.add(this);
    mId = instances.size();
  }

  public String getWord() {
    return mName;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }
}

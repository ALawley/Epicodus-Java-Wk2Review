import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances  = new ArrayList<Word>();
  private String mName;

  public Word(String word) {
    mName = word;
    instances.add(this);
  }

  public String getWord() {
    return mName;
  }

  public static ArrayList<Word> all() {
    return instances;
  }
}

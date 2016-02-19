import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mMeaning;
  private String mPart;
  private String mSentence;

  public Definition(String meaning, String part, String sentence) {
    mMeaning = meaning;
    mPart = part;
    mSentence = sentence;
    instances.add(this);
  }

  public String getMeaning() {
    return mMeaning;
  }

  public String getPart() {
    return mPart;
  }

  public String getSentence() {
    return mSentence;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }
}

import java.util.ArrayList;

public class Definition {
  private String mMeaning;
  private String mPart;
  private String mSentence;

  public Definition(String meaning, String part, String sentence) {
    mMeaning = meaning;
    mPart = part;
    mSentence = sentence;
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
}

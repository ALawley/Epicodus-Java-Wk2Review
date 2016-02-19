import java.util.ArrayList;

public class Definition {
  private String mMeaning;
  private String mPart;

  public Definition(String meaning, String part) {
    mMeaning = meaning;
    mPart = part;
  }

  public String getMeaning() {
    return mMeaning;
  }

  public String getPart() {
    return mPart;
  }
}

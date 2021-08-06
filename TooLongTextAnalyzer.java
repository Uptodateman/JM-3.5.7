package Ex3dot5dot7;

//АНТИПРОСТЫНЬ
public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;
    public TooLongTextAnalyzer (int maxLength) {
        this.maxLength = maxLength;
    }
    public Label processText(String text) {
        return (text.length() > maxLength) ? Label.TOO_LONG : Label.OK;
    }
}
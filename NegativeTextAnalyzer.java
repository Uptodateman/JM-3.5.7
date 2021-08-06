package Ex3dot5dot7;

//АНТИГРУСТЬ
public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    public NegativeTextAnalyzer () {
        this.keywords = new String[]{":(", "=(", ":|"};
    }
    protected String[] getKeywords() {
        return keywords;
    }
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}

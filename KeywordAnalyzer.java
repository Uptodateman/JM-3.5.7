package Ex3dot5dot7;

//КЛАСС-ПРЕДОК ДЛЯ АНТИСПАМ И АНТИГРУСТЬ
public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private String[] keywords={ ":(" ,"=(" ,":|"};
    public NegativeTextAnalyzer() {
    }

    @Override
    public Label processText(String text) {

        return Label.NEGATIVE_TEXT;
    }
}

public class SpamAnalyzer extends KeywordAnalyzer {
//    private String[] keywords;
//
//    public String[] getKeywords() {
//        return keywords;
//    }

    SpamAnalyzer (String[] keywords){

    }

    @Override
    public Label processText(String text) {
        return Label.SPAM;
    }
}

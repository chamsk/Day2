/**
 * Created by Kor on 17.10.2018.
 */
public class SpamAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer {

    private String[] words;

    public SpamAnalyzer(String[] words) {
        this.words = words;
    }

    @Override
    public String[] getKeywords() {
        return new String[0];
    }

    @Override
    public Label getLabel() {
                       return null;
    }

    @Override
    public Label processText(String text) {
        for(String word : words){
            if(text.contains(word)){
                return Label.SPAM;
            }
        }
        return Label.OK;
    }
}

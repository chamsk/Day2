package task2;

/**
 * Created by Kor on 17.10.2018.
 */
public class SpamAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer {

    private String[] words;
    private Label label;

    public SpamAnalyzer(String[] words) {
        this.words = words;
    }

    @Override
    public String[] getKeywords() {
        return words;
    }

    @Override
    public Label getLabel() {
       return label;
    }

    @Override
    public Label processText(String text) {
        label = Label.OK;
        for(String word : words){
            if(text.contains(word)){
                label = Label.SPAM;
            }
        }
        return label;
    }
}

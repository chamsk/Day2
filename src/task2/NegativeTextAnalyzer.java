package task2;

/**
 * Created by Kor on 17.10.2018.
 */
public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer{
    String[] words = {":(","=(",":|"};
    private Label label;
    @Override
    public Label processText(String text) {
        label = Label.OK;
        for(String s : words){
            if(text.contains(s)){
                label = Label.NEGATIVE_TEXT;
            }
        }
        return label;
    }

    @Override
    public String[] getKeywords() {
        return words;
    }

    @Override
    public Label getLabel() {
        return label;
    }
}

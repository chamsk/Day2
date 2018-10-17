/**
 * Created by Kor on 17.10.2018.
 */
public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer implements TextAnalyzer{
    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    public String[] getKeywords() {
        return new String[0];
    }

    @Override
    public Label getLabel() {
        return null;
    }
}

package task2;

/**
 * Created by Kor on 17.10.2018.
 */
public class TooLongTextAnalyzer implements TextAnalyzer {
    private int len;

    public TooLongTextAnalyzer(int len) {
        this.len = len;
    }

    @Override
    public Label processText(String text) {
        Label a = Label.OK;
        if(text.length()>len){
            a = Label.TOO_LONG;
        }
        return a;
    }


}

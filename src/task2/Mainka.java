package task2;

/**
 * Created by Kor on 17.10.2018.
 */
public class Mainka {
    public static void main(String[] args) {


        TextAnalyzer spamAnalyzer = new SpamAnalyzer(new String[]{"спам","spam"});
        System.out.println(spamAnalyzer.processText("жил да был\n" +
                "старик со старухой\n" +
                "и было у них"));
        System.out.println(spamAnalyzer.processText("жил да был\n" +
                "старик со старухой\n" +
                "и было у них спам"));

        TextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        System.out.println(negativeTextAnalyzer.processText("жил да был\n" +
                "старик со старухой\n" +
                "и было у них"));
        System.out.println(negativeTextAnalyzer.processText("жил да был\n" +
                ":( со старухой\n" +
                "и было у них"));

        TextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(24);
        System.out.println(tooLongTextAnalyzer.processText("жил да был\n" +
                "старик со старухой\n" +
                "и было у них"));
        System.out.println(tooLongTextAnalyzer.processText("жил да был\n" +
                "и было у них"));



    }
}

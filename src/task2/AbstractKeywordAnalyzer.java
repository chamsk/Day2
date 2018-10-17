package task2;

/**
 * Created by Kor on 17.10.2018.
 */
public abstract class AbstractKeywordAnalyzer {
    public abstract String[] getKeywords(); //возвращает набор ключевых слов для анализа
    public abstract Label getLabel(); //возвращает метку, в случае, если р-тат анализа положительный
    public Label processText(){
        return getLabel();
    }
}

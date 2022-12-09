import java.util.HashSet;

public class WordsChecker {
    HashSet<String> allWord = new HashSet<>();
    private String text;

    public WordsChecker(String text) {
        this.text = text;
        String[] textToArr = text.split("\\P{IsAlphabetic}+");
        for (String wordAll : textToArr) {
            this.allWord.add(wordAll);
        }
    }

    public boolean hasWord(String word) {
        return this.allWord.contains(word);
    }

}

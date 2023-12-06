import java.util.ArrayList;
import java.util.List;

public class Word{
    private final List<Letter> letters;

    Word(String wordStr) {
        letters = new ArrayList<>();
        for (char ch : wordStr.toCharArray()) {
            letters.add(new Letter(ch));
        }
    }

    public List<Letter> getLetters() {
        return letters;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getCharacter());
        }
        return sb.toString();
    }
}
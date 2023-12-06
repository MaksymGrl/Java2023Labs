import java.util.ArrayList;
import java.util.List;

public class Text {
    private final List<Sentence> sentences;

    Text(String textStr) {
        sentences = new ArrayList<>();
        String[] sentenceStrs = textStr.split("\\.");
        for (String sentenceStr : sentenceStrs) {
            sentences.add(new Sentence(sentenceStr));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString()).append(". ");
        }
        return sb.toString().trim();
    }
}
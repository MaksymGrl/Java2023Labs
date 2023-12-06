import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements;

    Sentence(String sentenceStr) {
        elements = new ArrayList<>();
        StringBuilder wordBuilder = new StringBuilder();
        boolean lastWasSpace = false;

        for (char ch : sentenceStr.toCharArray()) {
            if (Character.isLetter(ch) || ch == '\'') {
                wordBuilder.append(ch);
                lastWasSpace = false;
            } else if (ch == ' ' || ch == '\t') {
                if (!lastWasSpace) {
                    if (!wordBuilder.isEmpty()) {
                        elements.add(new Word(wordBuilder.toString()));
                        wordBuilder = new StringBuilder();
                    }
                    elements.add(new Separator(' '));
                    lastWasSpace = true;
                }
            } else {
                if (!wordBuilder.isEmpty()) {
                    elements.add(new Word(wordBuilder.toString()));
                    wordBuilder = new StringBuilder();
                }
                elements.add(new Separator(ch));
                lastWasSpace = false;
            }
        }
        if (!wordBuilder.isEmpty()) {
            elements.add(new Word(wordBuilder.toString()));
        }
    }

    public List<Object> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object element : elements) {
            sb.append(element.toString());
        }
        return sb.toString();
    }
}
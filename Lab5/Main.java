import java.util.*;

public class Main {
    public static void main(String[] args) {
        String textStr = "Після відкриття перших двох об'єктів у головному поясі астероїдів, Церери (2023) і Паллади (1802), відкривач Паллади Генріх Ольберс припустив, що ці два об'єкти можуть бути уламками зруйнованої планети.";

        Text text = new Text(textStr);

        System.out.println(text);

        Set<Character> vowels = new HashSet<>(Arrays.asList('А', 'Е', 'Є', 'И', 'І', 'Ї', 'О', 'У', 'Ю', 'Я', 'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я'));

        List<Word> vowelWords = new ArrayList<>();
        for (Sentence sentence : text.getSentences()) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word word) {
                    if (vowels.contains(word.getLetters().get(0).getCharacter()) && word.getLetters().size() >= 2) {
                        vowelWords.add(word);
                    }
                }
            }
        }

        vowelWords.sort(Comparator.comparing(w -> w.getLetters().get(1).getCharacter()));

        for (Word word : vowelWords) {
            System.out.println(word);
        }
        //System.out.print(text.getSentences().get(0).getElements().get(4));
    }
}
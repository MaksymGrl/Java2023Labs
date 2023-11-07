import java.util.*;

public class Lab3 {
	public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Після відкриття перших двох об'єктів у головному поясі астероїдів, Церери (2023) і Паллади (1802), відкривач Паллади Генріх Ольберс припустив, що ці два об'єкти можуть бути уламками зруйнованої планети.");

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                str.deleteCharAt(i);
            } else {
                str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }

        Set<Character> vowels = new HashSet<>(Arrays.asList('а', 'я', 'у', 'ю', 'е', 'є', 'и', 'ї', 'і', 'о'));

        List<StringBuilder> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ' || i == str.length() - 1) {
                if (currentWord.length() > 1 && vowels.contains(currentWord.charAt(0))) {
                    words.add(new StringBuilder(currentWord));
                }
                currentWord.setLength(0); 
            } else {
                currentWord.append(currentChar);
            }
        }


        words.sort((sb1, sb2) -> Character.compare(sb1.charAt(1), sb2.charAt(1)));


        for (StringBuilder word : words) {
            System.out.println(word.toString());
        }
    }
}

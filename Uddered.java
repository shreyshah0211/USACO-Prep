import java.util.*;
public class Uddered {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        String alphabet = r.next();
        Character[] characters = new Character[alphabet.length()];

        for (int i = 0; i < alphabet.length(); i++) {
            characters[i] = alphabet.charAt(i);
        }

        String word = r.next();

        Character[] wordChar = new Character[word.length()];

        for (int i = 0; i < word.length(); i++) {
            wordChar[i] = word.charAt(i);
        }

        int[] wordIndex = new int[word.length()];

        for (int i = 0; i < wordChar.length; i++) {
            for (int j = 0; j < characters.length; j++) {
                if (characters[j] == wordChar[i]) {
                    wordIndex[i] = j;
                }
            }
        }
        int count = 1;
        for (int i = 0; i < wordIndex.length - 1; i++) {
            if (wordIndex[i] >= wordIndex[i + 1]) {
                count++;
            }
        }

        System.out.println(count);

    }
}

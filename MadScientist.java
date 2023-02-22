import java.util.*;
import java.io.*;

public class MadScientist {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(new File("breedflip.in"));
        PrintWriter pw = new PrintWriter("breedflip.out");

        int cows = r.nextInt();
        Character[] charactersA = new Character[cows];
        Character[] charactersB = new Character[cows];

        String A = r.next();
        for (int i = 0; i < cows; i++) {
            charactersA[i] = A.charAt(i);
        }

        String B = r.next();
        for (int i = 0; i < cows; i++) {
            charactersB[i] = B.charAt(i);
        }

        int[] mapper = new int[cows];
        for (int i = 0; i < cows; i++) {
            if (charactersB[i] != charactersA[i]) {
                mapper[i] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < cows; i++) {
            if (mapper[i] == 1) {
                for (int j = i + 1; j < mapper.length; j++) {
                    if (mapper[j] == 1) {
                         i = j + 1;
                    }
                    else {
                        break;
                    }
                }
                count++;
            }
        }

        pw.println(count);
        pw.close();
    }
}

import java.util.*;
import java.io.*;
public class WordProcessor {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(new File("word.in"));
        PrintWriter pw = new PrintWriter("word.out");

        int N = r.nextInt();
        int K = r.nextInt();

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = r.next();
        }


        int[] lengths = new int[N];
        for (int i = 0; i < N; i++) {
            lengths[i] = words[i].length();
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int count = lengths[i];
            for (int j = i + 1; j < N; j++) {
                if (count + lengths[j] > K) {
                    arrayList.add(j);
                    break;
                }
                else {
                    count += lengths[j];
                    i = j;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            boolean on = false;
            for (int j = 0; j < arrayList.size(); j++) {
                if (i == arrayList.get(j) - 1) {
                    on = true;
                }
            }
            if (on) {
                pw.print(words[i]);
                pw.println();
            }
            else if (i + 1 == N) {
                pw.print(words[i]);
            }
            else {
                pw.print(words[i] + " ");
            }

        }
        pw.close();








    }
}

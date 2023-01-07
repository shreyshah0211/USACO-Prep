import java.util.*;
import java.io.*;
public class Signal {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(new File("cowsignal.in"));
        PrintWriter pw = new PrintWriter("cowsignal.out");

        int M = r.nextInt();
        int N = r.nextInt();
        int K = r.nextInt();
        r.nextLine();
        String result = "";
        for (int i = 0; i < M; i++) {
            String temp = r.nextLine();
            for (int j = 0; j < K; j++) {
                for (int z = 0; z < N; z++) {
                    for (int a = 0; a < K; a++) {
                        result += temp.charAt(z);
                    }
                }
                result += "\n";
            }
        }
        pw.println(result);
        pw.close();
    }
}

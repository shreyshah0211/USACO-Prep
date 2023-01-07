import java.io.*;
import java.util.*;
public class ShellGame {
    public static void main(String[] main) throws IOException {
        Scanner r = new Scanner(new File("shell.in")); 
        PrintWriter pw = new PrintWriter("shell.out");
        int swaps = r.nextInt();
        boolean[] opt1 = {true, false, false};
        boolean[] opt2 = {false, true, false};
        boolean[] opt3 = {false, false, true};

        int cor1 = 0;
        int cor2 = 0;
        int cor3 = 0;

        for (int i = 0; i < swaps; i++) {
            int a = r.nextInt() - 1;
            int b = r.nextInt() - 1;
            int g = r.nextInt() - 1;
            boolean temp1 = opt1[a];
            boolean temp2 = opt2[a];
            boolean temp3 = opt3[a];
            opt1[a] = opt1[b];
            opt2[a] = opt2[b];
            opt3[a] = opt3[b];
            opt1[b] = temp1;
            opt2[b] = temp2;
            opt3[b] = temp3;
            if (opt1[g]) {
                cor1++;
            }
            if (opt2[g]) {
                cor2++;
            }
            if (opt3[g]) {
                cor3++;
            }
        }
        int max = 0;
        if (cor1 > cor2 && cor1 > cor3) {
            max = cor1;
        }
        if (cor2 > cor1 && cor2 > cor3) {
            max = cor2;
        }
        if (cor3 >= cor2 && cor3 > cor1) {
            max = cor3;
        }
        pw.println(max);
        pw.close();
    }
}

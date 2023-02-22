import java.util.*;
public class Daisy {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int N = r.nextInt();

        int[] daisy = new int[N];
        for (int i = 0; i < N; i++) {
            daisy[i] = r.nextInt();
        }

        int chains = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = i; j <= N; j++) {
                int count = 0;
                for (int k = i; k <= j; k++) {
                    count += daisy[k - 1];
                }
                if ((j - i) == 0) {
                    chains++;
                }
                else if (count % (j - i + 1) != 0) {
                    count = 0;
                }
                else {
                    count = count/(j - i + 1);
                    boolean on = false;
                    for (int e = i; e <= j; e++) {
                        if (daisy[e - 1] == count) {
                            on = true;
                        }
                    }
                    if (on) {
                        chains++;
                    }
                }
            }
        }

        System.out.println(chains);

    }
}

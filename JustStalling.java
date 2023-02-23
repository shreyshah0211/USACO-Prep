import java.util.*;
import java.lang.*;

public class JustStalling {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int cows = r.nextInt();

        long[] cowsHeight = new long[cows];

        for (int i = 0; i < cows; i++) {
            cowsHeight[i] = -r.nextLong();
        }

        long[] stallHeight = new long[cows];

        for (int i = 0; i < cows; i++) {
            stallHeight[i] = r.nextLong();
        }

        int[] above = new int[cows];
        Arrays.sort(cowsHeight);

        for (int i = 0; i < cows; i++) {
            cowsHeight[i] = -cowsHeight[i];
        }
        for (int i = 0; i < cows; i++) {
            int count = 0;
            for (int j = 0; j < cows; j++) {
                if (cowsHeight[i] <= stallHeight[j]) {
                    count++;
                }
            }
            above[i] = count - i;
        }

        long result = 1;
        for (int i = 0; i < cows; i++) {
            result *= above[i];
        }
        System.out.println(result);

    }
}
import java.util.*;
import java.io.*;

//perfect solution to USACO December 2022 Problem 1

public class CollageII {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        int N = r.nextInt();
        long[] cows = new long[N];

        for (int i = 0; i < N; i++) {
            cows[i] = r.nextInt();
        }
        Arrays.sort(cows);


        long maxRev = 0;
        long maxValue = 0;
        for (int i = 0; i < cows.length; i++) {
            long tempRev = cows[i] * (cows.length - i);
            if (tempRev > maxRev) {
                maxRev = tempRev;
                maxValue = cows[i];
            }
        }

        System.out.println(maxRev + " " + maxValue);


    }
}

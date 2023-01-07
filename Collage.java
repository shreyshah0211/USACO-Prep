import java.util.*;
import java.io.*;
//USACO 2022 December Problem 1 Half-Solution

public class College {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        int N = r.nextInt();
        int[] cows = new int[N];

        for (int i = 0; i < N; i++) {
            cows[i] = r.nextInt();
        }
        int maxPay = 0;
        for (int i = 0; i <  cows.length; i++) {
            if (cows[i] > maxPay) {
                maxPay = cows[i];
            }
        }


        int[] possVal = new int[100000000];
        int temp = 0;
        for (int i = 0; i < maxPay; i++) {
            temp = 0;
            for (int j = 0; j < cows.length; j++) {
                if (cows[j] >= i) {
                    temp += i;
                }
            }
            possVal[i] = temp;
        }

        int max = 0;
        int maxPrice = 0;
        for (int i = 0; i < possVal.length; i++) {
            if (possVal[i] > max) {
                max = possVal[i];
                maxPrice = i;
            }
        }

        System.out.println(max + " " + maxPrice);

    }
}

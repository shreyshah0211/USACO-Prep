import java.util.*;
import java.io.*;
public class Billboard {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(new File("billboard.in"));
        PrintWriter pw = new PrintWriter("billboard.out");

        //billboard 1
        int bx1 = r.nextInt() + 1000;
        int by1 = r.nextInt() + 1000;
        int bx2 = r.nextInt() + 1000;
        int by2 = r.nextInt() + 1000;

        //billboard 2
        int b2x1 = r.nextInt() + 1000;
        int b2y1 = r.nextInt() + 1000;
        int b2x2 = r.nextInt() + 1000;
        int b2y2 = r.nextInt() + 1000;

        //truck
        int tx1 = r.nextInt() + 1000;
        int ty1 = r.nextInt() + 1000;
        int tx2 = r.nextInt() + 1000;
        int ty2 = r.nextInt() + 1000;

        int[][] map = new int[2000][2000];

        //mapping billboard 1
        for (int i = bx1; i < bx2; i++) {
            for (int j = by1; j < by2; j++) {
                map[j][i] = 1;
            }
        }


        //mapping billboard 2
        for (int i = b2x1; i < b2x2; i++) {
            for (int j = b2y1; j < b2y2; j++) {
                map[j][i] = 1;
            }
        }

        //mapping truck
        for (int i = tx1; i < tx2; i++) {
            for (int j = ty1; j < ty2; j++) {
                map[j][i] = 0;
            }
        }

        int result = 0;
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                result += map[j][i];
            }
        }

        pw.println(result);
        pw.close();
    }
}

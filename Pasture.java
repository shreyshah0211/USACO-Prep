import java.util.*;
import java.io.*;

public class Pasture {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(new File("square.in"));
        PrintWriter pw = new PrintWriter("square.out");

        //sqaure 1
        int sx1 = r.nextInt();
        int sy1 = r.nextInt();
        int sx2 = r.nextInt();
        int sy2 = r.nextInt();

        //square 2
        int s2x1 = r.nextInt();
        int s2y1 = r.nextInt();
        int s2x2 = r.nextInt();
        int s2y2 = r.nextInt();



        int largex = Math.max(sx2, s2x2);
        int smallx = Math.min(sx1, s2x1);
        int diff = largex - smallx;


        int largey = Math.max(sy2, s2y2);
        int smally = Math.min(sy1, s2y1);
        int diffH = largey - smally;

        int result = Math.max(diff, diffH); 



        pw.println(result*result);
        pw.close();
    }
}

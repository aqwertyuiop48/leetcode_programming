import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.next());
        double best = 1e18; int ba = 1, bb = 1;
        for (int a = 1; a <= 10; a++) for (int b = 1; b <= 10; b++) {
            double f = (double) a * b / Math.sqrt((double) a * a + 4.0 * b * b);
            double e = Math.abs(f - x);
            if (e < best - 1e-9 || (e < best + 1e-9 && a > ba)) { best = e; ba = a; bb = b; }
        }
        System.out.println(ba + " " + bb);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long c = s.nextLong(), d = s.nextLong(), n = s.nextLong(), m = s.nextLong(), k = s.nextLong();
        long need = Math.max(0, n * m - k);
        long best = Long.MAX_VALUE;
        for (long a = 0; a <= need / n + 1; a++) {
            long rem = Math.max(0, need - a * n);
            best = Math.min(best, a * c + rem * d);
        }
        System.out.println(best);
    }
}

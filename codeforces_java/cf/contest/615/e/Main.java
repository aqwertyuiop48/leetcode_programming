import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long n
            ? (n == 0 ? "0 0"
                : (Long) LongStream.rangeClosed(Math.max(1L, (long) Math.sqrt(n / 3.0) - 3), (long) Math.sqrt(n / 3.0) + 3).filter(k -> 3 * k * (k + 1) >= n).findFirst().getAsLong() instanceof Long k
                && Long.valueOf(n - 3 * k * (k - 1) - 1) instanceof Long t && Integer.valueOf((int) (t / k)) instanceof Integer e && Long.valueOf(t % k + 1) instanceof Long j
                ? (new long[]{2 * k, k, -k, -2 * k, -k, k}[e] + j * new long[]{-1, -2, -1, 1, 2, 1}[e]) + " " + (new long[]{0, 2 * k, 2 * k, 0, -2 * k, -2 * k}[e] + j * new long[]{2, 0, -2, -2, 0, 2}[e]) : "") : "");
    }
}

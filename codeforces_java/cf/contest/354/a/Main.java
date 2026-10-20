import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long l && Long.valueOf(s.nextLong()) instanceof Long r
            && Long.valueOf(s.nextLong()) instanceof Long ql && Long.valueOf(s.nextLong()) instanceof Long qr
            && new long[n + 1] instanceof long[] P && IntStream.range(0, n).allMatch(i -> (P[i + 1] = P[i] + s.nextLong()) > 0)
            ? IntStream.rangeClosed(0, n).mapToLong(k -> l * P[k] + r * (P[n] - P[k]) + (k > n - k ? (k - (n - k) - 1) * ql : n - k > k ? ((n - k) - k - 1) * qr : 0)).min().getAsLong() : "");
    }
}

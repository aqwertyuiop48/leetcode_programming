import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer N
            ? 3 * IntStream.rangeClosed(m + 1, n - m).parallel().mapToLong(t1 -> IntStream.rangeClosed(m + 1, n - m).mapToLong(t2 -> Long.valueOf((long) (N - t1) * (N - t1) + (long) t2 * t2 - (long) (N - t1) * t2) instanceof Long D
                    && Long.valueOf(t1 - (N - t2) - 2L * N) instanceof Long B
                    && Long.valueOf((long) (N - t2) * (N - t2) + (long) N * N + (long) t1 * t1 - (long) N * t1 - D) instanceof Long C
                    && Long.valueOf(B * B - 8 * C) instanceof Long disc && disc > 0
                    && Long.valueOf((long) Math.sqrt(disc - 1)) instanceof Long s0
                    && Long.valueOf(s0 * s0 > disc - 1 ? s0 - 1 : (s0 + 1) * (s0 + 1) <= disc - 1 ? s0 + 1 : s0) instanceof Long s
                    ? Math.max(0, Math.min((-B + s) >> 2, n - m) - Math.max((-B - s + 3) >> 2, m + 1) + 1) : 0).sum()).sum() : "");
    }
}

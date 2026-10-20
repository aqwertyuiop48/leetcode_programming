import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(n + 1) instanceof Integer N
            ? 3 * IntStream.rangeClosed(m + 1, n - m).parallel().mapToLong(t1 -> IntStream.rangeClosed(m + 1, Math.min(n - m, N - t1)).mapToLong(t2 ->
                  (t1 + t2 == N ? 1 : 2) * (
                  (long) (3 * N - t1 - t2) * (3 * N - t1 - t2) - 8L * (N - t2) * (N + t1) >= 1
                  && Long.valueOf((long) Math.sqrt((long) (3 * N - t1 - t2) * (3 * N - t1 - t2) - 8L * (N - t2) * (N + t1) - 1)) instanceof Long s
                    ? Math.max(0, Math.min((3L * N - t1 - t2 + s) >> 2, n - m) - Math.max((3L * N - t1 - t2 - s + 3) >> 2, m + 1) + 1) : 0)).sum()).sum() : "");
    }
}

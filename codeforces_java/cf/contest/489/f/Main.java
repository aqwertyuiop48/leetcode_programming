import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && Long.valueOf(t[2]) instanceof Long mod
            && new int[n] instanceof int[] col
            && IntStream.range(0, m).allMatch(r -> IntStream.range(0, n).allMatch(c -> (col[c] += t[3 + r].charAt(c) - '0') >= 0))
            && new long[n + 5] instanceof long[] d0
            && (d0[(int) IntStream.range(0, n).filter(c -> col[c] == 1).count()] = 1) == 1
            && IntStream.range(0, n - m).boxed().reduce(d0, (d, step) ->
                IntStream.range(0, n + 5).mapToLong(k ->
                    (k >= 2 ? d[k - 2] * ((2L * (n - m - step) - (k - 2)) / 2 * ((2L * (n - m - step) - (k - 2)) / 2 - 1) / 2) % mod : 0L)
                    + d[k] * ((2L * (n - m - step) - k) / 2 * k % mod) % mod
                    + (k + 2 < n + 5 ? d[k + 2] * ((long) (k + 2) * (k + 1) / 2 % mod) % mod : 0L)).map(v -> v % mod).toArray(),
                (x, y) -> x) instanceof long[] fin
            ? "" + fin[0] % mod
            : "");
    }
}

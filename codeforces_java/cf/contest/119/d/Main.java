import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes(), StandardCharsets.ISO_8859_1).split("\n") instanceof String[] ln
            && ln[0].replace("\r", "").chars().toArray() instanceof int[] a
            && ln[1].replace("\r", "").chars().toArray() instanceof int[] b
            && Integer.valueOf(a.length) instanceof Integer n
            && n.equals(b.length)
            && IntStream.range(0, 2 * n + 1).map(i -> i < n ? b[i] : i == n ? 0 : a[i - n - 1]).toArray() instanceof int[] s1
            && IntStream.range(0, 2 * n + 1).map(i -> i < n ? a[n - 1 - i] : i == n ? 0 : b[i - n - 1]).toArray() instanceof int[] s2
            && new int[2 * n + 1] instanceof int[] z
            && new int[2 * n + 1] instanceof int[] pi
            && new int[2] instanceof int[] lr
            && LongStream.iterate(1L << 32, st -> (st >>> 32) < s1.length, st ->
                (st >>> 32) + (int) st < s1.length && s1[(int) st] == s1[(int) (st >>> 32) + (int) st]
                    ? st + 1
                    : (z[(int) (st >>> 32)] = (int) st) >= 0
                        && ((int) (st >>> 32) + (int) st <= lr[1] || ((lr[0] = (int) (st >>> 32)) >= 0 && (lr[1] = (int) (st >>> 32) + (int) st) >= 0))
                        ? (((st >>> 32) + 1) << 32) | ((st >>> 32) + 1 < lr[1] ? Math.min(lr[1] - (int) (st >>> 32) - 1, z[(int) (st >>> 32) + 1 - lr[0]]) : 0)
                        : 0L).count() >= 0
            && LongStream.iterate(1L << 32, st -> (st >>> 32) < s2.length, st ->
                (int) st > 0 && s2[(int) st] != s2[(int) (st >>> 32)]
                    ? ((st >>> 32) << 32) | pi[(int) st - 1]
                    : (pi[(int) (st >>> 32)] = (int) st + (s2[(int) st] == s2[(int) (st >>> 32)] ? 1 : 0)) >= 0
                        ? (((st >>> 32) + 1) << 32) | pi[(int) (st >>> 32)]
                        : 0L).count() >= 0
            && Integer.valueOf((int) IntStream.range(0, n).takeWhile(t -> a[t] == b[n - 1 - t]).count()) instanceof Integer L
            ? IntStream.iterate(Math.min(L - 1, n - 2), i -> i >= 0, i -> i - 1)
                .filter(i -> pi[2 * n - i - 1] >= 1 && z[n + 2 + i] >= n - i - 1 - pi[2 * n - i - 1])
                .mapToObj(i -> i + " " + (n - pi[2 * n - i - 1])).findFirst().orElse("-1 -1")
            : "-1 -1");
    }


}


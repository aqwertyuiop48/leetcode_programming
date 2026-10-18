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
            && IntStream.range(1, 2 * n + 1).allMatch(i ->
                (Integer) (i < lr[1] ? Math.min(lr[1] - i, z[i - lr[0]]) : 0) instanceof Integer z0
                && (z[i] = z0 + (int) IntStream.iterate(z0, x -> i + x < s1.length && s1[x] == s1[i + x], x -> x + 1).count()) >= 0
                && (i + z[i] <= lr[1] || ((lr[0] = i) >= 0 && (lr[1] = i + z[i]) >= 0)))
            && IntStream.range(1, 2 * n + 1).allMatch(i ->
                (Integer) IntStream.iterate(pi[i - 1], x -> x > 0 && s2[x] != s2[i], x -> pi[x - 1]).map(x -> pi[x - 1]).reduce((p, q) -> q).orElse(pi[i - 1]) instanceof Integer k
                && (pi[i] = k + (s2[k] == s2[i] ? 1 : 0)) >= 0)
            && (Integer) (int) IntStream.range(0, n).takeWhile(t -> a[t] == b[n - 1 - t]).count() instanceof Integer L
            ? IntStream.iterate(Math.min(L - 1, n - 2), i -> i >= 0, i -> i - 1)
                .filter(i -> pi[n + 1 + n - i - 2] >= 1 && z[n + 2 + i] >= n - i - 1 - pi[n + 1 + n - i - 2])
                .mapToObj(i -> i + " " + (n - pi[n + 1 + n - i - 2])).findFirst().orElse("-1 -1")
            : "-1 -1");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            sc.next().trim().toCharArray() instanceof char[] a
            && (Integer) a.length instanceof Integer n
            && new char[2 * n + 1] instanceof char[] t
            && IntStream.range(0, n).allMatch(i -> (t[i] = a[n - 1 - i]) + (t[n + 1 + i] = a[i]) > 0)
            && (t[n] = '#') > 0
            && new int[2 * n + 1] instanceof int[] pi
            && IntStream.rangeClosed(1, 2 * n).allMatch(i ->
                (pi[i] = Stream.iterate(pi[i - 1], x -> pi[x - 1]).filter(x -> x == 0 || t[i] == t[x]).findFirst().get() instanceof Integer q
                    ? q + (t[i] == t[q] ? 1 : 0) : 0) >= 0)
            && new int[n] instanceof int[] F
            && IntStream.range(0, n).allMatch(j -> (F[j] = Math.max(j > 0 ? F[j - 1] : 0, pi[n + 1 + j])) >= 0)
            && new int[n] instanceof int[] d1
            && new int[]{0, -1} instanceof int[] s1
            && IntStream.range(0, n).allMatch(i ->
                (Integer) IntStream.iterate(i > s1[1] ? 1 : Math.min(d1[s1[0] + s1[1] - i], s1[1] - i + 1), x -> x + 1)
                    .filter(x -> !(i - x >= 0 && i + x < n && a[i - x] == a[i + x])).findFirst().getAsInt() instanceof Integer k
                && (d1[i] = k) > 0
                && (i + k - 1 <= s1[1] || ((s1[0] = i - k + 1) >= 0 && (s1[1] = i + k - 1) >= 0)))
            && new int[n] instanceof int[] d2
            && new int[]{0, -1} instanceof int[] s2
            && IntStream.range(0, n).allMatch(i ->
                (Integer) IntStream.iterate(i > s2[1] ? 0 : Math.min(d2[s2[0] + s2[1] - i + 1], s2[1] - i + 1), x -> x + 1)
                    .filter(x -> !(i + x < n && i - x - 1 >= 0 && a[i + x] == a[i - x - 1])).findFirst().getAsInt() instanceof Integer k
                && (d2[i] = k) >= 0
                && (i + k - 1 <= s2[1] || ((s2[0] = i - k) >= 0 && (s2[1] = i + k - 1) >= 0)))
            && IntStream.range(0, n).boxed()
                .flatMap(i -> Stream.of(new int[]{i - d1[i] + 1, 2 * d1[i] - 1}, new int[]{i - d2[i], 2 * d2[i]}))
                .filter(c -> c[1] > 0)
                .map(c -> new int[]{c[1] + 2 * Math.min(c[0] > 0 ? F[c[0] - 1] : 0, n - c[0] - c[1]), c[0], c[1], Math.min(c[0] > 0 ? F[c[0] - 1] : 0, n - c[0] - c[1])})
                .reduce((x, y) -> y[0] > x[0] ? y : x).get() instanceof int[] b
            ? b[3] == 0
                ? "1\n" + (b[1] + 1) + " " + b[2]
                : (Integer) IntStream.range(0, n).filter(j -> pi[n + 1 + j] >= b[3]).findFirst().getAsInt() instanceof Integer j
                    ? "3\n" + (j - pi[n + 1 + j] + 2) + " " + b[3] + "\n" + (b[1] + 1) + " " + b[2] + "\n" + (n - b[3] + 1) + " " + b[3]
                    : ""
            : ""));
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            sc.next().getBytes() instanceof byte[] a
            && (Integer) a.length instanceof Integer n
            && IntStream.range(0, 2 * n + 1).map(j -> j < n ? a[n - 1 - j] : j == n ? 35 : a[j - n - 1]).toArray() instanceof int[] t
            && new int[2 * n + 1] instanceof int[] pi
            && new int[]{1, 0} instanceof int[] st
            && IntStream.range(0, 4 * n + 4).allMatch(q ->
                st[0] >= 2 * n + 1
                || (st[1] > 0 && t[st[0]] != t[st[1]]
                    ? (st[1] = pi[st[1] - 1]) >= 0
                    : (t[st[0]] != t[st[1]] || ++st[1] > 0) && (pi[st[0]] = st[1]) >= 0 && ++st[0] > 0))
            && new int[n] instanceof int[] pm
            && IntStream.range(0, n).allMatch(i -> (pm[i] = Math.max(i > 0 ? pm[i - 1] : 0, pi[n + 1 + i])) >= 0)
            && new int[n] instanceof int[] d1
            && new int[]{0, -1} instanceof int[] s1
            && IntStream.range(0, n).allMatch(i ->
                (Integer) IntStream.iterate(i > s1[1] ? 1 : Math.min(d1[s1[0] + s1[1] - i], s1[1] - i + 1), x -> x + 1)
                    .filter(x -> !(i - x >= 0 && i + x < n && a[i - x] == a[i + x])).findFirst().getAsInt() instanceof Integer k
                && (d1[i] = k) > 0
                && (i + k - 1 <= s1[1] || ((s1[0] = i - k + 1) >= 0 && (s1[1] = i + k - 1) >= 0)))
            && (Long) IntStream.range(0, n).mapToLong(i ->
                ((long) (2 * d1[i] - 1 + 2 * Math.min(i - d1[i] + 1 > 0 ? pm[i - d1[i]] : 0, n - 1 - (i + d1[i] - 1))) << 20) | i).max().getAsLong() instanceof Long best
            && (Integer) (int) (best & 1048575) instanceof Integer ci
            && (Integer) (ci - d1[ci] + 1) instanceof Integer c
            && (Integer) (2 * d1[ci] - 1) instanceof Integer len
            && (Integer) Math.min(c > 0 ? pm[c - 1] : 0, n - 1 - (c + len - 1)) instanceof Integer L
            ? L == 0
                ? "1\n" + (c + 1) + " " + len
                : (Integer) IntStream.range(0, n).filter(i -> pi[n + 1 + i] >= L).findFirst().getAsInt() instanceof Integer fi
                    ? "3\n" + (fi - pi[n + 1 + fi] + 2) + " " + L + "\n" + (c + 1) + " " + len + "\n" + (n - L + 1) + " " + L
                    : ""
            : ""));
    }
}

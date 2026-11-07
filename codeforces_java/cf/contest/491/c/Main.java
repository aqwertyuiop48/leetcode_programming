import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer k
            && new int[k * k] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> ++cnt[(t[2].charAt(i) - 'a') * k + t[3].charAt(i) - 'a'] > 0)
            && new int[k + 1] instanceof int[] u
            && new int[k + 1] instanceof int[] v
            && new int[k + 1] instanceof int[] p
            && new int[k + 1] instanceof int[] way
            && new int[k + 1] instanceof int[] minv
            && new boolean[k + 1] instanceof boolean[] used
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(1, k).allMatch(i ->
                (p[0] = i) > 0
                && (st[0] = 0) == 0
                && IntStream.rangeClosed(0, k).allMatch(j -> (minv[j] = 1 << 30) > 0 && !(used[j] = false))
                && Stream.generate(() ->
                    (used[st[0]] = true)
                    && Integer.valueOf(p[st[0]]) instanceof Integer i0
                    && (st[2] = 1 << 30) > 0
                    && IntStream.rangeClosed(1, k).filter(j -> !used[j]).allMatch(j ->
                        Integer.valueOf(-cnt[(i0 - 1) * k + j - 1] - u[i0] - v[j]) instanceof Integer cur
                        && (cur >= minv[j] || ((minv[j] = cur) == cur && (way[j] = st[0]) >= 0))
                        && (minv[j] >= st[2] || ((st[2] = minv[j]) == st[2] && (st[1] = j) > 0)))
                    && IntStream.rangeClosed(0, k).allMatch(j ->
                        used[j]
                            ? (u[p[j]] += st[2]) > Integer.MIN_VALUE && (v[j] -= st[2]) > Integer.MIN_VALUE
                            : (minv[j] -= st[2]) > Integer.MIN_VALUE)
                    && (st[0] = st[1]) >= 0
                    && p[st[0]] == 0).anyMatch(b -> b)
                && Stream.generate(() ->
                    (st[1] = way[st[0]]) >= 0 && (p[st[0]] = p[st[1]]) >= 0 && (st[0] = st[1]) >= 0 && st[0] == 0).anyMatch(b -> b))
            && new char[k] instanceof char[] res
            && IntStream.rangeClosed(1, k).allMatch(j -> (res[p[j] - 1] = (char) ('a' + j - 1)) > 0)
            ? IntStream.rangeClosed(1, k).map(j -> cnt[(p[j] - 1) * k + j - 1]).sum() + "\n" + new String(res)
            : "");
    }
}

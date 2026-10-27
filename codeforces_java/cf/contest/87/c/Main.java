import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer n
            && new int[n + 2] instanceof int[] st
            && new int[n + 2] instanceof int[] fill
            && IntStream.rangeClosed(1, n).filter(d -> IntStream.rangeClosed(1, n / d).filter(q ->
                (d % 2 == 1 && d >= 3 && q >= (d + 1) / 2 && ++st[d * q + 1] < 0) | (q % 2 == 1 && q > 2 * d && ++st[d * q + 1] < 0)).count() < 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(m -> (st[m] += st[m - 1]) < 0).count() >= 0
            && new int[st[n + 1] + 1] instanceof int[] ks
            && IntStream.rangeClosed(1, n).filter(d -> IntStream.rangeClosed(1, n / d).filter(q ->
                (d % 2 == 1 && d >= 3 && q >= (d + 1) / 2 && (ks[st[d * q] + fill[d * q]++] = d) < 0)
                | (q % 2 == 1 && q > 2 * d && (ks[st[d * q] + fill[d * q]++] = 2 * d) < 0)).count() < 0).count() >= 0
            && new int[n + 2] instanceof int[] pre
            && new int[4096] instanceof int[] mark
            && IntStream.rangeClosed(1, n).filter(m ->
                IntStream.range(st[m], st[m + 1]).filter(e -> Integer.valueOf((m - ks[e] * (ks[e] - 1) / 2) / ks[e]) instanceof Integer s
                    && (mark[pre[s + ks[e] - 1] ^ pre[s - 1]] = m) < 0).count() >= 0
                && (pre[m] = pre[m - 1] ^ IntStream.range(0, 4096).filter(v -> mark[v] != m).findFirst().getAsInt() ^ 0) < 0).count() >= 0
            ? IntStream.range(st[n], st[n + 1]).map(e -> ks[e])
                .filter(k -> (pre[(n - k * (k - 1) / 2) / k + k - 1] ^ pre[(n - k * (k - 1) / 2) / k - 1]) == 0).min().orElse(-1) : 0);
    }
}


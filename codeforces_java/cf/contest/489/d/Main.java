import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && new int[n + 2] instanceof int[] st
            && IntStream.range(0, m).allMatch(e -> ++st[g0[2 + 2 * e] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
            && Arrays.copyOf(st, n + 2) instanceof int[] fp
            && new int[m + 1] instanceof int[] adj
            && IntStream.range(0, m).allMatch(e -> (adj[fp[g0[2 + 2 * e]]++] = g0[3 + 2 * e]) >= 0)
            && new int[n + 2] instanceof int[] cnt
            && new long[1] instanceof long[] tot
            && new int[n + 2] instanceof int[] mark
            && IntStream.rangeClosed(1, n).filter(a ->
                IntStream.range(st[a], st[a + 1]).filter(k1 ->
                    IntStream.range(st[adj[k1]], st[adj[k1] + 1]).filter(k2 ->
                        adj[k2] != a
                        && (mark[adj[k2]] == a
                            ? (tot[0] += cnt[adj[k2]]++) >= 0
                            : (mark[adj[k2]] = a) > 0 && (cnt[adj[k2]] = 1) > 0)).count() >= 0).count() >= 0).count() >= 0
            ? "" + tot[0]
            : "");
    }
}

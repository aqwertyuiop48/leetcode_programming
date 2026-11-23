


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer k
            && Integer.valueOf(n - 1) instanceof Integer m
            && new int[n + 1] instanceof int[] deg
            && new int[n + 1] instanceof int[] xr
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && new int[2 * m + 2] instanceof int[] nxt
            && new int[2 * m + 2] instanceof int[] to
            && IntStream.range(0, m).allMatch(e ->
                ++deg[tk[2 + 2 * e]] > 0 && ++deg[tk[3 + 2 * e]] > 0
                && (xr[tk[2 + 2 * e]] ^= tk[3 + 2 * e]) >= 0 && (xr[tk[3 + 2 * e]] ^= tk[2 + 2 * e]) >= 0
                && (to[2 * e] = tk[3 + 2 * e]) > 0 && (nxt[2 * e] = head[tk[2 + 2 * e]]) >= -1 && (head[tk[2 + 2 * e]] = 2 * e) >= 0
                && (to[2 * e + 1] = tk[2 + 2 * e]) > 0 && (nxt[2 * e + 1] = head[tk[3 + 2 * e]]) >= -1 && (head[tk[3 + 2 * e]] = 2 * e + 1) >= 0)
            && Arrays.copyOf(IntStream.rangeClosed(1, n).filter(i -> deg[i] == 1).toArray(), n + 1) instanceof int[] qu
            && new int[]{(int) IntStream.rangeClosed(1, n).filter(i -> deg[i] == 1).count()} instanceof int[] qt
            && new int[n + 1] instanceof int[] par
            && IntStream.range(0, m).allMatch(i ->
                Integer.valueOf(qu[i]) instanceof Integer lf
                && Integer.valueOf(xr[lf]) instanceof Integer nb
                && (par[lf] = nb) > 0 && (xr[nb] ^= lf) >= 0
                && (--deg[nb] != 1 || (qu[qt[0]++] = nb) > 0))
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(v -> par[v] == 0).findFirst().orElse(1)) instanceof Integer root
            && (qu[m] = root) > 0
            && new int[n + 1] instanceof int[] h
            && new int[n + 1] instanceof int[] hc
            && IntStream.range(0, m).allMatch(i ->
                Integer.valueOf(qu[i]) instanceof Integer v
                && (h[v] + 1 <= h[par[v]] || ((h[par[v]] = h[v] + 1) > 0 && (hc[par[v]] = v) > 0)))
            && new int[n + 1] instanceof int[] pos
            && new int[]{h[root] + 1} instanceof int[] alloc
            && IntStream.iterate(m - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                Integer.valueOf(qu[i]) instanceof Integer v
                && (hc[par[v]] == v ? (pos[v] = pos[par[v]] + 1) > 0 : (pos[v] = alloc[0]) >= 0 && (alloc[0] += h[v] + 1) > 0))
            && new long[n + 2] instanceof long[] buf
            && new long[1] instanceof long[] ans
            && IntStream.range(0, n).allMatch(i ->
                Integer.valueOf(qu[i]) instanceof Integer v
                && (buf[pos[v]] = 1) > 0
                && (k > h[v] || (ans[0] += buf[pos[v] + k]) >= 0)
                && IntStream.iterate(head[v], s -> s >= 0, s -> nxt[s]).allMatch(s ->
                    Integer.valueOf(to[s]) instanceof Integer c
                    && (c - par[v] == 0 || c - hc[v] == 0
                        || (IntStream.rangeClosed(0, h[c]).allMatch(d ->
                                k - d - 1 < 0 || k - d - 1 > h[v] || (ans[0] += buf[pos[v] + k - d - 1] * buf[pos[c] + d]) >= 0)
                            && IntStream.rangeClosed(0, h[c]).allMatch(d -> (buf[pos[v] + d + 1] += buf[pos[c] + d]) >= 0)))))
            ? ans[0]
            : 0L);
    }
}

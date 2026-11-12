import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] off && new int[2 * n] instanceof int[] adj && new int[n] instanceof int[] pos
            && IntStream.range(0, n - 1).filter(i -> ++off[tok[1 + 2 * i]] > 0 & ++off[tok[2 + 2 * i]] > 0).count() >= 0
            && IntStream.range(0, n).filter(i -> (off[i + 1] += off[i]) >= 0 & (pos[i] = off[i]) >= 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> (adj[pos[tok[1 + 2 * i] - 1]++] = tok[2 + 2 * i] - 1) >= 0 & (adj[pos[tok[2 + 2 * i] - 1]++] = tok[1 + 2 * i] - 1) >= 0).count() >= 0
            && new int[n] instanceof int[] order && new int[n] instanceof int[] par && new int[]{1} instanceof int[] tail && (par[0] = -1) == -1
            && IntStream.iterate(0, h -> h < tail[0], h -> h + 1).filter(h -> IntStream.range(off[order[h]], off[order[h] + 1]).filter(e -> adj[e] != par[order[h]] && (par[adj[e]] = order[h]) >= 0 && (order[tail[0]++] = adj[e]) >= 0).count() >= 0).count() >= 0
            && new int[n] instanceof int[] sz && new int[n] instanceof int[] down && new int[n] instanceof int[] m1 && new int[n] instanceof int[] m2 && new int[n] instanceof int[] bigSz && new int[n] instanceof int[] bigCh && new int[n] instanceof int[] up
            && IntStream.range(0, n).map(k -> order[n - 1 - k]).filter(v -> Integer.valueOf(par[v]) instanceof Integer p && ++sz[v] > 0
                && (down[v] = 2 * sz[v] <= n ? sz[v] : m1[v]) >= 0
                && (p < 0 || ((sz[p] += sz[v]) > 0
                    & (sz[v] > bigSz[p] ? (bigSz[p] = sz[v]) > 0 & (bigCh[p] = v) >= 0 : true)
                    & (down[v] > m1[p] ? (m2[p] = m1[p]) >= 0 & (m1[p] = down[v]) >= 0 : down[v] > m2[p] ? (m2[p] = down[v]) >= 0 : true)))).count() >= 0
            && IntStream.range(1, n).map(k -> order[k]).filter(v -> Integer.valueOf(par[v]) instanceof Integer p
                && (up[v] = 2 * (n - sz[v]) <= n ? n - sz[v] : Math.max(up[p], down[v] == m1[p] ? m2[p] : m1[p])) >= 0).count() >= 0
            ? IntStream.range(0, n).mapToObj(v -> Integer.valueOf(n - sz[v]) instanceof Integer ab
                && (2 * Math.max(bigSz[v], ab) <= n || (bigSz[v] >= ab ? 2 * (bigSz[v] - down[bigCh[v]]) <= n : 2 * (ab - up[v]) <= n)) ? "1" : "0").collect(Collectors.joining(" ")) : "");
    }
}

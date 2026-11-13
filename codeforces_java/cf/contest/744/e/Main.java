import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toArray(String[]::new) instanceof String[] s
            && IntStream.range(0, n).map(i -> s[i].length()).toArray() instanceof int[] len
            && new int[n + 1] instanceof int[] off && IntStream.range(0, n).allMatch(i -> (off[i + 1] = off[i] + len[i]) > 0)
            && Integer.valueOf(off[n]) instanceof Integer N
            && new int[N + 1] instanceof int[] sid && IntStream.range(0, n).allMatch(i -> IntStream.range(off[i], off[i + 1]).allMatch(v -> (sid[v] = i) >= 0))
            && new int[N * n] instanceof int[] L
            && IntStream.range(0, n * n).allMatch(p -> Integer.valueOf(p / n) instanceof Integer i && Integer.valueOf(p % n) instanceof Integer t
                && (s[t] + "#" + s[i]).toCharArray() instanceof char[] c && new int[c.length] instanceof int[] z && new int[2] instanceof int[] lr
                && IntStream.range(1, c.length).allMatch(x -> Integer.valueOf(x < lr[1] ? Math.min(lr[1] - x, z[x - lr[0]]) : 0) instanceof Integer z0
                    && (z[x] = z0 + (int) IntStream.iterate(z0, y -> x + y < c.length && c[y] == c[x + y], y -> y + 1).count()) >= 0
                    && (x + z[x] <= lr[1] || (lr[0] = x) >= 0 && (lr[1] = x + z[x]) >= 0))
                && IntStream.range(0, len[i]).allMatch(d -> (L[(off[i] + d) * n + t] = z[len[t] + 1 + d]) >= 0))
            && IntStream.range(0, N * n).allMatch(x -> Integer.valueOf(x / n) instanceof Integer v && Integer.valueOf(x % n) instanceof Integer t
                && Integer.valueOf(len[sid[v]] - (v - off[sid[v]])) instanceof Integer r
                && (L[x] = L[x] >= Math.min(r, len[t]) ? (len[t] < r ? v + len[t] : len[t] == r ? N : off[t] + r) : -1) > -2)
            && new int[N + 2] instanceof int[] es && IntStream.range(0, N).allMatch(v -> (es[v + 1] = es[v] + (int) IntStream.range(0, n).filter(t -> L[v * n + t] >= 0).count()) >= 0)
            && (es[N + 1] = es[N]) >= 0
            && new int[es[N]] instanceof int[] esrc && new int[es[N]] instanceof int[] edst && new int[es[N]] instanceof int[] et && new int[1] instanceof int[] ec
            && IntStream.range(0, N * n).filter(x -> L[x] >= 0).allMatch(x -> (esrc[ec[0]] = x / n) >= 0 && (et[ec[0]] = x % n) >= 0 && (edst[ec[0]++] = L[x]) >= 0)
            && new int[N + 1] instanceof int[] indeg && new int[N + 1] instanceof int[] outdeg && new int[N + 1] instanceof int[] st && new int[N + 1] instanceof int[] pin
            && new int[N + 2] instanceof int[] pS && new int[N + 1] instanceof int[] pos && new int[es[N] + 1] instanceof int[] pArr
            && new int[N + 2] instanceof int[] qu && new int[1] instanceof int[] ht
            && ((BiPredicate<Integer, Integer>) (a, b) -> Integer.valueOf(b - a + 1) instanceof Integer w && Integer.valueOf(off[a]) instanceof Integer v0 && Integer.valueOf(off[b + 1]) instanceof Integer v1
                && Integer.valueOf(es[v0]) instanceof Integer e0 && Integer.valueOf(es[v1]) instanceof Integer e1
                && IntStream.range(0, N + 1).allMatch(v -> (indeg[v] = 0) == 0 && (outdeg[v] = 0) == 0 && (st[v] = 0) == 0 && (pin[v] = 0) == 0)
                && IntStream.range(e0, e1).filter(e -> et[e] >= a && et[e] <= b).allMatch(e -> ++outdeg[esrc[e]] > 0 && ++pin[edst[e]] > 0 && ++indeg[edst[e]] > 0)
                && IntStream.rangeClosed(a, b).allMatch(j -> ++indeg[off[j]] > 0) && (outdeg[N] = w) == w
                && IntStream.range(0, N + 1).allMatch(v -> (pS[v + 1] = pS[v] + pin[v]) >= 0 && (pos[v] = pS[v]) >= 0)
                && IntStream.range(e0, e1).filter(e -> et[e] >= a && et[e] <= b).allMatch(e -> (pArr[pos[edst[e]]++] = esrc[e]) >= 0)
                && (ht[0] = 0) == 0
                && IntStream.concat(IntStream.range(v0, v1), IntStream.of(N)).filter(v -> indeg[v] == 0 || outdeg[v] == 0).allMatch(v -> (st[v] = 1) == 1 && (qu[ht[0]++] = v) >= 0)
                && IntStream.iterate(0, g -> g < ht[0], g -> g + 1).allMatch(g -> Integer.valueOf(qu[g]) instanceof Integer u
                    && (u == N ? IntStream.rangeClosed(a, b).allMatch(j -> --indeg[off[j]] > 0 || st[off[j]] == 1 || (st[off[j]] = 1) == 1 && (qu[ht[0]++] = off[j]) >= 0)
                        : es[u + 1] == es[u] || IntStream.range(es[u], es[u + 1]).filter(e -> et[e] >= a && et[e] <= b).allMatch(e -> --indeg[edst[e]] > 0 || st[edst[e]] == 1 || (st[edst[e]] = 1) == 1 && (qu[ht[0]++] = edst[e]) >= 0))
                    && (u == N || pS[u + 1] == pS[u] || IntStream.range(pS[u], pS[u + 1]).allMatch(e -> --outdeg[pArr[e]] > 0 || st[pArr[e]] == 1 || (st[pArr[e]] = 1) == 1 && (qu[ht[0]++] = pArr[e]) >= 0))
                    && (u == N || u != off[sid[u]] || --outdeg[N] > 0 || st[N] == 1 || (st[N] = 1) == 1 && (qu[ht[0]++] = N) >= 0))
                && IntStream.range(v0, v1).filter(v -> st[v] == 0 && v - off[sid[v]] > 0).count() == 0) instanceof BiPredicate<Integer, Integer> chk
            && new int[1] instanceof int[] hh && (hh[0] = -1) == -1
            ? IntStream.range(0, n).mapToLong(lo -> Integer.valueOf(Math.max(hh[0], lo - 1) + 1) instanceof Integer j0
                && Long.valueOf(IntStream.range(j0, n).takeWhile(j -> chk.test(lo, j)).count()) instanceof Long c && (hh[0] = j0 + c.intValue() - 1) >= -1 ? (long) (hh[0] - lo + 1) : 0L).sum() : "");
    }
}

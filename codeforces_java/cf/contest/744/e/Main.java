
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
            && String.join("", s).toCharArray() instanceof char[] cc
            && ((LongUnaryOperator) (r -> r >= 2305843009213693951L ? r - 2305843009213693951L : r)) instanceof LongUnaryOperator fin
            && ((LongUnaryOperator) (u -> (u & 2305843009213693951L) + (u >>> 61))) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) ((p, q) -> fin.applyAsLong(red.applyAsLong(((p * q) & 2305843009213693951L) + (((p * q) >>> 61) | (Math.multiplyHigh(p, q) << 3)))))) instanceof LongBinaryOperator mul
            && Long.valueOf((System.nanoTime() & 0x3FFFFFFFL) + 1000003L) instanceof Long bs
            && new long[N + 2] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.range(1, N + 2).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], bs)) > 0)
            && new long[N + n + 1] instanceof long[] hs
            && IntStream.range(0, N).allMatch(v -> (hs[v + sid[v] + 1] = fin.applyAsLong(mul.applyAsLong(hs[v + sid[v]], bs) + cc[v] - 96)) >= 0)
            && new int[N * n] instanceof int[] slot
            && IntStream.range(0, N * n).filter(x -> Integer.valueOf(x / n) instanceof Integer v && Integer.valueOf(x % n) instanceof Integer t
                && Integer.valueOf(sid[v]) instanceof Integer i && Integer.valueOf(len[i] - (v - off[i])) instanceof Integer r
                && Integer.valueOf(Math.min(r, len[t])) instanceof Integer m && Integer.valueOf(i + v) instanceof Integer bi && Integer.valueOf(off[t] + t) instanceof Integer bt
                && (slot[x] = fin.applyAsLong(hs[bi + m] - mul.applyAsLong(hs[bi], pw[m]) + 2305843009213693951L) == hs[bt + m] ? (len[t] < r ? v + len[t] : len[t] - r == 0 ? N : off[t] + r) : -1) < -5).count() >= 0
            && new int[N + 2] instanceof int[] es && IntStream.range(0, N).allMatch(v -> (es[v + 1] = es[v] + (int) IntStream.range(0, n).filter(t -> slot[v * n + t] >= 0).count()) >= 0)
            && (es[N + 1] = es[N]) >= 0
            && new int[es[N]] instanceof int[] dst && new int[es[N]] instanceof int[] src && new byte[es[N]] instanceof byte[] et && new int[1] instanceof int[] ec
            && IntStream.range(0, N * n).filter(x -> slot[x] >= 0).allMatch(x -> (src[ec[0]] = x / n) >= 0 && (et[ec[0]] = (byte) (x % n)) >= 0 && (dst[ec[0]++] = slot[x]) >= 0)
            && new int[N + 2] instanceof int[] rs && IntStream.range(0, es[N]).allMatch(e -> ++rs[dst[e] + 1] > 0)
            && IntStream.range(0, N + 1).allMatch(v -> (rs[v + 1] += rs[v]) >= 0)
            && rs.clone() instanceof int[] rp && new int[es[N]] instanceof int[] rsrc && new byte[es[N]] instanceof byte[] rt
            && IntStream.range(0, es[N]).allMatch(e -> Integer.valueOf(rp[dst[e]]++) instanceof Integer q && (rsrc[q] = src[e]) >= 0 && (rt[q] = et[e]) >= 0)
            && new int[N + 1] instanceof int[] indeg && new int[N + 1] instanceof int[] outdeg && new int[N + 1] instanceof int[] st
            && new int[N + 2] instanceof int[] qu && new int[1] instanceof int[] ht
            && ((BiPredicate<Integer, Integer>) (a, b) -> Integer.valueOf(off[a]) instanceof Integer v0 && Integer.valueOf(off[b + 1]) instanceof Integer v1
                && Integer.valueOf(es[v0]) instanceof Integer e0 && Integer.valueOf(es[v1]) instanceof Integer e1
                && IntStream.range(v0, v1).filter(v -> (indeg[v] = 0) == 0 && (outdeg[v] = 0) == 0 && (st[v] = 0) == 0 && v < 0).count() == 0
                && (indeg[N] = 0) == 0 && (outdeg[N] = b - a + 1) > 0 && (st[N] = 0) == 0
                && IntStream.range(e0, e1).filter(e -> et[e] >= a && et[e] <= b && ++outdeg[src[e]] > 0 && ++indeg[dst[e]] > 0 && e < 0).count() == 0
                && IntStream.rangeClosed(a, b).filter(j -> ++indeg[off[j]] > 0 && j < 0).count() == 0
                && (ht[0] = 0) == 0
                && IntStream.concat(IntStream.range(v0, v1), IntStream.of(N)).filter(v -> (indeg[v] == 0 || outdeg[v] == 0) && (st[v] = 1) == 1 && (qu[ht[0]++] = v) >= 0 && v < 0).count() == 0
                && IntStream.iterate(0, g -> g < ht[0], g -> g + 1).map(g -> qu[g]).filter(u ->
                    (u != N || IntStream.rangeClosed(a, b).filter(j -> (--indeg[off[j]] > 0 || st[off[j]] == 1 || (st[off[j]] = 1) == 1 && (qu[ht[0]++] = off[j]) >= 0) && j < 0).count() == 0)
                    && (es[u] == es[u + 1] || IntStream.range(es[u], es[u + 1]).filter(e -> et[e] >= a && et[e] <= b && (--indeg[dst[e]] > 0 || st[dst[e]] == 1 || (st[dst[e]] = 1) == 1 && (qu[ht[0]++] = dst[e]) >= 0) && e < 0).count() == 0)
                    && (rs[u] == rs[u + 1] || IntStream.range(rs[u], rs[u + 1]).filter(e -> rt[e] >= a && rt[e] <= b && rsrc[e] >= v0 && rsrc[e] < v1 && (--outdeg[rsrc[e]] > 0 || st[rsrc[e]] == 1 || (st[rsrc[e]] = 1) == 1 && (qu[ht[0]++] = rsrc[e]) >= 0) && e < 0).count() == 0)
                    && (u == N || u != off[sid[u]] || --outdeg[N] > 0 || st[N] == 1 || (st[N] = 1) == 1 && (qu[ht[0]++] = N) >= 0) && u < 0).count() == 0
                && IntStream.range(v0, v1).noneMatch(v -> st[v] == 0 && v != off[sid[v]])) instanceof BiPredicate<Integer, Integer> chk
            && new int[1] instanceof int[] hh && (hh[0] = -1) == -1 && new int[1] instanceof int[] lw && new int[1] instanceof int[] hi
            ? IntStream.range(0, n).mapToLong(lo -> Integer.valueOf(Math.max(hh[0], lo - 1)) instanceof Integer j0 && (lw[0] = j0) >= -1 && (hi[0] = n) > 0
                && IntStream.iterate(1, z -> z * 2).takeWhile(z -> lw[0] < n - 1 && hi[0] == n && (chk.test(lo, Math.min(lw[0] + z, n - 1)) ? (lw[0] = Math.min(lw[0] + z, n - 1)) >= 0 : (hi[0] = Math.min(lw[0] + z, n - 1)) < 0)).count() >= 0
                && IntStream.iterate(0, z -> z + 1).takeWhile(z -> hi[0] - lw[0] > 1 && (chk.test(lo, (lw[0] + hi[0]) / 2) ? (lw[0] = (lw[0] + hi[0]) / 2) >= 0 : (hi[0] = (lw[0] + hi[0]) / 2) >= 0)).count() >= 0
                && (hh[0] = lw[0]) >= -1 ? (long) (hh[0] - lo + 1) : 0L).sum() : "");
    }
}

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[raw.length / 2 + 8] instanceof int[] lt
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0
                        && (i < raw.length && raw[i] == 'P' ? (lt[ps[3]++] = 1) : i < raw.length && raw[i] == 'V' ? (lt[ps[3]++] = 0) : 0) >= 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] ch0
            && new int[n + 1] instanceof int[] ch1
            && new int[n + 1] instanceof int[] fa
            && new long[n + 1] instanceof long[] av
            && new long[n + 1] instanceof long[] vsz
            && new long[n + 1] instanceof long[] vsq
            && new long[n + 1] instanceof long[] vans
            && new long[n + 1] instanceof long[] P
            && new long[n + 1] instanceof long[] Q
            && new long[n + 1] instanceof long[] A
            && IntStream.rangeClosed(1, n).allMatch(i -> (av[i] = g0[n - 1 + i]) >= 0 && (i == 1 || (par[i] = g0[i - 1]) > 0))
            && new int[n + 2] instanceof int[] head
            && new int[n + 2] instanceof int[] nxt
            && IntStream.rangeClosed(2, n).allMatch(i -> (nxt[i] = head[par[i]]) >= 0 && (head[par[i]] = i) > 0)
            && new int[n + 1] instanceof int[] qu
            && new int[1] instanceof int[] qp
            && (qu[0] = 1) == 1
            && (qp[0] = 1) == 1
            && IntStream.range(0, n).allMatch(k -> IntStream.iterate(head[qu[k]], e -> e != 0, e -> nxt[e]).allMatch(e -> (qu[qp[0]++] = e) > 0))
            && ((IntUnaryOperator) (x -> (Long) (1 + vsz[x]) instanceof Long px
                && (P[x] = P[ch0[x]] + px + P[ch1[x]]) > 0
                && (Q[x] = Q[ch0[x]] + av[x] * px + Q[ch1[x]]) >= 0
                && (A[x] = A[ch0[x]] + av[x] * (px * px - vsq[x]) + vans[x] + 2 * px * Q[ch0[x]] + A[ch1[x]] + 2 * P[ch1[x]] * (Q[ch0[x]] + av[x] * px)) >= 0 ? 0 : 1)) instanceof IntUnaryOperator pu
            && IntStream.range(0, n).allMatch(k -> (Integer) qu[n - 1 - k] instanceof Integer v
                && pu.applyAsInt(v) == 0
                && (v == 1 || ((fa[v] = par[v]) > 0 & (vsz[par[v]] += P[v]) > 0 & (vsq[par[v]] += P[v] * P[v]) > 0 & (vans[par[v]] += A[v]) >= 0)))
            && ((IntUnaryOperator) (x -> fa[x] == 0 || (ch0[fa[x]] != x && ch1[fa[x]] != x) ? 1 : 0)) instanceof IntUnaryOperator isr
            && ((IntUnaryOperator) (x -> (Integer) fa[x] instanceof Integer y
                && (Integer) fa[y] instanceof Integer z
                && (ch0[z] == y ? (ch0[z] = x) >= 0 : ch1[z] == y ? (ch1[z] = x) >= 0 : true)
                && (fa[x] = z) >= 0
                && (ch0[y] == x
                    ? ((ch0[y] = ch1[x]) >= 0 & (fa[ch1[x]] = y) > 0 & (ch1[x] = y) > 0)
                    : ((ch1[y] = ch0[x]) >= 0 & (fa[ch0[x]] = y) > 0 & (ch0[x] = y) > 0))
                && (fa[y] = x) > 0
                && pu.applyAsInt(y) == 0 ? 0 : 1)) instanceof IntUnaryOperator rot
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> sref
            && sref.getAndSet(x -> isr.applyAsInt(x) == 1 ? pu.applyAsInt(x)
                : (Integer) fa[x] instanceof Integer y
                    && (Integer) fa[y] instanceof Integer z
                    && (isr.applyAsInt(y) == 1 || rot.applyAsInt((ch0[y] == x) == (ch0[z] == y) ? y : x) == 0)
                    && rot.applyAsInt(x) == 0 ? sref.get().applyAsInt(x) : 1) == null
            && ((IntUnaryOperator) (x -> sref.get().applyAsInt(x))) instanceof IntUnaryOperator spl
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> aref
            && aref.getAndSet((x, y) -> x == 0 ? 0
                : spl.applyAsInt(x) == 0
                    && ((vsz[x] += P[ch1[x]]) >= 0 & (vsq[x] += P[ch1[x]] * P[ch1[x]]) >= 0 & (vans[x] += A[ch1[x]]) >= 0)
                    && ((vsz[x] -= P[y]) >= 0 & (vsq[x] -= P[y] * P[y]) >= 0 & (vans[x] -= A[y]) >= 0)
                    && (ch1[x] = y) >= 0
                    && pu.applyAsInt(x) == 0 ? aref.get().applyAsInt(fa[x], x) : 1) == null
            && ((IntUnaryOperator) (x0 -> aref.get().applyAsInt(x0, 0))) instanceof IntUnaryOperator acc
            && ((IntBinaryOperator) ((u, w) -> acc.applyAsInt(u) == 0 && spl.applyAsInt(u) == 0
                && (fa[ch0[u]] = 0) == 0 && (ch0[u] = 0) == 0 && pu.applyAsInt(u) == 0
                && acc.applyAsInt(w) == 0 && spl.applyAsInt(w) == 0
                && (fa[u] = w) > 0
                && (vsz[w] += P[u]) > 0 && (vsq[w] += P[u] * P[u]) > 0 && (vans[w] += A[u]) >= 0
                && pu.applyAsInt(w) == 0 ? 0 : 1)) instanceof IntBinaryOperator mv
            && ((IntBinaryOperator) ((x, y) -> acc.applyAsInt(y) == 0 && spl.applyAsInt(y) == 0 && spl.applyAsInt(x) == 0 && isr.applyAsInt(y) == 0 ? 1 : 0)) instanceof IntBinaryOperator anc
            && ((IntSupplier) (() -> acc.applyAsInt(1) == 0 && spl.applyAsInt(1) == 0 ? 1 : 0)) instanceof IntSupplier top
            && Integer.valueOf(g0[2 * n]) instanceof Integer m
            ? Stream.concat(Stream.of(-1), IntStream.range(0, m).boxed()).map(t ->
                (t < 0 ? true
                    : lt[t] == 1
                        ? (anc.applyAsInt(g0[2 * n + 1 + 2 * t], g0[2 * n + 2 + 2 * t]) == 1
                            ? mv.applyAsInt(g0[2 * n + 2 + 2 * t], g0[2 * n + 1 + 2 * t]) == 0
                            : mv.applyAsInt(g0[2 * n + 1 + 2 * t], g0[2 * n + 2 + 2 * t]) == 0)
                        : acc.applyAsInt(g0[2 * n + 1 + 2 * t]) == 0 && spl.applyAsInt(g0[2 * n + 1 + 2 * t]) == 0
                            && (av[g0[2 * n + 1 + 2 * t]] = g0[2 * n + 2 + 2 * t]) >= 0 && pu.applyAsInt(g0[2 * n + 1 + 2 * t]) == 0)
                && top.getAsInt() == 1
                ? String.format(Locale.US, "%.9f", (double) A[1] / ((double) n * n)) : "").collect(Collectors.joining("\n"))
            : "");
    }
}

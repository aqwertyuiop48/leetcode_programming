
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw
            ? CompletableFuture.supplyAsync(() -> new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(2 * n + 3) instanceof Integer N
            && IntStream.range(0, N).map(i -> i == 0 || i == n + 1 || i == N - 1 ? -1 : i <= n ? g0[i] : g0[2 * n + 2 - i]).toArray() instanceof int[] X
            && Integer.valueOf(g0[n + 1]) instanceof Integer qn
            && new int[n + 3] instanceof int[] sx
            && new int[n + 3] instanceof int[] sp
            && new int[(n + 3) * 19] instanceof int[] T
            && new int[4] instanceof int[] st
            && IntStream.range(0, qn).map(t -> g0[n + 2 + 4 * t] <= g0[n + 4 + 4 * t] ? g0[n + 2 + 4 * t] : N - 1 - g0[n + 2 + 4 * t]).toArray() instanceof int[] P1
            && IntStream.range(0, qn).map(t -> g0[n + 2 + 4 * t] <= g0[n + 4 + 4 * t] ? g0[n + 4 + 4 * t] : N - 1 - g0[n + 4 + 4 * t]).toArray() instanceof int[] P2
            && new int[qn] instanceof int[] M0
            && new int[qn] instanceof int[] ans
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> popr
            && popr.getAndSet((s, x) -> s > 0 && sx[s - 1] >= x ? popr.get().applyAsInt(s - 1, x) : s) == null
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> bX
            && bX.getAndSet((lo, hi) -> lo >= hi ? lo : sx[(lo + hi) >>> 1] < st[2] ? bX.get().applyAsInt(((lo + hi) >>> 1) + 1, hi) : bX.get().applyAsInt(lo, (lo + hi) >>> 1)) == null
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> bP
            && bP.getAndSet((lo, hi) -> lo >= hi ? lo : sp[(lo + hi) >>> 1] < st[2] ? bP.get().applyAsInt(((lo + hi) >>> 1) + 1, hi) : bP.get().applyAsInt(lo, (lo + hi) >>> 1)) == null
            && ((IntUnaryOperator) (y -> (st[2] = y) == y ? bX.get().applyAsInt(0, st[0]) : -1)) instanceof IntUnaryOperator cX
            && ((IntUnaryOperator) (y2 -> (st[2] = y2) == y2 ? bP.get().applyAsInt(0, st[0]) : -1)) instanceof IntUnaryOperator cP
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> tbl
            && tbl.getAndSet((d, tt) -> (1 << tt) > d + 1 ? 0
                : (T[d * 19 + tt] = Math.min(T[d * 19 + tt - 1], T[(d - (1 << (tt - 1))) * 19 + tt - 1])) > Integer.MIN_VALUE ? tbl.get().applyAsInt(d, tt + 1) : 0) == null
            && ((IntPredicate) (i -> (st[0] = X[i] < 0 ? 0 : popr.get().applyAsInt(st[0], X[i])) >= 0
                && (sp[st[0]] = i) >= 0
                && (sx[st[0]] = X[i]) > -2
                && (T[st[0] * 19] = X[i] - 2 * i) > Integer.MIN_VALUE
                && tbl.get().applyAsInt(st[0], 1) >= 0
                && ++st[0] > 0)) instanceof IntPredicate pushI
            && ((LongBinaryOperator) ((pk, c2L) -> Integer.valueOf((int) (pk & 1048575L)) instanceof Integer v0
                && Integer.valueOf((int) ((pk >> 20) & 1L)) instanceof Integer v2
                && Integer.valueOf((int) (pk >> 21)) instanceof Integer v1
                && Integer.valueOf((int) c2L) instanceof Integer v3
                && Integer.valueOf(cX.applyAsInt(v1) - 1) instanceof Integer d1
                && sx[d1] >= 0
                ? (v1 <= v3 ? 2 * (v0 - sp[d1]) + v2 + v3 - sx[d1]
                    : Integer.valueOf(cX.applyAsInt(v3) - 1) instanceof Integer dc
                        ? Math.min(sx[dc] >= 0 ? 2 * (v0 - sp[dc]) + v2 + v3 - sx[dc] : 1000000000,
                            d1 > dc && Integer.valueOf(31 - Integer.numberOfLeadingZeros(d1 - dc)) instanceof Integer lg
                                ? 2 * v0 + Math.min(T[d1 * 19 + lg], T[(dc + (1 << lg)) * 19 + lg]) + v2 - v3
                                : 1000000000)
                        : 1000000000)
                : 1000000000)) instanceof LongBinaryOperator ld
            && IntStream.range(0, N).map(i -> -1).toArray() instanceof int[] head
            && new int[2 * qn] instanceof int[] nxt
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> hd
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> wk
            && wk.getAndSet(e -> hd.get().test(e) && (nxt[e] < 0 || wk.get().test(nxt[e]))) == null
            && IntStream.range(0, qn).allMatch(t -> (nxt[t] = head[P2[t]]) >= -1 && (head[P2[t]] = t) >= 0)
            && hd.getAndSet(t -> Integer.valueOf(P2[t]) instanceof Integer p2
                && Integer.valueOf(P1[t]) instanceof Integer p1
                && Integer.valueOf(g0[n + 5 + 4 * t]) instanceof Integer c2
                && Integer.valueOf(p2 - p1) instanceof Integer dd
                && Integer.valueOf(sx[cP.applyAsInt(p1)]) instanceof Integer m0
                && (M0[t] = m0) >= 0
                && Integer.valueOf(sp[cX.applyAsInt(c2 + 1) - 1]) instanceof Integer pp
                && (ans[t] = Math.min(Math.min(dd + 1 + Math.min(c2, X[p2] - c2), dd + Math.abs(Math.min(g0[n + 3 + 4 * t], m0) - c2)),
                    Math.min(dd + 1 + Math.abs(m0 - c2),
                        Math.min(pp >= p1 ? dd + 1 + Math.abs(X[pp] - c2) : 1000000000,
                            pp >= p1 && pp + 1 <= p2 ? dd + 1 + Math.abs(sx[cP.applyAsInt(pp + 1)] - c2) : 1000000000)))) >= 0) == null
            && (st[0] = 0) == 0
            && IntStream.range(0, N).allMatch(i -> pushI.test(i) && (head[i] < 0 || wk.get().test(head[i])))
            && IntStream.range(0, N).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, 2 * qn).allMatch(e -> Integer.valueOf((e & 1) == 0 ? P1[e >> 1] - 1 : N - 2 - P2[e >> 1]) instanceof Integer kk
                && (nxt[e] = head[kk]) >= -1 && (head[kk] = e) >= 0)
            && hd.getAndSet(w -> Integer.valueOf(w >> 1) instanceof Integer u
                && Integer.valueOf(P1[u]) instanceof Integer q1
                && Integer.valueOf(P2[u]) instanceof Integer q2
                && Integer.valueOf(g0[n + 5 + 4 * u]) instanceof Integer cc
                && Integer.valueOf(q2 - q1) instanceof Integer de
                && Integer.valueOf(M0[u]) instanceof Integer mm
                && Integer.valueOf(Math.min(g0[n + 3 + 4 * u], mm)) instanceof Integer yc
                && Integer.valueOf(ans[u]) instanceof Integer bs
                && Integer.valueOf(N - 1 - q2) instanceof Integer rho
                && (ans[u] = Math.min(bs, (w & 1) == 0
                    ? Math.min(
                        bs > de + 2 ? de + (int) ld.applyAsLong(((long) yc << 21) | q1, cc) : 1000000000,
                        bs > de + 3 ? de + (int) ld.applyAsLong(((long) mm << 21) | (1L << 20) | q1, cc) : 1000000000)
                    : Math.min(
                        bs > de + 2 ? de + (int) ld.applyAsLong(((long) yc << 21) | rho, cc) : 1000000000,
                        Math.min(
                            bs > de + 3 ? de + (int) ld.applyAsLong(((long) mm << 21) | (1L << 20) | rho, cc) : 1000000000,
                            bs > de + 3 ? de + (int) ld.applyAsLong(((long) X[q2] << 21) | (1L << 20) | rho, cc) : 1000000000)))) >= 0) != null
            && (st[0] = 0) == 0
            && IntStream.range(0, N).allMatch(i -> pushI.test(i) && (head[i] < 0 || wk.get().test(head[i])))
            ? Arrays.stream(ans).mapToObj(Integer::toString).collect(Collectors.joining("\n"))
            : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}




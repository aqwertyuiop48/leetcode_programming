import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n && Long.valueOf(a[1]) instanceof Long K
            && new long[n + 1] instanceof long[] G && new long[n + 1] instanceof long[] W && new long[n + 1] instanceof long[] b
            && IntStream.rangeClosed(1, n).filter(i -> (G[i] = G[i - 1] + a[n + i]) >= 0 && (W[i] = i < n ? W[i - 1] + a[1 + i] : W[i - 1]) >= 0 && (b[i] = G[i] - W[i - 1]) > Long.MIN_VALUE).count() >= 0
            && Integer.valueOf(Integer.highestOneBit(n + 1) * 2) instanceof Integer N
            && new long[2 * N] instanceof long[] mn1 && new long[2 * N] instanceof long[] mn2 && new long[2 * N] instanceof long[] lans && new long[2 * N] instanceof long[] lz
            && new long[]{0, 0} instanceof long[] qs
            && new int[n + 2] instanceof int[] stk && new int[]{0} instanceof int[] sp && new int[]{0, 0, 0} instanceof int[] bs && new long[]{1} instanceof long[] an
            && IntStream.range(0, N).filter(p -> (mn2[N + p] = p >= 1 && p <= n ? G[p - 1] - W[p - 1] : 4_000_000_000_000_000_000L) * 0 + (mn1[N + p] = p >= 1 && p <= n ? G[p] - W[p] + 1_000_000_000_000_000_000L : 2_000_000_000_000_000_000L) * 0 == 0).count() >= 0
            && ((LongBinaryOperator) (c, d) -> ((mn1[(int) c] += d) + (lans[(int) c] -= d) + (lz[(int) c] += d)) * 0) instanceof LongBinaryOperator ap
            && ((LongUnaryOperator) u -> lz[(int) u] == 0 ? 0L : (ap.applyAsLong(2 * u, lz[(int) u]) + ap.applyAsLong(2 * u + 1, lz[(int) u]) + (lz[(int) u] = 0)) * 0) instanceof LongUnaryOperator pd
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> cr
            && cr.getAndSet((u, v) -> u >= N ? mn2[(int) u] - Math.min(mn1[(int) u], v)
                : (lz[(int) u] == 0 || pd.applyAsLong(u) == 0) && mn1[2 * (int) u + 1] > v ? Math.min(mn2[2 * (int) u + 1] - v, cr.get().applyAsLong(2 * u, v))
                : Math.min(lans[(int) u], cr.get().applyAsLong(2 * u + 1, v))) == null
            && cr.get() instanceof LongBinaryOperator calc
            && ((LongUnaryOperator) p -> (mn1[(int) p] = Math.min(mn1[2 * (int) p], mn1[2 * (int) p + 1])) * 0 + (lans[(int) p] = calc.applyAsLong(2 * p, mn1[2 * (int) p + 1])) * 0) instanceof LongUnaryOperator pull
            && IntStream.range(1, N).map(u -> N - u).filter(u -> (mn2[u] = Math.min(mn2[2 * u], mn2[2 * u + 1])) > Long.MIN_VALUE && pull.applyAsLong(u) == 0).count() >= 0
            && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> ptr
            && ptr.getAndSet(x -> x <= 1 ? 0L : ptr.get().applyAsLong(x >> 1) + (lz[(int) (x >> 1)] == 0 ? 0L : pd.applyAsLong(x >> 1))) == null
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> clr
            && clr.getAndSet((x, d) -> x <= 1 ? 0L : (x % 2 == 0 ? ap.applyAsLong(x + 1, d) : 0L) + pull.applyAsLong(x >> 1) + clr.get().applyAsLong(x >> 1, d)) == null
            && ((LongBinaryOperator) (q, d) -> ptr.get().applyAsLong(N + q) == 0 && ap.applyAsLong(N + q, d) == 0 && clr.get().applyAsLong(N + q, d) == 0 ? 0L : 1L) instanceof LongBinaryOperator upd
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> fr
            && fr.getAndSet((u, sm) -> Integer.valueOf(Integer.numberOfLeadingZeros((int) u)) instanceof Integer z
                && Integer.valueOf(Integer.numberOfTrailingZeros(N) - (31 - z)) instanceof Integer sh
                && Long.valueOf((u << sh) - N) instanceof Long lo
                ? (lo + (1L << sh) - 1 < qs[0] ? -1L
                    : u >= N ? (calc.applyAsLong(u, sm) <= qs[1] ? lo : -1L)
                    : lo >= qs[0] && calc.applyAsLong(u, sm) > qs[1] ? -1L
                    : pd.applyAsLong(u) == 0 && Long.valueOf(fr.get().applyAsLong(2 * u, Math.min(sm, mn1[2 * (int) u + 1]))) instanceof Long rr
                        ? (rr >= 0 ? rr : fr.get().applyAsLong(2 * u + 1, sm)) : -1L) : -1L) == null
            && ((LongBinaryOperator) (qlo, v) -> (qs[0] = qlo) >= 0 && (qs[1] = v) > Long.MIN_VALUE ? fr.get().applyAsLong(1, 4_000_000_000_000_000_000L) : -1L) instanceof LongBinaryOperator find
            && new AtomicReference<LongUnaryOperator>() instanceof AtomicReference<LongUnaryOperator> clp
            && clp.getAndSet(x -> x <= 1 ? 0L : pull.applyAsLong(x >> 1) + clp.get().applyAsLong(x >> 1)) == null
            && IntStream.rangeClosed(1, n).filter(r -> (r > 1 ? ptr.get().applyAsLong(N + r - 1) + ap.applyAsLong(N + r - 1, -1_000_000_000_000_000_000L) + clp.get().applyAsLong(N + r - 1) : 0L) == 0
                && (bs[0] = sp[0]) >= 0
                && IntStream.iterate(0, i -> sp[0] > 0 && b[stk[sp[0] - 1]] <= b[r], i -> i + 1).filter(i -> (sp[0] >= 2 ? upd.applyAsLong(stk[sp[0] - 2] + 1, b[stk[sp[0] - 1]] - (b[stk[sp[0] - 2]] <= b[r] ? b[stk[sp[0] - 2]] : b[r])) : 0L) == 0 && --sp[0] >= 0).count() >= 0
                && (sp[0] < bs[0] || sp[0] == 0 || upd.applyAsLong(stk[sp[0] - 1] + 1, b[stk[sp[0] - 1]] - b[r]) == 0)
                && (stk[sp[0]++] = r) > 0
                && (bs[0] = 0) == 0 && (bs[1] = sp[0] - 1) >= 0
                && IntStream.range(0, 18).filter(i -> (bs[2] = (bs[0] + bs[1]) / 2) >= 0 && (b[stk[bs[2]]] <= b[r] + K ? (bs[1] = bs[2]) : (bs[0] = bs[2] + 1)) >= 0).count() >= 0
                && (an[0] = Math.max(an[0], r - find.applyAsLong((bs[0] > 0 ? stk[bs[0] - 1] : 0) + 1, K - (b[stk[0]] - b[r])) + 1)) > 0).count() >= 0
            ? an[0] : "");
    }
}

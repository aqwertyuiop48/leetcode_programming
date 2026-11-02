import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) 4000000000000000000L instanceof Long INF && (Long) Long.MIN_VALUE instanceof Long NOCH && (Integer) (Integer.highestOneBit(n + 1) << 1) instanceof Integer N
            && new long[n + 1] instanceof long[] l && new long[n + 1] instanceof long[] r && new long[n + 1] instanceof long[] t
            && IntStream.rangeClosed(1, n).map(i -> (int) ((l[i] = Long.parseLong(tk.nextToken())) * 0 + (r[i] = Long.parseLong(tk.nextToken())) * 0 + (t[i] = Long.parseLong(tk.nextToken())) * 0)).max().isPresent()
            && LongStream.range(0, 2L * N).map(x -> INF).toArray() instanceof long[] mn && new long[2 * N] instanceof long[] ad
            && LongStream.range(0, 2L * N).map(x -> -INF).toArray() instanceof long[] mu
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : (x << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - N).toArray() instanceof int[] lo
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : ((x + 1) << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - 1 - N).toArray() instanceof int[] hi
            && new long[8] instanceof long[] g && new long[]{0, 0} instanceof long[] st && new int[n + 2] instanceof int[] prv && new int[n + 2] instanceof int[] nxt
            && LongStream.range(0, n + 2).map(x -> -INF).toArray() instanceof long[] ua && new long[1] instanceof long[] fin
            && new IntToLongFunction[6] instanceof IntToLongFunction[] F
            && (F[0] = x -> g[1] < lo[x] || hi[x] < g[0] ? 0L
                : g[0] <= lo[x] && hi[x] <= g[1] ? (mn[x] += g[2]) * 0 + (ad[x] += g[2]) * 0
                : F[0].applyAsLong(2 * x) + F[0].applyAsLong(2 * x + 1) + (mn[x] = Math.min(mn[2 * x], mn[2 * x + 1]) + ad[x]) * 0) != null
            && (F[1] = x -> lo[x] == hi[x] ? mn[x] : ad[x] + F[1].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1)) != null
            && (F[2] = x -> lo[x] == hi[x] ? (g[1] != NOCH ? (mn[x] = g[1]) : 0L) * 0 + (g[2] != NOCH ? (mu[x] = g[2]) : 0L) * 0
                : (g[1] != NOCH ? (g[1] -= ad[x]) : 0L) * 0 + F[2].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1) + (g[1] != NOCH ? (g[1] += ad[x]) : 0L) * 0
                    + (mn[x] = Math.min(mn[2 * x], mn[2 * x + 1]) + ad[x]) * 0 + (mu[x] = Math.max(mu[2 * x], mu[2 * x + 1])) * 0) != null
            && (F[3] = x -> hi[x] < g[0] || mn[x] >= g[3] ? -1L : lo[x] == hi[x] ? (long) lo[x]
                : (Long) ((g[3] -= ad[x]) * 0 + ((Long) F[3].applyAsLong(2 * x) instanceof Long r1 && r1 >= 0 ? r1 : F[3].applyAsLong(2 * x + 1))) instanceof Long res && (g[3] += ad[x]) * 0 == 0 ? res : -1L) != null
            && (F[4] = x -> lo[x] == hi[x] ? Math.max(g[5], Math.min(mn[x] + g[7], g[6]))
                : (g[7] += ad[x]) * 0 + (Math.min(mn[2 * x + 1] + g[7], g[6]) >= Math.max(mu[2 * x + 1], g[5])
                    ? (g[5] = Math.max(g[5], mu[2 * x + 1])) * 0 + (g[6] = Math.min(g[6], mn[2 * x + 1] + g[7])) * 0 + F[4].applyAsLong(2 * x)
                    : F[4].applyAsLong(2 * x + 1))) != null
            && (F[5] = x -> x >= N ? (long) (x - N) : F[5].applyAsLong(mu[2 * x + 1] >= g[2] ? 2 * x + 1 : 2 * x)) != null
            && ((LongBinaryOperator) (a, b) -> a > b ? 0L : (g[0] = a) * 0 + (g[1] = b) * 0 + F[0].applyAsLong(1)) instanceof LongBinaryOperator aR
            && ((LongBinaryOperator) (i, v) -> (g[0] = i) * 0 + (g[1] = v) * 0 + (g[2] = NOCH) * 0 + F[2].applyAsLong(1)) instanceof LongBinaryOperator sS
            && ((LongBinaryOperator) (i, v) -> (g[0] = i) * 0 + (g[1] = NOCH) * 0 + (g[2] = v) * 0 + F[2].applyAsLong(1)) instanceof LongBinaryOperator sU
            && ((LongBinaryOperator) (i, v) -> (g[0] = i) * 0 + (g[1] = v) * 0 + (g[2] = ua[n + 1]) * 0 + F[2].applyAsLong(1)) instanceof LongBinaryOperator sB
            && ((LongBinaryOperator) (i, v) -> (g[0] = i) * 0 + (g[1] = INF) * 0 + (g[2] = -INF) * 0 + F[2].applyAsLong(1)) instanceof LongBinaryOperator kill
            && sS.applyAsLong(0, -1) == 0L
            && ((IntToLongFunction) i -> (Long) (Math.max(st[1] + 1, l[i]) + t[i] - 1) instanceof Long e
                && sB.applyAsLong(i, Math.max(st[1] + 1, l[i]) - l[i]) == 0L && (ua[i] = ua[n + 1]) * 0 == 0 && (ua[n + 1] = e - st[1]) * 0 == 0
                && sU.applyAsLong(n + 1, ua[n + 1]) == 0L && (prv[i] = (int) st[0]) >= 0 && ((st[0] == 0 ? 0 : (nxt[(int) st[0]] = i)) >= 0) && (st[0] = i) > 0 && (st[1] = e) > 0 ? 0L : 0L) instanceof IntToLongFunction app
            && ((IntToLongFunction) k -> (Integer) prv[k] instanceof Integer p && (Integer) nxt[k] instanceof Integer q && (Long) ua[k] instanceof Long uk
                && (nxt[p] = q) >= 0 && (q == 0 ? (st[0] = p) >= 0 : (prv[q] = p) >= 0)
                && kill.applyAsLong(k, 0) == 0L && (ua[k] = -INF) < 0
                && (q == 0 ? (Long) ua[n + 1] instanceof Long wk && (st[1] -= wk) >= 0 && (ua[n + 1] = uk) * 0 == 0 && sU.applyAsLong(n + 1, uk) == 0L
                    : (Long) ua[q] instanceof Long wk2 && (ua[q] = uk) * 0 == 0 && sU.applyAsLong(q, uk) == 0L && (fin[0] = wk2) > 0
                        && Stream.iterate(new long[]{q, wk2}, s -> s[0] >= 0, s -> (g[0] = s[0]) > 0 && (g[3] = s[1]) > 0 && (Long) F[3].applyAsLong(1) instanceof Long j
                            ? j < 0 ? (g[2] = -s[1]) < 0 && aR.applyAsLong(s[0], n) == 0L && (fin[0] = s[1]) > 0 ? new long[]{-1, 0} : new long[]{-1, 0}
                                : (g[2] = -s[1]) < 0 && aR.applyAsLong(s[0], j - 1) == 0L && (g[0] = j) > 0 && (Long) F[1].applyAsLong(1) instanceof Long sj
                                    && sS.applyAsLong(j, 0) == 0L && (Integer) (nxt[(int) (long) j] == 0 ? n + 1 : nxt[(int) (long) j]) instanceof Integer sc
                                    && (ua[sc] += s[1] - sj) * 0 == 0 && sU.applyAsLong(sc, ua[sc]) == 0L && (fin[0] = sj) >= 0 ? new long[]{sj == 0 ? -1 : j + 1, sj} : new long[]{-1, 0}
                            : new long[]{-1, 0}).count() >= 0
                        && (st[1] -= fin[0]) >= 0) ? 0L : 0L) instanceof IntToLongFunction remove
            && ((IntUnaryOperator) i -> (Long) (Math.max(st[1] + 1, l[i]) + t[i] - 1) instanceof Long e0 && e0 <= r[i] ? (int) app.applyAsLong(i)
                : st[0] == 0 ? -1
                : (Long) (st[1] + 1 - l[i]) instanceof Long cap && cap > 0 && (g[5] = -INF) < 0 && (g[6] = INF) > 0 && (g[7] = 0) == 0 && (Long) F[4].applyAsLong(1) instanceof Long vmax
                    && (Long) Math.min(vmax, cap) instanceof Long vv && vv > 0 && (Long) (Math.max(st[1] - vv + 1, l[i]) + t[i] - 1) instanceof Long na && na <= r[i] && na < st[1]
                    && (g[2] = vv) > 0 && (Long) F[5].applyAsLong(1) instanceof Long jj && (Integer) (jj == n + 1 ? (int) st[0] : prv[(int) (long) jj]) instanceof Integer kk
                    && remove.applyAsLong(kk) == 0L && app.applyAsLong(i) == 0L ? kk : -1) instanceof IntUnaryOperator step
            ? IntStream.rangeClosed(1, n).map(step).boxed().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

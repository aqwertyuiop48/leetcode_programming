import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) 4000000000000000000L instanceof Long INF && (Integer) (Integer.highestOneBit(n + 1) << 1) instanceof Integer N
            && new long[n + 1] instanceof long[] l && new long[n + 1] instanceof long[] r && new long[n + 1] instanceof long[] t
            && IntStream.rangeClosed(1, n).map(i -> (int) ((l[i] = Long.parseLong(tk.nextToken())) * 0 + (r[i] = Long.parseLong(tk.nextToken())) * 0 + (t[i] = Long.parseLong(tk.nextToken())) * 0)).max().isPresent()
            && LongStream.range(0, 2L * N).map(x -> INF).toArray() instanceof long[] mn && new long[2 * N] instanceof long[] ad
            && LongStream.range(0, 2L * N).map(x -> -INF).toArray() instanceof long[] wt
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : (x << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - N).toArray() instanceof int[] lo
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : ((x + 1) << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - 1 - N).toArray() instanceof int[] hi
            && new long[8] instanceof long[] g && new long[]{0, 0} instanceof long[] ans && new int[n + 2] instanceof int[] prv && new int[n + 2] instanceof int[] nxt && new int[]{0} instanceof int[] tail
            && new int[n + 2] instanceof int[] bd && new int[]{0} instanceof int[] bc && new long[]{0} instanceof long[] fin
            && new IntToLongFunction[7] instanceof IntToLongFunction[] F
            && (F[0] = x -> g[1] < lo[x] || hi[x] < g[0] ? 0L
                : g[0] <= lo[x] && hi[x] <= g[1] ? (mn[x] += g[2]) * 0 + (ad[x] += g[2]) * 0
                : F[0].applyAsLong(2 * x) + F[0].applyAsLong(2 * x + 1) + (mn[x] = Math.min(mn[2 * x], mn[2 * x + 1]) + ad[x]) * 0) != null
            && (F[1] = x -> lo[x] == hi[x] ? mn[x] : ad[x] + F[1].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1)) != null
            && (F[2] = x -> lo[x] == hi[x] ? (mn[x] = g[2]) * 0
                : (g[2] -= ad[x]) * 0 + F[2].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1) + (mn[x] = Math.min(mn[2 * x], mn[2 * x + 1]) + ad[x]) * 0) != null
            && (F[3] = x -> hi[x] < g[0] || mn[x] >= g[3] ? -1L : lo[x] == hi[x] ? (long) lo[x]
                : (Long) ((g[3] -= ad[x]) * 0 + ((Long) F[3].applyAsLong(2 * x) instanceof Long r1 && r1 >= 0 ? r1 : F[3].applyAsLong(2 * x + 1))) instanceof Long res && (g[3] += ad[x]) * 0 == 0 ? res : -1L) != null
            && (F[4] = x -> g[4] <= g[5] ? 0L
                : wt[x] <= g[5] ? (g[4] = Math.min(g[4], mn[x] + g[6])) * 0
                : mn[x] + g[6] >= g[4] ? (g[5] = Math.max(g[5], Math.min(wt[x], g[4]))) * 0
                : lo[x] == hi[x] ? (g[5] = Math.max(g[5], Math.min(wt[x], g[4]))) * 0 + (g[4] = mn[x] + g[6]) * 0
                : (g[6] += ad[x]) * 0 + F[4].applyAsLong(2 * x + 1) + F[4].applyAsLong(2 * x) + (g[6] -= ad[x]) * 0) != null
            && (F[5] = x -> lo[x] == hi[x] ? (wt[x] = g[2]) * 0
                : F[5].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1) + (wt[x] = Math.max(wt[2 * x], wt[2 * x + 1])) * 0) != null
            && (F[6] = x -> x >= N ? (long) (x - N) : F[6].applyAsLong(wt[2 * x + 1] >= g[2] ? 2 * x + 1 : 2 * x)) != null
            && ((IntToLongFunction) x -> (g[0] = x) * 0 + F[1].applyAsLong(1) + l[x] + t[x] - 1) instanceof IntToLongFunction E
            && ((LongBinaryOperator) (x, v) -> (g[0] = x) * 0 + (g[2] = v) * 0 + F[2].applyAsLong(1)) instanceof LongBinaryOperator setMn
            && ((LongBinaryOperator) (x, v) -> (g[0] = x) * 0 + (g[2] = v) * 0 + F[5].applyAsLong(1)) instanceof LongBinaryOperator setW
            && ((LongBinaryOperator) (a, b) -> a > b ? 0L : (g[0] = a) * 0 + (g[1] = b) * 0 + F[0].applyAsLong(1)) instanceof LongBinaryOperator addRange
            && ((IntUnaryOperator) i -> (Long) Math.max(ans[0] + 1, l[i]) instanceof Long s && (Long) (s + t[i] - 1) instanceof Long e
                && setMn.applyAsLong(i, s - l[i]) == 0 && setW.applyAsLong(i, e - ans[0]) == 0
                && (prv[i] = tail[0]) >= 0 && (nxt[tail[0]] = i) > 0 && (tail[0] = i) > 0 && (ans[0] = e) > 0 ? 0 : 0) instanceof IntUnaryOperator app
            && ((IntUnaryOperator) x -> (Long) (prv[x] == 0 ? 0L : E.applyAsLong(prv[x])) instanceof Long ep && setW.applyAsLong(x, E.applyAsLong(x) - ep) == 0 ? 0 : 0) instanceof IntUnaryOperator fixW
            && ((IntUnaryOperator) k -> (Integer) prv[k] instanceof Integer p && (Integer) nxt[k] instanceof Integer q && (Long) wt[N + k] instanceof Long dk
                && (nxt[p] = q) >= 0 && (q == 0 ? (tail[0] = p) >= 0 : (prv[q] = p) >= 0)
                && setMn.applyAsLong(k, INF) == 0 && setW.applyAsLong(k, -INF) == 0 && (bc[0] = 0) == 0 && (fin[0] = dk) > 0
                && Stream.iterate(new long[]{q, dk}, st -> st[0] > 0, st -> (g[0] = st[0]) > 0 && (g[3] = st[1]) > 0 && (Long) F[3].applyAsLong(1) instanceof Long j
                        && (g[2] = -st[1]) < 0 && addRange.applyAsLong(st[0], j < 0 ? tail[0] : j - 1) == 0
                        && j >= 0 && (g[0] = j) >= 0 && (Long) F[1].applyAsLong(1) instanceof Long sj && (g[2] = -sj) <= 0 && addRange.applyAsLong(j, j) == 0
                        && (bd[bc[0]++] = (int) (long) j) >= 0 && (fin[0] = sj) >= 0 ? new long[]{sj == 0 ? 0 : j + 1, sj} : new long[]{0, 0}).count() >= 0
                && (q == 0 || fixW.applyAsInt(q) == 0) && IntStream.range(0, bc[0]).allMatch(z -> fixW.applyAsInt(bd[z]) == 0 || true)
                && (ans[0] -= fin[0]) > 0 ? 0 : 0) instanceof IntUnaryOperator remove
            && ((IntUnaryOperator) i -> (Long) Math.max(ans[0] + 1, l[i]) instanceof Long s0 && s0 + t[i] - 1 <= r[i] ? app.applyAsInt(i)
                : tail[0] == 0 ? -1
                : (Long) (ans[0] + 1 - l[i]) instanceof Long cap && (g[4] = cap) > 0 && (g[5] = 0) == 0 && (g[6] = 0) == 0 && F[4].applyAsLong(1) == 0 && (Long) g[5] instanceof Long vv && vv > 0
                    && (Long) (Math.max(ans[0] - vv + 1, l[i]) + t[i] - 1) instanceof Long na && na <= r[i] && na < ans[0]
                    && (g[2] = vv) > 0 && (Long) F[6].applyAsLong(1) instanceof Long kk && remove.applyAsInt((int) (long) kk) == 0 && app.applyAsInt(i) == 0 ? (int) (long) kk : -1) instanceof IntUnaryOperator step
            ? IntStream.rangeClosed(1, n).map(step).boxed().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

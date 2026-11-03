import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[3] instanceof int[] s && new int[buf.length / 2 + 4] instanceof int[] tk
            && IntStream.rangeClosed(0, buf.length).filter(i -> i < buf.length && buf[i] >= '0'
                ? (s[0] = s[0] * 10 + buf[i] - '0') >= 0 && (s[2] = 1) > 0
                : s[2] == 1 && (tk[s[1]++] = s[0]) >= 0 && (s[0] = 0) == 0 && (s[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && IntStream.range(0, n).mapToLong(i -> ((long) tk[2 + 2 * i] << 36) + ((long) tk[3 + 2 * i] << 18) + i).toArray() instanceof long[] rec
            && Arrays.stream(rec).map(x -> x & 68719476735L).sorted().toArray() instanceof long[] byE
            && new int[n] instanceof int[] rank && IntStream.range(0, n).allMatch(r -> (rank[(int) (byE[r] & 262143L)] = r + 1) > 0)
            && new long[n + 1] instanceof long[] pre && IntStream.range(0, n).allMatch(r -> (pre[r + 1] = pre[r] + (byE[r] >> 18)) >= 0)
            && Arrays.stream(rec).map(x -> ((x >> 36) << 18) | rank[(int) (x & 262143L)]).sorted().toArray() instanceof long[] byP
            && new int[n + 3] instanceof int[] cm
            && Arrays.stream(rec).filter(x -> (x >> 36) <= n && (cm[(int) (x >> 36) + 1] += 1) > 0).count() >= 0
            && IntStream.range(1, n + 3).allMatch(i -> (cm[i] += cm[i - 1]) >= 0)
            && new long[1048577] instanceof long[] g
            && ((IntBinaryOperator) (r, d) -> Long.valueOf(d * ((byE[r - 1] >> 18) + 1099511627776L)) instanceof Long x && Integer.valueOf(r) instanceof Integer j0 && (g[j0] += x) >= 0
                && Integer.valueOf(Math.min(j0 + (j0 & -j0), 1048576)) instanceof Integer j1 && (g[j1] += x) >= 0
                && Integer.valueOf(Math.min(j1 + (j1 & -j1), 1048576)) instanceof Integer j2 && (g[j2] += x) >= 0
                && Integer.valueOf(Math.min(j2 + (j2 & -j2), 1048576)) instanceof Integer j3 && (g[j3] += x) >= 0
                && Integer.valueOf(Math.min(j3 + (j3 & -j3), 1048576)) instanceof Integer j4 && (g[j4] += x) >= 0
                && Integer.valueOf(Math.min(j4 + (j4 & -j4), 1048576)) instanceof Integer j5 && (g[j5] += x) >= 0
                && Integer.valueOf(Math.min(j5 + (j5 & -j5), 1048576)) instanceof Integer j6 && (g[j6] += x) >= 0
                && Integer.valueOf(Math.min(j6 + (j6 & -j6), 1048576)) instanceof Integer j7 && (g[j7] += x) >= 0
                && Integer.valueOf(Math.min(j7 + (j7 & -j7), 1048576)) instanceof Integer j8 && (g[j8] += x) >= 0
                && Integer.valueOf(Math.min(j8 + (j8 & -j8), 1048576)) instanceof Integer j9 && (g[j9] += x) >= 0
                && Integer.valueOf(Math.min(j9 + (j9 & -j9), 1048576)) instanceof Integer j10 && (g[j10] += x) >= 0
                && Integer.valueOf(Math.min(j10 + (j10 & -j10), 1048576)) instanceof Integer j11 && (g[j11] += x) >= 0
                && Integer.valueOf(Math.min(j11 + (j11 & -j11), 1048576)) instanceof Integer j12 && (g[j12] += x) >= 0
                && Integer.valueOf(Math.min(j12 + (j12 & -j12), 1048576)) instanceof Integer j13 && (g[j13] += x) >= 0
                && Integer.valueOf(Math.min(j13 + (j13 & -j13), 1048576)) instanceof Integer j14 && (g[j14] += x) >= 0
                && Integer.valueOf(Math.min(j14 + (j14 & -j14), 1048576)) instanceof Integer j15 && (g[j15] += x) >= 0
                && Integer.valueOf(Math.min(j15 + (j15 & -j15), 1048576)) instanceof Integer j16 && (g[j16] += x) >= 0
                && Integer.valueOf(Math.min(j16 + (j16 & -j16), 1048576)) instanceof Integer j17 && (g[j17] += x) >= 0
                && Integer.valueOf(Math.min(j17 + (j17 & -j17), 1048576)) instanceof Integer j18 && (g[j18] += x) >= 0
                ? 0 : 0) instanceof IntBinaryOperator upd
            && ((LongBinaryOperator) (a, mode) -> new long[]{0, 0, a} instanceof long[] st
                && IntStream.rangeClosed(0, 17).map(i -> Integer.highestOneBit(n) >> i)
                    .filter(q -> q > 0 && st[0] + q <= n
                        && (mode == 1 ? g[(int) st[0] + q] >> 40 : q - (g[(int) st[0] + q] >> 40)) <= st[2]
                        && (st[2] -= mode == 1 ? g[(int) st[0] + q] >> 40 : q - (g[(int) st[0] + q] >> 40)) >= 0
                        && (st[1] += mode == 1 ? g[(int) st[0] + q] & 1099511627775L : pre[(int) st[0] + q] - pre[(int) st[0]] - (g[(int) st[0] + q] & 1099511627775L)) >= 0
                        && (st[0] += q) > 0).count() >= 0
                ? st[1] : -1L) instanceof LongBinaryOperator desc
            && ((LongUnaryOperator) P0 -> Integer.valueOf((int) P0) instanceof Integer j0 && Integer.valueOf(j0 & (j0 - 1)) instanceof Integer j1 && Integer.valueOf(j1 & (j1 - 1)) instanceof Integer j2 && Integer.valueOf(j2 & (j2 - 1)) instanceof Integer j3 && Integer.valueOf(j3 & (j3 - 1)) instanceof Integer j4 && Integer.valueOf(j4 & (j4 - 1)) instanceof Integer j5 && Integer.valueOf(j5 & (j5 - 1)) instanceof Integer j6 && Integer.valueOf(j6 & (j6 - 1)) instanceof Integer j7 && Integer.valueOf(j7 & (j7 - 1)) instanceof Integer j8 && Integer.valueOf(j8 & (j8 - 1)) instanceof Integer j9 && Integer.valueOf(j9 & (j9 - 1)) instanceof Integer j10 && Integer.valueOf(j10 & (j10 - 1)) instanceof Integer j11 && Integer.valueOf(j11 & (j11 - 1)) instanceof Integer j12 && Integer.valueOf(j12 & (j12 - 1)) instanceof Integer j13 && Integer.valueOf(j13 & (j13 - 1)) instanceof Integer j14 && Integer.valueOf(j14 & (j14 - 1)) instanceof Integer j15 && Integer.valueOf(j15 & (j15 - 1)) instanceof Integer j16 && Integer.valueOf(j16 & (j16 - 1)) instanceof Integer j17 && Integer.valueOf(j17 & (j17 - 1)) instanceof Integer j18
                ? g[j0] + g[j1] + g[j2] + g[j3] + g[j4] + g[j5] + g[j6] + g[j7] + g[j8] + g[j9] + g[j10] + g[j11] + g[j12] + g[j13] + g[j14] + g[j15] + g[j16] + g[j17] + g[j18] : 0L) instanceof LongUnaryOperator pq
            && LongStream.concat(LongStream.of(Long.MAX_VALUE), IntStream.rangeClosed(0, n).mapToLong(P ->
                IntStream.range(cm[P], cm[P + 1]).map(q -> upd.applyAsInt((int) (byP[q] & 262143L), 1)).sum() >= 0
                && IntStream.range(P >= 2 ? cm[P - 2] : 0, P >= 2 ? cm[P - 1] : 0).map(q -> upd.applyAsInt((int) (byP[q] & 262143L), -1)).sum() >= 0
                && Integer.valueOf(cm[P + 1] - cm[Math.max(P - 1, 0)]) instanceof Integer c
                && Integer.valueOf(Math.max(0, n - cm[P + 1] + c + 1 - k)) instanceof Integer t
                && t <= c && t <= P
                ? pq.applyAsLong(P) >> 40 >= t
                    ? pre[P]
                    : desc.applyAsLong(t, 1) + desc.applyAsLong(P - t, 0)
                : Long.MAX_VALUE)).boxed().min(Comparator.naturalOrder()).get() instanceof Long best
            ? best == Long.MAX_VALUE ? -1L : best : "");
    }
}

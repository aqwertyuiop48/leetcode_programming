
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 && (i == 0 || raw[i - 1] < 48)).toArray() instanceof int[] ts
            && ((IntUnaryOperator) j -> IntStream.iterate(ts[j], i -> i < raw.length && raw[i] >= 48, i -> i + 1).reduce(0, (a, i) -> a * 10 + raw[i] - 48)) instanceof IntUnaryOperator num
            && Integer.valueOf(num.applyAsInt(0)) instanceof Integer n && Integer.valueOf(num.applyAsInt(1)) instanceof Integer m && Integer.valueOf(num.applyAsInt(2)) instanceof Integer k
            && Integer.valueOf(k + 1) instanceof Integer K && Integer.valueOf(Math.max(n, m) + 2) instanceof Integer M
            && new int[(n + 1) * (m + 1)] instanceof int[] P
            && IntStream.range(0, n * m).allMatch(x -> (P[(x / m + 1) * (m + 1) + x % m + 1] = P[(x / m) * (m + 1) + x % m + 1] + P[(x / m + 1) * (m + 1) + x % m] - P[(x / m) * (m + 1) + x % m] + raw[ts[3 + x / m] + x % m] - 48) >= 0)
            && new short[n * m] instanceof short[] pu0 && new short[n * m] instanceof short[] pd0 && new short[n * m] instanceof short[] pu1 && new short[n * m] instanceof short[] pd1
            && IntStream.range(0, n * m).allMatch(x -> (pu0[x] = (short) (raw[ts[3 + x % n] + x / n] == 49 ? x % n : x % n == 0 ? -1 : pu0[x - 1])) > -5)
            && IntStream.iterate(n * m - 1, x -> x >= 0, x -> x - 1).allMatch(x -> (pd0[x] = (short) (raw[ts[3 + x % n] + x / n] == 49 ? x % n : x % n == n - 1 ? n : pd0[x + 1])) > -5)
            && IntStream.range(0, n * m).allMatch(x -> (pu1[x] = (short) (raw[ts[3 + x / m] + x % m] == 49 ? x % m : x % m == 0 ? -1 : pu1[x - 1])) > -5)
            && IntStream.iterate(n * m - 1, x -> x >= 0, x -> x - 1).allMatch(x -> (pd1[x] = (short) (raw[ts[3 + x / m] + x % m] == 49 ? x % m : x % m == m - 1 ? m : pd1[x + 1])) > -5)
            && new short[][]{pu0, pu1} instanceof short[][] PU && new short[][]{pd0, pd1} instanceof short[][] ND && new int[]{n, m} instanceof int[] Hh
            && new int[M * K] instanceof int[] CU && new int[M * K] instanceof int[] CD && new int[M] instanceof int[] CU0 && new int[M] instanceof int[] CD0
            && new int[5][K] instanceof int[][] H && new int[5] instanceof int[] pt && new int[8] instanceof int[] c
            && new long[9] instanceof long[] st && new long[1] instanceof long[] tot
            && ((LongUnaryOperator) t -> t >> 44 > k ? -1L : t & 0xFFFFFFFFFFFL) instanceof LongUnaryOperator dec
            && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> cs
            && cs.compareAndSet(null, a -> a > k ? 0L : (long) (a == 0 ? c[3] - 1 - H[0][0] : H[0][a - 1] - H[0][a]) * (k - a == 0 ? H[1][0] - c[3] : H[1][k - a] - H[1][k - a - 1])
                + ((long) ((H[0][a] == c[3] - 1 ? 1 : 0) + (H[1][a] == c[3] ? 1 : 0)) << 44) + cs.get().applyAsLong(a + 1))
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> rs
            && rs.compareAndSet(null, i -> i >= K || ((H[0][i] = c[1] - 1) + (H[1][i] = c[2]) > -999999 && rs.get().test(i + 1)))
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> mg
            && mg.compareAndSet(null, i -> i >= K || ((H[2][i] = H[0][pt[0]] >= CU[pt[2] + pt[1]] ? H[0][pt[0]++] : CU[pt[2] + pt[1]++]) > -9
                & (H[3][i] = H[1][pt[3]] <= CD[pt[2] + pt[4]] ? H[1][pt[3]++] : CD[pt[2] + pt[4]++]) > -9 && mg.get().test(i + 1)))
            && ((IntPredicate) r -> (pt[0] = 0) + (pt[1] = 0) + (pt[3] = 0) + (pt[4] = 0) == 0 && (pt[2] = r * K) >= 0 && mg.get().test(0)
                && (H[4] = H[0]) != null && (H[0] = H[2]) != null && (H[2] = H[4]) != null && (H[4] = H[1]) != null && (H[1] = H[3]) != null && (H[3] = H[4]) != null
                && (st[2] = dec.applyAsLong(cs.get().applyAsLong(0))) > -5 && (st[0] = H[0][k]) > -5 && (st[1] = H[1][k]) > -5 && st[2] >= 0) instanceof IntPredicate evt
            && ((IntPredicate) x -> (st[7] = st[6]) >= 0 & (st[8] = st[6] == st[5] ? 1 : 0) >= 0 & (st[6] = st[6] + 1 >= c[6] ? ++st[5] : st[6] + 1) >= 0
                && ((st[8] == 0 || (rs.get().test(0) && (st[0] = c[1] - 1) > -9 && (st[1] = c[2]) > -9 && (st[2] = k == 0 ? (long) (c[3] - c[1]) * (c[2] - c[3]) : 0L) >= 0 && (st[3] = 0) == 0))
                    && (st[3] == 1 || (((CU0[(int) st[7]] > st[0] || CD0[(int) st[7]] < st[1]) && !evt.test((int) st[7])) ? (st[3] = 1) > 0 : (tot[0] += st[2]) >= 0))
                    || true)) instanceof IntPredicate pr
            && ((IntPredicate) x -> (CU[x] = x % K == 0 ? Math.max(c[1] - 1, PU[c[0]][(x / K + c[4]) * Hh[c[0]] + c[3] - 1]) : CU[x - 1] <= c[1] ? c[1] - 1 : Math.max(c[1] - 1, PU[c[0]][(x / K + c[4]) * Hh[c[0]] + CU[x - 1] - 1])) > -2
                & (CD[x] = x % K == 0 ? Math.min(c[2], ND[c[0]][(x / K + c[4]) * Hh[c[0]] + c[3]]) : CD[x - 1] >= c[2] - 1 ? c[2] : Math.min(c[2], ND[c[0]][(x / K + c[4]) * Hh[c[0]] + CD[x - 1] + 1])) > -2
                & (x % K != 0 || (CU0[x / K] = CU[x]) > -2 & (CD0[x / K] = CD[x]) > -2)) instanceof IntPredicate colf
            && ((Predicate<int[]>) q -> (c[0] = q[0]) + (c[1] = q[1]) + (c[2] = q[2]) + (c[3] = q[3]) + (c[4] = q[4]) + (c[5] = q[5]) >= 0 && (c[6] = c[5] - c[4]) > 0
                && (st[5] = 0) + (st[6] = 0) == 0
                && IntStream.range(0, c[6] * K).allMatch(colf) && IntStream.range(0, c[6] * (c[6] + 1) / 2).allMatch(pr)) instanceof Predicate<int[]> cross
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> slv
            && slv.compareAndSet(null, q -> q[1] - q[0] <= 4 && q[3] - q[2] <= 4
                ? Integer.valueOf(q[1] - q[0]) instanceof Integer h && Integer.valueOf(q[3] - q[2]) instanceof Integer w
                    && (tot[0] += IntStream.range(0, h * h * w * w).filter(z -> q[0] + z % h <= q[0] + z / h % h && q[2] + z / (h * h) % w <= q[2] + z / (h * h * w)
                        && P[(q[0] + z / h % h + 1) * (m + 1) + q[2] + z / (h * h * w) + 1] - P[(q[0] + z % h) * (m + 1) + q[2] + z / (h * h * w) + 1]
                            - P[(q[0] + z / h % h + 1) * (m + 1) + q[2] + z / (h * h) % w] + P[(q[0] + z % h) * (m + 1) + q[2] + z / (h * h) % w] == k).count()) >= 0
                : q[1] - q[0] >= q[3] - q[2]
                    ? Integer.valueOf((q[0] + q[1]) / 2) instanceof Integer mid && cross.test(new int[]{0, q[0], q[1], mid, q[2], q[3]})
                        && slv.get().test(new int[]{q[0], mid, q[2], q[3]}) && slv.get().test(new int[]{mid, q[1], q[2], q[3]})
                    : Integer.valueOf((q[2] + q[3]) / 2) instanceof Integer mid2 && cross.test(new int[]{1, q[2], q[3], mid2, q[0], q[1]})
                        && slv.get().test(new int[]{q[0], q[1], q[2], mid2}) && slv.get().test(new int[]{q[0], q[1], mid2, q[3]}))
            && slv.get().test(new int[]{0, n, 0, m})
            ? tot[0] : "");
    }
}




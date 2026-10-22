import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && new StringTokenizer(L.get(0)) instanceof StringTokenizer tk && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m && Integer.valueOf(tk.nextToken()) instanceof Integer k
            && new int[(n + 1) * (m + 1)] instanceof int[] P && new int[(m + 1) * (n + 1)] instanceof int[] PT
            && IntStream.range(0, n * m).allMatch(x -> Integer.valueOf(x / m) instanceof Integer i && Integer.valueOf(x % m) instanceof Integer j && Integer.valueOf(L.get(1 + i).charAt(j) - '0') instanceof Integer v
                && (P[(i + 1) * (m + 1) + j + 1] = P[i * (m + 1) + j + 1] + P[(i + 1) * (m + 1) + j] - P[i * (m + 1) + j] + v) >= 0)
            && IntStream.range(0, n * m).allMatch(y -> Integer.valueOf(y % n) instanceof Integer i && Integer.valueOf(y / n) instanceof Integer j && Integer.valueOf(L.get(1 + i).charAt(j) - '0') instanceof Integer v
                && (PT[(j + 1) * (n + 1) + i + 1] = PT[j * (n + 1) + i + 1] + PT[(j + 1) * (n + 1) + i] - PT[j * (n + 1) + i] + v) >= 0)
            && new long[1] instanceof long[] tot && new int[Math.max(n, m) + 2] instanceof int[] tc && new int[Math.max(n, m) + 2] instanceof int[] bc && new int[Math.max(n, m) + 2] instanceof int[] bn
            && ((BiPredicate<int[], int[]>) (arr, pr) -> Integer.valueOf(pr[0]) instanceof Integer W && Integer.valueOf(pr[1]) instanceof Integer lo && Integer.valueOf(pr[2]) instanceof Integer hi && Integer.valueOf(pr[3]) instanceof Integer mid
                && Integer.valueOf(pr[4]) instanceof Integer clo && Integer.valueOf(pr[5]) instanceof Integer chi
                && ((IntBinaryOperator) (rp, cp) -> arr[((rp & 4095) + 1) * W + (cp & 4095) + 1] - arr[(rp >> 12) * W + (cp & 4095) + 1] - arr[((rp & 4095) + 1) * W + (cp >> 12)] + arr[(rp >> 12) * W + (cp >> 12)]) instanceof IntBinaryOperator cn
                && new int[k + 1] instanceof int[] up && new int[k + 1] instanceof int[] dn && new int[5] instanceof int[] ctx 
                && IntStream.range(clo, chi).allMatch(x -> (tc[x] = cn.applyAsInt(lo << 12 | (mid - 1), x << 12 | x)) >= 0 & (bc[x] = cn.applyAsInt(mid << 12 | (hi - 1), x << 12 | x)) >= 0 & (bn[x] = cn.applyAsInt((mid - 1) << 12 | mid, x << 12 | x)) >= 0) && new boolean[]{true} instanceof boolean[] mv && new long[1] instanceof long[] last
                && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> gu && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> gd
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> bu && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> bd
                && bu.compareAndSet(null, (c, pk) -> (pk >> 12) == (pk & 4095) ? pk & 4095 : cn.applyAsInt(((pk >> 12) + (pk & 4095)) / 2 << 12 | (mid - 1), ctx[0] << 12 | ctx[1]) <= c
                    ? bu.get().applyAsInt(c, (pk >> 12) << 12 | ((pk >> 12) + (pk & 4095)) / 2) : bu.get().applyAsInt(c, (((pk >> 12) + (pk & 4095)) / 2 + 1) << 12 | (pk & 4095)))
                && bd.compareAndSet(null, (c, pk) -> (pk >> 12) == (pk & 4095) ? pk & 4095 : cn.applyAsInt(mid << 12 | ((pk >> 12) + (pk & 4095) + 1) / 2, ctx[0] << 12 | ctx[1]) <= c
                    ? bd.get().applyAsInt(c, ((pk >> 12) + (pk & 4095) + 1) / 2 << 12 | (pk & 4095)) : bd.get().applyAsInt(c, (pk >> 12) << 12 | (((pk >> 12) + (pk & 4095) + 1) / 2 - 1)))
                && gu.compareAndSet(null, c -> c >= Math.min(k + 1, ctx[2]) || (cn.applyAsInt(up[c] << 12 | (mid - 1), ctx[0] << 12 | ctx[1]) <= c || (mv[0] = true) && (up[c] = bu.get().applyAsInt(c, (up[c] + 1) << 12 | mid)) > -1) && gu.get().test(c + 1))
                && gd.compareAndSet(null, c -> c >= Math.min(k + 1, ctx[3]) || (cn.applyAsInt(mid << 12 | dn[c], ctx[0] << 12 | ctx[1]) <= c || (mv[0] = true) && (dn[c] = bd.get().applyAsInt(c, (mid - 1) << 12 | (dn[c] - 1))) > -2) && gd.get().test(c + 1))
                && new AtomicReference<IntToLongFunction>() instanceof AtomicReference<IntToLongFunction> sm
                && sm.compareAndSet(null, a -> a > k ? 0L : (long) (a == 0 ? mid - up[0] : up[a - 1] - up[a]) * (k - a == 0 ? dn[0] - mid + 1 : dn[k - a] - dn[k - a - 1]) + sm.get().applyAsLong(a + 1))
                && IntStream.range(clo, chi).allMatch(l -> IntStream.rangeClosed(0, k).allMatch(c -> (up[c] = lo) >= 0 & (dn[c] = hi - 1) >= 0) && (mv[0] = true) && (ctx[0] = l) >= 0 & (ctx[2] = 0) == 0 & (ctx[3] = 0) == 0 & (ctx[4] = 0) == 0
                    && (IntStream.rangeClosed(l, chi - 1).map(r -> (ctx[4] += bn[r]) > k || (ctx[1] = r) >= 0 & (ctx[2] += tc[r]) >= 0 & (ctx[3] += bc[r]) >= 0
                            && (tc[r] == 0 || gu.get().test(0)) && (bc[r] == 0 || gd.get().test(0))
                            && (!mv[0] || !(mv[0] = false) && (last[0] = sm.get().applyAsLong(0)) >= 0)
                            && (tot[0] += last[0]) >= 0 ? 1 : 0).sum() >= 0))) instanceof BiPredicate<int[], int[]> cross
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> slv
            && slv.compareAndSet(null, q -> q[1] - q[0] <= 4 && q[3] - q[2] <= 4
                ? (tot[0] += IntStream.range(0, (q[1] - q[0]) * (q[1] - q[0]) * (q[3] - q[2]) * (q[3] - q[2])).filter(z -> Integer.valueOf(q[1] - q[0]) instanceof Integer h && Integer.valueOf(q[3] - q[2]) instanceof Integer w
                    && Integer.valueOf(q[0] + z % h) instanceof Integer r1 && Integer.valueOf(q[0] + z / h % h) instanceof Integer r2 && Integer.valueOf(q[2] + z / (h * h) % w) instanceof Integer c1 && Integer.valueOf(q[2] + z / (h * h * w)) instanceof Integer c2
                    && r1 <= r2 && c1 <= c2 && P[(r2 + 1) * (m + 1) + c2 + 1] - P[r1 * (m + 1) + c2 + 1] - P[(r2 + 1) * (m + 1) + c1] + P[r1 * (m + 1) + c1] == k).count()) >= 0
                : q[1] - q[0] >= q[3] - q[2]
                    ? Integer.valueOf((q[0] + q[1]) / 2) instanceof Integer mid && cross.test(P, new int[]{m + 1, q[0], q[1], mid, q[2], q[3]})
                        && slv.get().test(new int[]{q[0], mid, q[2], q[3]}) && slv.get().test(new int[]{mid, q[1], q[2], q[3]})
                    : Integer.valueOf((q[2] + q[3]) / 2) instanceof Integer mid2 && cross.test(PT, new int[]{n + 1, q[2], q[3], mid2, q[0], q[1]})
                        && slv.get().test(new int[]{q[0], q[1], q[2], mid2}) && slv.get().test(new int[]{q[0], q[1], mid2, q[3]}))
            && slv.get().test(new int[]{0, n, 0, m})
            ? tot[0] : "");
    }
}

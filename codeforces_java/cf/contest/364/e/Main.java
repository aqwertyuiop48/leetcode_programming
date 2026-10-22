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
            && new long[1] instanceof long[] tot
            && ((BiPredicate<int[], int[]>) (arr, pr) -> Integer.valueOf(pr[0]) instanceof Integer W && Integer.valueOf(pr[1]) instanceof Integer lo && Integer.valueOf(pr[2]) instanceof Integer hi && Integer.valueOf(pr[3]) instanceof Integer mid
                && Integer.valueOf(pr[4]) instanceof Integer clo && Integer.valueOf(pr[5]) instanceof Integer chi
                && ((IntBinaryOperator) (rp, cp) -> arr[((rp & 4095) + 1) * W + (cp & 4095) + 1] - arr[(rp >> 12) * W + (cp & 4095) + 1] - arr[((rp & 4095) + 1) * W + (cp >> 12)] + arr[(rp >> 12) * W + (cp >> 12)]) instanceof IntBinaryOperator cn
                && IntStream.range(clo, chi).allMatch(l -> new int[k + 1] instanceof int[] up && new int[k + 1] instanceof int[] dn
                    && IntStream.rangeClosed(0, k).allMatch(c -> (up[c] = lo) >= 0 & (dn[c] = hi - 1) >= 0)
                    && (IntStream.rangeClosed(l, chi - 1).takeWhile(r -> cn.applyAsInt((mid - 1) << 12 | mid, l << 12 | r) <= k).allMatch(r ->
                            IntStream.rangeClosed(0, k).allMatch(c -> (up[c] += up[c] < mid && cn.applyAsInt(up[c] << 12 | (mid - 1), l << 12 | r) > c ? (int) IntStream.iterate(up[c], t -> t < mid && cn.applyAsInt(t << 12 | (mid - 1), l << 12 | r) > c, t -> t + 1).count() : 0) >= 0
                                & (dn[c] -= dn[c] >= mid && cn.applyAsInt(mid << 12 | dn[c], l << 12 | r) > c ? (int) IntStream.iterate(dn[c], b -> b >= mid && cn.applyAsInt(mid << 12 | b, l << 12 | r) > c, b -> b - 1).count() : 0) > -2)
                            && (tot[0] += IntStream.rangeClosed(0, k).mapToLong(a -> (long) (a == 0 ? mid - up[0] : up[a - 1] - up[a]) * (k - a == 0 ? dn[0] - mid + 1 : dn[k - a] - dn[k - a - 1])).sum()) >= 0) | true))) instanceof BiPredicate<int[], int[]> cross
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> slv
            && slv.compareAndSet(null, q -> q[1] - q[0] == 1 && q[3] - q[2] == 1
                ? (tot[0] += P[(q[0] + 1) * (m + 1) + q[2] + 1] - P[q[0] * (m + 1) + q[2] + 1] - P[(q[0] + 1) * (m + 1) + q[2]] + P[q[0] * (m + 1) + q[2]] == k ? 1 : 0) >= 0
                : q[1] - q[0] >= q[3] - q[2]
                    ? Integer.valueOf((q[0] + q[1]) / 2) instanceof Integer mid && cross.test(P, new int[]{m + 1, q[0], q[1], mid, q[2], q[3]})
                        && slv.get().test(new int[]{q[0], mid, q[2], q[3]}) && slv.get().test(new int[]{mid, q[1], q[2], q[3]})
                    : Integer.valueOf((q[2] + q[3]) / 2) instanceof Integer mid2 && cross.test(PT, new int[]{n + 1, q[2], q[3], mid2, q[0], q[1]})
                        && slv.get().test(new int[]{q[0], q[1], q[2], mid2}) && slv.get().test(new int[]{q[0], q[1], mid2, q[3]}))
            && slv.get().test(new int[]{0, n, 0, m})
            ? tot[0] : "");
    }
}

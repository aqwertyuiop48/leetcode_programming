import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Long.valueOf(1000000007L) instanceof Long M
            && LongStream.range(0, n).map(i -> Long.parseLong(it.next())).toArray() instanceof long[] a
            && new long[6][n + 1] instanceof long[][] P
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, 6).allMatch(j -> (P[j][i] = (P[j][i - 1] + LongStream.range(0, j).reduce(1, (x, y) -> x * i % M)) % M) >= 0))
            && new long[6][4 * n] instanceof long[][] sum && new long[4 * n] instanceof long[] lz && Arrays.stream(new int[4 * n]).allMatch(z -> true)
            && IntStream.range(0, 4 * n).allMatch(i -> (lz[i] = -1) < 0)
            && ((BiFunction<Integer, long[], Boolean>) (node, a3) -> IntStream.range(0, 6).allMatch(j -> (sum[j][node] = a3[2] * ((P[j][(int) a3[1]] - P[j][(int) a3[0] - 1] + M) % M) % M) >= 0) && (lz[node] = a3[2]) >= 0) instanceof BiFunction<Integer, long[], Boolean> app
            && ((BiFunction<Integer, int[], Boolean>) (node, lr) -> lz[node] < 0 || Integer.valueOf((lr[0] + lr[1]) / 2) instanceof Integer mid
                && app.apply(2 * node, new long[]{lr[0], mid, lz[node]}) && app.apply(2 * node + 1, new long[]{mid + 1, lr[1], lz[node]}) && (lz[node] = -1) < 0) instanceof BiFunction<Integer, int[], Boolean> push
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> build
            && build.compareAndSet(null, q -> q[1] == q[2]
                ? IntStream.range(0, 6).allMatch(j -> (sum[j][q[0]] = a[q[1] - 1] % M * (P[j][q[1]] - P[j][q[1] - 1] + M) % M) >= 0)
                : Integer.valueOf((q[1] + q[2]) / 2) instanceof Integer mid && build.get().apply(new int[]{2 * q[0], q[1], mid}) && build.get().apply(new int[]{2 * q[0] + 1, mid + 1, q[2]})
                    && IntStream.range(0, 6).allMatch(j -> (sum[j][q[0]] = (sum[j][2 * q[0]] + sum[j][2 * q[0] + 1]) % M) >= 0))
            && build.get().apply(new int[]{1, 1, n})
            && new AtomicReference<Function<long[], Boolean>>() instanceof AtomicReference<Function<long[], Boolean>> upd
            && upd.compareAndSet(null, q -> q[2] < q[3] || q[4] < q[1] ? true
                : q[3] <= q[1] && q[2] <= q[4] ? app.apply((int) q[0], new long[]{q[1], q[2], q[5]})
                : Integer.valueOf((int) ((q[1] + q[2]) / 2)) instanceof Integer mid && push.apply((int) q[0], new int[]{(int) q[1], (int) q[2]})
                    && upd.get().apply(new long[]{2 * q[0], q[1], mid, q[3], q[4], q[5]}) && upd.get().apply(new long[]{2 * q[0] + 1, mid + 1, q[2], q[3], q[4], q[5]})
                    && IntStream.range(0, 6).allMatch(j -> (sum[j][(int) q[0]] = (sum[j][(int) (2 * q[0])] + sum[j][(int) (2 * q[0] + 1)]) % M) >= 0))
            && new long[6] instanceof long[] acc
            && new AtomicReference<Function<long[], Boolean>>() instanceof AtomicReference<Function<long[], Boolean>> qry
            && qry.compareAndSet(null, q -> q[2] < q[3] || q[4] < q[1] ? true
                : q[3] <= q[1] && q[2] <= q[4] ? IntStream.range(0, 6).allMatch(j -> (acc[j] = (acc[j] + sum[j][(int) q[0]]) % M) >= 0)
                : Integer.valueOf((int) ((q[1] + q[2]) / 2)) instanceof Integer mid && push.apply((int) q[0], new int[]{(int) q[1], (int) q[2]})
                    && qry.get().apply(new long[]{2 * q[0], q[1], mid, q[3], q[4]}) && qry.get().apply(new long[]{2 * q[0] + 1, mid + 1, q[2], q[3], q[4]}))
            && new long[6][6] instanceof long[][] C && IntStream.range(0, 6).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + (j <= i - 1 ? C[i - 1][j] : 0)) > 0))
            ? IntStream.range(0, m).mapToObj(qi -> it.next() instanceof String ty && Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r && Long.valueOf(it.next()) instanceof Long z
                ? ty.equals("=") ? (upd.get().apply(new long[]{1, 1, n, l, r, z}) ? (String) null : (String) null)
                    : Arrays.stream(acc).allMatch(x -> true) && IntStream.range(0, 6).allMatch(j -> (acc[j] = 0) == 0) && qry.get().apply(new long[]{1, 1, n, l, r})
                        && Long.valueOf((1 - l + M) % M) instanceof Long c
                        ? String.valueOf(IntStream.rangeClosed(0, (int) (long) z).mapToLong(j -> C[(int) (long) z][j] * LongStream.range(0, z - j).reduce(1, (x, y) -> x * c % M) % M * acc[j] % M).sum() % M) : (String) null
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

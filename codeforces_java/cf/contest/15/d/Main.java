import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] nums
            && new long[3] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                    : (st[2] != 1 || ((nums[(int) st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0)) && (st[2] = 0) == 0)
            && new int[]{(int) nums[0], (int) nums[1], (int) nums[2], (int) nums[3]} instanceof int[] d
            && IntStream.range(0, d[0]).mapToObj(i -> Arrays.copyOfRange(nums, 4 + i * d[1], 4 + (i + 1) * d[1])).toArray(long[][]::new) instanceof long[][] h
            && new long[d[0] + 1][d[1] + 1] instanceof long[][] pre
            && IntStream.rangeClosed(1, d[0]).allMatch(i -> IntStream.rangeClosed(1, d[1]).allMatch(j -> (pre[i][j] = h[i - 1][j - 1] + pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1]) >= Long.MIN_VALUE))
            && ((BiFunction<long[], Integer, long[]>) (x, w) ->
                new long[x.length] instanceof long[] pf
                && new long[x.length] instanceof long[] sf
                && IntStream.range(0, x.length).allMatch(j -> (pf[j] = j % w == 0 ? x[j] : Math.min(pf[j - 1], x[j])) > Long.MIN_VALUE)
                && IntStream.iterate(x.length - 1, j -> j >= 0, j -> j - 1).allMatch(j -> (sf[j] = (j % w == w - 1 || j == x.length - 1) ? x[j] : Math.min(sf[j + 1], x[j])) > Long.MIN_VALUE)
                ? IntStream.rangeClosed(0, x.length - w).mapToLong(l -> Math.min(sf[l], pf[l + w - 1])).toArray()
                : null) instanceof BiFunction<long[], Integer, long[]> sl
            && Arrays.stream(h).map(r -> sl.apply(r, d[3])).toArray(long[][]::new) instanceof long[][] rm
            && Integer.valueOf(d[1] - d[3] + 1) instanceof Integer wc
            && Integer.valueOf(d[0] - d[2] + 1) instanceof Integer wr
            && new long[d[0]][wc] instanceof long[][] pfc
            && new long[d[0]][wc] instanceof long[][] sfc
            && IntStream.range(0, d[0]).allMatch(i -> IntStream.range(0, wc).allMatch(j -> (pfc[i][j] = i % d[2] == 0 ? rm[i][j] : Math.min(pfc[i - 1][j], rm[i][j])) > Long.MIN_VALUE))
            && IntStream.iterate(d[0] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, wc).allMatch(j -> (sfc[i][j] = (i % d[2] == d[2] - 1 || i == d[0] - 1) ? rm[i][j] : Math.min(sfc[i + 1][j], rm[i][j])) > Long.MIN_VALUE))
            && IntStream.range(0, wr * wc).mapToLong(k -> pre[k / wc + d[2]][k % wc + d[3]] - pre[k / wc][k % wc + d[3]] - pre[k / wc + d[2]][k % wc] + pre[k / wc][k % wc] - Math.min(sfc[k / wc][k % wc], pfc[k / wc + d[2] - 1][k % wc]) * d[2] * d[3]).toArray() instanceof long[] cost
            && (Integer) (64 - Long.numberOfLeadingZeros(LongStream.of(cost).max().orElse(0))) instanceof Integer cbits
            && (cbits + 20 <= 62
                ? IntStream.range(0, cost.length).mapToLong(k -> cost[k] << 20 | k).sorted().toArray()
                : Arrays.stream(cost).sorted().asDoubleStream().toArray() instanceof double[] vals
                    ? IntStream.range(0, cost.length).mapToLong(k -> (long) (-Arrays.binarySearch(vals, (double) cost[k] - 0.5) - 1) << 20 | k).sorted().toArray()
                    : new long[0]) instanceof long[] keys
            && new boolean[wr * wc] instanceof boolean[] blocked
            && new StringBuilder() instanceof StringBuilder sb
            && new int[1] instanceof int[] cnt
            && Arrays.stream(keys).allMatch(key ->
                (Integer) (int) (key & 1048575) instanceof Integer k
                && (blocked[k]
                    || (++cnt[0] > 0
                        && sb.append(k / wc + 1).append(' ').append(k % wc + 1).append(' ').append(cost[k]).append('\n') != null
                        && (d[2] == 1 && d[3] == 1
                            ? (blocked[k] = true)
                            : IntStream.range(0, (Math.min(wr - 1, k / wc + d[2] - 1) - Math.max(0, k / wc - d[2] + 1) + 1) * (Math.min(wc - 1, k % wc + d[3] - 1) - Math.max(0, k % wc - d[3] + 1) + 1)).allMatch(t ->
                                (blocked[(Math.max(0, k / wc - d[2] + 1) + t / (Math.min(wc - 1, k % wc + d[3] - 1) - Math.max(0, k % wc - d[3] + 1) + 1)) * wc + Math.max(0, k % wc - d[3] + 1) + t % (Math.min(wc - 1, k % wc + d[3] - 1) - Math.max(0, k % wc - d[3] + 1) + 1)] = true))))))
            ? cnt[0] + "\n" + sb
            : "");
    }
}

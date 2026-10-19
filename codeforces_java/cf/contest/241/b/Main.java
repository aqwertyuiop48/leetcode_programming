import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n && Long.valueOf(in[1]) instanceof Long k
            && Arrays.stream(in, 2, 2 + n).mapToInt(x -> (int) x).sorted().toArray() instanceof int[] a
            && new int[30][n + 1] instanceof int[][] pre
            && IntStream.range(0, 30).allMatch(b -> IntStream.range(0, n).allMatch(i -> (pre[b][i + 1] = pre[b][i] + (a[i] >> b & 1)) >= 0))
            && new int[n] instanceof int[] lo && new int[n] instanceof int[] hi && IntStream.range(0, n).allMatch(i -> (hi[i] = n) > 0)
            && new long[]{2 * k, 0} instanceof long[] kt
            && IntStream.iterate(29, b -> b >= 0, b -> b - 1).allMatch(b -> Long.valueOf(IntStream.range(0, n).mapToLong(i -> (a[i] >> b & 1) == 0 ? pre[b][hi[i]] - pre[b][lo[i]] : hi[i] - lo[i] - (pre[b][hi[i]] - pre[b][lo[i]])).sum()) instanceof Long c1
                && (c1 >= kt[0]
                    ? (kt[1] |= 1L << b) > 0 && IntStream.range(0, n).allMatch(i -> (a[i] >> b & 1) == 0 ? (lo[i] += hi[i] - lo[i] - (pre[b][hi[i]] - pre[b][lo[i]])) >= 0 : (hi[i] = lo[i] + hi[i] - lo[i] - (pre[b][hi[i]] - pre[b][lo[i]])) >= 0)
                    : (kt[0] -= c1) > Long.MIN_VALUE && IntStream.range(0, n).allMatch(i -> (a[i] >> b & 1) == 0 ? (hi[i] = hi[i] - (pre[b][hi[i]] - pre[b][lo[i]])) >= 0 : (lo[i] += hi[i] - lo[i] - (pre[b][hi[i]] - pre[b][lo[i]])) >= 0)))
            && new long[2] instanceof long[] acc
            && IntStream.range(0, n).allMatch(i -> new int[]{0, n} instanceof int[] st
                && IntStream.iterate(29, b -> b >= 0 && st[1] > st[0], b -> b - 1).allMatch(b -> Integer.valueOf(st[0] + (st[1] - st[0]) - (pre[b][st[1]] - pre[b][st[0]])) instanceof Integer mid
                    && (((a[i] >> b & 1) == 0 ? new int[]{mid, st[1], st[0], mid} : new int[]{st[0], mid, mid, st[1]}) instanceof int[] ch
                        && ((kt[1] >> b & 1) == 0
                            ? (acc[0] += ch[1] - ch[0]) >= 0 && (acc[1] += IntStream.range(0, 30).mapToLong(c -> ((a[i] >> c & 1) == 1 ? ch[1] - ch[0] - (pre[c][ch[1]] - pre[c][ch[0]]) : pre[c][ch[1]] - pre[c][ch[0]]) * (1L << c)).sum()) >= 0 && (st[0] = ch[2]) >= 0 && (st[1] = ch[3]) >= 0
                            : (st[0] = ch[0]) >= 0 && (st[1] = ch[1]) >= 0))))
            ? (acc[1] / 2 + (k - acc[0] / 2) % 1000000007L * (kt[1] % 1000000007L)) % 1000000007L : "");
    }
}

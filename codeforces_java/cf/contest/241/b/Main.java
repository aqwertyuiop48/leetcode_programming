import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] g
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                (Integer) (i == raw.length ? 32 : (int) raw[i]) instanceof Integer c
                && (c >= '0' && c <= '9'
                    ? (st[0] = st[0] * 10 + c - '0') >= 0 && (st[2] = 1) > 0
                    : c == '-'
                        ? (st[3] = 1) > 0
                        : st[2] == 0 || ((g[st[1]++] = st[3] == 1 ? -st[0] : st[0]) != Integer.MIN_VALUE && (st[0] = 0) == 0 && (st[2] = 0) == 0 && (st[3] = 0) == 0)))
            && Integer.valueOf(g[0]) instanceof Integer n
            && Long.valueOf(2L * g[1]) instanceof Long kk
            && IntStream.range(0, n).map(i -> g[2 + i]).sorted().toArray() instanceof int[] a
            && Arrays.stream(a).mapToLong(v -> 2L * v).toArray() instanceof long[] d
            && Integer.valueOf(n + 1) instanceof Integer w
            && new int[30 * w] instanceof int[] ones
            && IntStream.range(0, 30).allMatch(k -> IntStream.range(0, n).allMatch(j ->
                (ones[k * w + j + 1] = ones[k * w + j] + (a[j] >> k & 1)) >= 0))
            && new int[n] instanceof int[] lo
            && new int[n] instanceof int[] hi
            && new int[n] instanceof int[] sp
            && IntStream.range(0, n).allMatch(i -> (hi[i] = n) > 0)
            && new long[3] instanceof long[] ac
            && IntStream.iterate(29, b -> b >= 0, b -> b - 1).allMatch(b ->
                IntStream.range(0, n).allMatch(i ->
                    (sp[i] = i > 0 && a[i] >> (b + 1) == a[i - 1] >> (b + 1)
                        ? sp[i - 1]
                        : -Arrays.binarySearch(d, lo[i], hi[i], 2L * ((((a[i] ^ (int) ac[0]) >> (b + 1)) << (b + 1)) | (1 << b)) - 1) - 1) >= 0)
                && Long.valueOf(IntStream.range(0, n).mapToLong(i ->
                    (a[i] >> b & 1) == 0 ? hi[i] - sp[i] : sp[i] - lo[i]).sum()) instanceof Long c1
                && (Integer) (ac[1] + c1 >= kk ? 1 : 0) instanceof Integer tb
                && (tb == 1 ? (ac[0] |= 1L << b) > 0 : (ac[1] += c1) >= 0)
                && (tb == 1
                    || (IntStream.range(0, n).filter(i -> i == 0 || a[i] >> b != a[i - 1] >> b).toArray() instanceof int[] hd
                        && Long.valueOf(ac[0] | (1L << b)) instanceof Long top
                        && (ac[2] += IntStream.range(0, hd.length).mapToLong(t ->
                            (Long) (long) ((t + 1 < hd.length ? hd[t + 1] : n) - hd[t]) instanceof Long li
                            && (Integer) ((a[hd[t]] >> b & 1) == 0 ? sp[hd[t]] : lo[hd[t]]) instanceof Integer x
                            && (Integer) ((a[hd[t]] >> b & 1) == 0 ? hi[hd[t]] : sp[hd[t]]) instanceof Integer y
                            ? li * (y - x) * top : 0).sum()) >= 0
                        && IntStream.range(0, b).allMatch(k ->
                            (ac[2] += (1L << k) * IntStream.range(0, hd.length).mapToLong(t ->
                                (Integer) (t + 1 < hd.length ? hd[t + 1] : n) instanceof Integer e
                                && (Integer) ((a[hd[t]] >> b & 1) == 0 ? sp[hd[t]] : lo[hd[t]]) instanceof Integer x
                                && (Integer) ((a[hd[t]] >> b & 1) == 0 ? hi[hd[t]] : sp[hd[t]]) instanceof Integer y
                                && (Long) (long) (ones[k * w + e] - ones[k * w + hd[t]]) instanceof Long oi
                                && (Long) (long) (ones[k * w + y] - ones[k * w + x]) instanceof Long oj
                                ? oi * ((y - x) - oj) + ((e - hd[t]) - oi) * oj : 0).sum()) >= 0)))
                && IntStream.range(0, n).allMatch(i ->
                    ((a[i] >> b & 1) ^ tb) == 1 ? (lo[i] = sp[i]) >= 0 : (hi[i] = sp[i]) >= 0))
            ? String.valueOf((ac[2] / 2 % 1000000007L + (g[1] - ac[1] / 2) % 1000000007L * (ac[0] % 1000000007L)) % 1000000007L)
            : "");
    }
}

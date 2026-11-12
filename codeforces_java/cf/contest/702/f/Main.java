import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1 + 2 * n]) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> ((1000000000L - t[2 + 2 * i]) << 30) | t[1 + 2 * i]).sorted().map(x -> x & 1073741823L).toArray() instanceof long[] c
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer sz
            && new long[n + 1] instanceof long[] s2 && new int[n + 1] instanceof int[] cc && new long[2 * sz] instanceof long[] tr
            && LongStream.range(0, m).map(j -> t[2 + 2 * n + (int) j]).toArray() instanceof long[] b
            && new int[m] instanceof int[] pos && new int[m] instanceof int[] cnt
            && new java.util.function.LongBinaryOperator[1] instanceof java.util.function.LongBinaryOperator[] g
            && (g[0] = (x, tt) -> x == 0 ? n : tr[(int) x] > tt ? g[0].applyAsLong((x >> Long.numberOfTrailingZeros(~x)) == 0 ? 0 : (x >> Long.numberOfTrailingZeros(~x)) + 1, tt) : x >= sz ? x - sz : g[0].applyAsLong(tr[2 * (int) x] <= tt ? 2 * x : 2 * x + 1, tt)) != null
            && IntStream.iterate(29, k -> k >= 0, k -> k - 1).allMatch(k ->
                IntStream.range(0, n).filter(i -> (s2[i + 1] = s2[i] + (c[i] < (1L << k) ? 2 * c[i] : 0)) + (cc[i + 1] = cc[i] + (c[i] < (1L << k) ? 1 : 0)) < 0).count() == 0
                && IntStream.range(0, sz).filter(i -> (tr[sz + i] = i < n && c[i] >= (1L << k) && c[i] < (2L << k) ? c[i] + s2[i] / 2 : Long.MAX_VALUE / 2) < 0).count() == 0
                && IntStream.iterate(sz - 1, i -> i >= 1, i -> i - 1).filter(i -> (tr[i] = Math.min(tr[2 * i], tr[2 * i + 1])) < 0).count() == 0
                && IntStream.range(0, m).parallel().filter(cu -> (b[cu] >> k) == 1 && (pos[cu] >= n ? (b[cu] = 0) == 1 :
                    Integer.valueOf(pos[cu]) instanceof Integer i0 && Long.valueOf(s2[i0] / 2) instanceof Long si && Long.valueOf(b[cu] + si) instanceof Long tt
                    && Integer.valueOf((int) g[0].applyAsLong(sz + i0, tt)) instanceof Integer j
                    && Integer.valueOf(-Arrays.binarySearch(s2, 0, n + 1, 2 * (si + b[cu] - (1L << k)) + 1) - 1) instanceof Integer pp
                    && (j < n && (pp > n || j < pp - 1)
                        ? (cnt[cu] += cc[j] - cc[i0] + 1) + (b[cu] -= s2[j] / 2 - si + c[j]) + (pos[cu] = j + 1) != -1
                        : pp <= n
                            ? (cnt[cu] += cc[pp] - cc[i0]) + (b[cu] -= s2[pp] / 2 - si) + (pos[cu] = pp) != -1
                            : (cnt[cu] += cc[n] - cc[i0]) + (b[cu] -= s2[n] / 2 - si) + (pos[cu] = n) != -1)
                    && (pos[cu] < n || (b[cu] = 0) == 0 || true))).count() >= 0)
            ? IntStream.range(0, m).mapToObj(j -> Integer.toString(cnt[j])).collect(Collectors.joining(" ")) : "");
    }
}

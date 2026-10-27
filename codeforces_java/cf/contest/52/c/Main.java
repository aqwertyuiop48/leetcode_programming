import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && (raw[r0.length] = 10) == 10
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[raw.length / 2 + 8] instanceof int[] le
            && new int[5] instanceof int[] ps
            && IntStream.range(0, raw.length).allMatch(i ->
                raw[i] >= '0' && raw[i] <= '9' ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                : raw[i] == '-' ? (ps[3] = 1) > 0
                : (ps[2] != 1 || ((g[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) != Integer.MIN_VALUE && (ps[0] = ps[3] = ps[2] = 0) == 0))
                    && (raw[i] != 10 || ps[1] == (ps[4] == 0 ? 0 : le[ps[4] - 1]) || (le[ps[4]++] = ps[1]) > 0))
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[n + 1]) instanceof Integer mq
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1)) << 1) instanceof Integer N
            && Integer.valueOf(Integer.numberOfTrailingZeros(N)) instanceof Integer h
            && new long[2 * N] instanceof long[] t
            && new long[2 * N] instanceof long[] d
            && IntStream.range(0, N).allMatch(j -> (t[N + j] = j < n ? g[1 + j] : Long.MAX_VALUE / 4) > Long.MIN_VALUE)
            && IntStream.rangeClosed(1, N - 1).allMatch(k -> (t[N - k] = Math.min(t[2 * (N - k)], t[2 * (N - k) + 1])) > Long.MIN_VALUE)
            && Integer.valueOf(Integer.highestOneBit(h) << 1) instanceof Integer S2
            && Integer.valueOf(Integer.numberOfTrailingZeros(S2)) instanceof Integer sh
            && new int[10] instanceof int[] z
            && new long[3] instanceof long[] zr
            && new long[mq] instanceof long[] out
            && IntStream.range(0, mq).allMatch(q -> (out[q] = Long.MAX_VALUE / 4) > Long.MIN_VALUE)
            && IntStream.range(0, mq << (sh + 1)).allMatch(idx ->
                (idx & (S2 - 1)) > h
                || (((idx & (S2 - 1)) != 0 || (
                    (z[3] = le[3 + (idx >> (sh + 1))] - le[2 + (idx >> (sh + 1))] == 3 ? 1 : 0) >= 0
                    && (z[2] = ((idx >> sh) & 1) == 0 || g[le[2 + (idx >> (sh + 1))]] > g[le[2 + (idx >> (sh + 1))] + 1] ? 1 : 0) >= 0
                    && (z[0] = (((idx >> sh) & 1) == 0 ? g[le[2 + (idx >> (sh + 1))]] : 0) + N) > 0
                    && (z[1] = (((idx >> sh) & 1) == 0 ? (g[le[2 + (idx >> (sh + 1))]] > g[le[2 + (idx >> (sh + 1))] + 1] ? n - 1 : g[le[2 + (idx >> (sh + 1))] + 1]) : g[le[2 + (idx >> (sh + 1))] + 1]) + 1 + N) > 0
                    && (z[5] = z[0]) > 0 && (z[6] = z[1] - 1) > 0
                    && (z[4] = g[le[2 + (idx >> (sh + 1))] + 2]) > Integer.MIN_VALUE
                    && (z[7] = z[8] = 0) == 0 && (zr[0] = zr[1] = Long.MAX_VALUE / 4) > 0))
                && (z[2] == 0 || (z[3] == 1
                    ? (z[0] >= z[1] || (((z[0] & 1) == 0 || ((t[z[0]] += z[4]) > Long.MIN_VALUE & (d[z[0]++] += z[4]) > Long.MIN_VALUE))
                        && ((z[1] & 1) == 0 || ((t[--z[1]] += z[4]) > Long.MIN_VALUE & (d[z[1]] += z[4]) > Long.MIN_VALUE))))
                        && (z[0] >>= 1) >= 0 && (z[1] >>= 1) >= 0
                        && ((idx & (S2 - 1)) == 0 || ((t[z[5] >> (idx & (S2 - 1))] = Math.min(t[(z[5] >> (idx & (S2 - 1))) * 2], t[(z[5] >> (idx & (S2 - 1))) * 2 + 1]) + d[z[5] >> (idx & (S2 - 1))]) > Long.MIN_VALUE
                            & (t[z[6] >> (idx & (S2 - 1))] = Math.min(t[(z[6] >> (idx & (S2 - 1))) * 2], t[(z[6] >> (idx & (S2 - 1))) * 2 + 1]) + d[z[6] >> (idx & (S2 - 1))]) > Long.MIN_VALUE))
                    : (z[0] >= z[1] || (((z[0] & 1) == 0 || ((z[7] = z[0]) > 0 & (zr[0] = Math.min(zr[0], t[z[0]++])) > Long.MIN_VALUE))
                        && ((z[1] & 1) == 0 || ((zr[1] = Math.min(zr[1], t[--z[1]])) > Long.MIN_VALUE & (z[8] = z[1]) > 0))))
                        && ((idx & (S2 - 1)) == h
                            ? (out[(idx >> (sh + 1))] = Math.min(out[(idx >> (sh + 1))], Math.min(zr[0], zr[1]))) > Long.MIN_VALUE
                            : (z[0] >>= 1) >= 0 && (z[1] >>= 1) >= 0 && (z[7] >>= 1) >= 0 && (z[8] >>= 1) >= 0 && (zr[0] += d[z[7]]) > Long.MIN_VALUE && (zr[1] += d[z[8]]) > Long.MIN_VALUE)))))
            ? IntStream.range(0, mq).filter(q -> le[3 + q] - le[2 + q] == 2).mapToObj(q -> String.valueOf(out[q])).collect(Collectors.joining("\n"))
            : "");
    }
}


import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g0
            && new long[2] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0
                    : i == 0 || raw[i - 1] < '0' || raw[i - 1] > '9'
                        || ((g0[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)).count() >= 0
            && Integer.valueOf((int) g0[0]) instanceof Integer n
            && Integer.valueOf((int) g0[1]) instanceof Integer k
            && Long.valueOf(g0[2]) instanceof Long limit
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] >= 'A' && raw[i] <= 'Z').findFirst().getAsInt()) instanceof Integer s0
            && IntStream.range(0, k * k).map(i -> (int) g0[3 + k + i]).toArray() instanceof int[] aa
            && new int[1 << k] instanceof int[] f
            && new int[k] instanceof int[] ord
            && new int[8] instanceof int[] w
            && new int[2] instanceof int[] reg
            && IntStream.range(0, k).filter(i -> (f[1 << i] += (int) g0[3 + i]) == 0x5a5a5a5a).count() >= 0
            && new int[k] instanceof int[] where
            && IntStream.range(0, n).filter(p ->
                (w[5] = raw[s0 + p] - 'A') >= 0
                && (w[6] = 1 << w[5]) > 0
                && (w[7] = (reg[1] & w[6]) != 0 ? where[w[5]] : reg[0]) >= 0
                && (w[0] = 0) == 0
                && (w[1] = 0) == 0
                && (w[4] = w[5]) >= 0
                && IntStream.rangeClosed(0, w[7]).filter(q ->
                    (w[2] = ord[q]) >= 0
                    && ((f[w[0]] += (w[3] = (q == w[7] && w[7] == reg[0] ? 0 : aa[w[2] * k + w[5]]) - w[1])) | (f[w[0] | w[6]] -= w[3]) | (w[1] += w[3])
                        | (w[0] |= 1 << w[2]) | (ord[q] = w[4]) | (where[w[4]] = q) | (w[4] = w[2])) != 0x5a5a5a5a).count() >= 0
                && (reg[0] += w[7] == reg[0] ? 1 : 0) > 0
                && (reg[1] |= w[6]) > 0).count() >= 0
            && IntStream.range(0, k / 2).filter(pp ->
                IntStream.range(0, 1 << (k - 2)).parallel().filter(idx ->
                    ((f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + (1 << 2 * pp)] += f[idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)])
                    | (f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + 3 * (1 << 2 * pp)] += f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + 2 * (1 << 2 * pp)])
                    | (f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + 2 * (1 << 2 * pp)] += f[idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)])
                    | (f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + 3 * (1 << 2 * pp)] += f[(idx >> 2 * pp << 2 * pp + 2 | idx & ((1 << 2 * pp) - 1)) + (1 << 2 * pp)])) == 0x5a5a5a5a).count() >= 0).count() >= 0
            && (k % 2 == 0 || IntStream.range(0, 1 << (k - 1)).parallel().filter(idx -> (f[idx + (1 << (k - 1))] += f[idx]) == 0x5a5a5a5a).count() >= 0)
            ? IntStream.range(0, 1 << k).parallel().filter(d -> (d & ~reg[1]) == 0 && d != reg[1] && f[d] <= limit).count()
            : 0L);
    }
}


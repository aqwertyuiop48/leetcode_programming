import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] g0
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0
                    : i < raw.length && raw[i] == '-'
                        ? (ps[2] = 1) == 1
                        : i == 0 || raw[i - 1] < '0' || raw[i - 1] > '9'
                            || ((g0[(int) ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) != Long.MIN_VALUE && (ps[0] = 0) == 0 && (ps[2] = 0) == 0)).count() >= 0
            && Integer.valueOf((int) g0[0]) instanceof Integer n
            && Long.valueOf(g0[2 * n + 1]) instanceof Long v
            && IntStream.range(0, n)
                .mapToLong(i -> (v * g0[2 + 2 * i] - g0[1 + 2 * i] - 1100000000L << 32) + (v * g0[2 + 2 * i] + g0[1 + 2 * i] + 200000000L))
                .sorted().toArray() instanceof long[] keys
            && new long[n + 1] instanceof long[] ta
            && new long[n + 1] instanceof long[] tb
            && new int[2] instanceof int[] len
            && IntStream.range(0, n).filter(i ->
                (Long) ((keys[i] & 0xFFFFFFFFL) * 2) instanceof Long w
                && (Integer) (-Arrays.binarySearch(ta, 0, len[0], w + 1) - 1) instanceof Integer pa
                && (ta[pa] = w) >= 0
                && (len[0] += pa == len[0] ? 1 : 0) > 0
                && ((keys[i] >> 32) + 1100000000L < 0 || w < 400000000L
                    || ((Integer) (-Arrays.binarySearch(tb, 0, len[1], w + 1) - 1) instanceof Integer pb
                        && (tb[pb] = w) >= 0
                        && (len[1] += pb == len[1] ? 1 : 0) > 0))).count() >= 0
            ? len[1] + " " + len[0]
            : "");
    }
}


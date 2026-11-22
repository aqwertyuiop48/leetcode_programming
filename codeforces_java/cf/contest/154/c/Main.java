

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(tk[0]) instanceof Integer n
            && Integer.valueOf(tk[1]) instanceof Integer m
            && new Random(20120401L).longs(n + 1).toArray() instanceof long[] h
            && new long[n + 1] instanceof long[] sum
            && IntStream.range(0, m).allMatch(e ->
                (sum[tk[2 + 2 * e]] += h[tk[3 + 2 * e]]) == sum[tk[2 + 2 * e]]
                && (sum[tk[3 + 2 * e]] += h[tk[2 + 2 * e]]) == sum[tk[3 + 2 * e]])
            && new long[1] instanceof long[] run
            && IntStream.range(0, 2 * n).mapToLong(i -> i < n ? sum[i + 1] & ~1L : (sum[i - n + 1] + h[i - n + 1]) | 1L).sorted().toArray() instanceof long[] a
            ? IntStream.range(1, 2 * n).mapToLong(i -> a[i] == a[i - 1] ? ++run[0] : (run[0] = 0)).sum()
            : 0);
    }
}

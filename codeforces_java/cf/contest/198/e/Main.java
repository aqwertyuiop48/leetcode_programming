import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[1250010] instanceof long[] v && new long[4] instanceof long[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : i < raw.length && raw[i] == '-' ? (st[1] = 1) > 0
                : st[2] == 1 && (v[(int) st[3]++] = st[1] == 1 ? -st[0] : st[0]) < Long.MAX_VALUE && (st[0] = st[1] = st[2] = 0) == 0) || true)
            && (Integer) (int) v[4] instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> v[5 + 5 * i + 2] << 18 | i).sorted().toArray() instanceof long[] keys
            && Arrays.stream(keys).mapToInt(k -> (int) (k & 262143L)).toArray() instanceof int[] ord
            && (Integer) Integer.highestOneBit(2 * n) instanceof Integer N
            && new long[N] instanceof long[] val && new int[2 * N] instanceof int[] am
            && IntStream.range(0, N).allMatch(i -> (val[i] = i < n
                ? (v[5 + 5 * ord[i]] - v[0]) * (v[5 + 5 * ord[i]] - v[0]) + (v[5 + 5 * ord[i] + 1] - v[1]) * (v[5 + 5 * ord[i] + 1] - v[1])
                : Long.MAX_VALUE) >= 0 && (am[N + i] = i) >= 0)
            && IntStream.iterate(N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (am[i] = val[am[2 * i]] <= val[am[2 * i + 1]] ? am[2 * i] : am[2 * i + 1]) >= 0)
            && new int[n + 1] instanceof int[] qa && new int[2] instanceof int[] ht
            && ((LongBinaryOperator) (p, rr) -> (Integer) (-Arrays.binarySearch(keys, p << 18 | 262143L) - 1) instanceof Integer q0
                && (Long) (rr * rr) instanceof Long R
                && IntStream.iterate(N + q0, x -> x > 1, x -> x >> 1).filter(x -> (x & 1) == 1 && val[am[x - 1]] <= R).map(x -> x - 1)
                    .allMatch(c -> IntStream.generate(() -> val[am[c]] <= R
                        ? (Integer) am[c] instanceof Integer lf && (val[lf] = Long.MAX_VALUE) > 0
                            && (IntStream.iterate(N + lf >> 1, j -> j >= 1, j -> j >> 1).allMatch(j -> am[j] == lf && (am[j] = val[am[2 * j]] <= val[am[2 * j + 1]] ? am[2 * j] : am[2 * j + 1]) >= 0) || true)
                            && (qa[ht[1]++] = lf) >= 0 ? lf : -1
                        : -1).takeWhile(i -> i >= 0).count() >= 0)
                ? 1L : 0L) instanceof LongBinaryOperator proc
            && proc.applyAsLong(v[2], v[3]) >= 0
            && IntStream.generate(() -> ht[0] < ht[1] ? qa[ht[0]++] : -1).takeWhile(i -> i >= 0)
                .allMatch(j -> proc.applyAsLong(v[5 + 5 * ord[j] + 3], v[5 + 5 * ord[j] + 4]) >= 0)
            ? ht[1] : "");
    }


}

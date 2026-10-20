import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] in
            && Integer.valueOf(in[0]) instanceof Integer n && Integer.valueOf(in[1]) instanceof Integer len && Integer.valueOf(in[2]) instanceof Integer h
            && Arrays.stream(in, 3, 3 + len).map(x -> 2 * x).sorted().toArray() instanceof int[] b
            && IntStream.range(0, n).map(i -> -Arrays.binarySearch(b, 2 * (h - in[3 + len + i]) - 1)) .toArray() instanceof int[] hi
            && Integer.valueOf(Integer.highestOneBit(len + 1) == len + 1 ? len + 1 : Integer.highestOneBit(len + 1) * 2) instanceof Integer N
            && new int[2 * N] instanceof int[] t && new int[N] instanceof int[] d
            && IntStream.range(0, N).allMatch(i -> (t[N + i] = i <= len ? i - len : -1000000000) <= 0)
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).allMatch(p -> (t[p] = Math.max(t[2 * p], t[2 * p + 1])) <= 0)
            && ((IntBinaryOperator) (p, v) -> (t[p] += v) + (p < N ? d[p] += v : 0)) instanceof IntBinaryOperator ap
            && ((IntBinaryOperator) (r, v) -> new int[]{N, r + N} instanceof int[] st
                && IntStream.iterate(0, i -> st[0] < st[1], i -> i + 1).allMatch(i -> ((st[0] & 1) == 0 || ap.applyAsInt(st[0]++, v) > Integer.MIN_VALUE) && ((st[1] & 1) == 0 || ap.applyAsInt(--st[1], v) > Integer.MIN_VALUE) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0)
                && IntStream.of(N, r + N - 1).allMatch(p0 -> IntStream.iterate(p0 >> 1, q -> q >= 1, q -> q >> 1).allMatch(q -> (t[q] = Math.max(t[2 * q], t[2 * q + 1]) + d[q]) > Integer.MIN_VALUE)) ? 0 : 1) instanceof IntBinaryOperator add
            && new int[]{0} instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> add.applyAsInt(hi[i] + 0, 1) == 0 && (i < len || add.applyAsInt(hi[i - len], -1) == 0) && (i < len - 1 || t[1] > 0 || ++cnt[0] > 0))
            ? cnt[0] : "");
    }
}

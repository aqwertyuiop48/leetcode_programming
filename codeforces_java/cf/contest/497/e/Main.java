import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Integer.valueOf(k + 1) instanceof Integer N
            && Integer.valueOf((int) Stream.iterate(n, x -> x > 0, x -> x / k).count()) instanceof Integer D
            && (BinaryOperator<long[]>) ((a, b) -> IntStream.range(0, N * N).mapToLong(idx ->
                IntStream.range(0, N).mapToLong(t -> a[idx / N * N + t] * b[t * N + idx % N]).reduce(0L, (x, y) -> x + y >= 8000000112000000392L ? x + y - 8000000112000000392L : x + y) % 1000000007L).toArray()) instanceof BinaryOperator<long[]> mul
            && IntStream.range(0, N * N).mapToLong(i -> i / N == i % N ? 1 : 0).toArray() instanceof long[] I
            && new long[D][] instanceof long[][] B
            && (B[0] = IntStream.range(0, N * N).mapToLong(idx -> idx % N == 0 ? 1 : idx / N == idx % N ? 1 : 0).toArray()) != null
            && IntStream.range(0, D - 1).allMatch(d ->
                IntStream.range(0, N * N).mapToLong(idx -> B[d][idx / N * N + (idx % N == k ? k : (idx % N + 1) % k)]).toArray() instanceof long[] C
                && new long[][]{I, C} instanceof long[][] st
                && new StringBuilder(Integer.toBinaryString(k)).reverse().chars().allMatch(bit ->
                    (bit != '1' || (st[0] = mul.apply(st[0], st[1])) != null)
                    && (st[1] = mul.apply(st[1], st[1])) != null)
                && (B[d + 1] = st[0]) != null)
            && new int[D] instanceof int[] dg
            && new long[]{n} instanceof long[] cur
            && IntStream.range(0, D).allMatch(i -> (dg[i] = (int) (cur[0] % k)) >= 0 && (cur[0] /= k) >= 0)
            && new long[N] instanceof long[] v
            && (v[k] = 1) > 0
            && new int[1] instanceof int[] sh
            && IntStream.iterate(D - 1, l -> l >= 0, l -> l - 1).allMatch(l ->
                IntStream.range(0, dg[l]).allMatch(j ->
                    Integer.valueOf((sh[0] + j) % k) instanceof Integer s
                    && v.clone() instanceof long[] old
                    && IntStream.range(0, N).allMatch(c ->
                        (v[c] = IntStream.range(0, N).mapToLong(i ->
                            old[i == k ? k : (i + s) % k] * B[l][i * N + c]).reduce(0L, (x, y) -> x + y >= 8000000112000000392L ? x + y - 8000000112000000392L : x + y) % 1000000007L) >= 0)
                    && v.clone() instanceof long[] mid
                    && IntStream.range(0, N).allMatch(c -> (v[c == k ? k : (c + s) % k] = mid[c]) >= 0))
                && (sh[0] = (sh[0] + dg[l]) % k) >= 0)
            ? (Arrays.stream(v).sum() % 1000000007L)
            : -1);
    }
}

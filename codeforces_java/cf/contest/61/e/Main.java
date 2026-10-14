import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextToken())).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken())).toArray() instanceof int[] a
                && Arrays.stream(a).sorted().distinct().toArray() instanceof int[] u
                && Arrays.stream(a).map(x -> Arrays.binarySearch(u, x) + 1).toArray() instanceof int[] r
                && new int[n + 2] instanceof int[] bit
                && ((IntBinaryOperator) (p, d) -> IntStream.iterate(p, i -> i <= n, i -> i + (i & -i)).map(i -> bit[i] += d).sum()) instanceof IntBinaryOperator add
                && ((IntUnaryOperator) p -> IntStream.iterate(p, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum()) instanceof IntUnaryOperator qry
                && new long[n] instanceof long[] left
                && IntStream.range(0, n).allMatch(i -> (left[i] = i - qry.applyAsInt(r[i])) >= 0 && add.applyAsInt(r[i], 1) > 0)
                && IntStream.range(0, n + 2).allMatch(i -> (bit[i] = 0) == 0)
                ? IntStream.range(0, n).map(i -> n - 1 - i).mapToLong(i -> left[i] * qry.applyAsInt(r[i] - 1) + 0 * add.applyAsInt(r[i], 1)).sum()
                : 0L)));
    }
}

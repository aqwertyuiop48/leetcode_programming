import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(t -> !t.isEmpty()).mapToInt(Integer::parseInt).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToLong(j -> it.nextInt()).toArray()).toArray(long[][]::new) instanceof long[][] d
            && IntStream.range(0, n).map(i -> it.nextInt() - 1).toArray() instanceof int[] x && new long[n] instanceof long[] ans
            && IntStream.iterate(n - 1, k -> k >= 0, k -> k - 1).allMatch(k -> Integer.valueOf(x[k]) instanceof Integer v
                && IntStream.range(0, n).allMatch(i -> d[i] instanceof long[] row && Long.valueOf(row[v]) instanceof Long div && d[v] instanceof long[] dv
                    && IntStream.range(0, n).allMatch(j -> (row[j] = Math.min(row[j], div + dv[j])) >= 0))
                && (ans[k] = IntStream.range(k, n).mapToLong(p -> IntStream.range(k, n).mapToLong(q -> d[x[p]][x[q]]).sum()).sum()) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}


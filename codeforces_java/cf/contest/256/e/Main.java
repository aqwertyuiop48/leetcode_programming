import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Long.valueOf(777777777L) instanceof Long M
            && IntStream.range(0, 9).mapToLong(i -> it.next()).toArray() instanceof long[] w
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * (n - 1) - 1))) instanceof Integer size
            && ((java.util.function.BinaryOperator<long[]>) (A, B) -> IntStream.range(0, 9).mapToLong(x -> (A[x / 3 * 3] * B[x % 3] + A[x / 3 * 3 + 1] * B[3 + x % 3] + A[x / 3 * 3 + 2] * B[6 + x % 3]) % M).toArray()) instanceof java.util.function.BinaryOperator<long[]> mul
            && ((java.util.function.IntFunction<long[]>) tv -> IntStream.range(0, 9).mapToLong(x -> tv == 0 || tv == x / 3 + 1 ? w[x] : 0).toArray()) instanceof java.util.function.IntFunction<long[]> leaf
            && new long[2 * size][] instanceof long[][] t && new int[n] instanceof int[] a
            && IntStream.range(0, 2 * size).allMatch(i -> (t[i] = i >= size && i - size < n - 1 ? leaf.apply(0) : new long[]{1, 0, 0, 0, 1, 0, 0, 0, 1}) != null)
            && IntStream.iterate(size - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (t[i] = mul.apply(t[2 * i], t[2 * i + 1])) != null)
            && ((java.util.function.IntSupplier) () -> (int) IntStream.range(0, 3).mapToLong(i -> IntStream.range(0, 3).mapToLong(j -> a[n - 1] == 0 || a[n - 1] == j + 1 ? t[1][i * 3 + j] : 0).sum() % M).sum() % (int) (long) M) instanceof java.util.function.IntSupplier ans
            ? IntStream.range(0, m).mapToObj(q -> Integer.valueOf(it.next() - 1) instanceof Integer v && Integer.valueOf(it.next()) instanceof Integer tv
                && (a[v] = tv) >= 0 && (v >= n - 1 || (t[size + v] = leaf.apply(tv)) != null && IntStream.iterate((size + v) / 2, i -> i >= 1, i -> i / 2).allMatch(i -> (t[i] = mul.apply(t[2 * i], t[2 * i + 1])) != null))
                ? String.valueOf(ans.getAsInt()) : "").collect(Collectors.joining("\n")) : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && new int[n + 2] instanceof int[] nk && (nk[n] = n) >= 0 && (nk[n + 1] = n) >= 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (nk[i] = a[i] != -1 ? i : nk[i + 1]) >= 0)
            && ((IntUnaryOperator) i -> Integer.valueOf(nk[i]) instanceof Integer p1 && p1 < n && Integer.valueOf(nk[p1 + 1]) instanceof Integer p2 && p2 < n
                && Long.valueOf(a[p2] - a[p1]) instanceof Long d && Integer.valueOf(p2 - p1) instanceof Integer len
                ? (d % len != 0 || a[p1] - (long) (p1 - i) * (d / len) <= 0 ? p2
                    : IntStream.range(p2 + 1, n).filter(j -> a[p1] + (long) (j - p1) * (d / len) <= 0 || a[j] != -1 && a[j] != a[p1] + (long) (j - p1) * (d / len)).findFirst().orElse(n)) : n) instanceof IntUnaryOperator end
            ? IntStream.iterate(0, i -> i < n, i -> end.applyAsInt(i)).map(i -> 1).sum() : "");
    }
}

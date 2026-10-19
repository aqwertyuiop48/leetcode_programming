import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer l && Integer.valueOf(it.nextInt()) instanceof Integer r && Integer.valueOf(it.nextInt()) instanceof Integer p
            && new int[3000000] instanceof int[] raw && new int[]{1} instanceof int[] sz && (raw[0] = 1) == 1
            && IntStream.rangeClosed(2, p).filter(q -> IntStream.rangeClosed(2, q - 1).noneMatch(d -> q % d == 0)).allMatch(q -> IntStream.iterate(0, i -> i < sz[0], i -> i + 1).allMatch(i -> (long) raw[i] * q > r || (raw[sz[0]++] = raw[i] * q) > 0))
            && Arrays.stream(raw, 0, sz[0]).sorted().toArray() instanceof int[] a && Integer.valueOf(a.length) instanceof Integer N
            && new int[N] instanceof int[] g && new int[N] instanceof int[] best
            && IntStream.range(0, N).allMatch(i -> (g[i] = 1000) > 0 && (best[i] = 1000) > 0) && (g[0] = 0) == 0 && (best[0] = 0) == 0
            && ((java.util.function.IntBinaryOperator) (j, t) -> a[j] == t ? j : a[Math.min(N - 1, j + 1)] == t ? j + 1 : a[Math.min(N - 1, j + 2)] == t ? j + 2 : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 3), Math.min(N, j + 8), t)) instanceof Integer y1 && y1 >= 0 ? y1
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 8), Math.min(N, j + 32), t)) instanceof Integer y2 && y2 >= 0 ? y2
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 32), Math.min(N, j + 512), t)) instanceof Integer y3 && y3 >= 0 ? y3
                : Integer.valueOf(Arrays.binarySearch(a, Math.min(N, j + 512), Math.min(N, j + 8192), t)) instanceof Integer y4 && y4 >= 0 ? y4
                : Arrays.binarySearch(a, Math.min(N, j + 8192), N, t)) instanceof java.util.function.IntBinaryOperator find
            && IntStream.rangeClosed(2, p).allMatch(b -> new int[]{0} instanceof int[] jp
                && IntStream.range(0, N).takeWhile(i -> (long) a[i] * b <= r).allMatch(i -> g[i] + b >= p || (jp[0] = find.applyAsInt(jp[0], a[i] * b)) >= 0
                    && (g[jp[0]] = Math.min(g[jp[0]], g[i] + 1)) >= 0 && (best[jp[0]] = Math.min(best[jp[0]], g[jp[0]] + b)) >= 0))
            ? IntStream.range(0, N).filter(i -> a[i] >= l && best[i] <= p).count() : "");
    }
}

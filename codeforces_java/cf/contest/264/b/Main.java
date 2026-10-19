import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(100000) instanceof Integer N
            && new int[N + 1] instanceof int[] spf && IntStream.rangeClosed(2, N).allMatch(i -> spf[i] != 0 || (spf[i] = i) > 0 && (i > 316 || IntStream.iterate(i * i, j -> j <= N, j -> j + i).allMatch(j -> spf[j] != 0 || (spf[j] = i) > 0)))
            && new int[N + 1] instanceof int[] best
            ? IntStream.range(0, n).map(i -> Integer.valueOf(it.nextInt()) instanceof Integer x && IntStream.iterate(x, v -> v > 1, v -> v / spf[v]).map(v -> spf[v]).distinct().toArray() instanceof int[] ps
                && Integer.valueOf(1 + Arrays.stream(ps).map(p -> best[p]).max().orElse(0)) instanceof Integer v && Arrays.stream(ps).allMatch(p -> (best[p] = v) > 0) ? v : 1).max().getAsInt() : "");
    }
}

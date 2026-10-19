import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && new int[n + 1][4] instanceof int[][] adj && new int[n + 1] instanceof int[] cnt
            && IntStream.range(0, 2 * n).allMatch(e -> Integer.valueOf(it.nextInt()) instanceof Integer u && Integer.valueOf(it.nextInt()) instanceof Integer v
                && (adj[u][cnt[u]++ % 4] = v) > 0 && (adj[v][cnt[v]++ % 4] = u) > 0)
            && ((BiPredicate<Integer, Integer>) (u, v) -> Arrays.stream(adj[u]).anyMatch(w -> w == v)) instanceof BiPredicate<Integer, Integer> isAdj
            && ((BiFunction<Integer, Integer, int[]>) (x, y) -> x.equals(y) || !isAdj.test(x, y) ? null
                : new int[n] instanceof int[] p && new boolean[n + 1] instanceof boolean[] used
                && (p[0] = 1) == 1 && (p[1] = x) > 0 && (p[2] = y) > 0 && (used[1] = true) && (used[x] = true) && (used[y] = true)
                && IntStream.range(3, n).allMatch(i -> Integer.valueOf(Arrays.stream(adj[p[i - 1]]).filter(c -> !used[c] && isAdj.test(c, p[i - 2])).findFirst().orElse(0)) instanceof Integer c
                    && c > 0 && (used[c] = true) && (p[i] = c) > 0)
                && IntStream.range(0, n).allMatch(i -> isAdj.test(p[i], p[(i + 1) % n]) && isAdj.test(p[i], p[(i + 2) % n])) ? p : null) instanceof BiFunction<Integer, Integer, int[]> attempt
            ? Arrays.stream(adj[1]).boxed().flatMap(x -> Arrays.stream(adj[1]).boxed().map(y -> attempt.apply(x, y))).filter(Objects::nonNull).findFirst()
                .map(p -> Arrays.stream(p).mapToObj(String::valueOf).collect(Collectors.joining(" "))).orElse("-1") : "");
    }
}

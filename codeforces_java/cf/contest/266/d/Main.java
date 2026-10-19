import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && new int[n][n] instanceof int[][] d && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000000) >= 0))
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.nextInt() - 1, it.nextInt() - 1, it.nextInt()}).toList() instanceof List<int[]> es
            && es.stream().allMatch(e -> (d[e[0]][e[1]] = Math.min(d[e[0]][e[1]], e[2])) > 0 && (d[e[1]][e[0]] = Math.min(d[e[1]][e[0]], e[2])) > 0)
            && IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j])) >= 0)))
            ? String.format("%.2f", Math.min(IntStream.range(0, n).map(u -> 2 * Arrays.stream(d[u]).max().getAsInt()).min().getAsInt(),
                es.stream().mapToInt(e -> IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer x) -> -d[e[0]][x])).mapToInt(x -> x).toArray() instanceof int[] ord
                    && new int[]{ord[0], Integer.MAX_VALUE} instanceof int[] st
                    ? IntStream.range(1, n).filter(i -> d[e[1]][ord[i]] > d[e[1]][st[0]]).map(i -> Integer.valueOf(d[e[0]][ord[i]] + d[e[1]][st[0]] + e[2]) instanceof Integer cand && (st[0] = ord[i]) >= 0 ? cand : Integer.MAX_VALUE).min().orElse(Integer.MAX_VALUE) : Integer.MAX_VALUE).min().orElse(Integer.MAX_VALUE)) / 2.0) : "");
    }
}

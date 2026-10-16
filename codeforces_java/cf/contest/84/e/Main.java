import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList()).ifPresent(L ->
            System.out.println(
                Arrays.stream(L.get(0).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
                && Integer.valueOf(h[1]) instanceof Integer m
                && Integer.valueOf(h[0] * h[1]) instanceof Integer N
                && L.subList(1, h[0] + 1).stream().map(String::trim).collect(Collectors.joining()) instanceof String G
                && Integer.valueOf(G.indexOf('S')) instanceof Integer S
                && Integer.valueOf(G.indexOf('T')) instanceof Integer T
                && Integer.valueOf(G.chars().filter(c -> c >= 'a' && c <= 'z').map(c -> 1 << (c - 'a')).reduce(0, (x, y) -> x | y)) instanceof Integer present
                && Integer.valueOf(Math.min(h[2], Integer.bitCount(present))) instanceof Integer kk
                && ((IntFunction<IntStream>) u -> IntStream.of(u >= m ? u - m : -1, u + m < N ? u + m : -1, u % m > 0 ? u - 1 : -1, u % m < m - 1 ? u + 1 : -1).filter(v -> v >= 0)) instanceof IntFunction<IntStream> nb
                ? IntStream.concat(IntStream.iterate(present, x -> x > 0, x -> (x - 1) & present), IntStream.of(0))
                    .filter(mask -> Integer.bitCount(mask) == kk)
                    .mapToObj(mask -> IntStream.range(0, N).map(i -> -1).toArray() instanceof int[] d
                        && (d[T] = 0) == 0
                        && Stream.iterate(new int[]{T}, f -> f.length > 0, f -> IntStream.of(f)
                            .flatMap(u -> nb.apply(u).filter(v -> d[v] < 0
                                && (v == S || G.charAt(v) >= 'a' && G.charAt(v) <= 'z' && (mask >> (G.charAt(v) - 'a') & 1) == 1)
                                && (d[v] = d[u] + 1) > 0))
                            .toArray()).mapToInt(f -> f.length).sum() >= 0
                        && d[S] > 0
                        ? (String) IntStream.range(1, d[S]).boxed().reduce(new Object[]{"", new int[]{S}}, (st, s) ->
                            IntStream.of((int[]) st[1]).flatMap(nb).filter(v -> d[v] == d[S] - s).distinct().toArray() instanceof int[] c
                            && Integer.valueOf(IntStream.of(c).map(v -> G.charAt(v)).min().getAsInt()) instanceof Integer mn
                            ? new Object[]{st[0] + "" + (char) (int) mn, IntStream.of(c).filter(v -> G.charAt(v) == mn).toArray()}
                            : st, (a, b) -> a)[0]
                        : null)
                    .filter(Objects::nonNull)
                    .min(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                    .orElse("-1")
                : ""));
    }
}




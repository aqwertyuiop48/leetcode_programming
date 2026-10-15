import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split("\\s+") instanceof String[] tk
            && Arrays.stream(tk).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n
            && Integer.valueOf((int) a[1]) instanceof Integer m
            && ((IntUnaryOperator) k -> (int) a[k < m ? 4 + 3 * k : 5 + 3 * (k - m)] - 1) instanceof IntUnaryOperator fr
            && ((IntUnaryOperator) k -> (int) a[k < m ? 5 + 3 * k : 4 + 3 * (k - m)] - 1) instanceof IntUnaryOperator to
            && IntStream.range(0, n).mapToObj(u -> IntStream.range(0, 2 * m).filter(k -> fr.applyAsInt(k) == u)
                .mapToObj(k -> new long[]{to.applyAsInt(k), a[6 + 3 * (k % m)]}).toArray(long[][]::new))
                .toArray(long[][][]::new) instanceof long[][][] road
            && ((BiFunction<long[][][], Integer, long[]>) (g, src) ->
                new long[n] instanceof long[] d
                && IntStream.range(0, n).allMatch(i -> (d[i] = 4000000000000000000L) > 0)
                && (d[src] = 0) == 0
                && new PriorityQueue<long[]>((p, q) -> Long.compare(p[0], q[0])) instanceof PriorityQueue<long[]> pq
                && pq.add(new long[]{0, src})
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(t -> t[0] == d[(int) t[1]])
                    .allMatch(t -> Arrays.stream(g[(int) t[1]]).filter(e -> t[0] + e[1] < d[(int) e[0]])
                        .allMatch(e -> (d[(int) e[0]] = t[0] + e[1]) >= 0 && pq.add(new long[]{d[(int) e[0]], e[0]})))
                ? d : null) instanceof BiFunction<long[][][], Integer, long[]> dj
            && new long[n] instanceof long[] ds
            && IntStream.range(0, n).allMatch(i -> (ds[i] = 4000000000000000000L) > 0)
            && (ds[(int) a[2] - 1] = 0) == 0
            && new boolean[n] instanceof boolean[] dn
            && Stream.generate(() -> IntStream.range(0, n).filter(i -> !dn[i] && ds[i] < 4000000000000000000L).boxed()
                    .min(Comparator.comparingLong(i -> ds[i])).orElse(-1))
                .takeWhile(u -> u >= 0)
                .allMatch(u -> (dn[u] = true) && dj.apply(road, u) instanceof long[] rr
                    && IntStream.range(0, n).filter(j -> rr[j] <= a[4 + 3 * m + 2 * u] && ds[u] + a[5 + 3 * m + 2 * u] < ds[j])
                        .allMatch(j -> (ds[j] = ds[u] + a[5 + 3 * m + 2 * u]) >= 0))
            ? ds[(int) a[3] - 1] >= 4000000000000000000L ? -1 : ds[(int) a[3] - 1]
            : 0L);
    }
}


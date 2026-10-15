import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(new int[]{Integer.parseInt(sc.nextToken()), Integer.parseInt(sc.nextToken())}).ifPresent(nm ->
            System.out.println(
                Integer.valueOf(nm[0]) instanceof Integer n
                && Integer.valueOf(nm[1]) instanceof Integer m
                && Integer.valueOf((1 << n) - 1) instanceof Integer full
                && IntStream.range(0, m - 1).mapToObj(j -> IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken())).toArray()).toList() instanceof List<int[]> h
                && IntStream.range(0, m).mapToObj(j -> IntStream.range(0, n).map(i -> Integer.parseInt(sc.nextToken())).toArray()).toList() instanceof List<int[]> v
                ? IntStream.range(1, m).boxed().reduce(
                    IntStream.rangeClosed(0, full).mapToLong(mask -> mask == full ? IntStream.range(0, n).filter(i -> (mask >> i & 1) != (mask >> ((i + 1) % n) & 1)).map(i -> v.get(0)[i]).asLongStream().sum() : Long.MAX_VALUE / 4).toArray(),
                    (dp, j) -> IntStream.range(0, n).boxed().reduce(dp,
                            (d, i) -> IntStream.rangeClosed(0, full).mapToLong(M -> Math.min(d[M & ~(1 << i)], d[M | (1 << i)] + ((M >> i & 1) == 1 ? 0 : h.get(j - 1)[i])) + (i > 0 && (M >> i & 1) != (M >> (i - 1) & 1) ? v.get(j)[i - 1] : 0)).toArray(),
                            (x, y) -> x) instanceof long[] mid
                        ? IntStream.rangeClosed(0, full).mapToLong(M -> mid[M] + ((M & 1) != (M >> (n - 1) & 1) ? v.get(j)[n - 1] : 0)).toArray()
                        : dp,
                    (x, y) -> x)[0]
                : 0)));
    }
}


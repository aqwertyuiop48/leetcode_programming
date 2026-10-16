import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc -> Optional.of(Integer.parseInt(sc.nextToken())).ifPresent(n ->
            System.out.println(
                IntStream.range(0, 3 * n).map(i -> Integer.parseInt(sc.nextToken())).toArray() instanceof int[] r
                && new int[3 * n + 1] instanceof int[] tm
                && IntStream.range(0, 3 * n).allMatch(i -> (tm[Integer.parseInt(sc.nextToken())] = i / 3) >= 0)
                && Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer k
                && Integer.valueOf(IntStream.range(0, 3 * n).filter(i -> r[i] == k).findFirst().getAsInt()) instanceof Integer pos
                && Boolean.valueOf(IntStream.range(0, pos).allMatch(i -> tm[r[i]] < tm[k])) instanceof Boolean cap
                && Integer.valueOf(cap ? IntStream.rangeClosed(1, 3 * n).filter(p -> p != k && tm[p] == tm[k]).max().getAsInt() : 0) instanceof Integer m
                ? Stream.concat(
                    IntStream.rangeClosed(1, 3 * n).filter(p -> p != k && p <= m && tm[p] <= tm[k]).boxed(),
                    IntStream.rangeClosed(1, 3 * n).filter(p -> p != k && !(p <= m && tm[p] <= tm[k])).boxed())
                    .map(String::valueOf).collect(Collectors.joining(" "))
                : "")));
    }
}




import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && new int[5] instanceof int[] cnt && IntStream.range(0, n).allMatch(i -> ++cnt[it.next()] > 0)
            && IntStream.iterate(4, v -> v >= 0, v -> v - 1).flatMap(v -> IntStream.generate(() -> v).limit(cnt[v])).toArray() instanceof int[] a
            && new long[n + 1] instanceof long[] P && new long[n + 1] instanceof long[] G
            && IntStream.range(0, n).allMatch(i -> (P[i + 1] = P[i] + a[i]) >= 0 && (G[i + 1] = G[i] + Math.max(0, 3 - a[i])) >= 0)
            ? LongStream.rangeClosed(0, P[n] / 4).filter(x -> (P[n] - 4 * x) % 3 == 0 && x + (P[n] - 4 * x) / 3 <= n)
                .map(x -> 4 * x - P[(int) x] + G[(int) (x + (P[n] - 4 * x) / 3)] - G[(int) x]).min().stream().boxed().findFirst().map(String::valueOf).orElse("-1") : "");
    }
}

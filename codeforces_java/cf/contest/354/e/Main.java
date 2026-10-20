import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf(it.next().intValue()) instanceof Integer t
            && IntStream.range(0, 7).boxed().flatMap(c4 -> IntStream.range(0, 7 - c4).mapToObj(c7 -> new int[]{c4, c7, 4 * c4 + 7 * c7})).toList() instanceof List<int[]> opts
            && LongStream.iterate(1, v -> v * 10).limit(19).toArray() instanceof long[] pw
            ? IntStream.range(0, t).mapToObj(qi -> it.next() instanceof Long n && new boolean[20][8] instanceof boolean[][] ok && (ok[19][0] = true)
                && IntStream.iterate(18, p -> p >= 0, p -> p - 1).allMatch(p -> IntStream.range(0, 8).allMatch(c -> (ok[p][c] = opts.stream().anyMatch(o -> (o[2] + c) % 10 == n / pw[p] % 10 && ok[p + 1][(o[2] + c) / 10])) || true))
                ? ok[0][0] && new long[6] instanceof long[] num && new int[]{0} instanceof int[] cr
                    && IntStream.range(0, 19).allMatch(p -> opts.stream().filter(o -> (o[2] + cr[0]) % 10 == n / pw[p] % 10 && ok[p + 1][(o[2] + cr[0]) / 10]).findFirst().get() instanceof int[] o
                        && IntStream.range(0, 6).allMatch(j -> (num[j] += (j < o[1] ? 7 : j < o[0] + o[1] ? 4 : 0) * pw[p]) >= 0) && (cr[0] = (o[2] + cr[0]) / 10) >= 0)
                    ? Arrays.stream(num).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "-1" : "").collect(Collectors.joining("\n")) : "");
    }
}

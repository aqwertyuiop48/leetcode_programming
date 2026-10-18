import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            ? Stream.generate(() -> Stream.generate(() -> new long[]{s.nextLong(), s.nextLong()}).limit(s.nextInt()).toList() instanceof List<long[]> prs
                    && prs.stream().map(pa -> LongStream.iterate(1, x -> x * pa[0]).limit(pa[1] + 1).toArray()).toList() instanceof List<long[]> pw
                    && Long.valueOf(pw.stream().mapToLong(a -> a[a.length - 1]).reduce(1, (x, y) -> x * y)) instanceof Long v
                    && pw.stream().reduce(new long[]{1}, (old, a) -> Arrays.stream(a).flatMap(m -> Arrays.stream(old).map(d -> d * m)).toArray(), (x, y) -> x) instanceof long[] unsorted
                    && Arrays.stream(unsorted).sorted().toArray() instanceof long[] d
                    && new long[]{Long.MAX_VALUE, 0, 0, 0} instanceof long[] best
                    && Integer.valueOf(Arrays.binarySearch(d, (long) Math.cbrt(v) + 1)) instanceof Integer tp
                    && Integer.valueOf(tp >= 0 ? tp : -tp - 2) instanceof Integer top
                    && IntStream.iterate(Math.max(top, 0), i -> i >= 0, i -> i - 1)
                        .filter(i -> d[i] * d[i] * d[i] <= v)
                        .takeWhile(i -> 2 * (2 * d[i] * Math.sqrt((double) (v / d[i])) + v / d[i]) <= best[0] + 1.0)
                        .allMatch(i -> Long.valueOf(v / d[i]) instanceof Long w
                            && Long.valueOf((long) Math.sqrt((double) w)) instanceof Long r0
                            && Long.valueOf((r0 + 1) * (r0 + 1) <= w ? r0 + 1 : r0 * r0 > w ? r0 - 1 : r0) instanceof Long r
                            && Integer.valueOf(Arrays.binarySearch(d, r)) instanceof Integer pos
                            && Integer.valueOf(pos >= 0 ? pos : -pos - 2) instanceof Integer start
                            && IntStream.iterate(start, j -> j >= 0, j -> j - 1)
                                .takeWhile(j -> 2 * (d[i] * (d[j] + w / d[j]) + w) < best[0])
                                .filter(j -> w % d[j] == 0).findFirst().stream()
                                .allMatch(j -> (best[0] = 2 * (d[i] * (d[j] + w / d[j]) + w)) > 0 && (best[1] = d[i]) > 0 && (best[2] = d[j]) > 0 && (best[3] = w / d[j]) > 0) || true)
                    ? best[0] + " " + best[1] + " " + best[2] + " " + best[3] : "").limit(t).collect(Collectors.joining("\n"))
            : "");
    }
}

import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Long.valueOf(s.nextLong()) instanceof Long t
            && IntStream.range(0, k).mapToObj(i -> new long[]{s.nextInt() - 1, s.nextInt() - 1, s.nextLong()}).sorted(Comparator.comparingLong((long[] e) -> e[2])).toList() instanceof List<long[]> e
            && new long[]{0} instanceof long[] cnt
            && new long[]{0} instanceof long[] bound
            && new AtomicReference<Function<long[], Boolean>>() instanceof AtomicReference<Function<long[], Boolean>> dfs
            && dfs.compareAndSet(null, a -> ++cnt[0] < t
                && IntStream.range((int) a[0], k).takeWhile(j -> a[1] + e.get(j)[2] <= bound[0])
                    .filter(j -> ((a[2] >> e.get(j)[0]) & 1) == 0 && ((a[3] >> e.get(j)[1]) & 1) == 0)
                    .allMatch(j -> dfs.get().apply(new long[]{j + 1, a[1] + e.get(j)[2], a[2] | (1L << e.get(j)[0]), a[3] | (1L << e.get(j)[1])})))
            && new long[]{0, e.stream().mapToLong(x -> x[2]).sum()} instanceof long[] r
            && IntStream.range(0, 80).allMatch(i -> r[0] >= r[1] || ((bound[0] = (r[0] + r[1]) / 2) >= 0 && (cnt[0] = 0) == 0 && (dfs.get().apply(new long[]{0, 0, 0, 0}) || true)
                && (cnt[0] >= t ? (r[1] = bound[0]) >= 0 : (r[0] = bound[0] + 1) >= 0)))
            ? r[0]
            : 0);
    }
}

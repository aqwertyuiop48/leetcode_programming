import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> it.next()).toList() instanceof List<String> g
            && Integer.valueOf(it.next()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(i -> new int[]{Integer.parseInt(it.next()) - 1, Integer.parseInt(it.next()) - 1, Integer.parseInt(it.next()) - 1, Integer.parseInt(it.next()) - 1, i}).toList() instanceof List<int[]> qs
            && Integer.valueOf((m + 63) / 64) instanceof Integer W
            && new boolean[q] instanceof boolean[] ans
            && new AtomicReference<BiPredicate<int[], List<int[]>>>() instanceof AtomicReference<BiPredicate<int[], List<int[]>>> solve
            && solve.compareAndSet(null, (rg, ql) -> ql.isEmpty() || rg[0] > rg[1] || Integer.valueOf((rg[0] + rg[1]) / 2) instanceof Integer mid
                && new long[(mid - rg[0] + 1) * m * W] instanceof long[] L && new long[(rg[1] - mid + 1) * m * W] instanceof long[] R
                && IntStream.iterate(mid, r -> r >= rg[0], r -> r - 1).allMatch(r -> IntStream.iterate(m - 1, c -> c >= 0, c -> c - 1).allMatch(c -> g.get(r).charAt(c) == '.'
                    ? IntStream.range(0, W).allMatch(w -> (L[((r - rg[0]) * m + c) * W + w] = (r < mid ? L[((r + 1 - rg[0]) * m + c) * W + w] : 0L) | (c + 1 < m ? L[((r - rg[0]) * m + c + 1) * W + w] : 0L) | (r == mid && w == c / 64 ? 1L << (c % 64) : 0L)) >= Long.MIN_VALUE)
                    : true))
                && IntStream.rangeClosed(mid, rg[1]).allMatch(r -> IntStream.range(0, m).allMatch(c -> g.get(r).charAt(c) == '.'
                    ? IntStream.range(0, W).allMatch(w -> (R[((r - mid) * m + c) * W + w] = (r > mid ? R[((r - 1 - mid) * m + c) * W + w] : 0L) | (c > 0 ? R[((r - mid) * m + c - 1) * W + w] : 0L) | (r == mid && w == c / 64 ? 1L << (c % 64) : 0L)) >= Long.MIN_VALUE)
                    : true))
                && ql.stream().filter(x -> x[0] <= mid && x[2] >= mid).allMatch(x -> (ans[x[4]] = IntStream.range(0, W).anyMatch(w -> (L[((x[0] - rg[0]) * m + x[1]) * W + w] & R[((x[2] - mid) * m + x[3]) * W + w]) != 0)) | true)
                && solve.get().test(new int[]{rg[0], mid - 1}, ql.stream().filter(x -> x[2] < mid).toList())
                && solve.get().test(new int[]{mid + 1, rg[1]}, ql.stream().filter(x -> x[0] > mid).toList()))
            && solve.get().test(new int[]{0, n - 1}, qs)
            ? IntStream.range(0, q).mapToObj(i -> ans[i] ? "Yes" : "No").collect(Collectors.joining("\n")) : ""), "", 1 << 28).start();
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && (Long) Long.parseLong(t[1]) instanceof Long k
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[2 + 2 * i])).sorted().toArray() instanceof long[] ls
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[3 + 2 * i])).sorted().toArray() instanceof long[] rs
            && (Long) IntStream.range(0, n).mapToLong(i -> Long.parseLong(t[3 + 2 * i]) - Long.parseLong(t[2 + 2 * i])).min().getAsLong() instanceof Long minlen
            && Arrays.stream(ls).map(v -> v * 2).toArray() instanceof long[] l2
            && Arrays.stream(rs).map(v -> v * 2).toArray() instanceof long[] r2
            && new long[n + 1] instanceof long[] pl
            && new long[n + 1] instanceof long[] pr
            && new double[n + 1] instanceof double[] pld
            && new double[n + 1] instanceof double[] prd
            && IntStream.range(0, n).allMatch(i ->
                (pl[i + 1] = pl[i] + ls[i]) == pl[i + 1]
                && (pr[i + 1] = pr[i] + rs[i]) == pr[i + 1]
                && (pld[i + 1] = pld[i] + ls[i]) >= 0
                && (prd[i + 1] = prd[i] + rs[i]) >= 0)
            && Stream.iterate(new long[]{0}, a -> Arrays.stream(a).flatMap(p -> LongStream.of(p * 10 + 4, p * 10 + 7)).toArray())
                .skip(1).limit(18).flatMapToLong(Arrays::stream).toArray() instanceof long[] lk
            && (Integer) lk.length instanceof Integer M
            && Arrays.stream(lk).map(x ->
                (Integer) (-Arrays.binarySearch(l2, 2 * x + 1) - 1) instanceof Integer c
                ? (pld[n] - pld[c] - (double) x * (n - c) > 3e18 ? 2_000_000_000_000_000_000L : pl[n] - pl[c] - x * (n - c))
                : 0L).toArray() instanceof long[] A
            && Arrays.stream(lk).map(y ->
                (Integer) (-Arrays.binarySearch(r2, 2 * y - 1) - 1) instanceof Integer c
                ? ((double) y * c - prd[c] > 3e18 ? 2_000_000_000_000_000_000L : y * c - pr[c])
                : 0L).toArray() instanceof long[] B
            && new int[]{-1} instanceof int[] st
            ? IntStream.range(0, M).map(i ->
                (Integer) Math.max(st[0], i - 1) instanceof Integer jj
                && (Long) IntStream.iterate(jj + 1, tt -> tt < M && A[i] + B[tt] <= k && lk[tt] - lk[i] <= minlen, tt -> tt + 1).count() instanceof Long c
                && (st[0] = jj + (int) (long) c) >= 0
                ? st[0] - i + 1 : 0).max().getAsInt()
            : 0);
    }
}

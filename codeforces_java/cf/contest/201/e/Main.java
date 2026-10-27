import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer t
            && ((Function<long[], Long>) a -> a[1] < 0 || a[1] > a[0] ? 0L
                : (Long) Math.min(a[2], Stream.iterate(new long[]{0, 1}, st -> st[0] < Math.min(a[1], a[0] - a[1]) && st[1] <= a[2], st -> new long[]{st[0] + 1, st[1] * (a[0] - st[0]) / (st[0] + 1)})
                    .reduce((x, y) -> y).map(l -> new long[]{l[0] + 1, l[1] * (a[0] - l[0]) / (l[0] + 1)}).orElse(new long[]{0, 1})[1]) instanceof Long r ? r : 0L) instanceof Function<long[], Long> comb
            ? IntStream.range(0, t).mapToObj(q -> (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long m
                && ((Predicate<Long>) k -> n <= 1 || new long[]{1, 0, 0} instanceof long[] st
                    && LongStream.rangeClosed(1, k).allMatch(sz -> (Long) comb.apply(new long[]{k - 1, sz - 1, m - st[1] + 1}) instanceof Long cnt
                        ? st[1] + cnt <= m
                            ? (st[0] += comb.apply(new long[]{k, sz, n - st[0]})) > 0 && (st[0] >= n ? (st[2] = 1) < 0 : (st[1] += cnt) >= 0)
                            : (st[0] += k * (m - st[1]) / sz) > 0 && (st[2] = 1) < 0
                        : false) | true && st[0] >= n) instanceof Predicate<Long> chk
                && new long[]{1, n} instanceof long[] bs
                && IntStream.range(0, 40).allMatch(z -> bs[0] >= bs[1] || ((Long) (bs[0] + (bs[1] - bs[0]) / 2) instanceof Long mid && (chk.test(mid) ? (bs[1] = mid) > 0 : (bs[0] = mid + 1) > 0)))
                ? String.valueOf(n == 1 ? 0 : bs[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}


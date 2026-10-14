import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                (Integer) sc.nextInt() instanceof Integer n
                && sc.next().trim().chars().map(c -> c - '0').toArray() instanceof int[] a
                && LongStream.iterate(1, x -> x * 10).limit(n + 1).toArray() instanceof long[] pw
                && new long[2 * n + 1][2 * n + 1][n + 1] instanceof long[][][] memo
                && Arrays.stream(memo).allMatch(x -> Arrays.stream(x).allMatch(y -> IntStream.range(0, y.length).allMatch(i -> (y[i] = -1) < 0)))
                && new AtomicReference<ToLongFunction<int[]>>() instanceof AtomicReference<ToLongFunction<int[]>> f
                && ((Function<int[], long[]>) st -> new long[]{
                    st[2] < n ? a[st[0]] * pw[n - 1 - st[2]] + f.get().applyAsLong(new int[]{st[0] + 1, st[1], st[2] + 1}) : Long.MIN_VALUE / 4,
                    st[0] + st[1] - st[2] < n ? a[st[0]] * pw[n - 1 - (st[0] + st[1] - st[2])] + f.get().applyAsLong(new int[]{st[0] + 1, st[1], st[2]}) : Long.MIN_VALUE / 4,
                    st[2] < n ? a[2 * n - 1 - st[1]] * pw[n - 1 - st[2]] + f.get().applyAsLong(new int[]{st[0], st[1] + 1, st[2] + 1}) : Long.MIN_VALUE / 4,
                    st[0] + st[1] - st[2] < n ? a[2 * n - 1 - st[1]] * pw[n - 1 - (st[0] + st[1] - st[2])] + f.get().applyAsLong(new int[]{st[0], st[1] + 1, st[2]}) : Long.MIN_VALUE / 4}) instanceof Function<int[], long[]> opts
                && f.compareAndSet(null, st -> st[0] + st[1] == 2 * n ? 0
                    : memo[st[0]][st[1]][st[2]] >= 0 ? memo[st[0]][st[1]][st[2]]
                    : (memo[st[0]][st[1]][st[2]] = Arrays.stream(opts.apply(st)).max().getAsLong()))
                && ((ToIntFunction<int[]>) st -> (Long) LongStream.of(opts.apply(st)).max().getAsLong() instanceof Long mx
                    ? IntStream.range(0, 4).filter(j -> opts.apply(st)[j] == mx).findFirst().getAsInt() : 0) instanceof ToIntFunction<int[]> pick
                && new char[2 * n] instanceof char[] res
                && Stream.iterate(new int[]{0, 0, 0}, st -> st[0] + st[1] < 2 * n,
                        st -> (Integer) pick.applyAsInt(st) instanceof Integer j
                            ? (j < 2 ? new int[]{st[0] + 1, st[1], st[2] + (j == 0 ? 1 : 0)} : new int[]{st[0], st[1] + 1, st[2] + (j == 2 ? 1 : 0)})
                            : st)
                    .allMatch(st -> (res[st[0] + st[1]] = pick.applyAsInt(st) % 2 == 0 ? 'H' : 'M') > 0)
                ? new String(res) : ""));
    }
}


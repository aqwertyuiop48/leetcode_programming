
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long k0
            ? x == 1 ? "1" : k0 >= 100000 ? Collections.nCopies(100000, "1").stream().collect(Collectors.joining(" "))
            : CompletableFuture.supplyAsync(() -> LongStream.concat(LongStream.of(2, 3), IntStream.rangeClosed(1, 5270464).parallel().filter(i -> x % (6L * i - 1) == 0 || x % (6L * i + 1) == 0).sorted().mapToObj(i -> i).flatMapToLong(i -> LongStream.of(6L * i - 1, 6L * i + 1))).filter(c -> c * c <= x && x % c == 0).toArray() instanceof long[] cs
                && Arrays.stream(cs).filter(c -> Arrays.stream(cs).noneMatch(e -> e < c && c % e == 0)).toArray() instanceof long[] sp
                && (Long) Arrays.stream(sp).reduce(x, (y, p) -> LongStream.iterate(y, w -> w % p == 0, w -> w / p).reduce((a, b) -> b).orElse(y) / p) instanceof Long rest
                && (rest > 1 ? LongStream.concat(Arrays.stream(sp), LongStream.of(rest)).toArray() : sp) instanceof long[] P
                && new HashMap<Long, long[]>() instanceof HashMap<Long, long[]> memo && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt && new Object[1] instanceof Object[] ref
                && ((Function<Long, long[]>) d -> Arrays.stream(P).boxed().reduce(new long[]{1L}, (cur, p) -> (Integer) (int) LongStream.iterate(d, w -> w % p == 0, w -> w / p).count() instanceof Integer e && e > 0
                    ? Arrays.stream(cur).flatMap(v -> LongStream.iterate(1L, t -> t * p).limit(e + 1).map(t -> v * t)).toArray() : cur, (a, b) -> a)) instanceof Function<Long, long[]> divs
                && (ref[0] = (Predicate<long[]>) q -> cnt[0] < 100000 && (q[1] == 0 || q[0] == 1 ? sb.append(q[0]).append(' ') != null && ++cnt[0] > 0
                    : memo.computeIfAbsent(q[0], d -> Arrays.stream(divs.apply(d)).sorted().toArray()) instanceof long[] sub
                    && (sub.length == 2 ? IntStream.range(0, (int) Math.min(q[1], 100000 - cnt[0])).allMatch(z -> sb.append("1 ") != null && ++cnt[0] > 0)
                        && cnt[0] < 100000 && sb.append(q[0]).append(' ') != null && ++cnt[0] > 0
                    : Arrays.stream(sub).allMatch(j -> ((Predicate<long[]>) ref[0]).test(new long[]{j, q[1] - 1}))))) != null
                && (((Predicate<long[]>) ref[0]).test(new long[]{x, k0}) || true)
                ? sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}




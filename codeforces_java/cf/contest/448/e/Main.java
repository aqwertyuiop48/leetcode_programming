import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long x && (Long) s.nextLong() instanceof Long k0
            ? x == 1 ? "1" : k0 >= 100000 ? Collections.nCopies(100000, "1").stream().collect(Collectors.joining(" "))
            : CompletableFuture.supplyAsync(() -> LongStream.rangeClosed(1, 100000).filter(d -> x % d == 0).boxed().flatMap(d -> Stream.of(d, x / d)).distinct().sorted().mapToLong(d -> d).toArray() instanceof long[] dv
                && IntStream.range(0, dv.length).mapToObj(i -> IntStream.range(0, dv.length).filter(j -> dv[i] % dv[j] == 0).toArray()).toArray(int[][]::new) instanceof int[][] sub
                && new StringBuilder() instanceof StringBuilder sb && new int[1] instanceof int[] cnt && new Object[1] instanceof Object[] ref
                && (ref[0] = (Predicate<long[]>) q -> cnt[0] < 100000 && (q[1] == 0 || q[0] == 0 ? sb.append(dv[(int) q[0]]).append(' ') != null && ++cnt[0] > 0
                    : sub[(int) q[0]].length == 2 ? IntStream.range(0, (int) Math.min(q[1], 100000 - cnt[0])).allMatch(z -> sb.append("1 ") != null && ++cnt[0] > 0)
                        && cnt[0] < 100000 && sb.append(dv[(int) q[0]]).append(' ') != null && ++cnt[0] > 0
                    : Arrays.stream(sub[(int) q[0]]).allMatch(j -> ((Predicate<long[]>) ref[0]).test(new long[]{j, q[1] - 1})))) != null
                && (((Predicate<long[]>) ref[0]).test(new long[]{dv.length - 1, k0}) || true)
                ? sb.toString().trim() : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}


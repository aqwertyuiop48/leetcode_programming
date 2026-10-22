import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long X && Long.valueOf(sc.nextLong()) instanceof Long k
            && LongStream.rangeClosed(1, 31623).filter(d -> X % d == 0).flatMap(d -> LongStream.of(d, X / d)).distinct().sorted().toArray() instanceof long[] D
            && Arrays.stream(D).mapToObj(x -> IntStream.range(0, D.length).filter(j -> x % D[j] == 0).toArray()).toList() instanceof List<int[]> sub
            && new int[100000] instanceof int[] out && new int[1] instanceof int[] cnt
            && new AtomicReference<BiFunction<Integer, Long, Boolean>>() instanceof AtomicReference<BiFunction<Integer, Long, Boolean>> f
            && f.getAndSet((idx, dep) -> idx == 0 || dep == 0 ? (out[cnt[0]++] = (int) D[idx]) > 0 && cnt[0] >= 100000
                : Arrays.stream(sub.get(idx)).anyMatch(j -> f.get().apply(j, dep - 1))) == null
            ? f.get().apply(D.length - 1, Math.min(k, 100000L)) instanceof Boolean b ? Arrays.stream(out, 0, cnt[0]).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "" : ""), "", 1 << 29).start();
    }
}

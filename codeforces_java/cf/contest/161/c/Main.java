import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), 30} instanceof int[] q
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> rec
            && ((BiFunction<int[], Integer, List<int[]>>) (iv, mid) -> Stream.of(iv[0] < mid ? new int[]{iv[0], Math.min(iv[1], mid - 1)} : null, iv[1] > mid ? new int[]{Math.max(iv[0], mid + 1) - mid, iv[1] - mid} : null).filter(Objects::nonNull).toList()) instanceof BiFunction<int[], Integer, List<int[]>> pieces
            && rec.compareAndSet(null, a -> a[0] > a[1] || a[2] > a[3] ? 0
                : (a[0] <= a[2] && a[3] <= a[1]) || (a[2] <= a[0] && a[1] <= a[3]) ? Math.min(a[1] - a[0], a[3] - a[2]) + 1
                : Integer.valueOf(1 << (a[4] - 1)) instanceof Integer mid
                    ? Math.max(Math.max(Math.max(0, Math.min(a[1], a[3]) - Math.max(a[0], a[2]) + 1),
                            a[0] <= mid && mid <= a[1] && a[2] <= mid && mid <= a[3] ? Math.min(mid - a[0], mid - a[2]) + 1 + Math.min(a[1] - mid, a[3] - mid) : 0),
                        pieces.apply(new int[]{a[0], a[1]}, mid).stream().flatMap(x -> pieces.apply(new int[]{a[2], a[3]}, mid).stream().map(y -> rec.get().apply(new int[]{x[0], x[1], y[0], y[1], a[4] - 1}))).mapToInt(v -> v).max().orElse(0))
                    : 0)
            ? rec.get().apply(new int[]{q[0], q[1], q[2], q[3], 30}).toString()
            : "");
    }
}

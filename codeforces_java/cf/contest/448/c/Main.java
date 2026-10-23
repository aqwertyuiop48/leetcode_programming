import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s ? CompletableFuture.supplyAsync(() -> (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new Object[1] instanceof Object[] ref
            && (ref[0] = (ToIntFunction<int[]>) q -> q[0] > q[1] ? 0 : (Integer) IntStream.rangeClosed(q[0], q[1]).map(i -> a[i]).min().getAsInt() instanceof Integer mn
                && IntStream.rangeClosed(q[0] - 1, q[1]).filter(i -> i == q[0] - 1 || a[i] == mn).boxed().toList() instanceof List<Integer> cut
                ? Math.min(q[1] - q[0] + 1, mn - q[2] + IntStream.range(0, cut.size()).map(i -> ((ToIntFunction<int[]>) ref[0]).applyAsInt(new int[]{cut.get(i) + 1, (i + 1 < cut.size() ? cut.get(i + 1) : q[1] + 1) - 1, mn})).sum()) : 0) != null
            ? "" + ((ToIntFunction<int[]>) ref[0]).applyAsInt(new int[]{0, n - 1, 0}) : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}

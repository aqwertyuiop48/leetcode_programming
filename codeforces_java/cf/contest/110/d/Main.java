import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Long) s.nextLong() instanceof Long pl && (Long) s.nextLong() instanceof Long pr && (Long) s.nextLong() instanceof Long vl && (Long) s.nextLong() instanceof Long vr && (Integer) s.nextInt() instanceof Integer k && LongStream.concat(LongStream.of(0), LongStream.concat(IntStream.rangeClosed(1, 9).boxed().flatMapToLong(len -> IntStream.range(0, 1 << len).mapToLong(m -> Long.parseLong(Integer.toBinaryString(m | 1 << len).substring(1).replace('0', '4').replace('1', '7')))).sorted(), LongStream.of(1000000001L))).toArray() instanceof long[] a && ((Function<long[], Long>) q -> Math.max(0L, Math.min(q[1], q[3]) - Math.max(q[0], q[2]) + 1)) instanceof Function<long[], Long> ov ? String.format(Locale.US, "%.12f", IntStream.rangeClosed(1, a.length - 1 - k).mapToLong(i -> ov.apply(new long[]{a[i - 1] + 1, a[i], pl, pr}) * ov.apply(new long[]{a[i + k - 1], a[i + k] - 1, vl, vr}) + ov.apply(new long[]{a[i - 1] + 1, a[i], vl, vr}) * ov.apply(new long[]{a[i + k - 1], a[i + k] - 1, pl, pr}) - (k == 1 && pl <= a[i] && a[i] <= pr && vl <= a[i] && a[i] <= vr ? 1 : 0)).sum() / (double) ((pr - pl + 1) * (vr - vl + 1))) : "").ifPresent(System.out::println);
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong()}).ifPresent(nm ->
            System.out.println(
                new int[(int) nm[0] * 2 + 3] instanceof int[] diff
                ? 2 * LongStream.rangeClosed(1, nm[0]).map(b ->
                    (Long) Math.max(0L, (long) Math.sqrt((double) Math.max(0L, b * b - nm[1]))) instanceof Long r0
                    && (Long) (r0 * r0 >= b * b - nm[1] ? (r0 > 0 && (r0 - 1) * (r0 - 1) >= b * b - nm[1] ? r0 - 1 : r0) : r0 + 1) instanceof Long t0
                    && (Long) (b * b <= nm[1] ? 0L : t0) instanceof Long lo
                    ? Math.min(nm[1], b * b) - Math.max(0L, b - lo)
                        + (lo <= b - 1 ? 0L * (++diff[1] + --diff[(int) (b - lo + 1)] + ++diff[(int) (b + lo)] + --diff[(int) (2 * b)]) : 0L)
                    : 0L).sum()
                    + IntStream.rangeClosed(1, (int) nm[0] * 2).filter(new int[]{0} instanceof int[] cur ? p -> (cur[0] += diff[p]) > 0 : p -> false).count()
                : 0L)));
    }
}

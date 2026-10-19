import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long x && Long.valueOf(s.nextLong()) instanceof Long y && Long.valueOf(s.nextLong()) instanceof Long c
            && ((java.util.function.LongUnaryOperator) t -> 2 * t * t + 2 * t + 1
                - LongStream.of(x - 1, n - x, y - 1, n - y).filter(d -> t > d).map(d -> (t - d) * (t - d)).sum()
                + LongStream.of(x - 1 + y - 1, x - 1 + n - y, n - x + y - 1, n - x + n - y).filter(d -> t >= d + 2).map(d -> (t - d - 1) * (t - d) / 2).sum()) instanceof java.util.function.LongUnaryOperator cnt
            && new long[]{0, 2 * n} instanceof long[] st
            && IntStream.iterate(0, z -> st[0] < st[1], z -> z + 1).allMatch(z -> Long.valueOf((st[0] + st[1]) / 2) instanceof Long mid
                && (cnt.applyAsLong(mid) >= c ? (st[1] = mid) >= 0 : (st[0] = mid + 1) >= 0))
            ? st[0] : "");
    }
}

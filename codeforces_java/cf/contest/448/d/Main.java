import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long m && (Long) s.nextLong() instanceof Long k && new long[]{1, n * m} instanceof long[] st
            && IntStream.range(0, 64).allMatch(i -> (Long) ((st[0] + st[1]) / 2) instanceof Long mid
                && (LongStream.rangeClosed(1, n).map(r -> Math.min(m, mid / r)).sum() >= k ? (st[1] = mid) > 0 : (st[0] = mid + 1) > 0))
            ? st[0] : 0);
    }
}

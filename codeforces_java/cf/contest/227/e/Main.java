import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long m && Long.valueOf(s.nextLong()) instanceof Long l && Long.valueOf(s.nextLong()) instanceof Long r && Long.valueOf(s.nextLong()) instanceof Long k
            && LongStream.rangeClosed(1, (long) Math.sqrt(r) + 1).boxed().flatMap(i -> Stream.of(i, r / i)).filter(d -> d >= 1 && r / d - (l - 1) / d >= k).max(Long::compare).get() instanceof Long d
            ? LongStream.iterate(62, i -> i >= 0, i -> i - 1).boxed().reduce(new long[]{0, 1 % m}, (st, i) -> new long[]{st[0] * ((2 * st[1] - st[0]) % m + m) % m, (st[0] * st[0] + st[1] * st[1]) % m} instanceof long[] dbl
                ? (d >> i & 1) == 1 ? new long[]{dbl[1], (dbl[0] + dbl[1]) % m} : dbl : st, (x, y) -> x)[0] % m : "");
    }
}


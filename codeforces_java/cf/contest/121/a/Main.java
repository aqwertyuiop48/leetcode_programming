import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Long) s.nextLong() instanceof Long l
            && (Long) s.nextLong() instanceof Long r
            && LongStream.rangeClosed(1, 10).flatMap(len -> LongStream.range(0, 1L << len)
                .map(m -> IntStream.range(0, (int) len).mapToLong(b -> ((m >> (len - 1 - b)) & 1) == 1 ? 7 : 4).reduce(0, (x, d) -> x * 10 + d)))
                .toArray() instanceof long[] lk
            ? IntStream.range(0, lk.length)
                .mapToLong(i -> Math.max(0L, Math.min(r, lk[i]) - Math.max(l, i == 0 ? 1 : lk[i - 1] + 1) + 1) * lk[i]).sum()
            : 0L);
    }
}


import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                LongStream.of(s.nextLong() - 1, s.nextLong() - 1, s.nextLong() - 1).sorted().toArray() instanceof long[] d
                && new long[]{s.nextLong(), 1} instanceof long[] st
                && IntStream.range(0, 3).allMatch(i ->
                    Long.valueOf(Math.min(d[i], st[0] / (3 - i))) instanceof Long a
                    && (st[0] -= a) == st[0]
                    && (st[1] *= a + 1) == st[1])
                ? st[1]
                : 0L));
    }
}


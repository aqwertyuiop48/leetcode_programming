import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && Long.valueOf(s.nextLong()) instanceof Long k
            && new long[]{1, n} instanceof long[] r
            && IntStream.range(0, 40).allMatch(i -> LongStream.iterate((r[0] + r[1]) / 2, x -> x > 0, x -> x / k).sum() >= n ? (r[1] = (r[0] + r[1]) / 2) > 0 : (r[0] = (r[0] + r[1]) / 2 + 1) > 0)
            ? r[0]
            : 0);
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long c1
            && Long.valueOf(sc.nextLong()) instanceof Long c2
            && Long.valueOf(sc.nextLong()) instanceof Long x
            && Long.valueOf(sc.nextLong()) instanceof Long y
            && ((LongPredicate) v -> v - v / x >= c1 && v - v / y >= c2 && v - v / (x * y) >= c1 + c2) instanceof LongPredicate ok
            && new long[] {0, 1L << 40} instanceof long[] b
            && IntStream.range(0, 42).allMatch(i -> ok.test((b[0] + b[1]) / 2) ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2) >= 0)
            ? b[1]
            : -1);
    }
}

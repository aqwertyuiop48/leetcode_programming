import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                (LongUnaryOperator) (v -> v < 0 ? 0 : v % 4 == 0 ? v : v % 4 == 1 ? 1 : v % 4 == 2 ? v + 1 : 0) instanceof LongUnaryOperator xu
                && new long[]{0} instanceof long[] acc
                && IntStream.range(0, n).allMatch(i ->
                    new long[]{s.nextLong(), s.nextLong()} instanceof long[] xm
                    && (acc[0] ^= (xu.applyAsLong(xm[0] + xm[1] - 1) ^ xu.applyAsLong(xm[0] - 1))) >= Long.MIN_VALUE)
                && acc[0] != 0
                ? "tolik"
                : "bolik")));
    }
}






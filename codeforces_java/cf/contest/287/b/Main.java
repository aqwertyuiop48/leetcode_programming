import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long k
            && ((java.util.function.LongUnaryOperator) m -> m * (k - 1) - m * (m - 1) / 2 + 1) instanceof java.util.function.LongUnaryOperator tot
            && new long[]{0, k - 1} instanceof long[] b
            ? tot.applyAsLong(k - 1) < n ? -1 : IntStream.range(0, 64).allMatch(i -> b[0] >= b[1] || (tot.applyAsLong((b[0] + b[1]) / 2) >= n ? (b[1] = (b[0] + b[1]) / 2) >= 0 : (b[0] = (b[0] + b[1]) / 2 + 1) >= 0)) ? b[0] : -1 : "");
    }
}


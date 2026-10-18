import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong()) instanceof Long c
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> p
            && ((LongUnaryOperator) x -> p.stream().mapToLong(t -> 1 + (t[0] == 0 ? 0 : Math.min(2_000_000_000L, x / t[1] > 2_000_000_000L / t[0] ? 2_000_000_000L : x / t[1] * t[0] + x % t[1] * t[0] / t[1])) ).sum()) instanceof LongUnaryOperator f
            && ((LongUnaryOperator) target -> new long[]{1, 2_000_000_000_000_000_000L} instanceof long[] r
                && IntStream.range(0, 64).allMatch(i -> r[0] >= r[1] || (f.applyAsLong((r[0] + r[1]) / 2) >= target ? (r[1] = (r[0] + r[1]) / 2) > 0 : (r[0] = (r[0] + r[1]) / 2 + 1) > 0))
                ? r[0] : 0) instanceof LongUnaryOperator firstAtLeast
            ? p.stream().allMatch(t -> t[0] == 0) ? n.longValue() == c ? "-1" : "0" : String.valueOf(firstAtLeast.applyAsLong(c + 1) - firstAtLeast.applyAsLong(c))
            : "");
    }
}

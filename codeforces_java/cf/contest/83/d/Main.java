import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Long.valueOf(t[2]) instanceof Long k
            && ((LongPredicate) p -> p > 1 && LongStream.rangeClosed(2, (long) Math.sqrt(p)).noneMatch(d -> p % d == 0)) instanceof LongPredicate pr
            && IntStream.range(2, 44722).filter(p -> pr.test(p)).toArray() instanceof int[] P
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] g
            && (g[0] = (y, kk) -> y < kk ? (y >= 1 ? 1 : 0) : y - Arrays.stream(P).takeWhile(p -> p < kk && p <= y).mapToLong(p -> g[0].applyAsLong(y / p, p)).sum()) != null
            && ((LongUnaryOperator) x -> x < k ? 0 : g[0].applyAsLong(x / k, k)) instanceof LongUnaryOperator fx
            ? (!pr.test(k) ? 0L : k * k > t[1] ? (t[0] <= k && k <= t[1] ? 1L : 0L) : fx.applyAsLong(t[1]) - fx.applyAsLong(t[0] - 1)) : "");
    }
}




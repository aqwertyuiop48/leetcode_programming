import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Long) s.nextLong() instanceof Long h && (Long) s.nextLong() instanceof Long m && (Integer) s.nextInt() instanceof Integer k && (Long) s.nextLong() instanceof Long h1 && (Long) s.nextLong() instanceof Long m1 && (Long) s.nextLong() instanceof Long h2 && (Long) s.nextLong() instanceof Long m2 && (Long) (h * m) instanceof Long T && (Long) (h1 * m + m1) instanceof Long t1 && (Long) ((h2 * m + m2 - t1 + T) % T) instanceof Long len && (Long) String.valueOf(m - 1).chars().filter(c -> c != '0').count() instanceof Long cm && (Long) String.valueOf(h - 1).chars().filter(c -> c != '0').count() instanceof Long ch && ((LongUnaryOperator) X -> X < 0 || k > 10 ? 0L : (X + 1) / LongStream.range(0, k - 1).reduce(1, (a, b) -> a * 10)) instanceof LongUnaryOperator cnt && ((LongUnaryOperator) q -> (Long) Math.min(q - 1, h - 2) instanceof Long hm && (Long) (k - cm) instanceof Long need ? (hm < 0 ? 0L : need <= 1 ? hm + 1 : need > 10 ? 0L : (hm + 1) / LongStream.range(0, need - 1).reduce(1, (a, b) -> a * 10)) + (q >= h && ch + cm >= k ? 1L : 0L) : 0L) instanceof LongUnaryOperator bf && ((LongUnaryOperator) x -> x / m * cnt.applyAsLong(m - 2) + bf.applyAsLong(x / m) + cnt.applyAsLong(x % m - 1)) instanceof LongUnaryOperator g ? len == 0 ? 0L : t1 + len <= T ? g.applyAsLong(t1 + len) - g.applyAsLong(t1) : g.applyAsLong(T) - g.applyAsLong(t1) + g.applyAsLong(t1 + len - T) : 0L).ifPresent(System.out::println);
    }
}

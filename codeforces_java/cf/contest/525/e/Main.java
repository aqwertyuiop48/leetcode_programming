import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer k && (Long) sc.nextLong() instanceof Long s
            && IntStream.range(0, n).mapToLong(i -> sc.nextLong()).toArray() instanceof long[] a
            && new long[19] instanceof long[] fact && (fact[0] = 1) > 0 && IntStream.rangeClosed(1, 18).allMatch(i -> (fact[i] = fact[i - 1] * i) > 0)
            && ((BiFunction<Integer, Integer, long[]>) (from, to) -> IntStream.range(from, to).boxed().reduce(LongStream.of(0), (st, i) -> st.flatMap(key ->
                    LongStream.concat(LongStream.of(key), LongStream.concat(
                        (key >> 5) + a[i] <= s ? LongStream.of(key + (a[i] << 5)) : LongStream.empty(),
                        a[i] <= 18 && (key & 31) + 1 <= k && (key >> 5) + fact[(int) a[i]] <= s ? LongStream.of(key + (fact[(int) a[i]] << 5) + 1) : LongStream.empty()))), (x, y) -> x).toArray()) instanceof BiFunction<Integer, Integer, long[]> enumerate
            && enumerate.apply(0, n / 2) instanceof long[] left && Arrays.stream(left).sorted().toArray() instanceof long[] L && enumerate.apply(n / 2, n) instanceof long[] right
            && ((LongUnaryOperator) x -> IntStream.iterate(1 << 21, b -> b > 0, b -> b >> 1).reduce(0, (pos, b) -> pos + b <= L.length && L[pos + b - 1] < x ? pos + b : pos)) instanceof LongUnaryOperator lb
            ? Arrays.stream(right).map(key -> (Long) (s - (key >> 5)) instanceof Long rem ? lb.applyAsLong((rem << 5) + Math.max(0, k - (key & 31)) + 1) - lb.applyAsLong(rem << 5) : 0).sum() : 0);
    }
}

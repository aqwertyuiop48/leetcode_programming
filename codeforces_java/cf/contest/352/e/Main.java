import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            && Integer.valueOf(2 * n + 1) instanceof Integer K && Long.valueOf(1000000000000000L) instanceof Long INF
            && IntStream.range(0, K).mapToObj(i -> IntStream.range(0, n).boxed().reduce(LongStream.range(0, K).map(j -> j == i ? 0 : INF).toArray(),
                (dp, t) -> LongStream.range(0, K).map(j -> Math.min(j > 0 ? dp[(int) j - 1] + a[t] : INF, j + 1 < K ? dp[(int) j + 1] + b[t] : INF)).toArray(), (x, y) -> x)).toArray(long[][]::new) instanceof long[][] M
            && ((BinaryOperator<long[][]>) (A, B) -> IntStream.range(0, K).mapToObj(i -> IntStream.range(0, K).mapToLong(j -> IntStream.range(0, K).mapToLong(k -> Math.min(INF, A[i][k] + B[k][j])).min().getAsLong()).toArray()).toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            ? IntStream.iterate(31 - Integer.numberOfLeadingZeros(m), bt -> bt >= 0, bt -> bt - 1).boxed().reduce(IntStream.range(0, K).mapToObj(i -> LongStream.range(0, K).map(j -> j == i ? 0 : INF).toArray()).toArray(long[][]::new),
                (R, bt) -> (m >> bt & 1) == 1 ? mul.apply(mul.apply(R, R), M) : mul.apply(R, R), (x, y) -> x)[0][0] : "");
    }
}

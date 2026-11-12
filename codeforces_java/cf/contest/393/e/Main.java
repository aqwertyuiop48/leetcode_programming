
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long P && Integer.valueOf(2 * k + 3) instanceof Integer D
            && Stream.iterate(new long[]{1}, g -> IntStream.rangeClosed(0, g.length + 1).mapToLong(t -> ((t >= 2 ? g[t - 2] : 0) + 2 * P - (t >= 1 && t - 1 < g.length ? g[t - 1] : 0) - (t < g.length ? g[t] : 0)) % P).toArray())
                .limit(k + 2).reduce((x, y) -> y).get() instanceof long[] g1
            && IntStream.rangeClosed(0, D).mapToLong(t -> ((t >= 1 ? g1[t - 1] : 0) + P - (t < g1.length ? g1[t] : 0)) % P).toArray() instanceof long[] g
            && IntStream.range(0, D).mapToLong(i -> (P - g[i]) % P).toArray() instanceof long[] c
            && Stream.iterate(new long[]{1, 2}, f -> new long[]{f[1], (f[0] + f[1]) % P}).limit(D).mapToLong(f -> f[0]).toArray() instanceof long[] fib
            && new long[]{0} instanceof long[] acc
            && IntStream.range(0, D).mapToLong(i -> acc[0] = (acc[0] + fib[i] * LongStream.range(0, k).reduce(1L, (x, y) -> x * (i + 1) % P) % P) % P).toArray() instanceof long[] s
            && ((BinaryOperator<long[]>) (A, B) -> IntStream.range(0, 2 * D - 1).mapToLong(t -> IntStream.rangeClosed(Math.max(0, t - D + 1), Math.min(t, D - 1)).mapToLong(i -> A[i] * B[t - i] % P).sum() % P).toArray() instanceof long[] pr
                && IntStream.iterate(2 * D - 2, t -> t >= D, t -> t - 1).allMatch(t -> IntStream.range(0, D).allMatch(i -> (pr[t - D + i] = (pr[t - D + i] + pr[t] * c[i]) % P) >= 0))
                ? Arrays.copyOf(pr, D) : null) instanceof BinaryOperator<long[]> mul
            && ((UnaryOperator<long[]>) q -> IntStream.range(0, D).mapToLong(i -> ((i > 0 ? q[i - 1] : 0) + q[D - 1] * c[i]) % P).toArray()) instanceof UnaryOperator<long[]> shift
            && Long.valueOf(n - 1) instanceof Long e
            && IntStream.iterate(63 - Long.numberOfLeadingZeros(e), b -> b >= 0, b -> b - 1).boxed().reduce(IntStream.range(0, D).mapToLong(i -> i == 0 ? 1 : 0).toArray(),
                (r, b) -> (e >> b & 1) == 1 ? shift.apply(mul.apply(r, r)) : mul.apply(r, r),
                (x, y) -> x) instanceof long[] R
            ? IntStream.range(0, D).mapToLong(i -> R[i] * s[i] % P).sum() % P : "");
    }
}




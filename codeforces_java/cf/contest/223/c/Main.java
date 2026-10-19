import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long k
            && LongStream.range(0, n).map(i -> s.nextLong()).toArray() instanceof long[] a
            && Long.valueOf(1000000007L) instanceof Long M
            && ((LongBinaryOperator) (b, e) -> LongStream.iterate(62, i -> i >= 0, i -> i - 1).reduce(1L, (r, i) -> (e >> i & 1) == 1 ? r * r % M * b % M : r * r % M)) instanceof LongBinaryOperator pw
            && new long[n] instanceof long[] coef && (coef[0] = 1) == 1
            && IntStream.range(1, n).allMatch(d -> (coef[d] = coef[d - 1] * ((k - 1 + d) % M) % M * pw.applyAsLong(d, M - 2) % M) >= 0)
            ? k == 0 ? Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : IntStream.range(0, n).mapToObj(i -> String.valueOf(IntStream.rangeClosed(0, i).mapToLong(j -> coef[i - j] * (a[j] % M) % M).sum() % M)).collect(Collectors.joining(" ")) : "");
    }
}

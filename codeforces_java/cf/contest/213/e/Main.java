import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> it.next()).toArray() instanceof long[] a
            && IntStream.range(0, m).mapToLong(i -> it.next()).toArray() instanceof long[] b
            && Long.valueOf((1L << 61) - 1) instanceof Long M
            && ((LongBinaryOperator) (x, y) -> Long.valueOf(Math.multiplyHigh(x, y)) instanceof Long hi && Long.valueOf(x * y) instanceof Long lo
                && Long.valueOf((lo & M) + (lo >>> 61) + (hi << 3)) instanceof Long r
                ? Long.valueOf((r & M) + (r >>> 61)) instanceof Long q ? q >= M ? q - M : q : 0L : 0L) instanceof LongBinaryOperator mul
            && Long.valueOf(new Random().nextLong(1000, M - 1000)) instanceof Long B
            && new long[m + 2] instanceof long[] pw && (pw[0] = 1) == 1
            && IntStream.rangeClosed(1, m + 1).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], B)) > 0)
            && Long.valueOf(Arrays.stream(a).reduce(0L, (h, v) -> (mul.applyAsLong(h, B) + v) % M)) instanceof Long ha
            && Long.valueOf(IntStream.range(0, n).mapToLong(j -> pw[j]).reduce(0L, (x, y) -> (x + y) % M)) instanceof Long S
            && IntStream.iterate(60, i -> i >= 0, i -> i - 1).boxed().reduce(1L, (r, i) -> (M - 2 >> i & 1) == 1 ? mul.applyAsLong(mul.applyAsLong(r, r), S) : mul.applyAsLong(r, r), (x, y) -> x) instanceof Long invS
            && new long[m + 1] instanceof long[] P
            && IntStream.rangeClosed(1, m).allMatch(k -> (P[k] = (mul.applyAsLong(P[k - 1], B) + b[k - 1]) % M) >= 0)
            ? IntStream.rangeClosed(0, m - n).filter(i -> Long.valueOf(mul.applyAsLong(((P[i + n] - mul.applyAsLong(P[i], pw[n]) - ha) % M + 2 * M) % M, invS)) instanceof Long x && x <= m - n).count() : "");
    }
}

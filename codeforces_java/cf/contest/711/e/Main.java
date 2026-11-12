import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Long.valueOf(t[0]) instanceof Long n && Long.valueOf(t[1]) instanceof Long k && Long.valueOf(1000003L) instanceof Long p
            && ((LongBinaryOperator) (b, e) -> new long[]{1, b % 1000003L, e} instanceof long[] s
                && IntStream.range(0, 62).filter(z -> ((s[2] & 1) == 0 || (s[0] = s[0] * s[1] % 1000003L) >= 0) & (s[1] = s[1] * s[1] % 1000003L) >= 0 & (s[2] >>= 1) >= 0).count() >= 0 ? s[0] : 0L) instanceof LongBinaryOperator pw
            ? (n <= 62 && k > (1L << n) ? "1 1"
                : Long.valueOf(k - 1 - Long.bitCount(k - 1)) instanceof Long v2f && Long.valueOf(n + v2f) instanceof Long v
                && Long.valueOf(pw.applyAsLong(2, ((n % (p - 1)) * (k % (p - 1)) - v % (p - 1)) % (p - 1) + (p - 1))) instanceof Long dd
                && Long.valueOf(k - 1 >= p ? 0L : LongStream.range(1, k).map(i -> ((pw.applyAsLong(2, n) - i) % p + p) % p).reduce(1L, (x, y) -> x * y % p) * pw.applyAsLong(500002L, v2f) % p) instanceof Long nn
                ? ((dd - nn + p) % p) + " " + dd : "") : "");
    }
}

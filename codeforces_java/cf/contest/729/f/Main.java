import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && new long[n + 1] instanceof long[] P && IntStream.range(0, n).filter(i -> (P[i + 1] = P[i] + t[1 + i]) < 0).count() >= 0
            && new long[(n / 2 + 2) * 6440] instanceof long[] f
            && ((LongBinaryOperator) (stx, y) -> (stx / 92 % 70 + y - stx % 92 < 70 ? f[(int) (((stx / 6440 + stx % 92) * 70 + stx / 92 % 70 + y - stx % 92) * 92 + y)] : 0L)
                - (P[(int) (n - stx / 6440 - stx / 92 % 70)] - P[(int) (n - stx / 6440 - stx / 92 % 70 - y)])) instanceof LongBinaryOperator zv
            && ((LongBinaryOperator) (sq, x) -> x > n - 2 * (sq / 6440) - sq / 92 % 70 ? Long.MIN_VALUE
                : P[(int) (sq / 6440 + x)] - P[(int) (sq / 6440)] + (n - 2 * (sq / 6440) - sq / 92 % 70 - x >= x + 1
                    ? Math.min(zv.applyAsLong(sq - sq % 92 + x, x), zv.applyAsLong(sq - sq % 92 + x, x + 1))
                    : n - 2 * (sq / 6440) - sq / 92 % 70 - x >= x ? zv.applyAsLong(sq - sq % 92 + x, x) : 0L)) instanceof LongBinaryOperator w
            && IntStream.iterate(n / 2 + 1, l -> l >= 0, l -> l - 1).filter(l -> IntStream.rangeClosed(0, Math.min(69, (int) Math.sqrt(2 * l + 70)))
                .parallel().filter(d -> d * d <= 2 * l + d && n - 2 * l - d >= 1).filter(d -> IntStream.rangeClosed(d + 1, Math.min(88, (int) Math.sqrt(4 * l + 140) + 1))
                    .filter(k -> k * (k + 1) / 2 - 1 <= 2 * l + d && n - 2 * l - d >= k).filter(k ->
                        (f[(l * 70 + d) * 92 + k] = Long.valueOf(Math.max(w.applyAsLong((l * 70 + d) * 92 + k, k), w.applyAsLong((l * 70 + d) * 92 + k, k + 1))) instanceof Long mx
                            ? (mx == Long.MIN_VALUE ? 0L : mx) : 0L) < 0).count() >= 0).count() >= 0).count() >= 0
            ? String.valueOf(f[1]) : "");
    }
}

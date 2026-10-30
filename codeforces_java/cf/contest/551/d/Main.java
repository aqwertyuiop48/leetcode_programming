import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n && (Long) s.nextLong() instanceof Long k && (Long) s.nextLong() instanceof Long l && (Long) s.nextLong() instanceof Long m
            && (LongBinaryOperator) ((b, e) -> new long[]{1 % m, b % m} instanceof long[] st && IntStream.range(0, 63).allMatch(i -> ((e >> i & 1) == 1 ? (st[0] = st[0] * st[1] % m) : 0) >= 0 && (st[1] = st[1] * st[1] % m) >= 0) ? st[0] : 0) instanceof LongBinaryOperator pw
            && new long[]{0, 1 % m} instanceof long[] fs
            && IntStream.iterate(62, i -> i - 1).limit(63).allMatch(i -> (Long) (fs[0] * (((2 * fs[1] - fs[0]) % m + m) % m) % m) instanceof Long c && (Long) ((fs[0] * fs[0] + fs[1] * fs[1]) % m) instanceof Long d
                && (fs[0] = (n + 2 >> i & 1) == 1 ? d : c) >= 0 && (fs[1] = (n + 2 >> i & 1) == 1 ? (c + d) % m : d) >= 0)
            ? (l < 63 && k >> l != 0 ? 0 : pw.applyAsLong((pw.applyAsLong(2, n) - fs[0] + m) % m, Long.bitCount(k)) * pw.applyAsLong(fs[0], l - Long.bitCount(k)) % m) : 0);
    }
}

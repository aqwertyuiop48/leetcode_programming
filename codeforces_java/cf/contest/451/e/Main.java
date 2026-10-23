import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 8] instanceof long[] tk
            && new long[3] instanceof long[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[(int) ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) (int) tk[0] instanceof Integer n
            && (Long) tk[1] instanceof Long s
            && (Long) 1000000007L instanceof Long mod
            && new long[1 << n] instanceof long[] sm
            && IntStream.range(1, 1 << n).allMatch(m -> (sm[m] = sm[m & (m - 1)] + tk[2 + Integer.numberOfTrailingZeros(m)] + 1) > 0)
            && (Long) BigInteger.valueOf(LongStream.rangeClosed(1, n - 1).reduce(1, (a, b) -> a * b % mod)).modInverse(BigInteger.valueOf(mod)).longValue() instanceof Long inv
            && new long[1 << n] instanceof long[] acc
            && IntStream.range(0, 1 << n).allMatch(m ->
                (acc[m] = s - sm[m] < 0 ? 0 : Integer.bitCount(m) % 2 == 0 ? 1 : mod - 1) >= 0
                && (sm[m] = (s - sm[m]) % mod) > -mod)
            && IntStream.rangeClosed(1, n - 1).allMatch(j -> IntStream.range(0, 1 << n).allMatch(m ->
                (acc[m] = acc[m] * (sm[m] + j) - (long) (acc[m] * (sm[m] + j) * 1e-9 / 1.000000007) * 1000000007L) > -2000000000L))
            && (Long) (Arrays.stream(acc).map(v -> Math.floorMod(v, mod)).sum() % mod * inv % mod) instanceof Long tot
            ? tot : "");
    }
}

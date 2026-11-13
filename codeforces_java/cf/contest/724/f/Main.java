import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer d && Long.valueOf(t[2]) instanceof Long mod
            ? (n <= 2 ? "" + 1 % mod : (n - 2) % (d - 1) != 0 ? "0"
                : Integer.valueOf((n - 2) / (d - 1)) instanceof Integer m
                && new long[m + 1][d + 1] instanceof long[][] f && (f[1][0] = 1 % mod) >= 0
                && new long[d + 1] instanceof long[] cb && new long[d + 1] instanceof long[] iv
                && ((LongUnaryOperator) x -> BigInteger.valueOf(x).gcd(BigInteger.valueOf(mod)).equals(BigInteger.ONE) ? BigInteger.valueOf(x).modInverse(BigInteger.valueOf(mod)).longValue() : 0L) instanceof LongUnaryOperator inv
                && IntStream.rangeClosed(1, d).allMatch(i -> (iv[i] = inv.applyAsLong(i)) >= 0)
                && IntStream.rangeClosed(1, (m - 1) / 2).allMatch(k -> Long.valueOf(IntStream.rangeClosed(0, d - 1).mapToLong(j -> f[k][j]).sum() % mod) instanceof Long g
                    && (cb[0] = 1 % mod) >= 0
                    && IntStream.rangeClosed(1, d).allMatch(tt -> (cb[tt] = cb[tt - 1] * ((g + tt - 1) % mod) % mod * iv[tt] % mod) >= 0)
                    && IntStream.iterate(m, i -> i >= 1, i -> i - 1).allMatch(i -> IntStream.rangeClosed(1, d).allMatch(j ->
                        (f[i][j] = (f[i][j] + IntStream.rangeClosed(1, Math.min(j, (i - 1) / k)).mapToLong(tq -> f[i - tq * k][j - tq] * cb[tq] % mod).sum()) % mod) >= 0)))
                && Long.valueOf(m % 2 == 0 ? IntStream.rangeClosed(0, d - 1).mapToLong(j -> f[m / 2][j]).sum() % mod : 0) instanceof Long gp
                ? "" + (IntStream.rangeClosed(0, d).mapToLong(j -> f[m][j]).sum() % mod + (m % 2 == 0 ? gp * (gp + 1) % mod * inv.applyAsLong(2) % mod : 0)) % mod : "") : "");
    }
}

import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && s.next() instanceof String t
            && new long[n + 2] instanceof long[] fact && new long[n + 2] instanceof long[] inv && new long[n + 2] instanceof long[] p10 && new long[n + 2] instanceof long[] F
            && (fact[0] = 1) > 0 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0)
            && IntStream.rangeClosed(0, n + 1).allMatch(i -> (inv[i] = BigInteger.valueOf(fact[i]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) > 0)
            && (p10[0] = 1) > 0 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (p10[i] = p10[i - 1] * 10 % 1000000007L) > 0)
            && ((java.util.function.IntBinaryOperator) (a, b) -> b < 0 || b > a || a < 0 ? 0 : (int) (fact[a] * inv[b] % 1000000007L * inv[a - b] % 1000000007L)) instanceof java.util.function.IntBinaryOperator C
            && IntStream.range(0, n).allMatch(m -> (F[m] = ((m > 0 ? F[m - 1] : 0) + p10[m] * C.applyAsInt(n - 2 - m, k - 1)) % 1000000007L) >= 0)
            ? IntStream.range(0, n).mapToLong(i -> (t.charAt(i) - '0') * (((n - 2 - i >= 0 ? F[n - 2 - i] : 0) + p10[n - 1 - i] * C.applyAsInt(i, k)) % 1000000007L) % 1000000007L).sum() % 1000000007L : 0);
    }
}

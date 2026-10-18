import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(sc.nextLong()) instanceof Long w
            && Long.valueOf(1000000007L) instanceof Long P
            && ((LongBinaryOperator) (b, e) -> BigInteger.valueOf(b).modPow(BigInteger.valueOf(e), BigInteger.valueOf(P)).longValue()) instanceof LongBinaryOperator pow
            && new long[k + 1] instanceof long[] F
            && (F[0] = 1) == 1
            && IntStream.rangeClosed(1, k).allMatch(i -> (F[i] = F[i - 1] * i % P) > 0)
            && new long[k + 1] instanceof long[] IF
            && (IF[k] = pow.applyAsLong(F[k], P - 2)) > 0
            && IntStream.range(0, k).allMatch(i -> (IF[k - 1 - i] = IF[k - i] * (k - i) % P) > 0)
            && Integer.valueOf((int) Math.min(k + 2, w)) instanceof Integer cap
            && new long[cap + 2] instanceof long[] Pw
            && (Pw[cap] = pow.applyAsLong(k, w - cap)) > 0
            && IntStream.range(1, cap).allMatch(i -> (Pw[cap - i] = Pw[cap - i + 1] * k % P) > 0)
            && ((LongBinaryOperator) (n, t) -> t > k ? 0L
                : n >= 2 * t
                    ? (F[k] * IF[k - (int) t] % P) * (F[k] * IF[k - (int) t] % P) % P * Pw[(int) (w - (n - 2 * t))] % P
                    : F[k] * IF[k - (int) (2 * t - n)] % P * F[k - (int) (2 * t - n)] % P * F[k - (int) (2 * t - n)] % P
                        * IF[k - (int) t] % P * IF[k - (int) t] % P) instanceof LongBinaryOperator M
            ? IntStream.rangeClosed(1, k).mapToLong(j -> Math.floorMod(M.applyAsLong(w + j, j) - M.applyAsLong(w + j, j + 1), P))
                .reduce(0L, (a, b) -> (a + b) % P)
            : -1);
    }
}

import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m && Integer.valueOf(sc.nextInt()) instanceof Integer g
            && Long.valueOf(1000000007L) instanceof Long M && new long[n + m + 2] instanceof long[] f && new long[n + m + 2] instanceof long[] fi
            && (f[0] = 1) == 1 && IntStream.rangeClosed(1, n + m + 1).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0)
            && (fi[n + m + 1] = BigInteger.valueOf(f[n + m + 1]).modInverse(BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.iterate(n + m + 1, i -> i >= 1, i -> i - 1).allMatch(i -> (fi[i - 1] = fi[i] * i % M) > 0)
            && ((IntBinaryOperator) (a, b) -> b < 0 || b > a ? 0 : (int) (f[a] * fi[b] % M * fi[a - b] % M)) instanceof IntBinaryOperator C
            && Long.valueOf(m == 0 ? (n % 2 == 0 ? 1 : 0) : IntStream.rangeClosed(0, n).filter(z -> z % 2 == 1).mapToLong(z -> C.applyAsInt(n - z + m - 1, m - 1) - (m == 1 && z == n ? 1 : 0)).sum() % M + (m == 1 && n % 2 == 0 ? 1 : 0)) instanceof Long one
            ? g == 1 ? one % M : ((m == 0 ? 1 : (long) C.applyAsInt(n + m, n)) - one % M + M) % M : "");
    }
}

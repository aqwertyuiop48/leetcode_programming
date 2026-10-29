import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Long.valueOf(1000000007L) instanceof Long M && new long[n + 1] instanceof long[] f && new long[n + 1] instanceof long[] inv && (f[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0) && (inv[n] = BigInteger.valueOf(f[n]).modInverse(BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.iterate(n, i -> i >= 1, i -> i - 1).allMatch(i -> (inv[i - 1] = inv[i] * i % M) > 0)
            ? IntStream.rangeClosed(0, n).filter(k -> Long.toString((long) k * a + (long) (n - k) * b).chars().allMatch(c -> c - '0' == a || c - '0' == b))
                .mapToLong(k -> f[n] * inv[k] % M * inv[n - k] % M).sum() % M : "");
    }
}


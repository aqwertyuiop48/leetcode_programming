import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.joining(" "))) instanceof StringTokenizer t
            && new long[100001] instanceof long[] fact && new long[100001] instanceof long[] inv && new int[100001] instanceof int[] mu
            && Long.valueOf(1_000_000_007L) instanceof Long M
            && (fact[0] = 1) == 1 && (mu[1] = 1) == 1
            && IntStream.rangeClosed(1, 100000).allMatch(i -> (fact[i] = fact[i - 1] * i % M) >= 0)
            && (inv[100000] = BigInteger.valueOf(fact[100000]).modInverse(BigInteger.valueOf(M)).longValue()) > 0
            && IntStream.rangeClosed(1, 100000).allMatch(i -> (inv[100000 - i] = inv[100001 - i] * (100001 - i) % M) > 0)
            && IntStream.rangeClosed(1, 100000).allMatch(i -> IntStream.iterate(2 * i, j -> j <= 100000, j -> j + i).allMatch(j -> (mu[j] -= mu[i]) != Integer.MIN_VALUE))
            && ((BiFunction<Integer, Integer, Long>) (a, b) -> b < 0 || b > a ? 0L : fact[a] * inv[b] % M * inv[a - b] % M) instanceof BiFunction<Integer, Integer, Long> C
            && Integer.valueOf(t.nextToken()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(z -> Integer.valueOf(t.nextToken()) instanceof Integer n && Integer.valueOf(t.nextToken()) instanceof Integer f
                ? (f > n ? 0L : (IntStream.rangeClosed(1, (int) Math.sqrt(n) + 1).filter(d -> d * d <= n && n % d == 0)
                    .flatMap(d -> d * d == n ? IntStream.of(d) : IntStream.of(d, n / d))
                    .mapToLong(d -> mu[d] * C.apply(n / d - 1, f - 1)).sum() % M + M) % M) : 0L)
                .map(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

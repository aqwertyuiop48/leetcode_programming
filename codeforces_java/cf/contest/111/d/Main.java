import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k && (Long) 1000000007L instanceof Long M && BigInteger.valueOf(M) instanceof BigInteger P ? m == 1 ? BigInteger.valueOf(k).modPow(BigInteger.valueOf(n), P).toString() : (Integer) (Math.max(k, n) + 2) instanceof Integer N && new long[N] instanceof long[] f && (f[0] = 1) > 0 && IntStream.range(1, N).allMatch(i -> (f[i] = f[i - 1] * i % M) > 0) && new long[N] instanceof long[] iv && (iv[N - 1] = BigInteger.valueOf(f[N - 1]).modInverse(P).longValue()) > 0 && IntStream.iterate(N - 1, i -> i > 0, i -> i - 1).allMatch(i -> (iv[i - 1] = iv[i] * i % M) > 0) && ((BiFunction<Integer, Integer, Long>) (a, b) -> b < 0 || a < 0 || b > a ? 0L : f[a] * iv[b] % M * iv[a - b] % M) instanceof BiFunction<Integer, Integer, Long> C && new long[n + 2] instanceof long[] S && (S[0] = 1) > 0 && IntStream.rangeClosed(1, n).allMatch(r -> IntStream.iterate(r, i -> i >= 1, i -> i - 1).allMatch(i -> (S[i] = (i * S[i] + S[i - 1]) % M) >= 0) && (S[0] = 0) == 0) && LongStream.rangeClosed(0, n).map(j -> BigInteger.valueOf(j).modPow(BigInteger.valueOf((long) n * (m - 2)), P).longValue()).toArray() instanceof long[] pw ? String.valueOf(IntStream.rangeClosed(1, Math.min(n, k)).mapToLong(i -> IntStream.rangeClosed(0, i).mapToLong(j -> C.apply(k, j) * C.apply(k - j, i - j) % M * C.apply(k - i, i - j) % M * pw[j] % M).sum() % M * (f[i] * S[i] % M * (f[i] * S[i] % M) % M) % M).sum() % M) : "" : "").ifPresent(System.out::println);
    }
}


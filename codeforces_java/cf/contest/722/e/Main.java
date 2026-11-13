import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] a
            && Integer.valueOf((int) a[0]) instanceof Integer n && Integer.valueOf((int) a[1]) instanceof Integer m && Integer.valueOf((int) a[2]) instanceof Integer k && Long.valueOf(a[3]) instanceof Long s
            && Integer.valueOf((int) IntStream.iterate((int) (long) s, v -> v > 1, v -> (v + 1) / 2).count()) instanceof Integer X
            && IntStream.iterate((int) (long) s, v -> (v + 1) / 2).limit(X + 1).toArray() instanceof int[] en
            && new long[n + m + 2] instanceof long[] fact && new long[n + m + 2] instanceof long[] ifact
            && (fact[0] = 1) == 1 && IntStream.rangeClosed(1, n + m).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0)
            && (ifact[n + m] = BigInteger.valueOf(fact[n + m]).modPow(BigInteger.valueOf(1000000005L), BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.iterate(n + m, i -> i >= 1, i -> i - 1).allMatch(i -> (ifact[i - 1] = ifact[i] * i % 1000000007L) > 0)
            && ((IntBinaryOperator) (dr, dc) -> (int) (fact[dr + dc] * ifact[dr] % 1000000007L * ifact[dc] % 1000000007L)) instanceof IntBinaryOperator binom
            && IntStream.range(0, k).boxed().sorted(Comparator.comparingLong(i -> a[4 + 2 * i] * 200001L + a[5 + 2 * i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && IntStream.range(0, k).map(q -> (int) a[4 + 2 * ord[q]]).toArray() instanceof int[] rr
            && IntStream.range(0, k).map(q -> (int) a[5 + 2 * ord[q]]).toArray() instanceof int[] cc
            && new long[k][X + 2] instanceof long[][] dp
            && (X == 0 || IntStream.range(0, k).allMatch(i -> new long[X + 2] instanceof long[] A && (A[1] = binom.applyAsInt(rr[i] - 1, cc[i] - 1)) >= 0
                && IntStream.range(0, i).filter(q -> cc[q] <= cc[i]).allMatch(q -> Long.valueOf(binom.applyAsInt(rr[i] - rr[q], cc[i] - cc[q])) instanceof Long w
                    && IntStream.rangeClosed(1, X).allMatch(j -> (A[j + 1] = (A[j + 1] + dp[q][j] * w) % 1000000007L) >= 0))
                && IntStream.rangeClosed(1, X).allMatch(j -> (dp[i][j] = (A[j] - A[j + 1] + 1000000007L) % 1000000007L) >= 0)))
            && new long[X + 2] instanceof long[] B && (B[0] = binom.applyAsInt(n - 1, m - 1)) >= 0
            && IntStream.rangeClosed(1, X).allMatch(x -> (B[x] = IntStream.range(0, k).mapToLong(q -> dp[q][x] * binom.applyAsInt(n - rr[q], m - cc[q]) % 1000000007L).sum() % 1000000007L) >= 0)
            ? "" + (X == 0 ? 1 : (IntStream.range(0, X).mapToLong(x -> (B[x] - B[x + 1] + 1000000007L) % 1000000007L * en[x] % 1000000007L).sum() + B[X])
                % 1000000007L * BigInteger.valueOf(B[0]).modPow(BigInteger.valueOf(1000000005L), BigInteger.valueOf(1000000007L)).longValue() % 1000000007L) : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long A
            && LongStream.rangeClosed(1, 1000000).filter(i -> A % i == 0).flatMap(i -> LongStream.of(i, A / i)).distinct().sorted().toArray() instanceof long[] dv
            && new long[]{1} instanceof long[] mm
            && ((LongBinaryOperator) (a, b) -> ((a * (b >> 20) % mm[0] << 20) + a * (b & 1048575)) % mm[0]) instanceof LongBinaryOperator mul
            && ((LongBinaryOperator) (b, e) -> new long[]{1, b} instanceof long[] st
                && LongStream.range(0, 41).allMatch(i -> (((e >> i) & 1) == 0 || (st[0] = mul.applyAsLong(st[0], st[1])) >= 0) && (st[1] = mul.applyAsLong(st[1], st[1])) >= 0) ? st[0] : 0) instanceof LongBinaryOperator pw
            && ((LongPredicate) n -> n < 2 ? false
                : LongStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23).anyMatch(p -> n % p == 0) ? LongStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23).anyMatch(p -> p == n)
                : (mm[0] = n) > 0 && Integer.valueOf(Long.numberOfTrailingZeros(n - 1)) instanceof Integer s
                    && LongStream.of(2, 3, 5, 7, 11, 13, 17).allMatch(a -> Long.valueOf(pw.applyAsLong(a, (n - 1) >> s)) instanceof Long x0 && new long[]{x0} instanceof long[] cur
                        && (x0 == 1 || x0 == n - 1 || IntStream.range(1, s).anyMatch(r -> (cur[0] = mul.applyAsLong(cur[0], cur[0])) == n - 1)))) instanceof LongPredicate isPrime
            && new boolean[1000001] instanceof boolean[] comp
            && IntStream.rangeClosed(2, 1000).filter(i -> !comp[i]).allMatch(i -> IntStream.iterate(i * i, j -> j <= 1000000, j -> j + i).allMatch(j -> (comp[j] = true)))
            && Stream.concat(Arrays.stream(dv).filter(d -> d >= 3 && isPrime.test(d - 1)).mapToObj(d -> new long[]{d - 1, d}),
                IntStream.rangeClosed(2, 1000000).filter(p -> !comp[p]).boxed().flatMap(p -> LongStream.iterate((long) p * p, q -> q <= A, q -> q * p).filter(q -> A % (q + 1) == 0).mapToObj(q -> new long[]{p, q + 1})))
                .sorted(Comparator.comparingLong(a -> a[0])).toArray(long[][]::new) instanceof long[][] terms
            && new long[dv.length] instanceof long[] dp && new long[dv.length] instanceof long[] nd && (nd[0] = 1) == 1
            && IntStream.range(0, terms.length).allMatch(j -> (j == 0 || terms[j][0] != terms[j - 1][0] ? IntStream.range(0, dv.length).allMatch(idx -> (dp[idx] = nd[idx]) >= 0) : true)
                && IntStream.range(0, dv.length).allMatch(idx -> dp[idx] == 0 || A / dv[idx] % terms[j][1] != 0 || (nd[Arrays.binarySearch(dv, dv[idx] * terms[j][1])] += dp[idx]) >= 0))
            ? nd[dv.length - 1] : "");
    }
}

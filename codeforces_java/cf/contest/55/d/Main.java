import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(t ->
            System.out.println(
                IntStream.rangeClosed(1, 2520).filter(x -> 2520 % x == 0).toArray() instanceof int[] dv
                && new int[2521] instanceof int[] ix
                && IntStream.range(0, dv.length).allMatch(i -> (ix[dv[i]] = i) >= 0)
                && IntStream.range(0, dv.length).mapToObj(l -> IntStream.range(0, 10).map(d ->
                    ix[BigInteger.valueOf(dv[l]).multiply(BigInteger.valueOf(Math.max(d, 1))).divide(BigInteger.valueOf(dv[l]).gcd(BigInteger.valueOf(Math.max(d, 1)))).intValue()]).toArray()).toArray(int[][]::new) instanceof int[][] nx
                && new long[20][2520][dv.length] instanceof long[][][] dp
                && IntStream.range(0, 2520).allMatch(m -> IntStream.range(0, dv.length).allMatch(l -> (dp[0][m][l] = m % dv[l] == 0 ? 1 : 0) >= 0))
                && IntStream.range(1, 20).allMatch(r -> IntStream.range(0, 2520).allMatch(m -> IntStream.range(0, dv.length).allMatch(l ->
                    (dp[r][m][l] = IntStream.range(0, 10).mapToLong(d -> dp[r - 1][(m * 10 + d) % 2520][nx[l][d]]).sum()) >= 0)))
                && ((ToLongFunction<Long>) x -> Long.toString(x).chars().map(c -> c - '0').toArray() instanceof int[] dg
                    && new long[3] instanceof long[] st
                    && IntStream.range(0, dg.length).allMatch(i ->
                        IntStream.range(0, dg[i]).allMatch(d -> (st[2] += dp[dg.length - 1 - i][(int) ((st[0] * 10 + d) % 2520)][nx[(int) st[1]][d]]) >= 0)
                        && (st[0] = (st[0] * 10 + dg[i]) % 2520) >= 0
                        && (st[1] = nx[(int) st[1]][dg[i]]) >= 0)
                    ? st[2] + (st[0] % dv[(int) st[1]] == 0 ? 1 : 0)
                    : 0L) instanceof ToLongFunction<Long> cnt
                ? IntStream.range(0, t).mapToObj(q -> new long[]{s.nextLong(), s.nextLong()}).map(lr -> cnt.applyAsLong(lr[1]) - cnt.applyAsLong(lr[0] - 1)).map(String::valueOf).collect(Collectors.joining("\n"))
                : "")));
    }
}






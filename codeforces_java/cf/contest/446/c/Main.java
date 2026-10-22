import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Long.valueOf(1000000009L) instanceof Long M
            && new long[n + 1] instanceof long[] pre && IntStream.rangeClosed(1, n).allMatch(i -> (pre[i] = (pre[i - 1] + it.next()) % M) >= 0)
            && Long.valueOf(383008016L) instanceof Long s5 && java.math.BigInteger.valueOf(s5).modInverse(java.math.BigInteger.valueOf(M)) instanceof java.math.BigInteger is5b && Long.valueOf(is5b.longValue()) instanceof Long is5
            && new long[]{(1 + 383008016L) * 500000005L % M, (M + 1 - 383008016L) * 500000005L % M} instanceof long[] q
            && Arrays.stream(q).map(x -> java.math.BigInteger.valueOf(x).modInverse(java.math.BigInteger.valueOf(M)).longValue()).toArray() instanceof long[] qi
            && new long[2][n + 2] instanceof long[][] pw && new long[2][n + 2] instanceof long[][] ipw && new long[2][n + 2] instanceof long[][] G
            && IntStream.range(0, 2).allMatch(j -> (pw[j][0] = 1) + (ipw[j][0] = 1) > 0
                && IntStream.rangeClosed(1, n + 1).allMatch(i -> (pw[j][i] = pw[j][i - 1] * q[j] % M) >= 0 && (ipw[j][i] = ipw[j][i - 1] * qi[j] % M) >= 0 && (G[j][i] = (G[j][i - 1] + pw[j][i]) % M) >= 0))
            && new long[4][n + 2] instanceof long[][] bits
            && (BiFunction<long[], long[], Boolean>) ((b, pv) -> IntStream.iterate((int) pv[0], x -> x <= n, x -> x + (x & -x)).allMatch(x -> (b[x] = ((b[x] + pv[1]) % M + M) % M) >= 0)) instanceof BiFunction<long[], long[], Boolean> add
            && (BiFunction<long[], Integer, Long>) ((b, x) -> IntStream.iterate(x, y -> y > 0, y -> y - (y & -y)).mapToLong(y -> b[y]).sum() % M) instanceof BiFunction<long[], Integer, Long> qry
            && (Function<Integer, Long>) (x -> (pre[x] + IntStream.range(0, 2).mapToLong(j -> qry.apply(bits[2 * j], x) * G[j][x] % M + qry.apply(bits[2 * j + 1], x)).sum()) % M) instanceof Function<Integer, Long> P
            ? IntStream.range(0, m).mapToObj(i -> it.next() == 1
                ? Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r
                    && IntStream.range(0, 2).allMatch(j -> Long.valueOf((j == 0 ? 1 : M - 1) * ipw[j][l - 1] % M * is5 % M) instanceof Long c
                        && add.apply(bits[2 * j], new long[]{l, c}) && add.apply(bits[2 * j], new long[]{r + 1, M - c})
                        && add.apply(bits[2 * j + 1], new long[]{l, M - c * G[j][l - 1] % M}) && add.apply(bits[2 * j + 1], new long[]{r + 1, c * G[j][r] % M})) ? (String) null : null
                : Integer.valueOf(it.next()) instanceof Integer l && Integer.valueOf(it.next()) instanceof Integer r ? String.valueOf((P.apply(r) - P.apply(l - 1) + M) % M) : "").filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

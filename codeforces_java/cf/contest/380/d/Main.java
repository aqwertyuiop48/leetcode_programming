import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long MOD
            && new long[n + 2] instanceof long[] fact && (fact[0] = 1) > 0 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (fact[i] = fact[i - 1] * i % MOD) > 0)
            && new long[n + 2] instanceof long[] invf && (invf[n + 1] = BigInteger.valueOf(fact[n + 1]).modInverse(BigInteger.valueOf(MOD)).longValue()) > 0
            && IntStream.iterate(n + 1, i -> i > 0, i -> i - 1).allMatch(i -> (invf[i - 1] = invf[i] * i % MOD) > 0)
            && new long[n + 2] instanceof long[] p2 && (p2[0] = 1) > 0 && IntStream.rangeClosed(1, n + 1).allMatch(i -> (p2[i] = p2[i - 1] * 2 % MOD) > 0)
            && ((LongBinaryOperator) (a, b) -> a < 0 || b < 0 || b > a ? 0 : fact[(int) a] * invf[(int) b] % MOD * invf[(int) (a - b)] % MOD) instanceof LongBinaryOperator C
            && new int[n + 2] instanceof int[] posOf
            && IntStream.rangeClosed(1, n).filter(i -> t[i] > 0 && (t[i] > n || posOf[t[i]] != 0 || (posOf[t[i]] = i) < 0)).count() == 0
            && IntStream.rangeClosed(1, n).filter(v -> posOf[v] > 0).toArray() instanceof int[] vs && Integer.valueOf(vs.length) instanceof Integer m
            ? (m == 0 ? p2[n - 1]
                : new int[n + 2] instanceof int[] pg && IntStream.generate(() -> n + 1).limit(n + 2).toArray() instanceof int[] ng && new int[n + 2] instanceof int[] stk && new int[1] instanceof int[] sp
                    && IntStream.rangeClosed(1, n).filter(i -> t[i] > 0).allMatch(i -> IntStream.iterate(0, z -> sp[0] > 0 && t[stk[sp[0] - 1]] < t[i], z -> z + 1).allMatch(z -> (ng[stk[--sp[0]]] = i) > 0)
                        && (pg[i] = sp[0] > 0 ? stk[sp[0] - 1] : 0) >= 0 && (stk[sp[0]++] = i) > 0)
                    && new int[2 * m] instanceof int[] LL && new int[2 * m] instanceof int[] RR && new boolean[2 * m] instanceof boolean[] OK
                    && IntStream.range(0, m).allMatch(j -> Integer.valueOf(posOf[vs[j]]) instanceof Integer q
                        && (LL[2 * j] = q) > 0 && (RR[2 * j] = q + vs[j] - 1) > 0 && (OK[2 * j] = RR[2 * j] <= n && RR[2 * j] < ng[q]) == OK[2 * j]
                        && (LL[2 * j + 1] = q - vs[j] + 1) > -n * 2 && (RR[2 * j + 1] = q) > 0 && (OK[2 * j + 1] = vs[j] > 1 && LL[2 * j + 1] >= 1 && LL[2 * j + 1] > pg[q]) == OK[2 * j + 1])
                    && new long[]{OK[0] ? (vs[0] == 1 ? 1 : p2[vs[0] - 2]) : 0, OK[1] ? (vs[0] == 1 ? 1 : p2[vs[0] - 2]) : 0} instanceof long[] cur
                    && IntStream.range(1, m).allMatch(j -> new long[]{
                            IntStream.range(0, 2).mapToLong(o -> OK[2 * j] ? cur[o] * C.applyAsLong((long) LL[2 * (j - 1) + o] - LL[2 * j] - 1 + RR[2 * j] - RR[2 * (j - 1) + o], (long) LL[2 * (j - 1) + o] - LL[2 * j] - 1) * (LL[2 * (j - 1) + o] - LL[2 * j] - 1 >= 0 && RR[2 * j] - RR[2 * (j - 1) + o] >= 0 ? 1 : 0) % MOD : 0).sum() % MOD,
                            IntStream.range(0, 2).mapToLong(o -> OK[2 * j + 1] ? cur[o] * C.applyAsLong((long) LL[2 * (j - 1) + o] - LL[2 * j + 1] + RR[2 * j + 1] - 1 - RR[2 * (j - 1) + o], (long) LL[2 * (j - 1) + o] - LL[2 * j + 1]) * (LL[2 * (j - 1) + o] - LL[2 * j + 1] >= 0 && RR[2 * j + 1] - 1 - RR[2 * (j - 1) + o] >= 0 ? 1 : 0) % MOD : 0).sum() % MOD} instanceof long[] nw
                        && (cur[0] = nw[0]) >= 0 && (cur[1] = nw[1]) >= 0)
                    ? IntStream.range(0, 2).mapToLong(o -> cur[o] * C.applyAsLong(n - vs[m - 1], LL[2 * (m - 1) + o] - 1) % MOD).sum() % MOD : 0) : 0);
    }
}

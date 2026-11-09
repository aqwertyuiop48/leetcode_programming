import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String s
            && (Integer) s.length() instanceof Integer m
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) (m + n) instanceof Integer N
            && (Integer) ((N + 1) / 2 - 1) instanceof Integer e
            && (Integer) ((m + 1) / 2) instanceof Integer G
            && (Integer) (m + G) instanceof Integer S
            && new int[m * m * (m + 1)] instanceof int[] F
            && new long[m + 1] instanceof long[] cnt
            && new long[m + 1] instanceof long[] cnt2
            && (F[(m - 1) * (m + 1)] = 1) == 1
            && IntStream.iterate(m, len -> len >= 1, len -> len - 1).allMatch(len ->
                IntStream.rangeClosed(0, m - len).allMatch(l ->
                    (Integer) (l + len - 1) instanceof Integer r
                    && (Integer) ((l * m + r) * (m + 1)) instanceof Integer b
                    && IntStream.range(0, m - len + 1).filter(i -> !(
                        F[b + i] == 0
                        || (s.charAt(l) == s.charAt(r)
                            ? (len <= 2
                                ? (cnt[i] += F[b + i]) >= 0 && (len < 2 || (cnt2[i] += F[b + i]) >= 0)
                                : (F[((l + 1) * m + r - 1) * (m + 1) + i] = (F[((l + 1) * m + r - 1) * (m + 1) + i] + F[b + i]) % 10007) >= 0)
                            : (F[((l + 1) * m + r) * (m + 1) + i + 1] = (F[((l + 1) * m + r) * (m + 1) + i + 1] + F[b + i]) % 10007) >= 0
                              && (F[(l * m + r - 1) * (m + 1) + i + 1] = (F[(l * m + r - 1) * (m + 1) + i + 1] + F[b + i]) % 10007) >= 0))).count() == 0))
            && new long[S + 1] instanceof long[] cp
            && (cp[0] = 1) == 1
            && IntStream.range(0, S).allMatch(f ->
                (Integer) (f < m - 1 ? 24 : f == m - 1 ? 26 : 25) instanceof Integer w
                && IntStream.iterate(S, k -> k >= 1, k -> k - 1).allMatch(k -> (cp[k] = (cp[k - 1] + (10007 - w) * cp[k]) % 10007) >= 0)
                && (cp[0] = (10007 - w) * cp[0] % 10007) >= 0)
            && new long[S] instanceof long[] negc
            && IntStream.range(0, S).allMatch(k -> (negc[k] = (10007 - cp[k]) % 10007) >= 0)
            && ((UnaryOperator<long[]>) a ->
                new long[2 * S] instanceof long[] t
                && IntStream.range(0, S).allMatch(i -> a[i] == 0 || IntStream.range(0, S).filter(j -> (t[i + j] += a[i] * a[j]) < 0).count() == 0)
                && IntStream.range(S, 2 * S - 1).map(z -> 3 * S - 2 - z).allMatch(d ->
                    (Long) (t[d] % 10007) instanceof Long cf
                    && (cf == 0 || IntStream.range(0, S).filter(k -> (t[d - S + k] += cf * negc[k]) < 0).count() == 0))
                && new long[S] instanceof long[] o
                && IntStream.range(0, S).allMatch(k -> (o[k] = t[k] % 10007) >= 0)
                ? o : null) instanceof UnaryOperator<long[]> sq
            && ((UnaryOperator<long[]>) a ->
                new long[S] instanceof long[] o
                && IntStream.range(0, S).allMatch(k -> (o[k] = ((k > 0 ? a[k - 1] : 0) + a[S - 1] * negc[k]) % 10007) >= 0)
                ? o : null) instanceof UnaryOperator<long[]> mulX
            && new long[S] instanceof long[] one
            && (one[0] = 1) == 1
            && new long[][]{one} instanceof long[][] rh
            && IntStream.iterate(30, b -> b >= 0, b -> b - 1).allMatch(b ->
                ((e >> (b + 1)) == 0 || (rh[0] = sq.apply(rh[0])) != null)
                && (((e >> b) & 1) == 0 || (rh[0] = mulX.apply(rh[0])) != null))
            && mulX.apply(rh[0]) instanceof long[] rl
            && new long[2][(S + 1) * m] instanceof long[][] ub
            && (Integer) (m * m) instanceof Integer mm
            && (Integer) ((m + 1) * m) instanceof Integer m2
            && new long[m] instanceof long[] pr0
            && new long[m] instanceof long[] pr1
            && IntStream.range(0, m).allMatch(i -> (ub[0][(m - i) * m + i] = 1) == 1)
            && IntStream.range(0, S).allMatch(k ->
                ub[k & 1] instanceof long[] u
                && ub[1 - (k & 1)] instanceof long[] nu
                && IntStream.range(0, m).filter(i ->
                    (pr0[i] += rh[0][k] * (u[(m + (m - i + 1) / 2) * m + i] % 10007)) < 0
                    || (pr1[i] += rl[k] * (u[(m + (m - i + 1) / 2) * m + i] % 10007)) < 0).count() == 0
                && IntStream.range(m, (S + 1) * m).filter(z ->
                    (nu[z] = (z < mm ? 24 : z < m2 ? 26 : 25) * u[z] + u[z - m]) < 0).count() == 0
                && ((k & 7) != 7 || IntStream.range(m, (S + 1) * m).filter(z -> (nu[z] %= 10007) < 0).count() == 0))
            && (Long) IntStream.range(0, m).mapToLong(i ->
                (cnt[i] % 10007) * (pr1[i] % 10007)
                - ((N & 1) == 1 && ((m - i) & 1) == 0 ? (cnt2[i] % 10007) * ((pr1[i] % 10007) - 26 * (pr0[i] % 10007)) : 0L)
            ).sum() instanceof Long tot
            ? ((tot % 10007) + 10007) % 10007 : -1);
    }
}

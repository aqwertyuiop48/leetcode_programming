import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(-(1L << 50)) instanceof Long NEG && Long.valueOf(NEG / 2) instanceof Long H
            && LongStream.generate(sc::nextLong).limit(n).toArray() instanceof long[] v
            && LongStream.generate(sc::nextLong).limit(n).toArray() instanceof long[] w
            && new long[n + 1] instanceof long[] V
            && IntStream.rangeClosed(1, n).allMatch(L -> (V[L] = Math.max(v[L - 1] != -1 ? v[L - 1] : NEG,
                IntStream.range(1, L).filter(a -> V[a] > H && V[L - a] > H).mapToLong(a -> V[a] + V[L - a]).max().orElse(NEG))) > Long.MIN_VALUE)
            && new long[n + 2][n + 2] instanceof long[][] A && new long[n + 2][n + 2] instanceof long[][] D && new long[n + 2][n + 2] instanceof long[][] G && new long[n + 2][n + 2] instanceof long[][] F
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(l -> Integer.valueOf(l + len - 1) instanceof Integer r
                && (A[l][r] = r == l ? 0 : IntStream.range(l, r).filter(p -> w[p] == w[r] - 1 && A[l][p] > H && (p + 1 > r - 1 || F[p + 1][r - 1] > H))
                    .mapToLong(p -> A[l][p] + (p + 1 <= r - 1 ? F[p + 1][r - 1] : 0)).max().orElse(NEG)) > Long.MIN_VALUE
                && (D[l][r] = r == l ? 0 : IntStream.range(l, r).filter(p -> w[p] == w[r] + 1 && D[l][p] > H && (p + 1 > r - 1 || F[p + 1][r - 1] > H))
                    .mapToLong(p -> D[l][p] + (p + 1 <= r - 1 ? F[p + 1][r - 1] : 0)).max().orElse(NEG)) > Long.MIN_VALUE
                && (G[l][r] = IntStream.rangeClosed(l, r).filter(q -> w[q] >= w[l] && w[q] >= w[r] && A[l][q] > H && D[q][r] > H && V[(int) (2 * w[q] - w[l] - w[r] + 1)] > H)
                    .mapToLong(q -> A[l][q] + D[q][r] + V[(int) (2 * w[q] - w[l] - w[r] + 1)]).max().orElse(NEG)) > Long.MIN_VALUE
                && (F[l][r] = IntStream.rangeClosed(l, r).filter(m -> G[l][m] > H && (m == r || F[m + 1][r] > H))
                    .mapToLong(m -> G[l][m] + (m == r ? 0 : F[m + 1][r])).max().orElse(NEG)) > Long.MIN_VALUE))
            && new long[n + 1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(i -> (ans[i] = Math.max(ans[i - 1],
                IntStream.rangeClosed(1, i).filter(j -> F[j - 1][i - 1] > H).mapToLong(j -> ans[j - 1] + F[j - 1][i - 1]).max().orElse(NEG))) > Long.MIN_VALUE)
            ? ans[n] : "");
    }
}

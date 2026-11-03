import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Long.valueOf(-(1L << 50)) instanceof Long NEG && Long.valueOf(NEG / 2) instanceof Long H
            && LongStream.generate(sc::nextLong).limit(n).toArray() instanceof long[] v
            && LongStream.generate(sc::nextLong).limit(n).toArray() instanceof long[] w
            && new long[n + 1] instanceof long[] V
            && IntStream.rangeClosed(1, n).allMatch(L -> (V[L] = Math.max(v[L - 1],
                IntStream.range(1, L).filter(a -> V[a] > H && V[L - a] > H).mapToLong(a -> V[a] + V[L - a]).max().orElse(NEG))) > Long.MIN_VALUE)
            && new long[n + 2][n + 2] instanceof long[][] A && new long[n + 2][n + 2] instanceof long[][] D && new long[n + 2][n + 2] instanceof long[][] G && new long[n + 2][n + 2] instanceof long[][] F
            && new long[n + 2][n + 2] instanceof long[][] DT && new long[n + 2][n + 2] instanceof long[][] FT
            && IntStream.rangeClosed(1, n).allMatch(len -> IntStream.rangeClosed(0, n - len).allMatch(l -> Integer.valueOf(l + len - 1) instanceof Integer r
                && (A[l][r] = r == l ? 0 : IntStream.range(l, r).mapToLong(p -> w[p] == w[r] - 1 && A[l][p] > H && (p + 1 > r - 1 || FT[r - 1][p + 1] > H)
                    ? A[l][p] + (p + 1 <= r - 1 ? FT[r - 1][p + 1] : 0) : NEG).max().getAsLong()) > Long.MIN_VALUE
                && (D[l][r] = r == l ? 0 : IntStream.range(l, r).mapToLong(p -> w[p] == w[r] + 1 && D[l][p] > H && (p + 1 > r - 1 || FT[r - 1][p + 1] > H)
                    ? D[l][p] + (p + 1 <= r - 1 ? FT[r - 1][p + 1] : 0) : NEG).max().getAsLong()) > Long.MIN_VALUE
                && (DT[r][l] = D[l][r]) > Long.MIN_VALUE
                && (G[l][r] = IntStream.rangeClosed(l, r).mapToLong(q -> w[q] >= w[l] && w[q] >= w[r] && A[l][q] > H && DT[r][q] > H && V[(int) (2 * w[q] - w[l] - w[r] + 1)] > H
                    ? A[l][q] + DT[r][q] + V[(int) (2 * w[q] - w[l] - w[r] + 1)] : NEG).max().getAsLong()) > Long.MIN_VALUE
                && (F[l][r] = IntStream.rangeClosed(l, r).mapToLong(m -> G[l][m] > H && (m == r || FT[r][m + 1] > H)
                    ? G[l][m] + (m == r ? 0 : FT[r][m + 1]) : NEG).max().getAsLong()) > Long.MIN_VALUE
                && (FT[r][l] = F[l][r]) > Long.MIN_VALUE))
            && new long[n + 1] instanceof long[] ans
            && IntStream.rangeClosed(1, n).allMatch(i -> (ans[i] = Math.max(ans[i - 1],
                IntStream.rangeClosed(1, i).filter(j -> FT[i - 1][j - 1] > H).mapToLong(j -> ans[j - 1] + FT[i - 1][j - 1]).max().orElse(NEG))) > Long.MIN_VALUE)
            ? ans[n] : "");
    }
}

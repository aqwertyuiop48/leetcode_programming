import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer h && (Integer) s.nextInt() instanceof Integer w && (Integer) s.nextInt() instanceof Integer n
            && Stream.concat(IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}), Stream.of(new int[]{h, w})).sorted(Comparator.<int[]>comparingInt(p -> p[0]).thenComparingInt(p -> p[1])).toArray(int[][]::new) instanceof int[][] pts
            && new long[h + w + 1] instanceof long[] fact && (fact[0] = 1) == 1 && IntStream.rangeClosed(1, h + w).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) >= 0)
            && new long[h + w + 1] instanceof long[] inv && (inv[h + w] = BigInteger.valueOf(fact[h + w]).modInverse(BigInteger.valueOf(1000000007L)).longValue()) > 0
            && IntStream.iterate(h + w, i -> i > 0, i -> i - 1).allMatch(i -> (inv[i - 1] = inv[i] * i % 1000000007L) >= 0)
            && ((IntBinaryOperator) (nn, kk) -> kk < 0 || kk > nn ? 0 : (int) (fact[nn] * inv[kk] % 1000000007L * inv[nn - kk] % 1000000007L)) instanceof IntBinaryOperator comb
            && new long[n + 1] instanceof long[] f
            && IntStream.range(0, n + 1).allMatch(i -> (f[i] = ((comb.applyAsInt(pts[i][0] + pts[i][1] - 2, pts[i][0] - 1) - IntStream.range(0, i).filter(j -> pts[j][1] <= pts[i][1]).mapToLong(j -> f[j] * comb.applyAsInt(pts[i][0] - pts[j][0] + pts[i][1] - pts[j][1], pts[i][0] - pts[j][0]) % 1000000007L).sum()) % 1000000007L + 1000000007L) % 1000000007L) >= 0)
            ? f[n] : "");
    }
}

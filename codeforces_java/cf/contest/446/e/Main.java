import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && (Integer) sc.nextInt() instanceof Integer m && (Long) sc.nextLong() instanceof Long t && (Integer) sc.nextInt() instanceof Integer s
            && IntStream.range(0, s).map(i -> sc.nextInt()).toArray() instanceof int[] a0 && (Integer) (1 << m) instanceof Integer N && (Integer) (N / 2) instanceof Integer H
            && LongStream.rangeClosed(0, m).map(e -> BigInteger.valueOf(((e < m ? 1 + (e - 1) * (1L << (m - 1)) : 1 + m * (1L << (m - 1))) % 1051131L + 1051131L) % 1051131L).modPow(BigInteger.valueOf(t), BigInteger.valueOf(1051131L)).longValue()).toArray() instanceof long[] lt
            && LongStream.rangeClosed(0, m).map(e -> (((e == 0 ? lt[0] : lt[(int) e] - lt[(int) e - 1]) % 1051131L + 1051131L) % 1051131L) * BigInteger.valueOf((1051131L + 1) / 2).modPow(BigInteger.valueOf(e), BigInteger.valueOf(1051131L)).longValue() % 1051131L).toArray() instanceof long[] w
            && Arrays.copyOf(a0, s) instanceof int[] ring && new int[Math.max(H, 1)][] instanceof int[][] lvDummy && new int[m][] instanceof int[][] lv
            && IntStream.range(0, m).allMatch(k -> (lv[k] = new int[1 << k]) != null)
            && IntStream.range(0, N).allMatch(i -> (lv[m - 1][i & (H - 1)] = (int) ((lv[m - 1][i & (H - 1)] + (i < s ? ring[i] : (ring[i % s] = (int) ((101L * ring[i % s] + 10007) % 1051131L)))) % 1051131L)) >= 0)
            && IntStream.range(0, m - 1).map(k -> m - 2 - k).allMatch(k -> IntStream.range(0, 1 << k).allMatch(r -> (lv[k][r] = (int) ((lv[k + 1][r] + (long) lv[k + 1][r + (1 << k)]) % 1051131L)) >= 0))
            && (lv[0][0] = (int) (w[m] * lv[0][0] % 1051131L)) >= 0
            && IntStream.range(1, m).allMatch(k -> IntStream.range(0, 1 << k).allMatch(r -> (lv[k][r] = (int) ((lv[k - 1][r & ((1 << (k - 1)) - 1)] + w[m - k] * lv[k][r]) % 1051131L)) >= 0))
            && Arrays.copyOf(a0, s) instanceof int[] ring2 && new int[]{0} instanceof int[] x
            && IntStream.range(0, N).allMatch(i -> (x[0] ^= (int) ((lv[m - 1][i & (H - 1)] + w[0] * (i < s ? ring2[i] : (ring2[i % s] = (int) ((101L * ring2[i % s] + 10007) % 1051131L)))) % 1051131L)) >= Integer.MIN_VALUE)
            ? x[0] : 0);
    }
}


import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer m && (Long) Long.parseLong(sc.nextToken()) instanceof Long t && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer s
            && IntStream.range(0, s).map(i -> Integer.parseInt(sc.nextToken())).toArray() instanceof int[] a0 && (Integer) (1 << m) instanceof Integer N && (Integer) (N / 2) instanceof Integer H
            && LongStream.rangeClosed(0, m).map(e -> BigInteger.valueOf(((e < m ? 1 + (e - 1) * (1L << (m - 1)) : 1 + m * (1L << (m - 1))) % 1051131L + 1051131L) % 1051131L).modPow(BigInteger.valueOf(t), BigInteger.valueOf(1051131L)).longValue()).toArray() instanceof long[] lt
            && LongStream.rangeClosed(0, m).map(e -> (((e == 0 ? lt[0] : lt[(int) e] - lt[(int) e - 1]) % 1051131L + 1051131L) % 1051131L) * BigInteger.valueOf((1051131L + 1) / 2).modPow(BigInteger.valueOf(e), BigInteger.valueOf(1051131L)).longValue() % 1051131L).toArray() instanceof long[] w
            && new int[m][] instanceof int[][] lv && IntStream.range(0, m).allMatch(k -> (lv[k] = new int[1 << k]) != null) && lv[m - 1] instanceof int[] top && (Integer) (H - 1) instanceof Integer hm
            && new int[N] instanceof int[] av && (Integer) Math.min(N, 64) instanceof Integer C && (Integer) (N / C) instanceof Integer L
            && ((Function<Integer, long[]>) q -> (Long) BigInteger.valueOf(101).modPow(BigInteger.valueOf(q), BigInteger.valueOf(105113100L)).longValue() instanceof Long v ? new long[]{v % 1051131L, (v - 1) / 100 % 1051131L} : null) instanceof Function<Integer, long[]> aff
            && IntStream.range(0, C).parallel().filter(c -> !((Integer) (c * L) instanceof Integer i0
                && (Integer) (i0 == 0 ? 0 : (i0 - 1) / s) instanceof Integer q0 && (Integer) (i0 == 0 ? -1 : (i0 - 1) % s) instanceof Integer r0
                && aff.apply(q0) instanceof long[] hi && aff.apply(Math.max(0, q0 - 1)) instanceof long[] lo
                && IntStream.range(0, s).map(j -> (int) (((j <= r0 ? hi : lo)[0] * a0[j] + 10007L * (j <= r0 ? hi : lo)[1]) % 1051131L)).toArray() instanceof int[] rg
                && new int[]{i0 % s} instanceof int[] cur
                && IntStream.range(i0, i0 + L).filter(i -> !((Integer) (i < s ? rg[cur[0]] : (rg[cur[0]] = (int) ((101L * rg[cur[0]] + 10007) % 1051131L))) instanceof Integer v
                    && (av[i] = v) >= 0 && (cur[0] = cur[0] + 1 == s ? 0 : cur[0] + 1) >= 0)).count() >= 0)).count() >= 0
            && IntStream.range(0, H).parallel().filter(r -> (top[r] = (av[r] + av[r + H]) % 1051131) < 0).count() >= 0
            && IntStream.range(0, m - 1).map(k -> m - 2 - k).allMatch(k -> IntStream.range(0, 1 << k).parallel().filter(r -> (lv[k][r] = (lv[k + 1][r] + lv[k + 1][r + (1 << k)]) % 1051131) < 0).count() >= 0)
            && (lv[0][0] = (int) (w[m] * lv[0][0] % 1051131L)) >= 0
            && IntStream.range(1, m).allMatch(k -> IntStream.range(0, 1 << k).parallel().filter(r -> (lv[k][r] = (int) ((lv[k - 1][r & ((1 << (k - 1)) - 1)] + w[m - k] * lv[k][r]) % 1051131L)) < 0).count() >= 0)
            && (Long) w[0] instanceof Long w0
            ? IntStream.range(0, N).parallel().map(i -> (int) ((top[i & hm] + w0 * av[i]) % 1051131L)).reduce(0, (p, q) -> p ^ q) : 0);
    }
}




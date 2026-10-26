import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && tk.nextToken() instanceof String str && tk.nextToken() instanceof String pat
            && new long[1 << 19] instanceof long[] rt
            && IntStream.range(0, 19).allMatch(lv -> (Integer) (1 << lv) instanceof Integer half && (Long) BigInteger.valueOf(3).modPow(BigInteger.valueOf((998244353L - 1) / (2L * half)), BigInteger.valueOf(998244353L)).longValue() instanceof Long wl
                && (rt[half] = 1) == 1 && IntStream.range(1, half).allMatch(j -> (rt[half + j] = rt[half + j - 1] * wl % 998244353L) >= 0))
            && ((BiFunction<long[], Boolean, long[]>) (a, inv) -> (Integer) a.length instanceof Integer len && (Integer) Integer.numberOfTrailingZeros(len) instanceof Integer lg && new long[len] instanceof long[] b
                && IntStream.range(0, len).allMatch(i -> (b[Integer.reverse(i) >>> (32 - lg)] = a[i]) >= 0)
                && IntStream.range(0, lg).allMatch(lv -> IntStream.range(0, len / 2).allMatch(t -> (b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] = b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] * rt[(1 << lv) + (t & ((1 << lv) - 1))] % 998244353L) >= 0
                    && (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] = (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] + b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)]) % 998244353L) >= 0
                    && (b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] = (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] + 2 * 998244353L - 2 * b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)]) % 998244353L) >= 0))
                && (!inv || IntStream.range(1, len / 2).allMatch(i -> (Long) b[i] instanceof Long u && (Long) b[len - i] instanceof Long w && (b[i] = w) >= 0 && (b[len - i] = u) >= 0))
                && (!inv || (Long) BigInteger.valueOf(len).modInverse(BigInteger.valueOf(998244353L)).longValue() instanceof Long il && IntStream.range(0, len).allMatch(i -> (b[i] = b[i] * il % 998244353L) >= 0)) ? b : a) instanceof BiFunction<long[], Boolean, long[]> ntt
            && (Integer) (1 << 19) instanceof Integer sz
            && new int[128][n + 1] instanceof int[][] pre && IntStream.range(0, 128).allMatch(c -> IntStream.range(0, n).allMatch(i -> (pre[c][i + 1] = pre[c][i] + (str.charAt(i) == c ? 1 : 0)) >= 0))
            && "ACGT".chars().mapToObj(c -> new long[][]{
                    IntStream.range(0, sz).mapToLong(p -> p < n && pre[(int) c][Math.min(n, p + k + 1)] - pre[(int) c][Math.max(0, p - k)] > 0 ? 1 : 0).toArray(),
                    IntStream.range(0, sz).mapToLong(j -> j < m && pat.charAt(m - 1 - j) == c ? 1 : 0).toArray()}).toList() instanceof List<long[][]> ab
            && new long[sz] instanceof long[] acc
            && ab.stream().allMatch(p -> ntt.apply(p[0], false) instanceof long[] fa && ntt.apply(p[1], false) instanceof long[] fb && IntStream.range(0, sz).allMatch(i -> (acc[i] = (acc[i] + fa[i] * fb[i]) % 998244353L) >= 0))
            && ntt.apply(acc, true) instanceof long[] res
            ? IntStream.rangeClosed(0, n - m).filter(i -> res[i + m - 1] == m).count() : 0);
    }
}

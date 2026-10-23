import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[m + 1] instanceof long[] cc
            && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer c && (c > m || (cc[c] = 1) > 0))
            && new long[1 << 19] instanceof long[] rt
            && IntStream.range(0, 18).allMatch(lv -> (Integer) (1 << lv) instanceof Integer half && (Long) BigInteger.valueOf(3).modPow(BigInteger.valueOf((998244353L - 1) / (2L * half)), BigInteger.valueOf(998244353L)).longValue() instanceof Long wl
                && (rt[half] = 1) == 1 && IntStream.range(1, half).allMatch(j -> (rt[half + j] = rt[half + j - 1] * wl % 998244353L) >= 0))
            && ((BiFunction<long[], Boolean, long[]>) (a, inv) -> (Integer) a.length instanceof Integer len && (Integer) Integer.numberOfTrailingZeros(len) instanceof Integer lg && new long[len] instanceof long[] b
                && IntStream.range(0, len).allMatch(i -> (b[Integer.reverse(i) >>> (32 - lg)] = a[i]) >= 0)
                && IntStream.range(0, lg).allMatch(lv -> IntStream.range(0, len / 2).allMatch(t -> (b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] = b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] * rt[(1 << lv) + (t & ((1 << lv) - 1))] % 998244353L) >= 0
                    && (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] = (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] + b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)]) % 998244353L) >= 0
                    && (b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)] = (b[((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))] + 2 * 998244353L - 2 * b[(((t - (t & ((1 << lv) - 1))) << 1) + (t & ((1 << lv) - 1))) + (1 << lv)]) % 998244353L) >= 0))
                && (!inv || IntStream.range(1, len / 2).allMatch(i -> (Long) b[i] instanceof Long u && (Long) b[len - i] instanceof Long w && (b[i] = w) >= 0 && (b[len - i] = u) >= 0))
                && (!inv || (Long) BigInteger.valueOf(len).modInverse(BigInteger.valueOf(998244353L)).longValue() instanceof Long il && IntStream.range(0, len).allMatch(i -> (b[i] = b[i] * il % 998244353L) >= 0)) ? b : a) instanceof BiFunction<long[], Boolean, long[]> ntt
            && ((BinaryOperator<long[]>) (a, b) -> (Integer) (a.length + b.length - 1) instanceof Integer len && (Integer) (Integer.highestOneBit(Math.max(len - 1, 1)) << 1) instanceof Integer sz
                && ntt.apply(Arrays.copyOf(a, sz), false) instanceof long[] fa && ntt.apply(Arrays.copyOf(b, sz), false) instanceof long[] fb && IntStream.range(0, sz).allMatch(i -> (fa[i] = fa[i] * fb[i] % 998244353L) >= 0)
                ? Arrays.copyOf(ntt.apply(fa, true), len) : a) instanceof BinaryOperator<long[]> mul
            && new Object[2] instanceof Object[] ref
            && (ref[0] = (BiFunction<long[], Integer, long[]>) (a, nn) -> new long[][]{{BigInteger.valueOf(a[0]).modInverse(BigInteger.valueOf(998244353L)).longValue()}} instanceof long[][] h
                && (IntStream.iterate(1, l -> l < nn, l -> l * 2).allMatch(l -> mul.apply(Arrays.copyOf(a, 2 * l), h[0]) instanceof long[] t && new long[2 * l] instanceof long[] t2
                    && IntStream.range(0, 2 * l).allMatch(i -> (t2[i] = i == 0 ? (2 - t[0] + 998244353L) % 998244353L : (998244353L - t[i]) % 998244353L) >= 0) && (h[0] = Arrays.copyOf(mul.apply(h[0], t2), 2 * l)) != null) || true) ? Arrays.copyOf(h[0], nn) : a) != null
            && (ref[1] = (BiFunction<long[], Integer, long[]>) (a, nn) -> new long[][]{{1}} instanceof long[][] h
                && (IntStream.iterate(1, l -> l < nn, l -> l * 2).allMatch(l -> ((BiFunction<long[], Integer, long[]>) ref[0]).apply(Arrays.copyOf(h[0], 2 * l), 2 * l) instanceof long[] iv && Arrays.copyOf(mul.apply(Arrays.copyOf(a, 2 * l), iv), 2 * l) instanceof long[] t
                    && Arrays.copyOf(h[0], 2 * l) instanceof long[] hh && new long[2 * l] instanceof long[] s2 && IntStream.range(0, 2 * l).allMatch(i -> (s2[i] = (hh[i] + t[i]) % 998244353L * ((998244353L + 1) / 2) % 998244353L) >= 0) && (h[0] = s2) != null) || true) ? Arrays.copyOf(h[0], nn) : a) != null
            && LongStream.rangeClosed(0, m).map(i -> i == 0 ? 1 : (998244353L - 4 * cc[(int) i] % 998244353L) % 998244353L).toArray() instanceof long[] om
            && ((BiFunction<long[], Integer, long[]>) ref[1]).apply(om, m + 1) instanceof long[] sq && (sq[0] = (sq[0] + 1) % 998244353L) >= 0
            && ((BiFunction<long[], Integer, long[]>) ref[0]).apply(sq, m + 1) instanceof long[] f
            ? IntStream.rangeClosed(1, m).mapToObj(i -> String.valueOf(f[i] * 2 % 998244353L)).collect(Collectors.joining("\n")) : "");
    }
}

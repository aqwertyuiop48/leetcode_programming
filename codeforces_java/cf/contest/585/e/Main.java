import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new int[b.length / 2 + 2] instanceof int[] t && new int[2] instanceof int[] cu
            && IntStream.rangeClosed(0, b.length).allMatch(i -> (i < b.length ? b[i] : 32) >= 48 ? (cu[0] = cu[0] * 10 + b[i] - 48) >= 0 : (cu[0] == 0 || ((t[cu[1]++] = cu[0]) > 0 && (cu[0] = 0) == 0)))
            && (Integer) t[0] instanceof Integer n && (Integer) IntStream.rangeClosed(1, n).map(i -> t[i]).max().getAsInt() instanceof Integer M
            && new int[M + 1] instanceof int[] freq && new short[M + 1] instanceof short[] spf && new int[M + 1] instanceof int[] cnt
            && IntStream.rangeClosed(1, n).allMatch(i -> freq[t[i]]++ >= 0)
            && IntStream.iterate(3, p -> p * p <= M, p -> p + 2).filter(p -> spf[p] == 0).allMatch(p -> IntStream.iterate(p * p, j -> j <= M, j -> j + 2 * p).filter(j -> spf[j] == 0).map(j -> spf[j] = (short) p).sum() >= 0)
            && ((IntUnaryOperator) x -> (x & 1) == 0 ? 2 : (spf[x] == 0 ? x : spf[x])) instanceof IntUnaryOperator sp
            && new int[n + 1] instanceof int[] pw && (pw[0] = 1) == 1 && IntStream.rangeClosed(1, n).allMatch(i -> (pw[i] = (int) (pw[i - 1] * 2L % 1000000007L)) > 0)
            && new int[9] instanceof int[] pr && new int[256] instanceof int[] prod && new int[2] instanceof int[] kl && (prod[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> ((Integer) freq[t[i]] instanceof Integer c && c > 0 && (freq[t[i]] = 0) == 0 && (kl[0] = 0) == 0 && (kl[1] = 0) == 0
                && IntStream.iterate(t[i], x -> x > 1, x -> x / sp.applyAsInt(x)).map(sp).filter(p -> p != kl[1]).allMatch(p -> (kl[1] = p) > 0 && (pr[kl[0]++] = p) > 0)
                && IntStream.range(1, 1 << kl[0]).allMatch(s -> (prod[s] = prod[s & (s - 1)] * pr[Integer.numberOfTrailingZeros(s)]) > 0 && (cnt[prod[s]] += (Integer.bitCount(s) & 1) == 1 ? -c : c) != Integer.MIN_VALUE)) || true)
            ? (IntStream.rangeClosed(2, M).mapToLong(e -> cnt[e] == 0 ? 0L : (cnt[e] > 0 ? -1L : 1L) * ((pw[Math.abs(cnt[e])] - 1L) * (n - Math.abs(cnt[e])) % 1000000007L)).sum() % 1000000007L + 1000000007L) % 1000000007L : 0L);
    }
}

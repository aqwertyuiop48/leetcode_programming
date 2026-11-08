import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n
            && (Long) 2305843009213693951L instanceof Long M
            && (LongUnaryOperator) (t -> t >= M ? t - M : t) instanceof LongUnaryOperator red
            && (LongBinaryOperator) ((x, y) -> red.applyAsLong(red.applyAsLong((x * y & M) + ((x * y >>> 61) | (Math.multiplyHigh(x, y) << 3))))) instanceof LongBinaryOperator mul
            && new long[n] instanceof long[] U && new long[n] instanceof long[] V && new long[n] instanceof long[] D
            && IntStream.range(0, n).filter(i -> (U[i] = (long) a[3 + 3 * i] * a[1 + 3 * i]) >= Long.MIN_VALUE && (V[i] = (long) a[3 + 3 * i] * a[2 + 3 * i]) >= Long.MIN_VALUE
                && (D[i] = (long) a[1 + 3 * i] * a[1 + 3 * i] + (long) a[2 + 3 * i] * a[2 + 3 * i]) > 0).count() == n
            && new long[n] instanceof long[] xm && new long[n] instanceof long[] ym && new long[n] instanceof long[] f && new long[n] instanceof long[] pre && new long[n] instanceof long[] key
            && new long[]{0, 0} instanceof long[] pw && new long[]{0} instanceof long[] rs
            ? IntStream.range(0, n - 1).mapToLong(i -> IntStream.range(i + 1, n).filter(j -> (xm[j] = U[j] * D[i] - U[i] * D[j] < 0 ? U[j] * D[i] - U[i] * D[j] + M : U[j] * D[i] - U[i] * D[j]) >= 0
                    && (ym[j] = V[j] * D[i] - V[i] * D[j] < 0 ? V[j] * D[i] - V[i] * D[j] + M : V[j] * D[i] - V[i] * D[j]) >= 0 && (f[j] = xm[j] == 0 ? 1 : xm[j]) > 0).count() >= 0
                && (pre[i] = 1) == 1
                && IntStream.range(i + 1, n).filter(j -> (pre[j] = mul.applyAsLong(pre[j - 1], f[j])) >= 0).count() >= 0
                && (pw[0] = 1) == 1 && (pw[1] = pre[n - 1]) > 0
                && IntStream.range(0, 61).filter(z -> (z == 1 || (pw[0] = mul.applyAsLong(pw[0], pw[1])) >= 0) && (pw[1] = mul.applyAsLong(pw[1], pw[1])) >= 0).count() >= 0
                && IntStream.range(i + 1, n).map(t -> n + i - t).filter(j -> (key[j] = xm[j] == 0 && ym[j] == 0 ? -1 - j : xm[j] == 0 ? M : mul.applyAsLong(ym[j], mul.applyAsLong(pw[0], pre[j - 1]))) != Long.MIN_VALUE
                    && (pw[0] = mul.applyAsLong(pw[0], f[j])) >= 0).count() >= 0
                && IntStream.of(0).peek(z -> Arrays.sort(key, i + 1, n)).findFirst().isPresent()
                && (rs[0] = 0) == 0
                ? IntStream.range(i + 2, n).mapToLong(t -> (rs[0] = key[t] == key[t - 1] ? rs[0] + 1 : 0)).sum() : 0L).sum()
                + (IntStream.range(0, n).filter(i -> a[3 + 3 * i] == 0).toArray() instanceof int[] z0 && z0.length >= 2 ? n - z0[0] - 2 : 0) : "");
    }
}

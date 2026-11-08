import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{-1, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> Integer.valueOf(i < raw.length ? raw[i] : 32) instanceof Integer ch
                && (ch == 45 ? (st[2] = 1) > 0 : ch >= 48 ? (st[0] = Math.max(st[0], 0) * 10 + ch - 48) >= 0
                    : st[0] < 0 || ((v[st[1]++] = st[2] == 1 ? -st[0] : st[0]) > Integer.MIN_VALUE && (st[0] = -1) < 0 && (st[2] = 0) == 0))).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(k -> v[1 + 2 * k]).toArray() instanceof long[] X
            && IntStream.range(0, n).mapToLong(k -> v[2 + 2 * k]).toArray() instanceof long[] Y
            && new long[2 * n + 2] instanceof long[] Dw && new long[2 * n + 2] instanceof long[] Dm && new long[2 * n + 2] instanceof long[] SD
            && new long[2 * n + 2] instanceof long[] SX && new long[2 * n + 2] instanceof long[] SY
            && IntStream.range(0, 2 * n).filter(k -> Long.valueOf(X[(k + 1) % n] * Y[k % n] - X[k % n] * Y[(k + 1) % n]) instanceof Long e
                && (Dw[k + 1] = Dw[k] + e) >= Long.MIN_VALUE
                && (Dm[k + 1] = (Dm[k] + e % 1000000007L + 1000000007L) % 1000000007L) >= 0
                && (SD[k + 1] = (SD[k] + Dm[k]) % 1000000007L) >= 0
                && (SX[k + 1] = (SX[k] + (X[k % n] % 1000000007L + 1000000007L)) % 1000000007L) >= 0
                && (SY[k + 1] = (SY[k] + (Y[k % n] % 1000000007L + 1000000007L)) % 1000000007L) >= 0).count() >= 0
            && Long.valueOf(Dw[n]) instanceof Long Sd && Long.valueOf(Dm[n]) instanceof Long Sdm
            && new int[]{0} instanceof int[] ci && new int[]{0} instanceof int[] tp && new long[]{0} instanceof long[] tot
            && ((LongBinaryOperator) (lo, hi) -> hi < lo ? 0L
                : ((1000000007L - (hi - lo + 1) % 1000000007L) % 1000000007L * Dm[ci[0]] % 1000000007L
                    + (SD[(int) hi + 1] - SD[(int) lo] + 1000000007L) % 1000000007L
                    + (X[ci[0]] % 1000000007L + 1000000007L) % 1000000007L * ((SY[(int) hi + 1] - SY[(int) lo] + 1000000007L) % 1000000007L) % 1000000007L
                    + 1000000007L - (Y[ci[0]] % 1000000007L + 1000000007L) % 1000000007L * ((SX[(int) hi + 1] - SX[(int) lo] + 1000000007L) % 1000000007L) % 1000000007L) % 1000000007L) instanceof LongBinaryOperator sa
            && ((LongBinaryOperator) (i, j) -> Dw[(int) j] - Dw[(int) i] + X[(int) i] * Y[(int) (j % n)] - Y[(int) i] * X[(int) (j % n)]) instanceof LongBinaryOperator ad
            && IntStream.range(0, n).filter(i -> (ci[0] = i) >= 0 && (tp[0] = Math.max(tp[0], i + 2)) >= 0
                && IntStream.range(0, 2 * n).takeWhile(z -> tp[0] <= i + n - 2 && ad.applyAsLong(i, tp[0]) < Sd - ad.applyAsLong(i, tp[0]) && ++tp[0] > 0).count() >= 0
                && Long.valueOf((tp[0] - i - 2) % 1000000007L * Sdm % 1000000007L) instanceof Long a1
                && Long.valueOf(Math.max(0, i + n - 1 - tp[0]) % 1000000007L * Sdm % 1000000007L) instanceof Long b2
                && (tot[0] = (tot[0] + a1 + 2 * sa.applyAsLong(tp[0], i + n - 2) + 3000000021L - 2 * sa.applyAsLong(i + 2, tp[0] - 1) - b2) % 1000000007L) >= 0).count() >= 0
            ? tot[0] * 500000004L % 1000000007L : "");
    }
}

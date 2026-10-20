import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).readLine().trim().getBytes() instanceof byte[] cur
            && Integer.valueOf(cur.length) instanceof Integer n && Long.valueOf((1L << 61) - 1) instanceof Long M
            && Long.valueOf(new Random().nextInt(1 << 30) + 1000L) instanceof Long B
            && new byte[n] instanceof byte[] res && new long[n + 1] instanceof long[] H && new long[n + 1] instanceof long[] pw
            && new int[]{n, 0, 0} instanceof int[] sv
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(a * b) instanceof Long lo && Long.valueOf(Math.multiplyHigh(a, b)) instanceof Long hi
                && Long.valueOf((lo & M) + ((lo >>> 61) | (hi << 3))) instanceof Long r1 && Long.valueOf((r1 & M) + (r1 >>> 61)) instanceof Long r2
                ? (r2 >= M ? r2 - M : r2) : 0L) instanceof LongBinaryOperator mul
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(a + b) instanceof Long x ? (x >= M ? x - M : x) : 0L) instanceof LongBinaryOperator add
            && ((LongBinaryOperator) (l, r) -> Long.valueOf(H[(int) r] - mul.applyAsLong(H[(int) l], pw[(int) (r - l)])) instanceof Long x ? (x < 0 ? x + M : x) : 0L) instanceof LongBinaryOperator hs
            && LongStream.range(0, n).map(i -> pw[(int) i + 1] = mul.applyAsLong(i == 0 ? 1 : pw[(int) i], B)).max().orElse(0) >= 0
            && (pw[0] = 1) > 0
            && ((IntUnaryOperator) from -> IntStream.range(from, sv[0]).mapToLong(j -> H[j + 1] = add.applyAsLong(mul.applyAsLong(H[j], B), cur[j] + 1)).max().orElse(0) >= 0 ? 0 : 1) instanceof IntUnaryOperator rebuild
            && rebuild.applyAsInt(0) == 0
            && ((IntPredicate) L -> ((IntPredicate) j -> j >= 0 && j + L < sv[0] && cur[j] == cur[j + L]) instanceof IntPredicate mt
                && IntStream.iterate(0, i -> i + L < sv[0], i -> i + L).anyMatch(i ->
                mt.test(i) && (mt.test(i + L / 2) && mt.test(i + L / 4) || mt.test(i - L / 2) && mt.test(i - L / 4))
                && Integer.valueOf(Math.min(L, sv[0] - i - L)) instanceof Integer cf && Integer.valueOf(Math.min(L, i)) instanceof Integer cb
                && Integer.valueOf(IntStream.iterate(31 - Integer.numberOfLeadingZeros(cf), p -> p >= 0, p -> p - 1)
                    .reduce(0, (t, p) -> t + (1 << p) <= cf && hs.applyAsLong(i, i + t + (1 << p)) == hs.applyAsLong(i + L, i + L + t + (1 << p)) ? t + (1 << p) : t)) instanceof Integer f
                && (f >= L || Integer.valueOf(IntStream.iterate(31 - Integer.numberOfLeadingZeros(cb), p -> p >= 0, p -> p - 1)
                    .reduce(0, (t, p) -> t + (1 << p) <= cb && hs.applyAsLong(i - t - (1 << p), i) == hs.applyAsLong(i + L - t - (1 << p), i + L) ? t + (1 << p) : t)) instanceof Integer bk
                    && f + bk >= L))) instanceof IntPredicate check
            && ((IntUnaryOperator) L -> (sv[1] = 0) + (sv[2] = 0)
                + IntStream.range(0, sv[0]).map(ix -> (res[sv[1]++] = cur[ix]) * 0
                    + ((sv[2] = sv[1] > L && res[sv[1] - 1] == res[sv[1] - 1 - L] ? sv[2] + 1 : 0) == L ? (sv[1] -= L) * 0 + (sv[2] = 0) : 0)).sum()
                + (sv[0] = sv[1]) * 0 + IntStream.range(0, sv[0]).map(j -> cur[j] = res[j]).sum() * 0 + rebuild.applyAsInt(0)) instanceof IntUnaryOperator pass
            && IntStream.iterate(1, L -> 2 * L <= sv[0], L -> L + 1).map(L -> IntStream.iterate(0, k -> 2 * L <= sv[0] && check.test(L), k -> k + 1).map(k -> pass.applyAsInt(L)).sum()).sum() >= 0
            ? new String(cur, 0, sv[0]) : "");
    }
}

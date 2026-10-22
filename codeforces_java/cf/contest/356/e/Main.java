import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().findFirst().get().trim() instanceof String str && Integer.valueOf(str.length()) instanceof Integer n
            && str.chars().map(x -> x - 'a').toArray() instanceof int[] c && Long.valueOf((1L << 61) - 1) instanceof Long M
            && ((LongBinaryOperator) (a, b) -> Long.valueOf(Math.multiplyHigh(a, b)) instanceof Long hi && Long.valueOf((a * b & M) + ((a * b >>> 61) | (hi << 3))) instanceof Long r0 && Long.valueOf((r0 & M) + (r0 >>> 61)) instanceof Long r1
                ? (r1 >= M ? r1 - M : r1) : 0L) instanceof LongBinaryOperator mul
            && new long[n + 1] instanceof long[] pw && new long[n + 1] instanceof long[] H && (pw[0] = 1) == 1
            && IntStream.range(0, n).allMatch(i -> (pw[i + 1] = mul.applyAsLong(pw[i], 911382323L)) > 0 && (H[i + 1] = (mul.applyAsLong(H[i], 911382323L) + c[i] + 1) % M) > 0)
            && ((LongBinaryOperator) (l, len) -> (H[(int) (l + len)] - mul.applyAsLong(H[(int) l], pw[(int) len]) + M) % M) instanceof LongBinaryOperator get
            && new int[26 * (n + 1)] instanceof int[] pc
            && IntStream.range(0, 26).allMatch(ch -> IntStream.range(0, n).allMatch(i -> (pc[ch * (n + 1) + i + 1] = pc[ch * (n + 1) + i] + (c[i] == ch ? 1 : 0)) >= 0))
            && Integer.valueOf(31 - Integer.numberOfLeadingZeros(n + 1)) instanceof Integer K
            && new boolean[K + 1][n + 1] instanceof boolean[][] g && IntStream.range(0, n).allMatch(i -> g[1][i] = true)
            && new long[]{n} instanceof long[] base && new long[n + 2] instanceof long[] ld && new long[26 * n] instanceof long[] gain
            && IntStream.rangeClosed(2, K).allMatch(k -> Integer.valueOf((1 << k) - 1) instanceof Integer len && Integer.valueOf((1 << (k - 1)) - 1) instanceof Integer h && Long.valueOf((long) len * len) instanceof Long l2
                && IntStream.rangeClosed(0, n - len).allMatch(i -> Integer.valueOf(i + h) instanceof Integer mid && Integer.valueOf(mid + 1) instanceof Integer r0
                    && (!(g[k - 1][i] || g[k - 1][r0])
                        || Integer.valueOf(IntStream.iterate(16, bt -> bt >= 0, bt -> bt - 1).reduce(0, (t, bt) -> t + (1 << bt) <= h && get.applyAsLong(i, t + (1 << bt)) == get.applyAsLong(r0, t + (1 << bt)) ? t + (1 << bt) : t)) instanceof Integer t
                        && Integer.valueOf(c[mid]) instanceof Integer cm
                        && Boolean.valueOf(pc[cm * (n + 1) + mid] - pc[cm * (n + 1) + i] > 0) instanceof Boolean inL
                        && Boolean.valueOf(pc[cm * (n + 1) + r0 + h] - pc[cm * (n + 1) + r0] > 0) instanceof Boolean inR
                        && (t.intValue() == h
                            ? !g[k - 1][i] || (inL || (g[k][i] = true) && (base[0] += l2) > 0 && (ld[i] += l2) != Long.MIN_VALUE && (ld[i + len] -= l2) != Long.MIN_VALUE)
                                && IntStream.range(0, 26).filter(ch -> ch != cm && pc[ch * (n + 1) + mid] - pc[ch * (n + 1) + i] == 0).allMatch(ch -> (gain[mid * 26 + ch] += l2) > 0)
                            : get.applyAsLong(i + t + 1, h - t - 1) != get.applyAsLong(r0 + t + 1, h - t - 1)
                                || (!g[k - 1][i] || inL || (gain[(r0 + t) * 26 + c[i + t]] += l2) > 0) && (!g[k - 1][r0] || inR || (gain[(i + t) * 26 + c[r0 + t]] += l2) > 0)))))
            && new long[n] instanceof long[] lost && IntStream.range(0, n).allMatch(p -> (lost[p] = (p > 0 ? lost[p - 1] : 0) + ld[p]) > Long.MIN_VALUE)
            ? base[0] + Math.max(0, IntStream.range(0, 26 * n).mapToLong(x -> gain[x] - lost[x / 26]).max().orElse(0)) : "");
    }
}

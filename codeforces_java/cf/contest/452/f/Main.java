import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Long) 2305843009213693951L instanceof Long M
            && ((LongUnaryOperator) v -> v >= 2305843009213693951L ? v - 2305843009213693951L : v) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) (a, b) -> (((a * b) & 2305843009213693951L) + (((a * b) >>> 61) | (Math.multiplyHigh(a, b) << 3))) % 2305843009213693951L) instanceof LongBinaryOperator mul
            && (Long) ((System.nanoTime() * 6364136223846793005L >>> 4) % 2305843009213693000L + 1000003L) instanceof Long base
            && new long[n + 2] instanceof long[] pw
            && (pw[0] = 1) > 0
            && IntStream.rangeClosed(1, n + 1).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], base)) > 0)
            && new long[n + 2] instanceof long[] F
            && new long[n + 2] instanceof long[] G
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] upd
            && (upd[0] = j -> j > n ? 0
                : ((F[j] = red.applyAsLong(F[j] + pw[ps[1]])) >= 0 && (G[j] = red.applyAsLong(G[j] + pw[n + 1 - ps[1]])) >= 0
                    ? upd[0].applyAsInt(j + (j & -j)) : -1)) != null
            && new IntToLongFunction[2] instanceof IntToLongFunction[] qs
            && (qs[0] = j -> j <= 0 ? 0L : red.applyAsLong(F[j] + qs[0].applyAsLong(j - (j & -j)))) != null
            && (qs[1] = j -> j <= 0 ? 0L : red.applyAsLong(G[j] + qs[1].applyAsLong(j - (j & -j)))) != null
            && (ps[1] = 0) == 0
            && (Boolean) IntStream.range(0, n).allMatch(i ->
                (Integer) tk[1 + i] instanceof Integer x
                && (Integer) Math.min(x - 1, n - x) instanceof Integer len
                && (len == 0 || ((Long) Math.floorMod(qs[1].applyAsLong(x - 1) - qs[1].applyAsLong(x - len - 1), M) instanceof Long lf
                    && (Long) Math.floorMod(qs[0].applyAsLong(x + len) - qs[0].applyAsLong(x), M) instanceof Long rt
                    && (2 * x - n - 1 >= 0 ? rt.longValue() == mul.applyAsLong(lf, pw[2 * x - n - 1]) : lf.longValue() == mul.applyAsLong(rt, pw[n + 1 - 2 * x]))))
                && (ps[1] = x) > 0
                && upd[0].applyAsInt(x) >= 0) instanceof Boolean allSym
            ? (allSym ? "NO" : "YES") : "");
    }
}

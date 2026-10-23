import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf((int) IntStream.range(0, n).filter(i -> g[1 + 2 * i] == 0).count()) instanceof Integer m0
            && IntStream.range(0, n).filter(i -> g[1 + 2 * i] != 0).mapToLong(i -> (long) g[1 + 2 * i] << 14 | g[2 + 2 * i]).sorted().toArray() instanceof long[] ks
            && new int[100002] instanceof int[] cnt
            && new int[100002] instanceof int[] fst
            && IntStream.range(0, ks.length).allMatch(i ->
                cnt[(int) (ks[i] >> 14)]++ >= 0
                && (i > 0 && ks[i] >> 14 == ks[i - 1] >> 14 || (fst[(int) (ks[i] >> 14)] = i) >= 0))
            && IntStream.range(0, ks.length).mapToLong(i ->
                (long) (cnt[(int) (ks[i] >> 14)] - (i - fst[(int) (ks[i] >> 14)]) - 1) << 14 | (ks[i] & 16383)).sorted().toArray() instanceof long[] k2
            && new int[10003] instanceof int[] bc
            && new long[10003] instanceof long[] bs
            && ((IntBinaryOperator) (c, d) ->
                IntStream.iterate(c + 1, k -> k <= 10001, k -> k + (k & -k)).allMatch(k ->
                    (bc[k] += d) * 0 == 0 && (bs[k] += (long) d * c) * 0 == 0) ? 0 : 1) instanceof IntBinaryOperator upd
            && IntStream.range(0, ks.length).allMatch(i -> upd.applyAsInt((int) (ks[i] & 16383), 1) == 0)
            && new int[]{ks.length - 1, 0} instanceof int[] pf
            && new long[3] instanceof long[] q
            && new long[1] instanceof long[] ss
            && ((IntToLongFunction) v ->
                IntStream.iterate(pf[0], i -> i >= 0 && (k2[i] >> 14) >= v, i -> i - 1).allMatch(i ->
                    upd.applyAsInt((int) (k2[i] & 16383), -1) == 0
                    && ++pf[1] > 0
                    && (ss[0] += k2[i] & 16383) >= 0
                    && (pf[0] = i - 1) > -5)
                && (Integer) (v + 1 - m0 - pf[1]) instanceof Integer need
                ? need <= 0 ? ss[0]
                    : need <= ks.length - pf[1]
                        ? ((q[0] = 0) == 0 && (q[1] = need) == need && (q[2] = 0) == 0
                            && IntStream.iterate(13, b -> b >= 0, b -> b - 1).allMatch(b ->
                                q[0] + (1 << b) > 10001 || bc[(int) q[0] + (1 << b)] > q[1]
                                || ((q[0] += 1 << b) > 0 && (q[1] -= bc[(int) q[0]]) > -1 && (q[2] += bs[(int) q[0]]) >= 0))
                            ? ss[0] + q[2] + q[1] * q[0] : -1L)
                        : -1L
                : -1L) instanceof IntToLongFunction cost
            ? IntStream.iterate(n, v -> v >= 0, v -> v - 1).mapToLong(cost).filter(x -> x >= 0).min().getAsLong()
            : "");
    }
}

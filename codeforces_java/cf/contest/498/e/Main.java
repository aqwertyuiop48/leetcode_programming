import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && IntStream.range(0, 7).map(i -> sc.nextInt()).toArray() instanceof int[] w
            && Long.valueOf(1000000007L) instanceof Long P
            && (LongBinaryOperator) ((x, y) -> x + y >= 8000000112000000392L ? x + y - 8000000112000000392L : x + y) instanceof LongBinaryOperator red
            && new Random(7).longs(128, 1, 1000000007L).toArray() instanceof long[] rnd
            && new long[][]{{1}} instanceof long[][] vh
            && new int[]{0} instanceof int[] ph
            && IntStream.rangeClosed(1, 7).allMatch(h ->
                w[h - 1] == 0
                || Integer.valueOf(1 << h) instanceof Integer N
                && (vh[0] = IntStream.range(0, N).mapToLong(m -> (m >> ph[0]) == ((N - 1) >> ph[0]) ? vh[0][m & ((1 << ph[0]) - 1)] : 0L).toArray()) != null
                && (ph[0] = h) > 0
                && IntStream.range(0, N).mapToLong(c ->
                    IntStream.range(0, 1 << (h - 1)).filter(hm ->
                        Integer.valueOf(1 | (hm << 1) | (1 << h)) instanceof Integer E
                        && (c & E & (E >> 1)) == 0).count()).toArray() instanceof long[] fv
                && IntStream.range(0, N * N).mapToLong(idx -> fv[(idx / N) & (idx % N)]).toArray() instanceof long[] T0
                && new long[2 * N][] instanceof long[][] us
                && (us[0] = vh[0]) != null
                && IntStream.range(0, 2 * N - 1).allMatch(k ->
                    (us[k + 1] = IntStream.range(0, N).mapToLong(c ->
                        IntStream.range(0, N).mapToLong(a -> us[k][a] * T0[c * N + a]).reduce(0L, red) % P).toArray()) != null)
                && IntStream.range(0, 2 * N).mapToLong(k ->
                    IntStream.range(0, N).mapToLong(a -> us[k][a] * rnd[a]).reduce(0L, red) % P).toArray() instanceof long[] s
                && new long[][]{new long[2 * N + 2], new long[2 * N + 2]} instanceof long[][] cb
                && (cb[0][0] = 1) > 0
                && (cb[1][0] = 1) > 0
                && new long[]{0, 1, 1} instanceof long[] st
                && IntStream.range(0, 2 * N).allMatch(n ->
                    Long.valueOf((s[n] + IntStream.rangeClosed(1, (int) st[0]).mapToLong(i -> cb[0][i] * s[n - i] % P).sum()) % P) instanceof Long d
                    && (d == 0
                        ? (st[1]++) > 0
                        : Long.valueOf(d * BigInteger.valueOf(st[2]).modInverse(BigInteger.valueOf(P)).longValue() % P) instanceof Long cf
                            && cb[0].clone() instanceof long[] tmp
                            && IntStream.range(0, 2 * N + 2 - (int) st[1]).allMatch(i ->
                                (cb[0][i + (int) st[1]] = ((cb[0][i + (int) st[1]] - cf * cb[1][i]) % P + P) % P) >= 0)
                            && (2 * st[0] <= n
                                ? (cb[1] = tmp) != null && (st[0] = n + 1 - st[0]) > 0 && (st[2] = d) > 0 && (st[1] = 1) > 0
                                : (st[1]++) > 0)))
                && Integer.valueOf((int) st[0]) instanceof Integer L
                && (BinaryOperator<long[]>) ((a, b) ->
                    IntStream.range(0, 2 * L - 1).mapToLong(k ->
                        IntStream.rangeClosed(Math.max(0, k - L + 1), Math.min(k, L - 1)).mapToLong(i -> a[i] * b[k - i] % P).sum() % P).toArray() instanceof long[] pr
                    && IntStream.iterate(2 * L - 2, k -> k >= L, k -> k - 1).allMatch(k ->
                        IntStream.rangeClosed(1, L).allMatch(j -> (pr[k - j] = ((pr[k - j] - pr[k] * cb[0][j]) % P + P) % P) >= 0))
                        ? Arrays.copyOf(pr, L)
                        : null) instanceof BinaryOperator<long[]> mulmod
                && (UnaryOperator<long[]>) (a ->
                    IntStream.range(0, L).mapToLong(i -> ((i > 0 ? a[i - 1] : 0) - a[L - 1] * cb[0][L - i] % P + P) % P).toArray()) instanceof UnaryOperator<long[]> mulx
                && new long[][]{IntStream.range(0, L).mapToLong(i -> i == 0 ? 1 : 0).toArray()} instanceof long[][] rp
                && Integer.toBinaryString(w[h - 1]).chars().allMatch(bit ->
                    (rp[0] = mulmod.apply(rp[0], rp[0])) != null
                    && (bit != '1' || (rp[0] = mulx.apply(rp[0])) != null))
                && (vh[0] = IntStream.range(0, N).mapToLong(c ->
                    IntStream.range(0, L).mapToLong(k -> rp[0][k] * us[k][c] % P).sum() % P).toArray()) != null)
            ? vh[0][vh[0].length - 1]
            : -1);
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0].length()) instanceof Integer n && Integer.valueOf(tk[2].length()) instanceof Integer m && Integer.valueOf(n + 2) instanceof Integer W
            && tk[2].getBytes() instanceof byte[] w && new byte[4 * n] instanceof byte[] GB
            && new byte[][]{tk[0].getBytes(), tk[1].getBytes()} instanceof byte[][] rows
            && IntStream.range(0, 4).allMatch(s -> IntStream.range(0, n).map(c -> (GB[s * n + c] = s < 2 ? rows[s & 1][c] : rows[s & 1][n - 1 - c]) & 0).sum() == 0)
            && new short[12][(m + 2) * W] instanceof short[][] TT
            && IntStream.range(0, 4).allMatch(gr -> TT[gr / 2 * 6 + gr % 2] instanceof short[] XA && TT[gr / 2 * 6 + 2 + gr % 2] instanceof short[] XB && TT[gr / 2 * 6 + 4 + gr % 2] instanceof short[] XC
                && IntStream.range(0, m).allMatch(pp -> IntStream.range(0, n).map(q -> (XA[(m - 1 - pp) * W + q + 1] = (short) (GB[gr * n + q] == w[m - 1 - pp] ? XA[(m - pp) * W + q + 2] + 1 : 0))
                    & (XC[(m - 1 - pp) * W + q + 1] = (short) (((XB[(m - 1 - pp) * W + q + 1] = (short) (GB[gr * n + q] == w[m - 1 - pp] ? XB[(m - pp) * W + q] + 1 : 0)) >= pp + 1 ? 1 : 0) + XC[(m - pp) * W + q + 2])) & 0).sum() == 0))
            && new int[4 * n] instanceof int[] f0 && new int[4 * n] instanceof int[] f1 && new int[4 * n] instanceof int[] n0 && new int[4 * n] instanceof int[] n1 && new long[1] instanceof long[] tot
            && IntStream.range(0, 4 * n).map(x -> (f0[x] = GB[x] == w[0] ? 1 : 0) & 0).sum() == 0
            && IntStream.rangeClosed(1, m).allMatch(i -> Integer.valueOf(m - i) instanceof Integer rem && Integer.valueOf((m - i + 1) / 2) instanceof Integer j1
                && (i % 2 != 0 || i < 4 || IntStream.range(0, 4).allMatch(s -> TT[s / 2 * 6 + s % 2] instanceof short[] TA && TT[s / 2 * 6 + 3 - s % 2] instanceof short[] TB
                    && Integer.valueOf((1 - s / 2) * 2 * n + (1 - s % 2) * n + n - 1) instanceof Integer tb
                    && IntStream.range(0, n - (i / 2 - 1)).map(c0 -> TA[c0 + 1] >= i / 2 && TB[i / 2 * W + c0 + i / 2] >= i / 2
                        && (f1[tb - c0] = (f1[tb - c0] + 1) % 1000000007) >= 0 ? 0 : 0).sum() == 0))
                && (i != m || (tot[0] = (tot[0] + IntStream.range(0, 4 * n).mapToLong(x -> (long) f0[x] + f1[x]).sum()) % 1000000007) >= 0)
                && (rem < 4 || (tot[0] = (tot[0] + IntStream.range(0, 4).mapToLong(s -> TT[s / 2 * 6 + s % 2] instanceof short[] TA && TT[s / 2 * 6 + 5 - s % 2] instanceof short[] TB
                    ? IntStream.range(0, n).mapToLong(c -> f1[s * n + c] == 0 || j1 > Math.min(rem - 2, TA[i * W + c + 2]) ? 0L
                        : (long) f1[s * n + c] * (TB[(i + j1) * W + c + j1 + 1] - TB[(i + Math.min(rem - 2, TA[i * W + c + 2]) + 1) * W + c + Math.min(rem - 2, TA[i * W + c + 2]) + 2])).sum() : 0L).sum()) % 1000000007) >= 0)
                && (i == m || IntStream.range(0, 4).allMatch(s -> IntStream.range(0, n).map(c -> (n0[s * n + c] = c > 0 && GB[s * n + c] == w[i] ? f0[s * n + c - 1] + f1[s * n + c - 1] - (f0[s * n + c - 1] + f1[s * n + c - 1] >= 1000000007 ? 1000000007 : 0) : 0)
                        & (n1[s * n + c] = GB[s * n + c] == w[i] ? f0[s * n + c + ((s & 1) == 0 ? n : -n)] : 0) & 0).sum() == 0)
                    && Stream.of(0).peek(z -> System.arraycopy(n0, 0, f0, 0, 4 * n)).peek(z -> System.arraycopy(n1, 0, f1, 0, 4 * n)).findFirst().isPresent()))
            && (tot[0] = (tot[0] + IntStream.range(0, 4).mapToLong(s -> TT[s / 2 * 6 + s % 2] instanceof short[] TA && TT[s / 2 * 6 + 3 - s % 2] instanceof short[] TB
                ? IntStream.range(0, n).mapToLong(c0 -> IntStream.rangeClosed(Math.max(1, m / 2), Math.min(m - 3, TA[c0 + 1] - 1)).filter(j -> TB[(1 + j) * W + c0 + j + 1] >= m - 1 - j).count()).sum() : 0L).sum()) % 1000000007) >= 0
            ? ((tot[0] - (m == 1 ? IntStream.range(0, 2 * n).filter(x -> GB[x] == w[0]).count()
                : m == 2 ? IntStream.range(0, 2 * n).filter(x -> GB[x] == w[0] && GB[x < n ? x + n : x - n] == w[1]).count() : 0L)) % 1000000007 + 1000000007) % 1000000007 : "");
    }
}

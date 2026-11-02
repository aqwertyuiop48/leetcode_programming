import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] w
            && w[0].getBytes() instanceof byte[] s
            && Integer.valueOf(s.length) instanceof Integer n
            && Integer.valueOf(w[1]) instanceof Integer k
            && Integer.valueOf(w[2]) instanceof Integer lw
            && Integer.valueOf(w[3]) instanceof Integer rw
            && IntStream.range(0, k).map(i -> w[4 + 3 * i].charAt(0) - 'a').toArray() instanceof int[] cc
            && IntStream.range(0, k).map(i -> Integer.parseInt(w[5 + 3 * i])).toArray() instanceof int[] lo
            && IntStream.range(0, k).map(i -> Integer.parseInt(w[6 + 3 * i])).toArray() instanceof int[] hi
            && new int[26] instanceof int[] occN
            && new int[n] instanceof int[] rank
            && IntStream.range(0, n).allMatch(e -> (rank[e] = ++occN[s[e] - 'a']) > 0)
            && IntStream.range(0, 26).mapToObj(c -> new int[occN[c] + 2]).toArray(int[][]::new) instanceof int[][] occ
            && IntStream.range(0, 26).allMatch(c -> (occ[c][0] = -1) < 0)
            && IntStream.range(0, n).allMatch(e -> (occ[s[e] - 'a'][rank[e]] = e) >= 0)
            && Integer.valueOf((int) IntStream.range(0, k).filter(i -> lo[i] == 0).count()) instanceof Integer z0
            && new int[n] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(x -> (cnt[x] = z0) >= 0)
            && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, k).filter(i -> cc[i] == c).map(i -> hi[i]).sorted().toArray()).toArray(int[][]::new) instanceof int[][] hiS
            && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, k).filter(i -> cc[i] == c && lo[i] >= 1).map(i -> lo[i]).sorted().toArray()).toArray(int[][]::new) instanceof int[][] loS
            && IntStream.range(0, 26).mapToObj(c -> new int[occN[c] + 2]).toArray(int[][]::new) instanceof int[][] cH
            && IntStream.range(0, 26).mapToObj(c -> new int[occN[c] + 2]).toArray(int[][]::new) instanceof int[][] cL
            && IntStream.range(0, 26).allMatch(c -> IntStream.range(0, hiS[c].length).allMatch(t -> ++cH[c][Math.min(hiS[c][t], occN[c] + 1)] > 0)
                && IntStream.range(0, loS[c].length).allMatch(t -> ++cL[c][Math.min(loS[c][t], occN[c] + 1)] > 0)
                && IntStream.rangeClosed(1, occN[c] + 1).allMatch(t -> (cH[c][t] += cH[c][t - 1]) >= 0 && (cL[c][t] += cL[c][t - 1]) >= 0))
            && new long[]{z0 >= lw && z0 <= rw ? n : 0} instanceof long[] good
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] rg
            && (rg[0] = (a, b) -> a == b ? (--cnt[a] == rw ? 1 : 0) - (cnt[a] == lw - 1 ? 1 : 0) : a > b ? 0
                : b - a < 8 ? ((--cnt[a] == rw ? 1 : 0) - (cnt[a] == lw - 1 ? 1 : 0)) + (b > a + 0 ? ((--cnt[a + 1] == rw ? 1 : 0) - (cnt[a + 1] == lw - 1 ? 1 : 0)) : 0) + (b > a + 1 ? ((--cnt[a + 2] == rw ? 1 : 0) - (cnt[a + 2] == lw - 1 ? 1 : 0)) : 0) + (b > a + 2 ? ((--cnt[a + 3] == rw ? 1 : 0) - (cnt[a + 3] == lw - 1 ? 1 : 0)) : 0) + (b > a + 3 ? ((--cnt[a + 4] == rw ? 1 : 0) - (cnt[a + 4] == lw - 1 ? 1 : 0)) : 0) + (b > a + 4 ? ((--cnt[a + 5] == rw ? 1 : 0) - (cnt[a + 5] == lw - 1 ? 1 : 0)) : 0) + (b > a + 5 ? ((--cnt[a + 6] == rw ? 1 : 0) - (cnt[a + 6] == lw - 1 ? 1 : 0)) : 0) + (b > a + 6 ? ((--cnt[a + 7] == rw ? 1 : 0) - (cnt[a + 7] == lw - 1 ? 1 : 0)) : 0)
                : rg[0].applyAsInt(a, (a + b) >>> 1) + rg[0].applyAsInt(((a + b) >>> 1) + 1, b)) != null
            && (rg[1] = (a, b) -> a == b ? (++cnt[a] == lw ? 1 : 0) - (cnt[a] == rw + 1 ? 1 : 0) : a > b ? 0
                : b - a < 8 ? ((++cnt[a] == lw ? 1 : 0) - (cnt[a] == rw + 1 ? 1 : 0)) + (b > a + 0 ? ((++cnt[a + 1] == lw ? 1 : 0) - (cnt[a + 1] == rw + 1 ? 1 : 0)) : 0) + (b > a + 1 ? ((++cnt[a + 2] == lw ? 1 : 0) - (cnt[a + 2] == rw + 1 ? 1 : 0)) : 0) + (b > a + 2 ? ((++cnt[a + 3] == lw ? 1 : 0) - (cnt[a + 3] == rw + 1 ? 1 : 0)) : 0) + (b > a + 3 ? ((++cnt[a + 4] == lw ? 1 : 0) - (cnt[a + 4] == rw + 1 ? 1 : 0)) : 0) + (b > a + 4 ? ((++cnt[a + 5] == lw ? 1 : 0) - (cnt[a + 5] == rw + 1 ? 1 : 0)) : 0) + (b > a + 5 ? ((++cnt[a + 6] == lw ? 1 : 0) - (cnt[a + 6] == rw + 1 ? 1 : 0)) : 0) + (b > a + 6 ? ((++cnt[a + 7] == lw ? 1 : 0) - (cnt[a + 7] == rw + 1 ? 1 : 0)) : 0)
                : rg[1].applyAsInt(a, (a + b) >>> 1) + rg[1].applyAsInt(((a + b) >>> 1) + 1, b)) != null
            && new long[]{0} instanceof long[] ans
            && IntStream.range(0, n).allMatch(e -> (Integer) rank[e] instanceof Integer R && occ[s[e] - 'a'] instanceof int[] o && hiS[s[e] - 'a'] instanceof int[] hh && loS[s[e] - 'a'] instanceof int[] ll
                && (Integer) cH[s[e] - 'a'][R - 1] instanceof Integer mh && (Integer) cL[s[e] - 'a'][R] instanceof Integer ml
                && (good[0] += IntStream.range(0, (mh + 7) / 8).map(t -> (8 * t + 0 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 0]] + 1, o[R - hh[8 * t + 0]]) : 0) + (8 * t + 1 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 1]] + 1, o[R - hh[8 * t + 1]]) : 0) + (8 * t + 2 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 2]] + 1, o[R - hh[8 * t + 2]]) : 0) + (8 * t + 3 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 3]] + 1, o[R - hh[8 * t + 3]]) : 0) + (8 * t + 4 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 4]] + 1, o[R - hh[8 * t + 4]]) : 0) + (8 * t + 5 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 5]] + 1, o[R - hh[8 * t + 5]]) : 0) + (8 * t + 6 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 6]] + 1, o[R - hh[8 * t + 6]]) : 0) + (8 * t + 7 < mh ? rg[0].applyAsInt(o[R - 1 - hh[8 * t + 7]] + 1, o[R - hh[8 * t + 7]]) : 0)).sum()
                    + IntStream.range(0, (ml + 7) / 8).map(t -> (8 * t + 0 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 0]] + 1, o[R - ll[8 * t + 0] + 1]) : 0) + (8 * t + 1 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 1]] + 1, o[R - ll[8 * t + 1] + 1]) : 0) + (8 * t + 2 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 2]] + 1, o[R - ll[8 * t + 2] + 1]) : 0) + (8 * t + 3 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 3]] + 1, o[R - ll[8 * t + 3] + 1]) : 0) + (8 * t + 4 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 4]] + 1, o[R - ll[8 * t + 4] + 1]) : 0) + (8 * t + 5 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 5]] + 1, o[R - ll[8 * t + 5] + 1]) : 0) + (8 * t + 6 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 6]] + 1, o[R - ll[8 * t + 6] + 1]) : 0) + (8 * t + 7 < ml ? rg[1].applyAsInt(o[R - ll[8 * t + 7]] + 1, o[R - ll[8 * t + 7] + 1]) : 0)).sum()) >= 0
                && (ans[0] += good[0] - (z0 >= lw && z0 <= rw ? n - 1 - e : 0)) >= 0)
            ? ans[0]
            : -1);
    }
}

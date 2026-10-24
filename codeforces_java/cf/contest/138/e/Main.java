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
            && IntStream.range(0, 26).mapToObj(c -> new int[occN[c]]).toArray(int[][]::new) instanceof int[][] occ
            && IntStream.range(0, n).allMatch(e -> (occ[s[e] - 'a'][rank[e] - 1] = e) >= 0)
            && Integer.valueOf((int) IntStream.range(0, k).filter(i -> lo[i] == 0).count()) instanceof Integer z0
            && new int[n] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(x -> (cnt[x] = z0) >= 0)
            && new int[k] instanceof int[] ia
            && IntStream.range(0, k).map(i -> lo[i] == 0 ? n - 1 : -1).toArray() instanceof int[] ib
            && IntStream.range(0, 26).mapToObj(c -> IntStream.range(0, k).filter(i -> cc[i] == c).toArray()).toArray(int[][]::new) instanceof int[][] by
            && new long[]{z0 >= lw && z0 <= rw ? n : 0} instanceof long[] good
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] rg
            && (rg[0] = (a, b) -> a > b ? 0
                : a == b ? ((--cnt[a] == rw ? 1 : 0) - (cnt[a] == lw - 1 ? 1 : 0))
                : rg[0].applyAsInt(a, (a + b) >>> 1) + rg[0].applyAsInt(((a + b) >>> 1) + 1, b)) != null
            && (rg[1] = (a, b) -> a > b ? 0
                : a == b ? ((++cnt[a] == lw ? 1 : 0) - (cnt[a] == rw + 1 ? 1 : 0))
                : rg[1].applyAsInt(a, (a + b) >>> 1) + rg[1].applyAsInt(((a + b) >>> 1) + 1, b)) != null
            && new long[]{0} instanceof long[] ans
            && IntStream.range(0, n).allMatch(e -> (good[0] += Arrays.stream(by[s[e] - 'a']).mapToLong(i ->
                    Integer.valueOf(rank[e] - hi[i] >= 1 ? occ[cc[i]][rank[e] - hi[i] - 1] + 1 : 0) instanceof Integer a2
                    && Integer.valueOf(lo[i] == 0 ? n - 1 : rank[e] - lo[i] + 1 >= 1 ? occ[cc[i]][rank[e] - lo[i]] : -1) instanceof Integer b2
                    && Integer.valueOf(Math.min(ib[i], a2 - 1)) instanceof Integer q
                    && Integer.valueOf(Math.max(a2, ib[i] + 1)) instanceof Integer p
                    ? (ia[i] > q ? 0 : ia[i] == q ? (--cnt[q] == rw ? 1 : 0) - (cnt[q] == lw - 1 ? 1 : 0) : rg[0].applyAsInt(ia[i], q))
                        + (p > b2 ? 0 : p.equals(b2) ? (++cnt[p] == lw ? 1 : 0) - (cnt[p] == rw + 1 ? 1 : 0) : rg[1].applyAsInt(p, b2))
                        + 0 * (ia[i] = a2) + 0 * (ib[i] = b2)
                    : 0).sum()) >= 0
                && (ans[0] += good[0] - (z0 >= lw && z0 <= rw ? n - 1 - e : 0)) >= 0)
            ? ans[0]
            : -1);
    }


}

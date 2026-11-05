import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] tk && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, buf.length).filter(i -> i < buf.length && buf[i] >= '0'
                ? (st[0] = st[0] * 10 + buf[i] - '0') >= 0 && (st[1] = 1) > 0
                : st[1] == 1 && (tk[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0).count() >= 0
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer k
            && new boolean[n + 1] instanceof boolean[] fav && new int[n + 1] instanceof int[] pos
            && IntStream.range(0, k).allMatch(i -> fav[tk[2 + n + i]] = true)
            && IntStream.rangeClosed(1, n).allMatch(i -> (pos[tk[1 + i]] = i) > 0)
            && new int[k + 2] instanceof int[] sv && new int[k + 2] instanceof int[] sq && new int[1] instanceof int[] sz
            && new int[n + 2] instanceof int[] lo && new int[n + 2] instanceof int[] hi
            && IntStream.rangeClosed(1, n).allMatch(i -> Integer.valueOf(tk[1 + i]) instanceof Integer val
                && Integer.valueOf(-Arrays.binarySearch(sv, 0, sz[0], val) - 1) instanceof Integer ins
                && (fav[val]
                    ? (sz[0] = ins + 1) > 0 && (sv[ins] = val) >= 0 && (sq[ins] = i) >= 0
                    : (lo[i] = ins == 0 ? 0 : sq[ins - 1]) >= 0))
            && (sz[0] = 0) == 0
            && IntStream.rangeClosed(1, n).allMatch(x -> Integer.valueOf(n + 1 - x) instanceof Integer i && Integer.valueOf(tk[1 + i]) instanceof Integer val
                && Integer.valueOf(-Arrays.binarySearch(sv, 0, sz[0], val) - 1) instanceof Integer ins
                && (fav[val]
                    ? (sz[0] = ins + 1) > 0 && (sv[ins] = val) >= 0 && (sq[ins] = i) >= 0
                    : (hi[i] = ins == 0 ? n + 1 : sq[ins - 1]) >= 0))
            && new long[(n >> 6) + 2] instanceof long[] W && new int[(n >> 6) + 4] instanceof int[] tree && Integer.valueOf((n >> 6) + 2) instanceof Integer nw
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] g
            && (g[0] = (r, l) -> r == l ? 0 : r > l ? tree[r] + g[0].applyAsInt(r - (r & -r), l) : -tree[l] + g[0].applyAsInt(r, l - (l & -l))) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] up
            && (up[0] = j -> j > nw ? 0 : (++tree[j] > 0 ? 0 : 1) + up[0].applyAsInt(j + (j & -j))) != null
            ? IntStream.rangeClosed(1, n).mapToLong(x -> Integer.valueOf(n + 1 - x) instanceof Integer v && Integer.valueOf(pos[v]) instanceof Integer p
                && (W[p >> 6] |= 1L << p) != 0 && up[0].applyAsInt((p >> 6) + 1) == 0 && !fav[v]
                ? (long) (g[0].applyAsInt(hi[p] - 1 >> 6, lo[p] >> 6) + Long.bitCount(W[hi[p] - 1 >> 6] & (-1L >>> (63 - (hi[p] - 1)))) - Long.bitCount(W[lo[p] >> 6] & (-1L >>> (63 - lo[p]))))
                : 0L).sum() : "");
    }
}

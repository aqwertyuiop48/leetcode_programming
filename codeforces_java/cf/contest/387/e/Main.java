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
            && new int[n + 1] instanceof int[] pos && new boolean[n + 1] instanceof boolean[] kept && new int[n + 2] instanceof int[] bit
            && IntStream.rangeClosed(1, n).allMatch(i -> (pos[tk[1 + i]] = i) > 0 && (bit[i] = i & -i) > 0)
            && IntStream.range(0, k).allMatch(i -> kept[tk[2 + n + i]] = true)
            && IntStream.range(0, 4).mapToObj(l -> new long[(n >> (6 * l + 6)) + 2]).toArray(long[][]::new) instanceof long[][] Lv
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] g
            && (g[0] = (r, l) -> r == l ? 0 : r > l ? bit[r] + g[0].applyAsInt(r - (r & -r), l) : -bit[l] + g[0].applyAsInt(r, l - (l & -l))) != null
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] up
            && (up[0] = j -> j > n ? 0 : (--bit[j] > -5 ? 0 : 1) + up[0].applyAsInt(j + (j & -j))) != null
            && new LongBinaryOperator[2] instanceof LongBinaryOperator[] sp
            && (sp[0] = (l, x) -> x >> 6 >= Lv[(int) l].length ? -1
                : (Lv[(int) l][(int) (x >> 6)] & (-1L << x)) != 0 ? ((x >> 6) << 6) + Long.numberOfTrailingZeros(Lv[(int) l][(int) (x >> 6)] & (-1L << x))
                : l == 3 ? -1
                : Long.valueOf(sp[0].applyAsLong(l + 1, (x >> 6) + 1)) instanceof Long r ? (r < 0 ? -1 : (r << 6) + Long.numberOfTrailingZeros(Lv[(int) l][(int) (long) r])) : -1) != null
            && (sp[1] = (l, x) -> x < 0 ? -1
                : (Lv[(int) l][(int) (x >> 6)] & (-1L >>> (63 - x))) != 0 ? ((x >> 6) << 6) + 63 - Long.numberOfLeadingZeros(Lv[(int) l][(int) (x >> 6)] & (-1L >>> (63 - x)))
                : l == 3 ? -1
                : Long.valueOf(sp[1].applyAsLong(l + 1, (x >> 6) - 1)) instanceof Long r ? (r < 0 ? -1 : (r << 6) + 63 - Long.numberOfLeadingZeros(Lv[(int) l][(int) (long) r])) : -1) != null
            ? IntStream.rangeClosed(1, n).mapToLong(v -> kept[v]
                ? (Lv[0][pos[v] >> 6] |= 1L << pos[v]) != 0 && (Lv[1][pos[v] >> 12] |= 1L << (pos[v] >> 6)) != 0
                    && (Lv[2][pos[v] >> 18] |= 1L << (pos[v] >> 12)) != 0 && (Lv[3][pos[v] >> 24] |= 1L << (pos[v] >> 18)) != 0 ? 0L : 0L
                : Integer.valueOf(pos[v]) instanceof Integer p
                    && Integer.valueOf((int) Math.max(0L, sp[1].applyAsLong(0, p))) instanceof Integer lo
                    && Integer.valueOf(sp[0].applyAsLong(0, p) < 0 ? n + 1 : (int) sp[0].applyAsLong(0, p)) instanceof Integer hi
                    && Integer.valueOf(g[0].applyAsInt(hi - 1, lo)) instanceof Integer w
                    && up[0].applyAsInt(p) == 0
                    ? (long) w : 0L).sum() : "");
    }
}

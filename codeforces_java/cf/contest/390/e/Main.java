import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[buf.length / 2 + 3] instanceof int[] tk && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, buf.length).filter(i -> i < buf.length && buf[i] >= '0'
                ? (st[0] = st[0] * 10 + buf[i] - '0') >= 0 && (st[1] = 1) > 0
                : st[1] == 1 && (tk[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0).count() >= 0
            && Integer.valueOf(tk[2]) instanceof Integer w && new int[]{3} instanceof int[] ptr
            && new long[][]{new long[(tk[0] + 2 >> 6) + 2], new long[(tk[1] + 2 >> 6) + 2]} instanceof long[][] BM
            && IntStream.range(0, w).allMatch(o -> Integer.valueOf(ptr[0]) instanceof Integer p
                && (tk[p] != 0 || (BM[0][tk[p + 1] >> 6] |= 1L << tk[p + 1]) != 0 && (BM[0][tk[p + 3] + 1 >> 6] |= 1L << (tk[p + 3] + 1)) != 0
                    && (BM[1][tk[p + 2] >> 6] |= 1L << tk[p + 2]) != 0 && (BM[1][tk[p + 4] + 1 >> 6] |= 1L << (tk[p + 4] + 1)) != 0)
                && (ptr[0] += tk[p] == 0 ? 6 : 5) > 0)
            && (ptr[0] = 3) == 3
            && new int[][]{new int[BM[0].length + 1], new int[BM[1].length + 1]} instanceof int[][] P
            && IntStream.rangeClosed(1, BM[0].length).allMatch(k -> (P[0][k] = P[0][k - 1] + Long.bitCount(BM[0][k - 1])) >= 0)
            && IntStream.rangeClosed(1, BM[1].length).allMatch(k -> (P[1][k] = P[1][k - 1] + Long.bitCount(BM[1][k - 1])) >= 0)
            && new long[][]{new long[2 * (P[0][BM[0].length] + 2)], new long[2 * (P[1][BM[1].length] + 2)]} instanceof long[][] T
            && new long[1] instanceof long[] total
            && ((IntBinaryOperator) (b, x) -> P[b][x >> 6] + Long.bitCount(BM[b][x >> 6] & (-1L >>> (63 - x)))) instanceof IntBinaryOperator rk
            && new long[4] instanceof long[] sv && new IntUnaryOperator[1] instanceof IntUnaryOperator[] us && new LongUnaryOperator[1] instanceof LongUnaryOperator[] qs
            && (us[0] = j -> j > (int) sv[3] ? 0 : (int) ((T[(int) sv[0]][2 * j] += sv[2]) * 0 + (T[(int) sv[0]][2 * j + 1] += sv[2] * (sv[1] - 1)) * 0) + us[0].applyAsInt(j + (j & -j))) != null
            && (qs[0] = q -> q <= 0 ? 0L : sv[1] * T[(int) sv[0]][2 * (int) q] - T[(int) sv[0]][2 * (int) q + 1] + qs[0].applyAsLong(q - (q & -q))) != null
            && ((LongBinaryOperator) (a, c) -> (sv[0] = a >>> 32) >= 0 && (sv[1] = a & 0xffffffffL) > 0 && (sv[2] = c) * 0 == 0 && (sv[3] = P[(int) sv[0]][BM[(int) sv[0]].length]) > 0
                ? (long) us[0].applyAsInt(rk.applyAsInt((int) sv[0], (int) sv[1])) : 1L) instanceof LongBinaryOperator upd
            && ((LongBinaryOperator) (b, i) -> (sv[0] = b) >= 0 && (sv[1] = i) >= 0 ? qs[0].applyAsLong(rk.applyAsInt((int) b, (int) i)) : 0L) instanceof LongBinaryOperator qry
            ? IntStream.range(0, w).mapToObj(o -> Integer.valueOf(ptr[0]) instanceof Integer p && Integer.valueOf(tk[p + 1]) instanceof Integer x0
                && Integer.valueOf(tk[p + 2]) instanceof Integer y0 && Integer.valueOf(tk[p + 3]) instanceof Integer x1 && Integer.valueOf(tk[p + 4]) instanceof Integer y1
                ? tk[p] == 0
                    ? Long.valueOf(tk[p + 5]) instanceof Long v
                        && upd.applyAsLong(x0, v * (y1 - y0 + 1)) + upd.applyAsLong(x1 + 1, -v * (y1 - y0 + 1))
                            + upd.applyAsLong((1L << 32) + y0, v * (x1 - x0 + 1)) + upd.applyAsLong((1L << 32) + y1 + 1, -v * (x1 - x0 + 1)) == 0
                        && (total[0] += v * (x1 - x0 + 1) * (y1 - y0 + 1)) * 0 == 0 && (ptr[0] += 6) > 0 ? (String) null : null
                    : (ptr[0] += 5) > 0 ? String.valueOf(qry.applyAsLong(0, x1) - qry.applyAsLong(0, x0 - 1) + qry.applyAsLong(1, y1) - qry.applyAsLong(1, y0 - 1) - total[0]) : null
                : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

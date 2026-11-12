
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer t
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer tp && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer tu && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer td
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> Integer.parseInt(tk.nextToken())).toArray()).toArray(int[][]::new) instanceof int[][] h
            && ((IntBinaryOperator) (p, q) -> q > p ? tu : q < p ? td : tp) instanceof IntBinaryOperator cs
            && new int[n][m] instanceof int[][] rowR && new int[n][m] instanceof int[][] rowL && new int[n][m] instanceof int[][] cD && new int[n][m] instanceof int[][] cU
            && IntStream.range(0, n).allMatch(x -> IntStream.range(1, m).allMatch(y -> (rowR[x][y] = rowR[x][y - 1] + cs.applyAsInt(h[x][y - 1], h[x][y])) >= 0 && (rowL[x][y] = rowL[x][y - 1] + cs.applyAsInt(h[x][y], h[x][y - 1])) >= 0))
            && IntStream.range(1, n).allMatch(x -> IntStream.range(0, m).allMatch(y -> (cD[x][y] = cD[x - 1][y] + cs.applyAsInt(h[x - 1][y], h[x][y])) >= 0 && (cU[x][y] = cU[x - 1][y] + cs.applyAsInt(h[x][y], h[x - 1][y])) >= 0))
            && new int[n][m] instanceof int[][] PA && new int[n][m] instanceof int[][] PB && new int[n][m] instanceof int[][] QA && new int[n][m] instanceof int[][] QB
            && IntStream.range(0, n).allMatch(x -> IntStream.range(0, m).allMatch(y -> (PA[x][y] = rowR[x][y] - cD[x][y]) > Integer.MIN_VALUE && (PB[x][y] = cD[x][y] + rowL[x][y]) > Integer.MIN_VALUE
                && (QA[x][y] = -rowR[x][y] - cU[x][y]) > Integer.MIN_VALUE && (QB[x][y] = cU[x][y] - rowL[x][y]) > Integer.MIN_VALUE))
            && new long[4161] instanceof long[] bs && new int[262144] instanceof int[] idx && new long[]{Long.MAX_VALUE, 0, 0, 0, 0} instanceof long[] best
            && ((IntUnaryOperator) wd -> (wd << 6) + 63 - Long.numberOfLeadingZeros(bs[wd])) instanceof IntUnaryOperator last0
            && ((IntUnaryOperator) u -> last0.applyAsInt((u << 6) + 63 - Long.numberOfLeadingZeros(bs[4096 + u]))) instanceof IntUnaryOperator last1
            && ((IntUnaryOperator) wd -> (wd << 6) + Long.numberOfTrailingZeros(bs[wd])) instanceof IntUnaryOperator first0
            && ((IntUnaryOperator) u -> first0.applyAsInt((u << 6) + Long.numberOfTrailingZeros(bs[4096 + u]))) instanceof IntUnaryOperator first1
            && ((IntUnaryOperator) v -> (Long) (bs[v >> 6] & (-1L >>> (63 - (v & 63)))) instanceof Long m0 && m0 != 0 ? (v >> 6 << 6) + 63 - Long.numberOfLeadingZeros(m0)
                : (Long) (bs[4096 + (v >> 12)] & ((1L << ((v >> 6) & 63)) - 1)) instanceof Long m1 && m1 != 0 ? last0.applyAsInt((v >> 12 << 6) + 63 - Long.numberOfLeadingZeros(m1))
                : (Long) (bs[4160] & ((1L << (v >> 12)) - 1)) instanceof Long m2 && m2 != 0 ? last1.applyAsInt(63 - Long.numberOfLeadingZeros(m2)) : -1) instanceof IntUnaryOperator pred
            && ((IntUnaryOperator) v -> (Long) (bs[v >> 6] & (-1L << (v & 63))) instanceof Long m0 && m0 != 0 ? (v >> 6 << 6) + Long.numberOfTrailingZeros(m0)
                : (Long) (bs[4096 + (v >> 12)] & (-2L << ((v >> 6) & 63))) instanceof Long m1 && m1 != 0 ? first0.applyAsInt((v >> 12 << 6) + Long.numberOfTrailingZeros(m1))
                : (Long) (bs[4160] & (-2L << (v >> 12))) instanceof Long m2 && m2 != 0 ? first1.applyAsInt(Long.numberOfTrailingZeros(m2)) : -1) instanceof IntUnaryOperator succ
            && IntStream.range(0, n).allMatch(x1 -> PA[x1] instanceof int[] pa && QA[x1] instanceof int[] qa && IntStream.range(x1 + 2, n).allMatch(x2 -> PB[x2] instanceof int[] pb && QB[x2] instanceof int[] qb
                && IntStream.of(0).peek(z -> Arrays.fill(bs, 0L)).sum() == 0 && IntStream.range(2, m).allMatch(y2 ->
                (Integer) (qa[y2 - 2] + qb[y2 - 2] + 131072) instanceof Integer k && (idx[k] = y2 - 2) >= 0
                && (bs[k >> 6] |= 1L << (k & 63)) != 0 && (bs[4096 + (k >> 12)] |= 1L << ((k >> 6) & 63)) != 0 && (bs[4160] |= 1L << (k >> 12)) != 0
                && (Integer) (pa[y2] + pb[y2]) instanceof Integer sv && (Integer) (int) Math.max(0L, Math.min(262143L, (long) t - sv + 131072)) instanceof Integer vi
                && (Integer) pred.applyAsInt(vi) instanceof Integer pv && (Integer) succ.applyAsInt(vi) instanceof Integer nv
                && (pv < 0 || Math.abs((long) sv + pv - 131072 - t) >= best[0] || ((best[0] = Math.abs((long) sv + pv - 131072 - t)) >= 0 && (best[1] = x1) >= 0 && (best[2] = idx[pv]) >= 0 && (best[3] = x2) >= 0 && (best[4] = y2) >= 0))
                && (nv < 0 || Math.abs((long) sv + nv - 131072 - t) >= best[0] || ((best[0] = Math.abs((long) sv + nv - 131072 - t)) >= 0 && (best[1] = x1) >= 0 && (best[2] = idx[nv]) >= 0 && (best[3] = x2) >= 0 && (best[4] = y2) >= 0)))))
            ? (best[1] + 1) + " " + (best[2] + 1) + " " + (best[3] + 1) + " " + (best[4] + 1) : "");
    }
}




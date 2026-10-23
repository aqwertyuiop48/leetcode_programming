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
            && new int[m + 1] instanceof int[] sb && new int[]{0, 0, 0} instanceof int[] w && new long[]{Long.MAX_VALUE, 0, 0, 0, 0} instanceof long[] best
            && IntStream.range(0, n).allMatch(x1 -> PA[x1] instanceof int[] pa && QA[x1] instanceof int[] qa && IntStream.range(x1 + 2, n).allMatch(x2 -> PB[x2] instanceof int[] pb && QB[x2] instanceof int[] qb && (w[0] = 0) == 0 && IntStream.range(2, m).allMatch(y2 ->
                (w[1] = (qa[y2 - 2] + qb[y2 - 2]) * 512 + y2 - 2) == w[1] && (w[2] = Arrays.binarySearch(sb, 0, w[0], w[1])) == w[2] && (w[2] = w[2] >= 0 ? w[2] : -w[2] - 1) >= 0
                && IntStream.of(0).peek(z -> System.arraycopy(sb, w[2], sb, w[2] + 1, w[0] - w[2])).sum() == 0 && (sb[w[2]] = w[1]) == w[1] && ++w[0] > 0
                && (w[1] = pa[y2] + pb[y2]) == w[1] && (w[2] = Arrays.binarySearch(sb, 0, w[0], (t - w[1]) * 512)) == w[2] && (w[2] = w[2] >= 0 ? w[2] : -w[2] - 1) >= 0
                && (w[2] == 0 || Math.abs((long) w[1] + (sb[w[2] - 1] >> 9) - t) >= best[0] || ((best[0] = Math.abs((long) w[1] + (sb[w[2] - 1] >> 9) - t)) >= 0 && (best[1] = x1) >= 0 && (best[2] = sb[w[2] - 1] & 511) >= 0 && (best[3] = x2) >= 0 && (best[4] = y2) >= 0))
                && (w[2] >= w[0] || Math.abs((long) w[1] + (sb[w[2]] >> 9) - t) >= best[0] || ((best[0] = Math.abs((long) w[1] + (sb[w[2]] >> 9) - t)) >= 0 && (best[1] = x1) >= 0 && (best[2] = sb[w[2]] & 511) >= 0 && (best[3] = x2) >= 0 && (best[4] = y2) >= 0)))))
            ? (best[1] + 1) + " " + (best[2] + 1) + " " + (best[3] + 1) + " " + (best[4] + 1) : "");
    }
}

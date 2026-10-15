import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new long[nm[0]] instanceof long[] rx
                && new long[nm[0]] instanceof long[] ry
                && IntStream.range(0, nm[0]).allMatch(i -> (rx[i] = s.nextLong()) >= Long.MIN_VALUE && (ry[i] = s.nextLong()) >= Long.MIN_VALUE)
                && new long[nm[1]] instanceof long[] bx
                && new long[nm[1]] instanceof long[] by
                && IntStream.range(0, nm[1]).allMatch(i -> (bx[i] = s.nextLong()) >= Long.MIN_VALUE && (by[i] = s.nextLong()) >= Long.MIN_VALUE)
                && Integer.valueOf((nm[1] + 63) / 64) instanceof Integer W
                && new long[nm[0]][W] instanceof long[][] pos
                && new long[nm[0]][W] instanceof long[][] neg
                && IntStream.range(0, nm[0]).allMatch(a -> IntStream.range(0, nm[1]).allMatch(p ->
                    (Long.signum((rx[a] - rx[0]) * (by[p] - ry[0]) - (ry[a] - ry[0]) * (bx[p] - rx[0])) > 0
                        ? (pos[a][p >> 6] |= 1L << p) != 0
                        : Long.signum((rx[a] - rx[0]) * (by[p] - ry[0]) - (ry[a] - ry[0]) * (bx[p] - rx[0])) < 0 ? (neg[a][p >> 6] |= 1L << p) != 0 : true)))
                && new long[nm[0]][nm[0]] instanceof long[][] c
                && new int[4] instanceof int[] ctx
                && new LongToIntFunction[1] instanceof LongToIntFunction[] rec
                && (rec[0] = x -> x == 0 ? 0
                    : (Long.signum((rx[ctx[1]] - rx[ctx[0]]) * (by[ctx[3] + Long.numberOfTrailingZeros(x)] - ry[ctx[0]]) - (ry[ctx[1]] - ry[ctx[0]]) * (bx[ctx[3] + Long.numberOfTrailingZeros(x)] - rx[ctx[0]])) == ctx[2] ? 1 : 0)
                        + rec[0].applyAsInt(x & (x - 1))) != null
                && IntStream.range(0, nm[0]).allMatch(a -> IntStream.range(a + 1, nm[0]).allMatch(b ->
                    (ctx[0] = a) >= 0 && (ctx[1] = b) >= 0
                    && (ctx[2] = Long.signum((rx[a] - rx[0]) * (ry[b] - ry[0]) - (ry[a] - ry[0]) * (rx[b] - rx[0]))) > -2
                    && (c[a][b] = ctx[2] == 0 ? 0 : ctx[2] * IntStream.range(0, W).map(w ->
                        (ctx[3] = w * 64) >= 0 ? rec[0].applyAsInt(ctx[2] > 0 ? pos[a][w] & neg[b][w] : neg[a][w] & pos[b][w]) : 0).sum()) >= Long.MIN_VALUE
                    && (c[b][a] = -c[a][b]) >= Long.MIN_VALUE))
                ? IntStream.range(0, nm[0]).mapToLong(i -> IntStream.range(i + 1, nm[0]).mapToLong(j ->
                    c[i] instanceof long[] ci && c[j] instanceof long[] cj ? (long) IntStream.range(j + 1, nm[0]).map(k -> ci[j] + cj[k] - ci[k] == 0 ? 1 : 0).sum() : 0L).sum()).sum()
                : 0L)));
    }
}

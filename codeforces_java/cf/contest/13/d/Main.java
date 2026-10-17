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
                && new int[nm[0]][nm[0]] instanceof int[][] c
                && Integer.valueOf((nm[1] + 63) / 64) instanceof Integer W
                && new long[nm[0]][W] instanceof long[][] P
                && IntStream.range(1, nm[0]).allMatch(i -> IntStream.range(0, nm[1]).filter(p ->
                    (rx[i] - rx[0]) * (by[p] - ry[0]) - (ry[i] - ry[0]) * (bx[p] - rx[0]) > 0 && (P[i][p >> 6] |= 1L << p) != 0).count() >= 0)
                && IntStream.range(1, nm[0]).allMatch(i -> IntStream.range(i + 1, nm[0]).allMatch(j ->
                    (Integer) Long.signum((rx[i] - rx[0]) * (ry[j] - ry[0]) - (ry[i] - ry[0]) * (rx[j] - rx[0])) instanceof Integer o
                    && (c[i][j] = o * (int) IntStream.range(0, W).mapToLong(w ->
                        (Long) (o > 0 ? P[i][w] & ~P[j][w] : P[j][w] & ~P[i][w]) instanceof Long x && x != 0
                            ? LongStream.iterate(x, y -> y != 0, y -> y & (y - 1)).filter(y ->
                                Long.signum((rx[j] - rx[i]) * (by[w * 64 + Long.numberOfTrailingZeros(y)] - ry[i]) - (ry[j] - ry[i]) * (bx[w * 64 + Long.numberOfTrailingZeros(y)] - rx[i])) == o).count()
                            : 0L).sum()) > Integer.MIN_VALUE
                    && (c[j][i] = -c[i][j]) > Integer.MIN_VALUE))
                ? IntStream.range(1, nm[0]).mapToLong(i -> c[i] instanceof int[] ci ? IntStream.range(i + 1, nm[0]).mapToLong(j ->
                    (ci[j] == 0 ? 1L : 0L) + (c[j] instanceof int[] cj ? IntStream.range(j + 1, nm[0]).filter(k -> ci[j] + cj[k] - ci[k] == 0).count() : 0L)).sum() : 0L).sum()
                : 0L)));
    }
}


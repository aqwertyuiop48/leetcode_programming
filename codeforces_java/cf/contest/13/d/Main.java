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
                && new byte[nm[0]][nm[1]] instanceof byte[][] side
                && IntStream.range(1, nm[0]).allMatch(i -> IntStream.range(0, nm[1]).allMatch(p ->
                    (side[i][p] = (byte) Long.signum((rx[i] - rx[0]) * (by[p] - ry[0]) - (ry[i] - ry[0]) * (bx[p] - rx[0]))) != 2))
                && IntStream.range(1, nm[0]).allMatch(i -> IntStream.range(i + 1, nm[0]).allMatch(j ->
                    (Integer) Long.signum((rx[i] - rx[0]) * (ry[j] - ry[0]) - (ry[i] - ry[0]) * (rx[j] - rx[0])) instanceof Integer o
                    && (c[i][j] = o * (int) IntStream.range(0, nm[1]).filter(p ->
                        side[i][p] == o && side[j][p] == -o
                        && Long.signum((rx[j] - rx[i]) * (by[p] - ry[i]) - (ry[j] - ry[i]) * (bx[p] - rx[i])) == o).count()) > Integer.MIN_VALUE
                    && (c[j][i] = -c[i][j]) > Integer.MIN_VALUE))
                ? IntStream.range(1, nm[0]).mapToLong(i -> c[i] instanceof int[] ci ? IntStream.range(i + 1, nm[0]).mapToLong(j ->
                    (ci[j] == 0 ? 1L : 0L) + (c[j] instanceof int[] cj ? IntStream.range(j + 1, nm[0]).filter(k -> ci[j] + cj[k] - ci[k] == 0).count() : 0L)).sum() : 0L).sum()
                : 0L)));
    }
}

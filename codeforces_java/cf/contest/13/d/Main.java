import java.util.*;
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
                && IntStream.range(0, nm[0]).mapToObj(a -> IntStream.range(0, nm[1]).map(p ->
                    Long.signum((rx[a] - rx[0]) * (by[p] - ry[0]) - (ry[a] - ry[0]) * (bx[p] - rx[0]))).toArray()).toArray(int[][]::new) instanceof int[][] sg
                && new long[nm[0]][nm[0]] instanceof long[][] c
                && IntStream.range(0, nm[0]).allMatch(a -> IntStream.range(a + 1, nm[0]).allMatch(b ->
                    (Integer) Long.signum((rx[a] - rx[0]) * (ry[b] - ry[0]) - (ry[a] - ry[0]) * (rx[b] - rx[0])) instanceof Integer o
                    && (c[a][b] = o == 0 ? 0 : o * IntStream.range(0, nm[1]).filter(p ->
                        (o > 0 ? sg[a][p] > 0 && sg[b][p] < 0 : sg[a][p] < 0 && sg[b][p] > 0)
                        && Long.signum((rx[b] - rx[a]) * (by[p] - ry[a]) - (ry[b] - ry[a]) * (bx[p] - rx[a])) == o).count()) >= Long.MIN_VALUE
                    && (c[b][a] = -c[a][b]) >= Long.MIN_VALUE))
                ? IntStream.range(0, nm[0]).mapToLong(i -> IntStream.range(i + 1, nm[0]).mapToLong(j ->
                    c[i] instanceof long[] ci && c[j] instanceof long[] cj ? IntStream.range(j + 1, nm[0]).filter(k -> ci[j] + cj[k] - ci[k] == 0).count() : 0L).sum()).sum()
                : 0L)));
    }
}

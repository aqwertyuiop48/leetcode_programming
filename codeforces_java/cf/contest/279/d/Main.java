import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, i).map(p -> IntStream.rangeClosed(0, i - 1).filter(q -> a[q] == a[i] - a[p]).map(q -> 1 << q).sum()).toArray()).toArray(int[][]::new) instanceof int[][] qm
            && new boolean[1 << n] instanceof boolean[] reach && (reach[1] = true)
            && IntStream.range(0, n - 1).allMatch(i -> IntStream.range(1 << i, 1 << (i + 1)).filter(mask -> reach[mask]
                    && IntStream.iterate(mask, m -> m != 0, m -> m & (m - 1)).anyMatch(m -> (mask & qm[i + 1][Integer.numberOfTrailingZeros(m)]) != 0))
                .allMatch(mask -> (reach[mask | 1 << (i + 1)] = true)
                    && IntStream.iterate(mask, m -> m != 0, m -> m & (m - 1)).allMatch(m -> (reach[(mask ^ (m & -m)) | 1 << (i + 1)] = true))))
            ? IntStream.range(1 << (n - 1), 1 << n).filter(m -> reach[m]).map(Integer::bitCount).min().orElse(-1) : "");
    }
}

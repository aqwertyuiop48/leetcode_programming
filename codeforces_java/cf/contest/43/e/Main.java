import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            IntStream.range(0, a[0]).mapToObj(i -> Optional.of(s.nextInt()).map(k -> Optional.of(IntStream.range(0, 2 * k).map(x -> s.nextInt()).toArray()).map(r -> new int[][]{
                IntStream.range(0, k).map(j -> r[2 * j]).toArray(),
                IntStream.range(0, k).map(j -> r[2 * j + 1]).toArray(),
                IntStream.range(0, k).map(j -> IntStream.range(0, j).map(l -> r[2 * l + 1]).sum()).toArray()}).get()).get()).toArray(int[][][]::new) instanceof int[][][] cars
            && Arrays.stream(cars).map(c -> IntStream.range(0, c[0].length).mapToLong(j -> IntStream.range(0, j).mapToLong(l -> (long) c[0][l] * c[1][l]).sum()).toArray()).toArray(long[][]::new) instanceof long[][] pd
            && ((LongBinaryOperator) (i, T) ->
                T >= cars[(int) i][2][cars[(int) i][2].length - 1] + cars[(int) i][1][cars[(int) i][1].length - 1]
                    ? pd[(int) i][pd[(int) i].length - 1] + (long) cars[(int) i][0][cars[(int) i][0].length - 1] * cars[(int) i][1][cars[(int) i][1].length - 1]
                    : (Integer) Arrays.binarySearch(cars[(int) i][2], (int) T) instanceof Integer ix
                        && (Integer) (ix >= 0 ? ix : -ix - 2) instanceof Integer q
                        ? pd[(int) i][q] + (long) cars[(int) i][0][q] * (T - cars[(int) i][2][q])
                        : 0L) instanceof LongBinaryOperator pos
            ? IntStream.range(0, a[0]).mapToLong(i -> IntStream.range(i + 1, a[0]).mapToLong(j -> Optional.of(IntStream.concat(IntStream.concat(Arrays.stream(cars[i][2]), Arrays.stream(cars[j][2])),
                    IntStream.of(cars[i][2][cars[i][2].length - 1] + cars[i][1][cars[i][1].length - 1], cars[j][2][cars[j][2].length - 1] + cars[j][1][cars[j][1].length - 1])).sorted().distinct()
                    .mapToLong(T -> Long.signum(pos.applyAsLong(i, T) - pos.applyAsLong(j, T))).filter(x -> x != 0).toArray())
                .map(g -> IntStream.range(1, g.length).filter(q -> g[q] != g[q - 1]).count()).get()).sum()).sum()
            : 0L)));
    }
}

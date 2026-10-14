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
            && ((ToLongBiFunction<int[][], Integer>) (c, T) -> IntStream.range(0, c[0].length).mapToLong(j -> (long) c[0][j] * Math.max(0, Math.min(c[1][j], T - c[2][j]))).sum()) instanceof ToLongBiFunction<int[][], Integer> pos
            ? IntStream.range(0, a[0]).mapToLong(i -> IntStream.range(i + 1, a[0]).mapToLong(j -> Optional.of(IntStream.concat(IntStream.concat(Arrays.stream(cars[i][2]), Arrays.stream(cars[j][2])),
                    IntStream.of(cars[i][2][cars[i][2].length - 1] + cars[i][1][cars[i][1].length - 1], cars[j][2][cars[j][2].length - 1] + cars[j][1][cars[j][1].length - 1])).sorted().distinct()
                    .mapToLong(T -> Long.signum(pos.applyAsLong(cars[i], T) - pos.applyAsLong(cars[j], T))).filter(x -> x != 0).toArray())
                .map(g -> IntStream.range(1, g.length).filter(q -> g[q] != g[q - 1]).count()).get()).sum()).sum()
            : 0L)));
    }
}

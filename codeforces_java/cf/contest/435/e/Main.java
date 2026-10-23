import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> s.next().chars().map(c -> c - '0').toArray()).toArray(int[][]::new) instanceof int[][] g
            && new int[][][]{{{1, 2}, {3, 4}}, {{3, 4}, {1, 2}}, {{1, 3}, {2, 4}}, {{2, 4}, {1, 3}}, {{1, 4}, {2, 3}}, {{2, 3}, {1, 4}}} instanceof int[][][] pairs
            && ((Function<int[][], int[][]>) a -> Arrays.stream(pairs).map(pp -> IntStream.range(0, a.length).mapToObj(i -> IntStream.range(0, 2).mapToObj(ph -> IntStream.range(0, a[0].length).map(j -> pp[i % 2][(j + ph) % 2]).toArray())
                    .filter(row -> IntStream.range(0, a[0].length).allMatch(j -> a[i][j] == 0 || a[i][j] == row[j])).findFirst().orElse(null)).toArray(int[][]::new))
                .filter(res -> Arrays.stream(res).allMatch(Objects::nonNull)).findFirst().orElse(null)) instanceof Function<int[][], int[][]> solve
            ? solve.apply(g) instanceof int[][] r1 ? Arrays.stream(r1).map(row -> IntStream.of(row).mapToObj(String::valueOf).collect(Collectors.joining())).collect(Collectors.joining("\n"))
                : IntStream.range(0, m).mapToObj(j -> IntStream.range(0, n).map(i -> g[i][j]).toArray()).toArray(int[][]::new) instanceof int[][] gt && solve.apply(gt) instanceof int[][] r2
                    ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> String.valueOf(r2[j][i])).collect(Collectors.joining())).collect(Collectors.joining("\n")) : "0" : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> IntStream.generate(s::nextInt).limit(n).toArray()).toArray(int[][]::new) instanceof int[][] d
            && (Integer) s.nextInt() instanceof Integer k
            ? IntStream.range(0, k).mapToObj(q ->
                new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt()} instanceof int[] r
                && new long[1] instanceof long[] acc
                && IntStream.range(0, n).allMatch(i -> IntStream.range(i + 1, n).allMatch(j ->
                    (d[i][j] = d[j][i] = Math.min(d[i][j], Math.min(d[i][r[0]] + r[2] + d[r[1]][j], d[i][r[1]] + r[2] + d[r[0]][j]))) >= 0
                    && (acc[0] += d[i][j]) >= 0))
                ? String.valueOf(acc[0])
                : "").collect(Collectors.joining(" "))
            : ""));
    }
}





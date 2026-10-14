import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && new int[n + 1][n + 1] instanceof int[][] d
                && IntStream.rangeClosed(0, n).allMatch(i -> IntStream.rangeClosed(0, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000) >= 0))
                && IntStream.range(0, n - 1).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] e
                && Arrays.stream(e).allMatch(x -> (d[x[0]][x[1]] = d[x[1]][x[0]] = 1) > 0)
                && IntStream.rangeClosed(1, n).allMatch(k -> IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, n).allMatch(j -> (d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j])) >= 0)))
                && ((IntBinaryOperator) (u, v) -> IntStream.rangeClosed(1, n).filter(a -> d[a][u] < d[a][v])
                    .flatMap(a -> IntStream.rangeClosed(1, n).filter(b -> d[b][u] < d[b][v]).map(b -> d[a][b])).max().orElse(0)) instanceof IntBinaryOperator diam
                ? Arrays.stream(e).mapToLong(x -> (long) diam.applyAsInt(x[0], x[1]) * diam.applyAsInt(x[1], x[0])).max().orElse(0L)
                : 0L));
    }
}


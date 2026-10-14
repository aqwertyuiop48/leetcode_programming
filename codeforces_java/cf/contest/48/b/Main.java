import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                && new int[nm[0] + 1][nm[1] + 1] instanceof int[][] p
                && IntStream.range(0, nm[0]).allMatch(i -> IntStream.range(0, nm[1]).allMatch(j ->
                    (p[i + 1][j + 1] = s.nextInt() + p[i][j + 1] + p[i + 1][j] - p[i][j]) >= 0))
                && new int[]{s.nextInt(), s.nextInt()} instanceof int[] ab
                ? Stream.of(new int[]{ab[0], ab[1]}, new int[]{ab[1], ab[0]}).filter(d -> d[0] <= nm[0] && d[1] <= nm[1])
                    .flatMapToInt(d -> IntStream.rangeClosed(0, nm[0] - d[0]).flatMap(i -> IntStream.rangeClosed(0, nm[1] - d[1])
                        .map(j -> p[i + d[0]][j + d[1]] - p[i][j + d[1]] - p[i + d[0]][j] + p[i][j])))
                    .min().getAsInt()
                : -1));
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                IntStream.range(0, nm[0]).mapToObj(i -> s.next()).toArray(String[]::new) instanceof String[] grid
                && new long[nm[0] + 1][nm[1] + 1] instanceof long[][] pre
                && IntStream.rangeClosed(1, nm[0]).allMatch(i ->
                    IntStream.rangeClosed(1, nm[1]).allMatch(j ->
                        (pre[i][j] = (grid[i - 1].charAt(j - 1) == '1' ? 1 : 0) + pre[i - 1][j] + pre[i][j - 1] - pre[i - 1][j - 1]) >= 0))
                ? IntStream.rangeClosed(1, nm[0]).boxed()
                    .flatMap(r1 -> IntStream.rangeClosed(r1, nm[0]).boxed().flatMap(r2 ->
                        IntStream.rangeClosed(1, nm[1]).boxed().flatMap(c1 -> IntStream.rangeClosed(c1, nm[1]).mapToObj(c2 ->
                            new long[]{pre[r2][c2] - pre[r1 - 1][c2] - pre[r2][c1 - 1] + pre[r1 - 1][c1 - 1], r1, r2, c1, c2}))))
                    .filter(v -> v[0] == 0)
                    .mapToLong(v -> 2 * ((v[2] - v[1] + 1) + (v[4] - v[3] + 1)))
                    .max().orElse(0)
                : 0L)));
    }
}





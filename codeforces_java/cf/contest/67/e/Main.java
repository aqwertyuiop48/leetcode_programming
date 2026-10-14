import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new)).ifPresent(p ->
                System.out.print(Math.max(0, Math.min(Math.max(p[0][0], p[1][0]), IntStream.range(0, n).mapToLong(i -> Optional.of(p[(i + 1) % n][0] - p[i][0]).map(dx -> Optional.of(p[(i + 1) % n][1] - p[i][1]).map(dy -> Optional.of(dx * (p[0][1] - p[i][1])).map(r -> dy < 0 ? p[i][0] + Math.floorDiv(r, dy) : dy == 0 ? (r <= 0 ? 1L << 40 : -(1L << 40)) : 1L << 40).get()).get()).get()).min().getAsLong())
                    - Math.max(Math.min(p[0][0], p[1][0]), IntStream.range(0, n).mapToLong(i -> Optional.of(p[(i + 1) % n][0] - p[i][0]).map(dx -> Optional.of(p[(i + 1) % n][1] - p[i][1]).map(dy -> Optional.of(dx * (p[0][1] - p[i][1])).map(r -> dy > 0 ? p[i][0] - Math.floorDiv(-r, dy) : dy == 0 ? (r <= 0 ? -(1L << 40) : 1L << 40) : -(1L << 40)).get()).get()).get()).max().getAsLong()) + 1)))));
    }
}

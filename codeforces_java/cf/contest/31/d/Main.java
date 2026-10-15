import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] h
                && new boolean[h[0] + 2][h[1] + 2] instanceof boolean[][] vb
                && new boolean[h[0] + 2][h[1] + 2] instanceof boolean[][] hb
                && IntStream.range(0, h[2]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()})
                    .allMatch(c -> c[0] == c[2]
                        ? IntStream.range(Math.min(c[1], c[3]), Math.max(c[1], c[3])).allMatch(y -> (vb[c[0]][y] = true))
                        : IntStream.range(Math.min(c[0], c[2]), Math.max(c[0], c[2])).allMatch(x -> (hb[x][c[1]] = true)))
                && IntStream.range(0, (h[0] + 1) * (h[1] + 1)).toArray() instanceof int[] p
                && ((java.util.function.IntUnaryOperator) u -> IntStream.iterate(u, y -> p[y]).takeWhile(y -> p[y] != y).toArray() instanceof int[] path
                    && (Integer) (path.length == 0 ? u : p[path[path.length - 1]]) instanceof Integer r
                    && Arrays.stream(path).allMatch(y -> (p[y] = r) >= 0)
                    ? r : -1) instanceof java.util.function.IntUnaryOperator find
                && IntStream.range(0, h[0]).allMatch(x -> IntStream.range(0, h[1]).allMatch(y ->
                    (x + 1 >= h[0] || vb[x + 1][y] || (p[find.applyAsInt(x * h[1] + y)] = find.applyAsInt((x + 1) * h[1] + y)) >= 0)
                    && (y + 1 >= h[1] || hb[x][y + 1] || (p[find.applyAsInt(x * h[1] + y)] = find.applyAsInt(x * h[1] + y + 1)) >= 0)))
                ? IntStream.range(0, h[0] * h[1]).boxed().collect(Collectors.groupingBy(i -> find.applyAsInt(i), Collectors.counting()))
                    .values().stream().sorted().map(String::valueOf).collect(Collectors.joining(" "))
                : ""));
    }
}




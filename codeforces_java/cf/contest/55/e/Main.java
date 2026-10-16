import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] P
                && Optional.of(s.nextInt()) instanceof Optional<Integer> tq
                ? IntStream.range(0, tq.get()).mapToObj(q -> new long[]{s.nextLong(), s.nextLong()}).map(pt ->
                    ((LongBinaryOperator) (a, b) -> (P[(int) a][0] - pt[0]) * (P[(int) b][1] - pt[1]) - (P[(int) a][1] - pt[1]) * (P[(int) b][0] - pt[0])) instanceof LongBinaryOperator cr
                    && new int[n] instanceof int[] E
                    && IntStream.range(0, n).allMatch(i -> (P[(i + 1) % n][0] - P[i][0]) * (pt[1] - P[i][1]) - (P[(i + 1) % n][1] - P[i][1]) * (pt[0] - P[i][0]) < 0)
                    && IntStream.range(0, n).allMatch(i -> (E[i] = Math.max(i, i > 0 ? E[i - 1] : 0)) >= 0
                        && (E[i] += (int) IntStream.iterate(E[i], j -> j + 1 < i + n && cr.applyAsLong(i, (j + 1) % n) < 0, j -> j + 1).count()) >= 0)
                    ? String.valueOf((long) n * (n - 1) * (n - 2) / 6 - IntStream.range(0, n).mapToLong(i -> (long) (E[i] - i) * (E[i] - i - 1) / 2).sum())
                    : "0").collect(Collectors.joining("\n"))
                : "")));
    }
}




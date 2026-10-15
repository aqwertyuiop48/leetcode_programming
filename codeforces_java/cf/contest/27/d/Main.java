import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).map(e -> new int[]{Math.min(e[0], e[1]), Math.max(e[0], e[1])}).toArray(int[][]::new) instanceof int[][] r
            && new int[m] instanceof int[] col
            && ((BiPredicate<Integer, Integer>) (i, j) -> r[i][0] < r[j][0] && r[j][0] < r[i][1] && r[i][1] < r[j][1]
                || r[j][0] < r[i][0] && r[i][0] < r[j][1] && r[j][1] < r[i][1]) instanceof BiPredicate<Integer, Integer> cr
            && new AtomicReference<BiPredicate<Integer, Integer>>() instanceof AtomicReference<BiPredicate<Integer, Integer>> h
            && h.getAndSet((v, c) -> (col[v] = c) > 0 && IntStream.range(0, m).filter(u -> cr.test(v, u))
                .allMatch(u -> col[u] == 0 ? h.get().test(u, 3 - c) : col[u] != c)) == null
            && IntStream.range(0, m).allMatch(v -> col[v] != 0
                || (IntStream.range(0, m).noneMatch(u -> cr.test(v, u)) ? (col[v] = 2) > 0 : h.get().test(v, 1)))
            ? IntStream.of(col).mapToObj(c -> c == 1 ? "i" : "o").collect(Collectors.joining())
            : "Impossible"));

    }
}



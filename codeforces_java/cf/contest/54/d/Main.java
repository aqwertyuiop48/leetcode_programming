import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n -> Optional.of(sc.nextInt()).ifPresent(k -> Optional.of(sc.next()).ifPresent(p -> Optional.of(sc.next()).ifPresent(bits -> Optional.of(p.length()).ifPresent(L ->
            System.out.println(
                new int[L + 1][k] instanceof int[][] dl
                && IntStream.rangeClosed(0, L).allMatch(st -> IntStream.range(0, k).allMatch(c ->
                    (dl[st][c] = IntStream.iterate(Math.min(L, st + 1), t -> t >= 0, t -> t - 1).filter(t -> (p.substring(0, st) + (char) ('a' + c)).endsWith(p.substring(0, t))).findFirst().getAsInt()) >= 0))
                && new boolean[n + 1][L + 1] instanceof boolean[][] can
                && IntStream.rangeClosed(0, L).allMatch(st -> (can[n][st] = true))
                && ((Predicate<int[]>) q -> (q[0] < L - 1 || ((dl[q[1]][q[2]] == L) == (bits.charAt(q[0] - L + 1) == '1'))) && can[q[0] + 1][dl[q[1]][q[2]]]) instanceof Predicate<int[]> ok
                && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.rangeClosed(0, L).allMatch(st ->
                    (can[i][st] = IntStream.range(0, k).anyMatch(c -> ok.test(new int[]{i, st, c}))) || true))
                && new int[1] instanceof int[] cur
                ? (can[0][0]
                    ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, k).filter(c -> ok.test(new int[]{i, cur[0], c})).findFirst().getAsInt())
                        .map(c -> Optional.of(String.valueOf((char) ('a' + c))).filter(z -> (cur[0] = dl[cur[0]][c]) >= 0).get())
                        .collect(Collectors.joining())
                    : "No solution")
                : "")))))));
    }
}






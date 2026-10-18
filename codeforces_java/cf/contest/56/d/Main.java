import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.next()).ifPresent(a -> Optional.of(sc.next()).ifPresent(b -> Optional.of(a.length()).ifPresent(n -> Optional.of(b.length()).ifPresent(m ->
            System.out.println(
                new int[n + 1][m + 1] instanceof int[][] d
                && IntStream.rangeClosed(0, n).allMatch(i -> IntStream.rangeClosed(0, m).allMatch(j ->
                    (d[i][j] = i == 0 ? j : j == 0 ? i : Math.min(d[i - 1][j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1), Math.min(d[i - 1][j], d[i][j - 1]) + 1)) >= 0))
                && ((ToIntFunction<int[]>) p -> p[0] > 0 && p[1] > 0 && d[p[0]][p[1]] == d[p[0] - 1][p[1] - 1] + (a.charAt(p[0] - 1) == b.charAt(p[1] - 1) ? 0 : 1)
                    ? (a.charAt(p[0] - 1) == b.charAt(p[1] - 1) ? 0 : 1)
                    : p[0] > 0 && d[p[0]][p[1]] == d[p[0] - 1][p[1]] + 1 ? 2 : 3) instanceof ToIntFunction<int[]> dec
                ? d[n][m] + Stream.iterate(new int[]{n, m}, p -> p[0] > 0 || p[1] > 0, p -> new int[]{p[0] - new int[]{1, 1, 1, 0}[dec.applyAsInt(p)], p[1] - new int[]{1, 1, 0, 1}[dec.applyAsInt(p)]})
                    .filter(p -> dec.applyAsInt(p) != 0)
                    .map(p -> dec.applyAsInt(p) == 1 ? "\nREPLACE " + p[0] + " " + b.charAt(p[1] - 1) : dec.applyAsInt(p) == 2 ? "\nDELETE " + p[0] : "\nINSERT " + (p[0] + 1) + " " + b.charAt(p[1] - 1))
                    .collect(Collectors.joining())
                : ""))))));
    }
}





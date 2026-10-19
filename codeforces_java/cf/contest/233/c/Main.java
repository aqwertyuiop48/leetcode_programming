import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Integer.valueOf(IntStream.rangeClosed(3, 100).filter(m -> m * (m - 1) * (m - 2) / 6 <= k).max().getAsInt()) instanceof Integer m
            && new boolean[100][100] instanceof boolean[][] g
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, m).allMatch(j -> i == j || (g[i][j] = true)))
            && new int[]{k - m * (m - 1) * (m - 2) / 6, m} instanceof int[] st
            && IntStream.iterate(0, x -> st[0] > 0, x -> x + 1).allMatch(x -> Integer.valueOf(IntStream.rangeClosed(2, st[1]).filter(j -> j * (j - 1) / 2 <= st[0]).max().getAsInt()) instanceof Integer j
                && IntStream.range(0, j).allMatch(v -> (g[st[1]][v] = g[v][st[1]] = true))
                && (st[0] -= j * (j - 1) / 2) >= 0 && ++st[1] > 0)
            ? st[1] + "\n" + IntStream.range(0, st[1]).mapToObj(i -> IntStream.range(0, st[1]).mapToObj(j -> g[i][j] ? "1" : "0").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}

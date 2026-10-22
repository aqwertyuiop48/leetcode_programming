import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && new char[n + 2][m + 2] instanceof char[][] g
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> g[i][j] != 0
                || Integer.valueOf(IntStream.rangeClosed('A', 'Z').filter(x -> x != g[i - 1][j] && x != g[i][j - 1] && x != g[i][j + 1]).findFirst().getAsInt()) instanceof Integer c
                && Integer.valueOf(IntStream.iterate(1, k -> k + 1).filter(k -> !(i + k <= n && j + k <= m && g[i][j + k] == 0 && c != g[i - 1][j + k] && c != g[i][j + k + 1]
                    && c < IntStream.rangeClosed('A', 'Z').filter(d -> d != c && d != g[i - 1][j + k] && d != g[i][j + k + 1]).findFirst().getAsInt())).findFirst().getAsInt()) instanceof Integer k
                && IntStream.range(0, k).allMatch(a -> IntStream.range(0, k).allMatch(b -> (g[i + a][j + b] = (char) (int) c) > 0))))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> new String(g[i], 1, m)).collect(Collectors.joining("\n")) : "");
    }
}

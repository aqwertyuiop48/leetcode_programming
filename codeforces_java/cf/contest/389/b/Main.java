import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next().toCharArray()).toArray(char[][]::new) instanceof char[][] g
            ? IntStream.range(0, n * n).allMatch(p -> Integer.valueOf(p / n) instanceof Integer i && Integer.valueOf(p % n) instanceof Integer j
                && (g[i][j] != '#' || i + 2 < n && j > 0 && j + 1 < n
                    && g[i + 1][j - 1] == '#' && g[i + 1][j] == '#' && g[i + 1][j + 1] == '#' && g[i + 2][j] == '#'
                    && (g[i][j] = g[i + 1][j - 1] = g[i + 1][j] = g[i + 1][j + 1] = g[i + 2][j] = '.') == '.')) ? "YES" : "NO" : "");
    }
}

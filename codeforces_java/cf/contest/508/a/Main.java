import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && new boolean[n + 3][m + 3] instanceof boolean[][] g
            ? IntStream.rangeClosed(1, k).filter(i -> (Integer) s.nextInt() instanceof Integer x && (Integer) s.nextInt() instanceof Integer y && (g[x][y] = true)
                && IntStream.rangeClosed(-1, 0).anyMatch(dx -> IntStream.rangeClosed(-1, 0).anyMatch(dy ->
                    x + dx >= 1 && y + dy >= 1 && x + dx + 1 <= n && y + dy + 1 <= m
                    && g[x + dx][y + dy] && g[x + dx + 1][y + dy] && g[x + dx][y + dy + 1] && g[x + dx + 1][y + dy + 1]))).findFirst().orElse(0) : 0);
    }
}

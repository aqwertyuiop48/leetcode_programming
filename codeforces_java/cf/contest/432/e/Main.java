import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && new int[n + 2][m + 2] instanceof int[][] g
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> g[i][j] != 0 || (Integer) IntStream.rangeClosed(1, 26).filter(l -> g[i - 1][j] != l && g[i + 1][j] != l && g[i][j - 1] != l && g[i][j + 1] != l).findFirst().getAsInt() instanceof Integer c
                && new int[]{1} instanceof int[] sz
                && ((IntPredicate) t -> i + t - 1 <= n && j + t - 1 <= m
                    && IntStream.range(0, t).allMatch(q -> g[i + q][j + t - 1] == 0 && g[i + t - 1][j + q] == 0)
                    && IntStream.range(0, t).allMatch(q -> g[i - 1][j + q] != c && g[i + t][j + q] != c && g[i + q][j - 1] != c && g[i + q][j + t] != c)
                    && IntStream.rangeClosed(1, 26).filter(l -> l != c && g[i - 1][j + t - 1] != l && g[i][j + t] != l && g[i + 1][j + t - 1] != l).findFirst().getAsInt() > c) instanceof IntPredicate ok
                && (IntStream.range(0, 200).anyMatch(step -> !(ok.test(sz[0] + 1) && ++sz[0] > 0)) || true)
                && IntStream.range(0, sz[0]).allMatch(a -> IntStream.range(0, sz[0]).allMatch(b -> (g[i + a][j + b] = c) > 0))))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, m).mapToObj(j -> String.valueOf((char) ('A' + g[i][j] - 1))).collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}

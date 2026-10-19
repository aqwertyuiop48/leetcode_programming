import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer k
            && new long[n + 2][m + 2] instanceof long[][] a && new long[n + 2][m + 2] instanceof long[][] d1 && new long[n + 2][m + 2] instanceof long[][] d2
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (a[i][j] = it.nextInt()) >= 0))
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (d1[i][j] = a[i][j] + d1[i - 1][j - 1]) >= 0 && (d2[i][j] = a[i][j] + d2[i - 1][j + 1]) >= 0))
            && ((BiFunction<Integer, Integer, Long>) (x, y) -> d1[x][y + k] - d1[x - k][y] + d2[x + k - 1][y + 1] - d2[x][y + k]
                - (d2[x][y - k + 1] - d2[x - k][y + 1] + d1[x + k - 1][y] - d1[x][y - k + 1])) instanceof BiFunction<Integer, Integer, Long> hor
            && ((BiFunction<Integer, Integer, Long>) (x, y) -> d1[x + k][y] - d1[x][y - k] + d2[x + k - 1][y + 1] - d2[x][y + k]
                - (d2[x][y - k + 1] - d2[x - k][y + 1] + d1[x][y + k - 1] - d1[x - k + 1][y])) instanceof BiFunction<Integer, Integer, Long> ver
            && new long[]{IntStream.range(0, 2 * k - 1).mapToLong(i -> IntStream.range(Math.abs(i - k + 1) + 1, 2 * k - Math.abs(i - k + 1)).mapToLong(j -> a[i + 1][j]).sum()).sum(), 0} instanceof long[] cur
            && new long[]{-1} instanceof long[] best && new int[2] instanceof int[] arg
            && IntStream.rangeClosed(k, n - k + 1).allMatch(x -> (x == k || (cur[0] += ver.apply(x - 1, k)) >= 0) && (cur[1] = cur[0]) >= 0
                && (cur[1] <= best[0] || (best[0] = cur[1]) >= 0 && (arg[0] = x) > 0 && (arg[1] = k) > 0)
                && IntStream.rangeClosed(k + 1, m - k + 1).allMatch(y -> (cur[1] += hor.apply(x, y - 1)) >= 0 && (cur[1] <= best[0] || (best[0] = cur[1]) >= 0 && (arg[0] = x) > 0 && (arg[1] = y) > 0)))
            ? arg[0] + " " + arg[1] : "");
    }
}

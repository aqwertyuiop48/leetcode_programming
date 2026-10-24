import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer it
            && ((IntSupplier) () -> Integer.parseInt(it.nextToken())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).map(j -> rd.getAsInt()).toArray()).toArray(int[][]::new) instanceof int[][] a
            && new int[1] instanceof int[] run && IntStream.range(0, n).mapToObj(i -> IntStream.rangeClosed(0, m).map(j -> j == 0 ? (run[0] = 0) : (run[0] += a[i][j - 1])).toArray()).toArray(int[][]::new) instanceof int[][] rp
            && IntStream.range(0, m).mapToObj(j -> IntStream.rangeClosed(0, n).map(i -> i == 0 ? (run[0] = 0) : (run[0] += a[i - 1][j])).toArray()).toArray(int[][]::new) instanceof int[][] cp
            && Integer.valueOf(Math.min(n, m)) instanceof Integer lim
            && new int[lim / 2 + 2][][] instanceof int[][][] layer
            && (layer[0] = a) != null
            && new int[]{Integer.MIN_VALUE} instanceof int[] best
            ? IntStream.rangeClosed(1, (lim - 1) / 2).allMatch(t -> Integer.valueOf(2 * t + 1) instanceof Integer k
                && (layer[t] = IntStream.rangeClosed(0, n - k).mapToObj(i -> IntStream.rangeClosed(0, m - k).map(j ->
                    rp[i][j + k] - rp[i][j] + rp[i + k - 1][j + k] - rp[i + k - 1][j] + cp[j][i + k - 1] - cp[j][i + 1] + cp[j + k - 1][i + k - 1] - cp[j + k - 1][i + 1]
                    - a[i + 1][j] + (k >= 5 ? a[i + 2][j + 1] + layer[t - 2][i + 2][j + 2] : 0)).toArray()).toArray(int[][]::new)) != null
                && (best[0] = Math.max(best[0], Arrays.stream(layer[t]).flatMapToInt(Arrays::stream).max().getAsInt())) > Integer.MIN_VALUE
                && (t < 2 || (layer[t - 2] = null) == null)) ? best[0] : 0
            : 0);
    }
}

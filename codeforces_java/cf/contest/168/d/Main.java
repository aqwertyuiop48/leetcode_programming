import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer l
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToDouble(i -> s.nextInt() / 100.0).toArray() instanceof double[] p
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new double[n + 2][2 * n + 1] instanceof double[][] init
            && (init[0][Math.min(k, n) + n] = 1) == 1
            && new double[][][]{init} instanceof double[][][] cur
            && IntStream.range(0, n).allMatch(i -> new double[n + 2][2 * n + 1] instanceof double[][] nx
                && IntStream.rangeClosed(0, i).allMatch(j -> IntStream.rangeClosed(0, 2 * n).allMatch(c ->
                    cur[0][j][c] == 0
                    || ((nx[j][c] += cur[0][j][c] * (1 - p[i])) >= 0
                        && (nx[j + 1][Math.min(2 * n, c + (a[i] == -1 ? -1 : a[i]))] += cur[0][j][c] * p[i]) >= 0)))
                && (cur[0] = nx) != null)
            ? String.format("%.12f", IntStream.rangeClosed(l, n).mapToDouble(j -> IntStream.rangeClosed(n, 2 * n).mapToDouble(c -> cur[0][j][c]).sum()).sum())
            : "");
    }
}

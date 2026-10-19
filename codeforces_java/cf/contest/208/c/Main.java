import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new int[n + 1][n + 1] instanceof int[][] d && new double[n + 1][n + 1] instanceof double[][] c
            && IntStream.rangeClosed(1, n).allMatch(i -> Arrays.stream(d[i]).max().getAsInt() == 0 && IntStream.rangeClosed(1, n).allMatch(j -> (d[i][j] = i == j ? 0 : 1000000) >= 0 && (c[i][j] = i == j ? 1 : 0) >= 0))
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b
                && (d[a][b] = d[b][a] = 1) == 1 && (c[a][b] = c[b][a] = 1) == 1)
            && IntStream.rangeClosed(1, n).allMatch(k -> IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, n).allMatch(j ->
                d[i][k] + d[k][j] < d[i][j] ? (d[i][j] = d[i][k] + d[k][j]) > 0 && (c[i][j] = c[i][k] * c[k][j]) >= 0
                    : d[i][k] + d[k][j] == d[i][j] && k != i && k != j ? (c[i][j] += c[i][k] * c[k][j]) >= 0 : true)))
            ? String.format("%.12f", IntStream.rangeClosed(1, n).filter(v -> d[1][v] + d[v][n] == d[1][n]).mapToDouble(v -> c[1][v] * c[v][n] / c[1][n] * (v == 1 || v == n ? 1 : 2)).max().getAsDouble()) : "");
    }
}

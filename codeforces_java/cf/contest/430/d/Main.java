import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[n + 2][m + 2] instanceof int[][] a && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (a[i][j] = Integer.parseInt(tk.nextToken())) >= 0))
            && new int[n + 2][m + 2] instanceof int[][] d1 && new int[n + 2][m + 2] instanceof int[][] d2 && new int[n + 2][m + 2] instanceof int[][] d3 && new int[n + 2][m + 2] instanceof int[][] d4
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (d1[i][j] = a[i][j] + Math.max(d1[i - 1][j], d1[i][j - 1])) >= 0))
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(i -> IntStream.rangeClosed(1, m).map(j -> m + 1 - j).allMatch(j -> (d2[i][j] = a[i][j] + Math.max(d2[i + 1][j], d2[i][j + 1])) >= 0))
            && IntStream.rangeClosed(1, n).map(i -> n + 1 - i).allMatch(i -> IntStream.rangeClosed(1, m).allMatch(j -> (d3[i][j] = a[i][j] + Math.max(d3[i + 1][j], d3[i][j - 1])) >= 0))
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.rangeClosed(1, m).map(j -> m + 1 - j).allMatch(j -> (d4[i][j] = a[i][j] + Math.max(d4[i - 1][j], d4[i][j + 1])) >= 0))
            ? IntStream.rangeClosed(2, n - 1).flatMap(i -> IntStream.rangeClosed(2, m - 1).flatMap(j -> IntStream.of(d1[i][j - 1] + d2[i][j + 1] + d3[i + 1][j] + d4[i - 1][j], d1[i - 1][j] + d2[i + 1][j] + d3[i][j - 1] + d4[i][j + 1]))).max().getAsInt() : 0);
    }
}

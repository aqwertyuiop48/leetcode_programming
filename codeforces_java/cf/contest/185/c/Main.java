import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new int[n][n + 2] instanceof int[][] f
            && IntStream.range(0, n).map(i -> f[0][i + 1] = s.nextInt()).max().isPresent()
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).map(k -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] w
            && IntStream.range(0, n * n).map(t -> t / n < n - 1 && t % n < n - t / n && f[t / n][t % n + 1] >= w[t / n][t % n]
                ? (f[t / n + 1][t % n] += f[t / n][t % n + 1]) + (f[t / n + 1][t % n + 1] += f[t / n][t % n + 1]) : 0).max().isPresent()
            ? f[n - 1][1] >= w[n - 1][0] ? "Cerealguy" : "Fat Rat" : "");
    }
}

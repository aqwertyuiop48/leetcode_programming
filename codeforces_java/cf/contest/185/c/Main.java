import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).map(k -> s.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] w
            && new int[n * n * n * n] instanceof int[] g
            && IntStream.range(0, n).map(j -> g[(j * n + j) * n + j] = a[j] >= w[0][j] ? a[j] : 0).max().isPresent()
            && IntStream.rangeClosed(1, n).map(i -> i == n ? 0 : IntStream.range(0, n - i).map(j -> (Integer) (((i - 1) * n + j) * n * n) instanceof Integer p && (Integer) (((i - 1) * n + j + 1) * n * n) instanceof Integer q
                ? IntStream.rangeClosed(j, j + i).map(x -> IntStream.rangeClosed(x, j + i).map(y -> g[((i * n + j) * n + x) * n + y] = (Integer) Math.max(Math.max(x <= j + i - 1 ? g[p + x * n + Math.min(y, j + i - 1)] : 0, y >= j + 1 ? g[q + Math.max(x, j + 1) * n + y] : 0),
                    IntStream.range(x, y).map(m -> g[p + x * n + m] + g[q + (m + 1) * n + y]).max().orElse(0)) instanceof Integer b ? (b >= w[i][j] ? b : 0) : 0).max().getAsInt()).max().getAsInt() : 0).max().getAsInt()).max().isPresent()
            ? g[(n - 1) * n * n * n + n - 1] > 0 ? "Cerealguy" : "Fat Rat" : "");
    }
}

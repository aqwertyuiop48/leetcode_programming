import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).mapToLong(k -> s.nextLong()).toArray()).toArray(long[][]::new) instanceof long[][] w
            && new long[n + 1][n + 2] instanceof long[][] r && IntStream.range(0, n).allMatch(j -> (r[0][j] = a[j]) > 0)
            && IntStream.range(0, n - 1).allMatch(i -> IntStream.range(0, n - i).allMatch(j -> r[i][j] < w[i][j] || ((j == 0 || (r[i + 1][j - 1] += r[i][j]) > 0) & (j > n - i - 2 || (r[i + 1][j] += r[i][j]) > 0))))
            ? r[n - 1][0] >= w[n - 1][0] ? "Cerealguy" : "Fat Rat" : "");
    }


}

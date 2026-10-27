import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).mapToLong(k -> s.nextLong()).toArray()).toArray(long[][]::new) instanceof long[][] w
            && new long[n + 1][n + 2] instanceof long[][] load && IntStream.range(0, n).allMatch(k -> (load[0][k] = a[k]) > 0)
            ? IntStream.range(0, n).allMatch(i -> IntStream.range(0, n - i).allMatch(k -> load[i][k] < w[i][k]
                || i < n - 1 && (k == 0 || (load[i + 1][k - 1] += load[i][k]) > 0) && (k >= n - i - 1 || (load[i + 1][k] += load[i][k]) > 0)))
                ? "Fat Rat" : "Cerealguy" : "");
    }
}


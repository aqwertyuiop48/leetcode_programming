import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, n + 1).map(i -> i == 0 || i == n + 1 ? 0 : s.nextInt()).toArray() instanceof int[] a
            && new long[n + 3][n + 3] instanceof long[][] f && Arrays.stream(f).allMatch(row -> IntStream.range(0, row.length).allMatch(j -> (row[j] = 1) > 0))
            && IntStream.iterate(n, l -> l >= 2, l -> l - 1).allMatch(l -> IntStream.rangeClosed(l, n).allMatch(r ->
                (f[l][r] = IntStream.rangeClosed(l, r).mapToLong(k -> f[l + 1][k] * (k == r ? 1 : a[l] < a[k + 1] ? f[k + 1][r] : 0) % 1000000007L).sum() % 1000000007L) >= 0))
            ? f[2][n] : 0);
    }
}

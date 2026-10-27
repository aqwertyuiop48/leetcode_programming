import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, 10).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[n + 2][n + 2] instanceof long[][] C
            && IntStream.rangeClosed(0, n + 1).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % M) >= 0))
            ? Arrays.stream(IntStream.iterate(9, d -> d >= 0, d -> d - 1).boxed().reduce(IntStream.rangeClosed(0, n).mapToLong(l -> l == 0 ? 1 : 0).toArray(),
                (f, d) -> IntStream.rangeClosed(0, n).mapToLong(len -> d == 0 && len == 0 ? 0 : IntStream.rangeClosed(a[d], len).filter(c -> d != 0 || c <= len - 1).mapToLong(c -> f[len - c] * C[d == 0 ? len - 1 : len][c] % M).sum() % M).toArray(), (x, y) -> x))
                .skip(1).sum() % M : "");
    }
}


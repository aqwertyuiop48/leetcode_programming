import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long P && Integer.valueOf(2 * k + 3) instanceof Integer D
            && Stream.iterate(new long[]{1}, r -> IntStream.rangeClosed(0, r.length).mapToLong(c -> ((c > 0 ? r[c - 1] : 0) + (c < r.length ? r[c] : 0)) % P).toArray()).limit(k + 1).toArray(long[][]::new) instanceof long[][] bin
            && IntStream.range(0, D).mapToObj(i -> IntStream.range(0, D).mapToLong(c -> i <= k ? (c <= i ? bin[i][c] : 0) + (c >= k + 1 && c - k - 1 <= i ? bin[i][c - k - 1] : 0)
                : i <= 2 * k + 1 ? (c <= i - k - 1 ? bin[i - k - 1][c] : 0)
                : (c <= k ? bin[k][c] : c <= 2 * k + 1 ? bin[k][c - k - 1] : 1)).toArray()).toArray(long[][]::new) instanceof long[][] M0
            && ((BinaryOperator<long[][]>) (A, B) -> IntStream.range(0, D).mapToObj(i -> IntStream.range(0, D).mapToLong(j -> IntStream.range(0, D).mapToLong(c -> A[i][c] * B[c][j] % P).sum() % P).toArray()).toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            && IntStream.range(0, D).mapToObj(i -> IntStream.range(0, D).mapToLong(j -> i == j ? 1 : 0).toArray()).toArray(long[][]::new) instanceof long[][] I
            && IntStream.iterate(60, b -> b >= 0, b -> b - 1).boxed().reduce(I, (r, b) -> mul.apply(r, r) instanceof long[][] sq ? ((n - 1) >> b & 1) == 1 ? mul.apply(sq, M0) : sq : r, (x, y) -> x) instanceof long[][] R
            ? Arrays.stream(R[2 * k + 2]).sum() % P : "");
    }
}

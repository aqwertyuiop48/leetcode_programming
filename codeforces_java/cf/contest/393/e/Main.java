import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M && Integer.valueOf(2 * k + 3) instanceof Integer m && new long[k + 1][k + 1] instanceof long[][] C
            && IntStream.rangeClosed(0, k).allMatch(i -> IntStream.rangeClosed(0, k).allMatch(j -> (C[i][j] = j == 0 ? 1 : i == 0 ? 0 : (C[i - 1][j - 1] + C[i - 1][j]) % M) >= 0))
            && IntStream.range(0, m).mapToObj(r -> IntStream.range(0, m).mapToLong(c -> r <= k ? (c <= k ? C[r][c] : c <= 2 * k + 1 ? C[r][c - k - 1] : 0)
                : r <= 2 * k + 1 ? (c <= k ? C[r - k - 1][c] : 0) : (c == 2 * k + 2 ? 1 : c <= k ? C[k][c] : C[k][c - k - 1])).toArray()).toArray(long[][]::new) instanceof long[][] mx
            && ((BinaryOperator<long[][]>) (A, B) -> IntStream.range(0, m).mapToObj(i -> IntStream.range(0, m).mapToLong(j -> IntStream.range(0, m).mapToLong(l -> A[i][l] * B[l][j] % M).sum() % M).toArray()).toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            && IntStream.rangeClosed(0, 57).map(i -> 57 - i).boxed().reduce(IntStream.range(0, m).mapToObj(i -> IntStream.range(0, m).mapToLong(j -> i == j ? 1 : 0).toArray()).toArray(long[][]::new),
                (r, b) -> ((n - 1) >> b & 1) == 1 ? mul.apply(mul.apply(r, r), mx) : mul.apply(r, r), (x, y) -> x) instanceof long[][] P
            ? (P[2 * k + 2][2 * k + 2] + IntStream.rangeClosed(0, 2 * k + 1).mapToLong(j -> P[2 * k + 2][j]).sum()) % M : "");
    }
}

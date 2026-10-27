import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            && new long[m][m] instanceof long[][] t
            && IntStream.range(0, m).allMatch(i -> IntStream.range(0, m).allMatch(j -> (t[i][j] = 1) == 1))
            && IntStream.range(0, k).allMatch(i -> s.next() instanceof String p && (t[p.charAt(0) <= 'Z' ? p.charAt(0) - 'A' + 26 : p.charAt(0) - 'a'][p.charAt(1) <= 'Z' ? p.charAt(1) - 'A' + 26 : p.charAt(1) - 'a'] = 0) == 0)
            && ((BinaryOperator<long[][]>) (A, B) -> IntStream.range(0, m).mapToObj(i -> IntStream.range(0, m).mapToLong(j -> IntStream.range(0, m).mapToLong(l -> A[i][l] * B[l][j] % M).sum() % M).toArray()).toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            ? Arrays.stream(IntStream.iterate(60, i -> i >= 0, i -> i - 1).boxed().reduce(IntStream.range(0, m).mapToObj(i -> LongStream.range(0, m).map(j -> i == j ? 1 : 0).toArray()).toArray(long[][]::new),
                (r, i) -> (n - 1 >> i & 1) == 1 ? mul.apply(mul.apply(r, r), t) : mul.apply(r, r), (x, y) -> x)).mapToLong(row -> Arrays.stream(row).sum() % M).sum() % M : "");
    }
}


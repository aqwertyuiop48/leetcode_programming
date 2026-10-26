import java.util.*;
import java.util.stream.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToLong(j -> s.nextLong()).toArray()).toArray(long[][]::new) instanceof long[][] w
            && (Long) IntStream.range(0, n * m).mapToLong(t -> Math.abs(w[t / m][t % m] + w[0][0] - w[t / m][0] - w[0][t % m]))
                .reduce(0L, (x, y) -> BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue()) instanceof Long g
            && (Long) Stream.of(w).flatMapToLong(Arrays::stream).max().getAsLong() instanceof Long mx
            && (Long) (g == 0 ? mx + 1 : g) instanceof Long k
            ? k <= mx ? "NO"
                : "YES\n" + k + "\n" + IntStream.range(0, n).mapToObj(i -> String.valueOf(((w[i][0] - w[0][0]) % k + k) % k)).collect(Collectors.joining(" "))
                    + "\n" + IntStream.range(0, m).mapToObj(j -> String.valueOf(w[0][j] % k)).collect(Collectors.joining(" "))
            : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && Integer.valueOf(s.nextInt()) instanceof Integer c
            && Integer.valueOf(Math.max(a, Math.max(b, c))) instanceof Integer N
            && new int[N + 1][N + 1] instanceof int[][] gg && new boolean[N + 1][N + 1] instanceof boolean[][] cop
            && IntStream.rangeClosed(0, N).allMatch(i -> IntStream.rangeClosed(0, N).allMatch(j -> (gg[i][j] = i == 0 ? j : j == 0 ? i : i >= j ? gg[i - j][j] : gg[i][j - i]) >= 0 && (cop[i][j] = gg[i][j] == 1) | true))
            && new int[N + 1] instanceof int[] mu
            && IntStream.rangeClosed(1, N).allMatch(d -> (mu[d] = d == 1 ? 1 : IntStream.rangeClosed(2, d).filter(p -> d % p == 0 && IntStream.rangeClosed(2, (int) Math.sqrt(p)).noneMatch(q -> p % q == 0)).map(p -> d % ((long) p * p) == 0 ? 0 : -1).reduce(1, (x, y) -> x * y)) > -2)
            ? Long.valueOf(IntStream.rangeClosed(1, a).mapToLong(x -> (a / x) * IntStream.rangeClosed(1, Math.min(b, c)).filter(d -> mu[d] != 0 && cop[d][x]).mapToLong(d ->
                mu[d] * (IntStream.iterate(d, y -> y <= b, y -> y + d).filter(y -> cop[y][x]).mapToLong(y -> b / y).sum() % (1L << 30)) * (IntStream.iterate(d, z -> z <= c, z -> z + d).filter(z -> cop[z][x]).mapToLong(z -> c / z).sum() % (1L << 30)) % (1L << 30)).sum() % (1L << 30)).sum() % (1L << 30)) instanceof Long tot ? Math.floorMod(tot, 1L << 30) : "" : "");
    }
}

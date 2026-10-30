import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).mapToLong(k -> s.nextLong()).toArray()).toArray(long[][]::new) instanceof long[][] w
            && IntStream.range(0, n).filter(t -> a[t] >= w[0][t]).toArray() instanceof int[] act
            && (Integer) act.length instanceof Integer q
            && new long[q + 1] instanceof long[] pre && IntStream.range(0, q).allMatch(x -> (pre[x + 1] = pre[x] + a[act[x]]) >= 0)
            && new long[n][][] instanceof long[][][] ok
            && (ok[0] = new long[n][q]) != null && IntStream.range(0, q).allMatch(x -> (ok[0][act[x]][x] = 1L << x) > 0)
            && IntStream.range(1, n).allMatch(i -> (ok[i] = new long[n - i][q]) != null
                && IntStream.range(0, n - i).allMatch(k -> IntStream.range(0, q).allMatch(x ->
                    (ok[i][k][x] = IntStream.range(x, q).filter(y -> act[x] >= k && act[y] <= k + i && pre[y + 1] - pre[x] >= w[i][k]).mapToLong(y -> 1L << y).reduce(0L, (p, c) -> p | c)
                        & (ok[i - 1][k][x] | ok[i - 1][k + 1][x]
                            | IntStream.range(x, q - 1).filter(m -> (ok[i - 1][k][x] >> m & 1L) == 1L).mapToLong(m -> ok[i - 1][k + 1][m + 1]).reduce(0L, (p, c) -> p | c))) >= 0)))
            && IntStream.range(0, q).anyMatch(x -> ok[n - 1][0][x] != 0L)
            ? "Cerealguy" : "Fat Rat");
    }


}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long sx && Long.valueOf(s.nextLong()) instanceof Long sy
            && Long.valueOf(s.nextLong()) instanceof Long dx && Long.valueOf(s.nextLong()) instanceof Long dy && Long.valueOf(s.nextLong()) instanceof Long t
            && ((BinaryOperator<long[][]>) (X, Y) -> IntStream.range(0, 6).mapToObj(i -> IntStream.range(0, 6).mapToLong(j -> IntStream.range(0, 6).mapToLong(k -> X[i][k] * Y[k][j] % n).sum() % n).toArray()).toArray(long[][]::new)) instanceof BinaryOperator<long[][]> mul
            && new long[][]{{2, 1, 1, 0, 1, 2}, {1, 2, 0, 1, 1, 2}, {1, 1, 1, 0, 1, 2}, {1, 1, 0, 1, 1, 2}, {0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 1}} instanceof long[][] M
            && IntStream.range(0, 6).mapToObj(i -> IntStream.range(0, 6).mapToLong(j -> i == j ? 1 % n : 0).toArray()).toArray(long[][]::new) instanceof long[][] I
            && IntStream.range(0, 6).mapToObj(i -> IntStream.range(0, 6).mapToLong(j -> M[i][j] % n).toArray()).toArray(long[][]::new) instanceof long[][] B
            && IntStream.range(0, 62).boxed().reduce(new long[][][]{I, B}, (st, bit) -> new long[][][]{(t >> bit & 1) == 1 ? mul.apply(st[0], st[1]) : st[0], mul.apply(st[1], st[1])}, (x, y) -> x) instanceof long[][][] fin
            && new long[]{Math.floorMod(sx - 1, n), Math.floorMod(sy - 1, n), Math.floorMod(dx, n), Math.floorMod(dy, n), 0, 1 % n} instanceof long[] v0
            ? (IntStream.range(0, 2).mapToLong(i -> IntStream.range(0, 6).mapToLong(k -> fin[0][i][k] * v0[k] % n).sum() % n + 1).boxed().map(String::valueOf).collect(Collectors.joining(" "))) : "");
    }
}

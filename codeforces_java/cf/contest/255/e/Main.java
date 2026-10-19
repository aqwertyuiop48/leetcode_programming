import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(881920) instanceof Integer M
            && new int[M + 1] instanceof int[] G && new int[5][M + 2] instanceof int[][] pc
            && ((LongUnaryOperator) a -> Long.valueOf((long) Math.sqrt(a)) instanceof Long h0
                && Long.valueOf(Math.min(h0 * h0 > a ? h0 - 1 : (h0 + 1) * (h0 + 1) <= a ? h0 + 1 : h0, a - 1)) instanceof Long hi
                && Long.valueOf((long) Math.ceil(Math.sqrt(Math.sqrt(a)))) instanceof Long l0
                && Long.valueOf(l0 * l0 * l0 * l0 < a ? l0 + 1 : l0 > 0 && (l0 - 1) * (l0 - 1) * (l0 - 1) * (l0 - 1) >= a ? l0 - 1 : l0) instanceof Long lo
                ? lo > hi ? 0 : IntStream.range(0, 5).filter(v -> pc[v][(int) (hi + 1)] - pc[v][(int) (long) lo] == 0).findFirst().getAsInt() : 0) instanceof LongUnaryOperator g
            && IntStream.rangeClosed(0, M).allMatch(x -> (G[x] = (int) g.applyAsLong(x)) >= 0 && IntStream.range(0, 5).allMatch(v -> (pc[v][x + 1] = pc[v][x] + (G[x] == v ? 1 : 0)) >= 0))
            && Long.valueOf(LongStream.generate(sc::nextLong).limit(n).map(g).reduce(0, (p, q) -> p ^ q)) instanceof Long r
            ? r != 0 ? "Furlo" : "Rublo" : "");
    }
}

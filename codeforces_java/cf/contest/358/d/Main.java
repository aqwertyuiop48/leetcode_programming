import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, 3).mapToObj(k -> IntStream.range(0, n).map(i -> it.nextInt()).toArray()).toArray(int[][]::new) instanceof int[][] v
            && Long.valueOf(Long.MIN_VALUE / 4) instanceof Long NEG
            && ((IntFunction<IntBinaryOperator>) i -> (xp, xi) -> v[(xp == 1 ? 1 : 0) + (xi == 0 && i < n ? 1 : 0)][i - 1]) instanceof IntFunction<IntBinaryOperator> joy
            && IntStream.rangeClosed(1, n).boxed().reduce(new long[]{0, NEG}, (d, i) -> new long[]{i == n ? NEG : Math.max(d[0] + joy.apply(i).applyAsInt(0, 0), d[1] + joy.apply(i).applyAsInt(1, 0)),
                Math.max(d[0] + joy.apply(i).applyAsInt(0, 1), d[1] + joy.apply(i).applyAsInt(1, 1))}, (x, y) -> x) instanceof long[] res
            ? String.valueOf(res[1]) : "");
    }
}

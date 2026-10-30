import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, 3 * n).map(i -> s.nextInt()).toArray() instanceof int[] q
            && (Integer) (n / 2) instanceof Integer h && IntStream.range(0, 15).map(i -> (int) Math.round(Math.pow(3, i))).toArray() instanceof int[] P
            && ((BiFunction<Integer, Integer, long[][]>) (base, len) -> new long[2][P[len]] instanceof long[][] r
                && IntStream.rangeClosed(1, len).filter(L -> IntStream.iterate(P[L] - 1, c -> c >= 0, c -> c - 1).filter(c -> (Integer) (c % 3) instanceof Integer dg && (Integer) (3 * (base + L - 1)) instanceof Integer o
                    && (r[0][c] = r[0][c / 3] + (((long) ((dg < 2 ? q[o] : 0) - (dg != 1 ? q[o + 1] : 0))) << 32) + ((dg < 2 ? q[o] : 0) - (dg > 0 ? q[o + 2] : 0))) != 0 | true
                    && (r[1][c] = r[1][c / 3] + (dg < 2 ? q[o] : 0)) != 0 | true).count() >= 0).count() >= 0 ? r : null) instanceof BiFunction<Integer, Integer, long[][]> build
            && build.apply(0, h) instanceof long[][] f1 && build.apply(h, n - h) instanceof long[][] f2
            && new HashMap<Long, long[]>(2 * P[h]) instanceof HashMap<Long, long[]> map
            && IntStream.range(0, P[h]).filter(c -> map.merge(f1[0][c], new long[]{f1[1][c], c}, (o, w) -> w[0] > o[0] ? w : o) == null).count() >= 0
            && new long[]{Long.MIN_VALUE, 0, 0} instanceof long[] best
            && IntStream.range(0, P[n - h]).filter(c -> map.get(-f2[0][c]) instanceof long[] e && e[0] + f2[1][c] > best[0] && (best[0] = e[0] + f2[1][c]) + (best[1] = e[1]) + (best[2] = c) != 0).count() >= 0
            ? (best[0] == Long.MIN_VALUE ? "Impossible" : IntStream.range(0, n).mapToObj(i -> new String[]{"LM", "LW", "MW"}[(int) (i < h ? best[1] / P[h - 1 - i] % 3 : best[2] / P[n - 1 - i] % 3)]).collect(Collectors.joining("\n"))) : "");
    }
}

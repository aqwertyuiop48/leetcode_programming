import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer T
            && IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong(), Math.round(Double.parseDouble(sc.next()) * 1e6)})
                .sorted((a, b) -> Double.compare((double) a[3] * a[4] * (1000000 - b[4]), (double) b[3] * b[4] * (1000000 - a[4]))).toList() instanceof List<long[]> ps
            && new long[T + 1] instanceof long[] sc2 && new double[T + 1] instanceof double[] pen
            && IntStream.rangeClosed(1, T).allMatch(t -> (sc2[t] = -1) < 0)
            && ps.stream().allMatch(a -> Integer.valueOf((int) a[2]) instanceof Integer ts && Integer.valueOf((int) a[3]) instanceof Integer tl
                && Long.valueOf(a[0] * 1000000) instanceof Long s1 && Long.valueOf(a[1] * (1000000 - a[4])) instanceof Long s2 && Double.valueOf(a[4] / 1e6) instanceof Double p
                && IntStream.iterate(T, t -> t >= 0, t -> t - 1).allMatch(t ->
                    (t < ts || sc2[t - ts] < 0 || !(sc2[t - ts] + s1 > sc2[t] || sc2[t - ts] + s1 == sc2[t] && pen[t - ts] + ts < pen[t])
                        || (pen[t] = pen[t - ts] + ts) >= 0 & (sc2[t] = sc2[t - ts] + s1) >= 0)
                    && (t < ts + tl || sc2[t - ts - tl] < 0 || !(sc2[t - ts - tl] + s1 + s2 > sc2[t] || sc2[t - ts - tl] + s1 + s2 == sc2[t] && (1 - p) * t + p * (pen[t - ts - tl] + ts) < pen[t])
                        || (pen[t] = (1 - p) * t + p * (pen[t - ts - tl] + ts)) >= 0 & (sc2[t] = sc2[t - ts - tl] + s1 + s2) >= 0)))
            && IntStream.rangeClosed(0, T).boxed().reduce((x, y) -> sc2[y] > sc2[x] || sc2[y] == sc2[x] && pen[y] < pen[x] ? y : x).get() instanceof Integer best
            ? String.format("%d.%06d %.9f", sc2[best] / 1000000, sc2[best] % 1000000, pen[best]) : "");
    }
}

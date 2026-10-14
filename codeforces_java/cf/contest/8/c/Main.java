import java.util.*;
import java.util.stream.*;

public class Main {
    static long[] X, Y;
    static long dist(int i, int j) { return (X[i] - X[j]) * (X[i] - X[j]) + (Y[i] - Y[j]) * (Y[i] - Y[j]); }

    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong()}).ifPresent(start ->
            Optional.of(sc.nextInt()).ifPresent(n ->
                System.out.println(
                IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).toArray(long[][]::new) instanceof long[][] pts
                && new long[n + 1] instanceof long[] xs0
                && new long[n + 1] instanceof long[] ys0
                && (xs0[0] = start[0]) == xs0[0]
                && (ys0[0] = start[1]) == ys0[0]
                && IntStream.range(0, n).allMatch(i -> (xs0[i + 1] = pts[i][0]) == xs0[i + 1] & (ys0[i + 1] = pts[i][1]) == ys0[i + 1])
                && (X = xs0) != null
                && (Y = ys0) != null
                && new long[1 << n] instanceof long[] dp
                && new int[1 << n] instanceof int[] choice
                && IntStream.range(1, 1 << n).allMatch(mask ->
                    Integer.valueOf(Integer.numberOfTrailingZeros(mask)) instanceof Integer i
                    && new long[]{dp[mask ^ (1 << i)] + 2 * dist(0, i + 1)} instanceof long[] aloneCost
                    && IntStream.range(0, n).filter(j -> j != i && (mask >> j & 1) == 1).boxed()
                        .map(j -> new long[]{dp[mask ^ (1 << i) ^ (1 << j)] + dist(0, i + 1) + dist(i + 1, j + 1) + dist(j + 1, 0), j})
                        .min(Comparator.comparingLong(a -> a[0]))
                        .map(best -> best[0] < aloneCost[0] ? best : new long[]{aloneCost[0], -1})
                        .orElse(new long[]{aloneCost[0], -1}) instanceof long[] chosen
                    && (dp[mask] = chosen[0]) == dp[mask]
                    && (choice[mask] = (int) chosen[1]) == choice[mask])
                && new ArrayList<Integer>() instanceof ArrayList<Integer> order
                && Stream.iterate(Integer.valueOf((1 << n) - 1), m -> m != 0, m ->
                        Integer.valueOf(Integer.numberOfTrailingZeros(m)) instanceof Integer i2
                        && order.add(i2 + 1)
                        && (choice[m] >= 0 ? (order.add(choice[m] + 1) && order.add(0)) : order.add(0))
                        ? Integer.valueOf(choice[m] >= 0 ? m ^ (1 << i2) ^ (1 << choice[m]) : m ^ (1 << i2))
                        : m)
                    .count() >= 0
                ? dp[(1 << n) - 1] + "\n0 " + order.stream().map(String::valueOf).collect(Collectors.joining(" "))
                : ""))));
    }
}

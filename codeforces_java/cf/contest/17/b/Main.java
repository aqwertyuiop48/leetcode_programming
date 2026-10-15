import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray()).ifPresent(q ->
                Optional.of(s.nextInt()).ifPresent(m ->
                    System.out.println(
                        new long[n + 1] instanceof long[] minCost
                        && IntStream.rangeClosed(1, n).allMatch(i -> (minCost[i] = Long.MAX_VALUE) >= 0)
                        && IntStream.range(0, m).allMatch(i ->
                            new long[]{s.nextLong(), s.nextLong(), s.nextLong()} instanceof long[] abc
                            && (minCost[(int) abc[1]] = Math.min(minCost[(int) abc[1]], abc[2])) >= 0)
                        && new long[]{0, 0} instanceof long[] res
                        && IntStream.rangeClosed(1, n).allMatch(i ->
                            minCost[i] == Long.MAX_VALUE
                                ? (res[1] += 1) >= 0
                                : (res[0] += minCost[i]) >= 0)
                        ? (res[1] == 1 ? res[0] : -1)
                        : -1)))));
    }
}




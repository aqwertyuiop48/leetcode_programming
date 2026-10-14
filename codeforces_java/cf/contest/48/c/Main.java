import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, n).map(i -> s.nextInt()).toArray()).ifPresent(a ->
                Optional.of(Math.max(n + 1, IntStream.rangeClosed(1, a[n - 1]).filter(k -> Arrays.stream(a).noneMatch(x -> x == k))
                        .map(k -> (k + 1) * (n + 1) / ((int) Arrays.stream(a).filter(x -> x < k).count() + 1)).max().orElse(0))).ifPresent(kmin ->
                    Optional.of(IntStream.rangeClosed(1, n).map(i -> ((a[i - 1] + 1) * (n + 1) - 1) / i).min().getAsInt()).ifPresent(kmax ->
                        System.out.println(kmin == kmax ? "unique\n" + kmin : "not unique"))))));
    }
}

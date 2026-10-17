import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray()).ifPresent(a ->
                Optional.of(Math.max(n + 1L, IntStream.range(0, n).filter(j -> a[j] - 1 > (j > 0 ? a[j - 1] : 0)).mapToLong(j -> a[j] * (n + 1L) / (j + 1)).max().orElse(0))).ifPresent(kmin ->
                    Optional.of(IntStream.rangeClosed(1, n).mapToLong(i -> ((a[i - 1] + 1) * (n + 1L) - 1) / i).min().getAsLong()).ifPresent(kmax ->
                        System.out.println(kmin.equals(kmax) ? "unique\n" + kmin : "not unique"))))));
    }
}

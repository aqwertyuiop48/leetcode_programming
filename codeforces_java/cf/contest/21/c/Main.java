import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
                && new long[]{Arrays.stream(a).sum()} instanceof long[] total
                && total[0] % 3 == 0
                && new long[]{total[0] / 3, 0, 0} instanceof long[] st
                ? IntStream.range(0, n - 1)
                    .mapToLong(i -> ((st[1] += a[i]) == 2 * st[0] ? st[2] : 0L)
                        + (st[1] == st[0] && st[2]++ >= 0 ? 0L : 0L))
                    .sum()
                : 0L)));
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
                && new long[]{Arrays.stream(a).sum()} instanceof long[] total
                && new long[]{0} instanceof long[] prefix
                ? IntStream.range(0, n - 1)
                    .filter(i -> (prefix[0] += a[i]) * 2 == total[0])
                    .count()
                : 0L)));
    }
}




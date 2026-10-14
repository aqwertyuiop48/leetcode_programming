import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new long[n + 1] instanceof long[] p
                && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + s.nextLong()) > Long.MIN_VALUE)
                && new long[]{Long.MAX_VALUE} instanceof long[] mn
                ? 2 * IntStream.rangeClosed(0, n).mapToLong(j -> p[j] - (mn[0] = Math.min(mn[0], p[j]))).max().getAsLong() - p[n]
                : 0)));
    }
}


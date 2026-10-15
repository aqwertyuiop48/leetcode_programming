import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new long[]{2, 1, 2} instanceof long[] st
                && IntStream.rangeClosed(2, n / 2).allMatch(i ->
                    (st[0] = st[0] * 2 % 1_000_000_009L) > 0
                    && (st[1] = st[1] * ((st[0] - 3 + 1_000_000_009L) % 1_000_000_009L) % 1_000_000_009L) >= 0
                    && (st[2] = (st[2] + 4 * st[1]) % 1_000_000_009L) >= 0)
                ? 2 * (st[2] * st[2] % 1_000_000_009L + 1) % 1_000_000_009L
                : 0L)));
    }
}

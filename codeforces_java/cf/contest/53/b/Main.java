import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(h -> Optional.of(s.nextLong()).ifPresent(w ->
            System.out.println(IntStream.range(0, 31).mapToObj(k -> 1L << k)
                .flatMap(p -> Stream.of(new long[]{p, Math.min(w, 5 * p / 4)}, new long[]{Math.min(h, 5 * p / 4), p}))
                .filter(c -> c[0] >= 1 && c[1] >= 1 && c[0] <= h && c[1] <= w && 4 * c[1] <= 5 * c[0] && 4 * c[0] <= 5 * c[1])
                .max(Comparator.<long[]>comparingLong(c -> c[0] * c[1]).thenComparingLong(c -> c[0]))
                .map(c -> c[0] + " " + c[1]).get()))));
    }
}

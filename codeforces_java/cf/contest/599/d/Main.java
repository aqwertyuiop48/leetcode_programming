import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println((Long) new Scanner(System.in).nextLong() instanceof Long x
                && LongStream.rangeClosed(1, 1500000).filter(n -> n * (n + 1) * (2 * n + 1) / 6 <= x && 6 * x % (n * (n + 1)) == 0 && (6 * x / (n * (n + 1)) + n - 1) % 3 == 0 && (6 * x / (n * (n + 1)) + n - 1) / 3 >= n)
                        .mapToObj(n -> new long[]{n, (6 * x / (n * (n + 1)) + n - 1) / 3}).toList() instanceof List<long[]> l
                && Stream.concat(l.stream(), IntStream.range(0, l.size()).mapToObj(i -> l.get(l.size() - 1 - i)).filter(p -> p[0] != p[1]).map(p -> new long[]{p[1], p[0]})).toList() instanceof List<long[]> all
                ? all.size() + "\n" + all.stream().map(p -> p[0] + " " + p[1]).collect(Collectors.joining("\n")) : "");
    }
}

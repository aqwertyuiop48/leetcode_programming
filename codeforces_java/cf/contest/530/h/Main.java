import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextInt(), s.nextInt()}).toList() instanceof List<long[]> p
            && (Long) p.stream().mapToLong(x -> x[0]).max().getAsLong() instanceof Long mx
            ? String.format(Locale.ROOT, "%.1f", LongStream.rangeClosed(mx + 1, 20000).map(a -> a * p.stream().mapToLong(x -> (x[1] * a + a - x[0] - 1) / (a - x[0])).max().getAsLong()).min().getAsLong() / 2.0) : "");
    }
}

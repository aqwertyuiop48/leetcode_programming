import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                IntStream.range(0, nm[0]).mapToLong(i -> s.nextLong()).sorted().toArray() instanceof long[] prices
                && IntStream.range(0, nm[1]).mapToObj(i -> s.next())
                    .collect(Collectors.groupingBy(f -> f, Collectors.counting()))
                    .values().stream().sorted(Comparator.reverseOrder()).mapToLong(Long::longValue).toArray() instanceof long[] counts
                && new long[]{0, 0} instanceof long[] res
                && IntStream.range(0, counts.length).allMatch(i ->
                    (res[0] += counts[i] * prices[i]) >= 0
                    && (res[1] += counts[i] * prices[prices.length - 1 - i]) >= 0)
                ? res[0] + " " + res[1]
                : "0 0")));
    }
}






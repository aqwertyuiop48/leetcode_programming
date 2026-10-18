import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong()) instanceof Long t1
            && Long.valueOf(s.nextLong()) instanceof Long t2
            && Long.valueOf(s.nextLong()) instanceof Long k
            ? IntStream.rangeClosed(1, n).mapToObj(i -> new long[]{i, s.nextLong(), s.nextLong()})
                .map(p -> new long[]{p[0], Math.max(p[1] * t1 * (100 - k) + p[2] * t2 * 100, p[2] * t1 * (100 - k) + p[1] * t2 * 100)})
                .sorted(Comparator.comparingLong((long[] p) -> -p[1]).thenComparingLong(p -> p[0]))
                .map(p -> p[0] + " " + p[1] / 100 + "." + String.format("%02d", p[1] % 100)).collect(Collectors.joining("\n"))
            : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Long.valueOf(s.nextLong()) instanceof Long j
            && new long[]{s.nextLong(), s.nextLong()} instanceof long[] p
            && IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] a
            && LongStream.range(0, j % (2L * n)).allMatch(k ->
                Integer.valueOf((int) (k % n)) instanceof Integer idx
                && (p[0] = 2 * a[idx][0] - p[0]) == p[0]
                && (p[1] = 2 * a[idx][1] - p[1]) == p[1])
            ? p[0] + " " + p[1]
            : ""));
    }
}


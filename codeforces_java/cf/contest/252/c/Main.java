import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Long.valueOf(s.nextLong()) instanceof Long d
            && LongStream.generate(s::nextLong).limit(n).toArray() instanceof long[] x
            ? IntStream.range(0, n).mapToLong(k -> Integer.valueOf(Arrays.binarySearch(x, x[k] - d)) instanceof Integer b
                && Integer.valueOf(b >= 0 ? b : -b - 1) instanceof Integer lo ? (long) (k - lo) * (k - lo - 1) / 2 : 0).sum() : "");
    }
}

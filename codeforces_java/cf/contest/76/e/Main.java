import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Long.valueOf(s.nextLong()) instanceof Long n
                && new long[3] instanceof long[] a
                && LongStream.range(0, n).allMatch(i ->
                    Long.valueOf(s.nextLong()) instanceof Long x
                    && Long.valueOf(s.nextLong()) instanceof Long y
                    && (a[0] += x) == a[0]
                    && (a[1] += y) == a[1]
                    && (a[2] += x * x + y * y) == a[2])
                ? n * a[2] - a[0] * a[0] - a[1] * a[1]
                : 0L));
    }
}






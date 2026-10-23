import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a && (Long) (LongStream.of(a).sum() / n) instanceof Long avg && new long[1] instanceof long[] acc
            ? IntStream.range(0, n).mapToLong(i -> Math.abs((acc[0] += a[i]) - (i + 1) * avg)).sum() : 0);
    }
}

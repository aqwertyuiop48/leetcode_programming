import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Long.valueOf(new Scanner(System.in).nextLong()) instanceof Long n
            ? n % 3 != 0 ? 0 : Long.valueOf(n / 3) instanceof Long m
                && LongStream.rangeClosed(1, (long) Math.sqrt(m) + 1).filter(i -> i * i <= m && m % i == 0).boxed().flatMap(i -> Stream.of(i, m / i)).distinct().sorted().toList() instanceof List<Long> ds
                ? ds.stream().takeWhile(x -> x <= m / x / x).mapToLong(x -> ds.subList(Collections.binarySearch(ds, x), ds.size()).stream().takeWhile(y -> y <= m / x / y)
                    .filter(y -> m / x % y == 0 && Long.valueOf(m / x / y) instanceof Long z && z < x + y && (x + y + z) % 2 == 0)
                    .mapToLong(y -> x.equals(y) ? (y.equals(m / x / y) ? 1 : 3) : (y.equals(m / x / y) ? 3 : 6)).sum()).sum() : "" : "");
    }
}

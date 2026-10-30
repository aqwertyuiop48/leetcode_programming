import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && (Long) (long) Math.pow(10, k) instanceof Long p && (Long) (p / 10) instanceof Long q
            && IntStream.range(0, n / k).mapToObj(i -> s.nextLong()).toArray(Long[]::new) instanceof Long[] a
            ? IntStream.range(0, n / k).mapToLong(i -> (Long) s.nextLong() instanceof Long b
                ? (p - 1) / a[i] + 1 - (b == 0 ? (q - 1) / a[i] + 1 : (b + 1) * q - 1 >= 0 ? ((b + 1) * q - 1) / a[i] - (b * q - 1) / a[i] : 0) : 0)
                .reduce(1L, (u, v) -> u * v % 1000000007L) : 0);
    }
}

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer h && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] a && (Integer) IntStream.of(a).sum() instanceof Integer total ? total < n ? "-1" : String.format(java.util.Locale.US, "%.9f", 1 - IntStream.range(0, n - 1).mapToDouble(i -> (double) Math.max(0, total - a[h - 1] - i) / (total - 1 - i)).reduce(1.0, (x, y) -> x * y)) : "").ifPresent(System.out::println);
    }
}

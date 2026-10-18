import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer h && IntStream.range(0, m).map(i -> s.nextInt()).toArray() instanceof int[] a && (Integer) IntStream.of(a).sum() instanceof Integer S ? S < n ? "-1" : String.format(Locale.US, "%.6f", 1 - IntStream.range(0, n - 1).mapToDouble(i -> (double) (S - a[h - 1] - i) / (S - 1 - i)).reduce(1, (x, y) -> x * y)) : "").ifPresent(System.out::println);
    }
}

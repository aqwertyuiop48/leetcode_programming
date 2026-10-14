import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer b
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? Math.max((int) b, IntStream.range(0, n).boxed().flatMapToInt(i -> IntStream.range(i + 1, n).map(j -> b / a[i] * a[j] + b % a[i])).max().orElse(0))
            : 0));
    }
}

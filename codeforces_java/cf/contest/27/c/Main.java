import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.generate(s::nextInt).limit(s.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf(a.length) instanceof Integer n
            ? (IntStream.range(1, n).allMatch(i -> a[i] >= a[i - 1]) || IntStream.range(1, n).allMatch(i -> a[i] <= a[i - 1])) ? "0"
            : "3\n" + (
                IntStream.range(0, n).boxed().max(Comparator.comparingInt((Integer i) -> a[i]).thenComparing(Comparator.reverseOrder())).get() instanceof Integer mx
                && IntStream.range(0, n).boxed().min(Comparator.comparingInt((Integer i) -> a[i]).thenComparing(Comparator.reverseOrder())).get() instanceof Integer mn
                ? a[mx] > Math.max(a[0], a[n - 1]) ? "1 " + (mx + 1) + " " + n
                : a[mn] < Math.min(a[0], a[n - 1]) ? "1 " + (mn + 1) + " " + n
                : Integer.valueOf(IntStream.range(1, n).filter(i -> a[i] != a[i - 1]).findFirst().getAsInt()) instanceof Integer f
                    && Integer.valueOf(IntStream.range(f + 1, n).filter(i -> Integer.compare(a[i], a[i - 1]) == -Integer.compare(a[f], a[f - 1])).findFirst().getAsInt()) instanceof Integer j
                    ? "1 " + j + " " + (j + 1) : ""
                : "")
            : ""));

    }
}





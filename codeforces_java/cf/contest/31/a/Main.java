import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
                ? IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(0, n).map(j -> n - 1 - j).boxed().flatMap(j -> IntStream.range(0, n)
                    .filter(k -> i != j && i != k && j != k && a[i] == a[j] + a[k])
                    .mapToObj(k -> (i + 1) + " " + (j + 1) + " " + (k + 1))))
                    .findFirst().orElse("-1")
                : "")));
    }
}



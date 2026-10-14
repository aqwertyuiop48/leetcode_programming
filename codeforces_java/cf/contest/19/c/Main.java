import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new long[s.nextInt()] instanceof long[] a
                && IntStream.range(0, a.length).allMatch(i -> (a[i] = s.nextLong()) == a[i])
                && new int[1] instanceof int[] L
                && IntStream.range(0, a.length).boxed()
                    .flatMap(i -> IntStream.rangeClosed(1, (a.length - i) / 2)
                        .filter(x -> IntStream.range(0, x).allMatch(k -> a[i + k] == a[i + x + k]))
                        .mapToObj(x -> new int[]{x, i}))
                    .sorted(Comparator.<int[]>comparingInt(c -> c[0]).thenComparingInt(c -> c[1]))
                    .filter(c -> c[1] >= L[0])
                    .allMatch(c -> (L[0] = c[1] + c[0]) >= 0)
                ? (a.length - L[0]) + "\n" + IntStream.range(L[0], a.length).mapToObj(i -> "" + a[i]).collect(Collectors.joining(" "))
                : ""));
    }
}


import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, m * n).map(i -> sc.nextInt()).toArray() instanceof int[] b
            && IntStream.range(0, m * n).map(i -> IntStream.range(0, n).allMatch(j -> b[i / n * n + j] == 1) && IntStream.range(0, m).allMatch(r -> b[r * n + i % n] == 1) ? 1 : 0).toArray() instanceof int[] a
            && IntStream.range(0, m * n).allMatch(i ->
                b[i] == (IntStream.range(0, n).anyMatch(j -> a[i / n * n + j] == 1) || IntStream.range(0, m).anyMatch(r -> a[r * n + i % n] == 1) ? 1 : 0))
            ? "YES\n" + IntStream.range(0, m).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> String.valueOf(a[i * n + j])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "NO");
    }
}

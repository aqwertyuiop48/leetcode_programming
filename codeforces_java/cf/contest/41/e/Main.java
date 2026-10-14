import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            n * n / 4 + "\n" + IntStream.rangeClosed(1, n).boxed().flatMap(i -> IntStream.rangeClosed(i + 1, n).filter(j -> (j - i) % 2 == 1)
                .mapToObj(j -> j - i <= n - (j - i) ? new int[]{j - i, i, j} : new int[]{n - (j - i), j, i}))
                .sorted(Comparator.<int[]>comparingInt(x -> x[0]).thenComparingInt(x -> x[1]))
                .map(x -> x[1] + " " + x[2]).collect(Collectors.joining("\n")))));
    }
}


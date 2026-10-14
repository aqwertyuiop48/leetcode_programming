import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] p
            && ((ToDoubleBiFunction<long[], long[]>) (u, w) -> Math.sqrt((u[0] - w[0]) * (u[0] - w[0]) + (u[1] - w[1]) * (u[1] - w[1]) + (u[2] - w[2]) * (u[2] - w[2]))) instanceof ToDoubleBiFunction<long[], long[]> d
            ? String.format(Locale.US, "%.10f", IntStream.range(1, n).mapToDouble(i -> IntStream.range(i + 1, n).mapToDouble(j -> (d.applyAsDouble(p[0], p[i]) + d.applyAsDouble(p[0], p[j]) + d.applyAsDouble(p[i], p[j])) / 2).min().orElse(Double.MAX_VALUE)).min().getAsDouble())
            : "")));
    }
}

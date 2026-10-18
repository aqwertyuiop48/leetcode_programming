import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] v
            && ((IntBinaryOperator) (i, j) -> Math.max(0,
                Math.min((i + 1) * v[1] * v[2], (j + 1) * v[0] * v[1]) - Math.max(i * v[1] * v[2], j * v[0] * v[1]))) instanceof IntBinaryOperator ov
            ? IntStream.range(0, v[0]).allMatch(i -> IntStream.range(0, v[2]).filter(j -> ov.applyAsInt(i, j) > 0).count() <= 2)
                ? "YES\n" + IntStream.range(0, v[2]).mapToObj(j -> IntStream.range(0, v[0]).filter(i -> ov.applyAsInt(i, j) > 0)
                    .mapToObj(i -> (i + 1) + " " + String.format(Locale.US, "%.6f", ov.applyAsInt(i, j) / (double) v[2]))
                    .collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
                : "NO"
            : "");
    }
}





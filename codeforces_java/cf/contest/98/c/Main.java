import java.util.*;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Double) s.nextDouble() instanceof Double a
            && (Double) s.nextDouble() instanceof Double b
            && (Double) s.nextDouble() instanceof Double l
            && new double[] {0, Math.PI / 2} instanceof double[] d
            && ((DoubleUnaryOperator) t -> a * Math.cos(t) + b * Math.sin(t) - l * Math.sin(t) * Math.cos(t)) instanceof DoubleUnaryOperator f
            && IntStream.range(0, 200).allMatch(i ->
                f.applyAsDouble(d[0] + (d[1] - d[0]) / 3) < f.applyAsDouble(d[1] - (d[1] - d[0]) / 3)
                    ? (d[1] = d[1] - (d[1] - d[0]) / 3) >= 0
                    : (d[0] = d[0] + (d[1] - d[0]) / 3) >= 0)
            && (Double) (l <= b ? Math.min(a, l) : l <= a ? Math.min(b, l) : Math.min(f.applyAsDouble(d[0]), l)) instanceof Double r
            ? r < 1e-8 ? "My poor head =(" : String.format(Locale.US, "%.7f", r)
            : ""));
    }
}





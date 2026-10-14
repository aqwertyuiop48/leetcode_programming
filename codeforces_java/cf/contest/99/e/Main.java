import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new double[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(v -> Optional.<DoubleUnaryOperator>of(t -> v[0] * Math.cos(t) + v[1] * Math.sin(t) - v[2] * Math.sin(t) * Math.cos(t)).ifPresent(f -> Optional.of(new double[]{0, Math.PI / 2}).ifPresent(w -> Optional.of(IntStream.range(0, 200).allMatch(i -> (f.applyAsDouble(w[0] + (w[1] - w[0]) / 3) < f.applyAsDouble(w[1] - (w[1] - w[0]) / 3) ? (w[1] = w[1] - (w[1] - w[0]) / 3) : (w[0] = w[0] + (w[1] - w[0]) / 3)) >= 0)).ifPresent(ok -> Optional.of(v[2] <= v[1] ? Math.min(v[0], v[2]) : v[2] <= v[0] ? Math.min(v[1], v[2]) : Math.min(f.applyAsDouble(w[0]), v[2])).ifPresent(ans -> System.out.print(ans < 1e-8 ? "My poor head =(" : String.format(Locale.US, "%.7f", ans))))))));
    }
}

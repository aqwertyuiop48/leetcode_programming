import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nv ->
            Optional.of(IntStream.range(0, nv[0]).mapToDouble(i -> s.nextDouble()).toArray()).ifPresent(ang ->
                Optional.of(s.nextInt()).ifPresent(m ->
                    Optional.of(IntStream.range(0, m).mapToObj(i -> new double[]{s.nextDouble(), s.nextDouble()})
                            .sorted(Comparator.comparingDouble(w -> w[0])).toList()).ifPresent(walls ->
                        System.out.println(Arrays.stream(ang).mapToObj(t ->
                            ((DoubleUnaryOperator) x -> x * Math.tan(t) - 9.8 * x * x / (2.0 * nv[1] * nv[1] * Math.cos(t) * Math.cos(t))) instanceof DoubleUnaryOperator y
                            && Double.valueOf(nv[1] * (double) nv[1] * Math.sin(2 * t) / 9.8) instanceof Double r
                            ? walls.stream().takeWhile(w -> w[0] <= r).filter(w -> y.applyAsDouble(w[0]) <= w[1]).findFirst()
                                .map(w -> String.format(Locale.ROOT, "%.9f %.9f", w[0], y.applyAsDouble(w[0])))
                                .orElse(String.format(Locale.ROOT, "%.9f %.9f", r, 0.0))
                            : "").collect(Collectors.joining("\n"))))))));
    }
}


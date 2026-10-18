import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Double.valueOf(t[1]) instanceof Double h
            && Double.valueOf(t[2]) instanceof Double f
            && Double.valueOf(f - h) instanceof Double D
            && ((ToDoubleBiFunction<double[], Double>) (w, y) -> Math.max(0, Math.min(w[1] * (f - y), w[3] * (f + y)) - Math.max(w[0] * (f - y), w[2] * (f + y))) / D) instanceof ToDoubleBiFunction<double[], Double> g
            ? String.format(Locale.US, "%.10f", 2 * IntStream.range(0, n).mapToDouble(i -> (t[4 + 2 * i] - t[3 + 2 * i]) * (1 + (f + h) / D) * h).sum()
                - IntStream.range(0, n).mapToDouble(i -> IntStream.range(0, n).mapToDouble(j -> new double[]{t[3 + 2 * i], t[4 + 2 * i], t[3 + 2 * j], t[4 + 2 * j]} instanceof double[] w
                    && DoubleStream.concat(DoubleStream.of(-h, h), DoubleStream.of(f * (w[1] - w[3]) / (w[1] + w[3]), f * (w[0] - w[2]) / (w[0] + w[2]), f * (w[1] - w[2]) / (w[1] + w[2]), f * (w[0] - w[3]) / (w[0] + w[3]))
                        .filter(y -> y > -h && y < h)).sorted().toArray() instanceof double[] ys
                    ? IntStream.range(0, ys.length - 1).mapToDouble(q -> (ys[q + 1] - ys[q]) * (g.applyAsDouble(w, ys[q]) + g.applyAsDouble(w, ys[q + 1])) / 2).sum() : 0.0).sum()).sum()) : "");
    }
}





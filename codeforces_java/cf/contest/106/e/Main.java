import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new double[] {s.nextDouble(), s.nextDouble(), s.nextDouble()}).toArray(double[][]::new) instanceof double[][] a && IntStream.range(0, 3).mapToDouble(d -> java.util.Arrays.stream(a).mapToDouble(q -> q[d]).sum() / n).toArray() instanceof double[] p && new double[] {1} instanceof double[] step && IntStream.range(0, 200000).allMatch(it -> java.util.Arrays.stream(a).max(Comparator.comparingDouble(q -> (q[0] - p[0]) * (q[0] - p[0]) + (q[1] - p[1]) * (q[1] - p[1]) + (q[2] - p[2]) * (q[2] - p[2]))).get() instanceof double[] far && IntStream.range(0, 3).allMatch(d -> !Double.isNaN(p[d] += (far[d] - p[d]) * step[0])) && (step[0] *= 0.9995) > 0) ? String.format(java.util.Locale.US, "%.10f %.10f %.10f", p[0], p[1], p[2]) : "").ifPresent(System.out::println);
    }
}


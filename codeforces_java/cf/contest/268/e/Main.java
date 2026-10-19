import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new double[]{it.nextInt(), it.nextInt() / 100.0}).sorted((x, y) -> Double.compare(y[0] * y[1] * (1 - x[1]), x[0] * x[1] * (1 - y[1]))).toList() instanceof List<double[]> s
            && new double[]{0} instanceof double[] acc
            ? String.format("%.9f", s.stream().mapToDouble(x -> x[0] + (1 - x[1]) * acc[0] + 0 * (acc[0] += x[0] * x[1])).sum()) : "");
    }
}

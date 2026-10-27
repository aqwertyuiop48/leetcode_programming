import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextInt(), s.nextInt()}).toArray(double[][]::new) instanceof double[][] p
            ? String.format(Locale.US, "%.9f",
                IntStream.range(1, n).mapToDouble(i -> Math.hypot(p[i][0] - p[i - 1][0], p[i][1] - p[i - 1][1])).sum() * k / 50.0)
            : "");
    }
}


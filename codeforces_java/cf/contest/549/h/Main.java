import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Double) s.nextDouble() instanceof Double a && (Double) s.nextDouble() instanceof Double b && (Double) s.nextDouble() instanceof Double c && (Double) s.nextDouble() instanceof Double d
            && new double[]{0, 1e10} instanceof double[] ab
            && IntStream.range(0, 300).allMatch(z -> (Double) ((ab[0] + ab[1]) / 2) instanceof Double x
                && IntStream.range(0, 16).mapToDouble(m -> (a + ((m & 1) == 0 ? -x : x)) * (d + ((m & 8) == 0 ? -x : x)) - (b + ((m & 2) == 0 ? -x : x)) * (c + ((m & 4) == 0 ? -x : x))).toArray() instanceof double[] dets
                && ((DoubleStream.of(dets).min().getAsDouble() <= 0 && DoubleStream.of(dets).max().getAsDouble() >= 0) ? (ab[1] = x) > -1 : (ab[0] = x) > -1))
            ? String.format(Locale.ROOT, "%.10f", ab[1]) : "");
    }
}

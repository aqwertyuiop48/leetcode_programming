import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer t && Integer.valueOf(t.nextToken()) instanceof Integer n && Double.valueOf(t.nextToken()) instanceof Double p && Double.valueOf(t.nextToken()) instanceof Double q
            && new double[n] instanceof double[] ia && new double[n] instanceof double[] ib && new double[]{0, 0} instanceof double[] r
            && IntStream.range(0, n).filter(i -> Double.valueOf(t.nextToken()) instanceof Double a && Double.valueOf(t.nextToken()) instanceof Double b && (ia[i] = a / b) > 0 & (ib[i] = 1 / b) > 0 & (r[1] = Math.max(r[1], a)) > 0).count() >= 0
            && (r[1] = 1 / r[1]) > 0 && ((DoubleUnaryOperator) u -> p * u + q * IntStream.range(0, n).mapToDouble(i -> ib[i] - ia[i] * u).min().getAsDouble()) instanceof DoubleUnaryOperator f
            && IntStream.range(0, 100).filter(it -> Double.valueOf(r[0] + (r[1] - r[0]) / 3) instanceof Double m1 && Double.valueOf(r[1] - (r[1] - r[0]) / 3) instanceof Double m2 && (f.applyAsDouble(m1) < f.applyAsDouble(m2) ? (r[0] = m1) : (r[1] = m2)) >= 0).count() >= 0
            ? String.format(Locale.ROOT, "%.15f", f.applyAsDouble((r[0] + r[1]) / 2)) : "");
    }
}

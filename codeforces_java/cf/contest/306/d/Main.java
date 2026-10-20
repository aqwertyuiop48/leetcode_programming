import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer n
            ? n < 5 ? "No solution"
            : IntStream.range(0, n).mapToDouble(k -> 2 * Math.PI * k / n).toArray() instanceof double[] th
                && IntStream.range(0, n - 2).mapToDouble(k -> 500 + 0.01 * k).toArray() instanceof double[] l0
                && Double.valueOf(-IntStream.range(0, n - 2).mapToDouble(k -> l0[k] * Math.cos(th[k])).sum()) instanceof Double rx
                && Double.valueOf(-IntStream.range(0, n - 2).mapToDouble(k -> l0[k] * Math.sin(th[k])).sum()) instanceof Double ry
                && Double.valueOf(Math.cos(th[n - 2]) * Math.sin(th[n - 1]) - Math.sin(th[n - 2]) * Math.cos(th[n - 1])) instanceof Double det
                && DoubleStream.concat(Arrays.stream(l0), DoubleStream.of((rx * Math.sin(th[n - 1]) - ry * Math.cos(th[n - 1])) / det, (Math.cos(th[n - 2]) * ry - Math.sin(th[n - 2]) * rx) / det)).toArray() instanceof double[] l
                && new double[n][2] instanceof double[][] p
                && IntStream.range(1, n).allMatch(i -> (p[i][0] = p[i - 1][0] + l[i - 1] * Math.cos(th[i - 1])) > -1e18 && (p[i][1] = p[i - 1][1] + l[i - 1] * Math.sin(th[i - 1])) > -1e18)
                ? Arrays.stream(p).map(q -> String.format(Locale.US, "%.9f %.9f", q[0], q[1])).collect(Collectors.joining("\n")) : "" : "");
    }
}

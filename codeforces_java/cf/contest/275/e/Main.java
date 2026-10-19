import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextInt(), s.nextInt()}).toArray(double[][]::new) instanceof double[][] p
            && Double.valueOf(IntStream.range(0, n).boxed().flatMap(i -> IntStream.range(i + 1, n).boxed().flatMap(j -> IntStream.range(j + 1, n).mapToObj(k -> new int[]{i, j, k})))
                .mapToDouble(t -> Double.valueOf(2 * (p[t[0]][0] * (p[t[1]][1] - p[t[2]][1]) + p[t[1]][0] * (p[t[2]][1] - p[t[0]][1]) + p[t[2]][0] * (p[t[0]][1] - p[t[1]][1]))) instanceof Double d
                    && d != 0
                    && Double.valueOf(((p[t[0]][0] * p[t[0]][0] + p[t[0]][1] * p[t[0]][1]) * (p[t[1]][1] - p[t[2]][1]) + (p[t[1]][0] * p[t[1]][0] + p[t[1]][1] * p[t[1]][1]) * (p[t[2]][1] - p[t[0]][1]) + (p[t[2]][0] * p[t[2]][0] + p[t[2]][1] * p[t[2]][1]) * (p[t[0]][1] - p[t[1]][1])) / d) instanceof Double ux
                    && Double.valueOf(((p[t[0]][0] * p[t[0]][0] + p[t[0]][1] * p[t[0]][1]) * (p[t[2]][0] - p[t[1]][0]) + (p[t[1]][0] * p[t[1]][0] + p[t[1]][1] * p[t[1]][1]) * (p[t[0]][0] - p[t[2]][0]) + (p[t[2]][0] * p[t[2]][0] + p[t[2]][1] * p[t[2]][1]) * (p[t[1]][0] - p[t[0]][0])) / d) instanceof Double uy
                    && Double.valueOf(Math.pow(p[t[0]][0] - ux, 2) + Math.pow(p[t[0]][1] - uy, 2)) instanceof Double r2
                    && Double.valueOf(1e-9 * Math.max(1, r2)) instanceof Double eps
                    && Arrays.stream(p).allMatch(q -> Math.pow(q[0] - ux, 2) + Math.pow(q[1] - uy, 2) >= r2 - eps)
                    && Arrays.stream(p).filter(q -> Math.abs(Math.pow(q[0] - ux, 2) + Math.pow(q[1] - uy, 2) - r2) <= eps).mapToDouble(q -> Math.atan2(q[1] - uy, q[0] - ux)).sorted().toArray() instanceof double[] an
                    && IntStream.range(0, an.length).mapToDouble(i -> i + 1 < an.length ? an[i + 1] - an[i] : an[0] + 2 * Math.PI - an[i]).max().getAsDouble() < Math.PI - 1e-9
                    ? Math.sqrt(r2) : -1).max().orElse(-1)) instanceof Double ans
            ? ans < 0 ? "-1" : String.format("%.9f", ans) : "");
    }
}

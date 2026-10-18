import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) t[1]) instanceof Integer m
            && new Random(7).doubles(n).toArray() instanceof double[] keys
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> keys[i])).mapToInt(i -> i).toArray() instanceof int[] perm
            && ((ToDoubleBiFunction<double[], double[]>) (p, q) -> p[0] * q[0] + p[1] * q[1] + p[2] * q[2]) instanceof ToDoubleBiFunction<double[], double[]> dot
            && ((BinaryOperator<double[]>) (p, q) -> new double[]{p[1] * q[2] - p[2] * q[1], p[2] * q[0] - p[0] * q[2], p[0] * q[1] - p[1] * q[0]}) instanceof BinaryOperator<double[]> cross
            ? IntStream.range(0, m).mapToObj(qi ->
                new double[]{t[2 + 3 * n + 3 * qi], t[3 + 3 * n + 3 * qi], t[4 + 3 * n + 3 * qi]} instanceof double[] nv0
                && (Double) Math.sqrt(dot.applyAsDouble(nv0, nv0)) instanceof Double len
                && new double[]{nv0[0] / len, nv0[1] / len, nv0[2] / len} instanceof double[] nv
                && (Math.abs(nv[0]) <= Math.abs(nv[1]) && Math.abs(nv[0]) <= Math.abs(nv[2]) ? new double[]{1, 0, 0}
                    : Math.abs(nv[1]) <= Math.abs(nv[2]) ? new double[]{0, 1, 0} : new double[]{0, 0, 1}) instanceof double[] e
                && cross.apply(nv, e) instanceof double[] u0
                && (Double) Math.sqrt(dot.applyAsDouble(u0, u0)) instanceof Double ul
                && new double[]{u0[0] / ul, u0[1] / ul, u0[2] / ul} instanceof double[] u
                && cross.apply(nv, u) instanceof double[] v
                && IntStream.range(0, n).mapToObj(i -> new double[]{t[2 + 3 * perm[i]], t[3 + 3 * perm[i]], t[4 + 3 * perm[i]]}).toArray(double[][]::new) instanceof double[][] P
                && Arrays.stream(P).mapToDouble(p -> dot.applyAsDouble(p, u)).toArray() instanceof double[] x
                && Arrays.stream(P).mapToDouble(p -> dot.applyAsDouble(p, v)).toArray() instanceof double[] y
                && new double[1][] instanceof double[][] c
                && ((IntPredicate) k -> Math.hypot(x[k] - c[0][0], y[k] - c[0][1]) <= c[0][2] + 1e-9) instanceof IntPredicate inside
                && IntStream.range(0, n).allMatch(i ->
                    (c[0] != null && inside.test(i))
                    || ((c[0] = new double[]{x[i], y[i], 0}) != null
                        && IntStream.range(0, i).allMatch(j ->
                            inside.test(j)
                            || ((c[0] = new double[]{(x[i] + x[j]) / 2, (y[i] + y[j]) / 2, Math.hypot(x[i] - x[j], y[i] - y[j]) / 2}) != null
                                && IntStream.range(0, j).allMatch(k ->
                                    inside.test(k)
                                    || ((Double) (2 * ((x[j] - x[i]) * (y[k] - y[i]) - (y[j] - y[i]) * (x[k] - x[i]))) instanceof Double d
                                        && (Double) (((y[k] - y[i]) * (Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2))
                                            - (y[j] - y[i]) * (Math.pow(x[k] - x[i], 2) + Math.pow(y[k] - y[i], 2))) / d) instanceof Double ux
                                        && (Double) (((x[j] - x[i]) * (Math.pow(x[k] - x[i], 2) + Math.pow(y[k] - y[i], 2))
                                            - (x[k] - x[i]) * (Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2))) / d) instanceof Double uy
                                        && (c[0] = new double[]{x[i] + ux, y[i] + uy, Math.hypot(ux, uy)}) != null))))))
                ? String.format(Locale.US, "%.10f", c[0][2]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}

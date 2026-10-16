import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToDouble(Double::parseDouble).toArray() instanceof double[] v
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && new double[n] instanceof double[] b
            && IntStream.range(0, n).allMatch(i -> (b[i] = IntStream.range(0, i).mapToDouble(j ->
                new double[]{v[1 + 3 * i], v[2 + 3 * i], v[3 + 3 * i], v[1 + 3 * j], v[2 + 3 * j], v[3 + 3 * j], b[j]} instanceof double[] p
                && Double.valueOf(p[6] + p[3]) instanceof Double top
                && Double.valueOf(Math.max(p[6], Math.min(p[6] + p[3] * (p[1] - p[4]) / (p[5] - p[4]), top))) instanceof Double lo
                && Double.valueOf(p[6] + p[3] * (p[2] - p[4]) / (p[5] - p[4]) - p[0]) instanceof Double a
                && Double.valueOf(top - (p[5] - p[1]) * p[0] / (p[2] - p[1])) instanceof Double c
                ? (Math.max(lo, a) <= top - p[0] ? Math.max(lo, a) : Math.max(Math.max(lo, c), top - p[0]))
                : 0.0).max().orElse(0)) >= 0)
            ? String.format(Locale.US, "%.8f", IntStream.range(0, n).mapToDouble(i -> b[i] + v[1 + 3 * i]).max().getAsDouble())
            : "");
    }
}




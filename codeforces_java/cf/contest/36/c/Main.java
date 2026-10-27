import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new java.io.PrintStream(new java.io.FileOutputStream("output.txt"), true).println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("input.txt"))).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToDouble(Double::parseDouble).toArray() instanceof double[] v
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && new double[n] instanceof double[] y
            && IntStream.range(0, n).allMatch(i ->
                ((IntToDoubleFunction) j -> v[3 + 3 * j] > v[2 + 3 * j] ? y[j] + v[1 + 3 * j] * (v[2 + 3 * i] - v[2 + 3 * j]) / (v[3 + 3 * j] - v[2 + 3 * j]) : v[2 + 3 * i] > v[2 + 3 * j] ? (y[j] + v[1 + 3 * j]) : y[j]) instanceof IntToDoubleFunction f1
                && ((IntToDoubleFunction) j -> v[3 + 3 * j] > v[2 + 3 * j] ? y[j] + v[1 + 3 * j] * (v[3 + 3 * i] - v[2 + 3 * j]) / (v[3 + 3 * j] - v[2 + 3 * j]) - v[1 + 3 * i] : v[3 + 3 * i] > v[2 + 3 * j] ? (y[j] + v[1 + 3 * j]) : y[j]) instanceof IntToDoubleFunction f2
                && ((IntToDoubleFunction) j -> v[3 + 3 * i] > v[2 + 3 * i] ? (y[j] + v[1 + 3 * j]) - v[1 + 3 * i] * (v[3 + 3 * j] - v[2 + 3 * i]) / (v[3 + 3 * i] - v[2 + 3 * i]) : v[3 + 3 * j] >= v[2 + 3 * i] ? y[j] : (y[j] + v[1 + 3 * j])) instanceof IntToDoubleFunction f3
                && ((IntToDoubleFunction) j ->
                    Math.min((y[j] + v[1 + 3 * j]),
                        Math.max(Math.max(y[j], f1.applyAsDouble(j)), f2.applyAsDouble(j)) <= (y[j] + v[1 + 3 * j]) - v[1 + 3 * i]
                            ? Math.max(Math.max(y[j], f1.applyAsDouble(j)), f2.applyAsDouble(j))
                            : Math.max(Math.max(Math.max(y[j], f1.applyAsDouble(j)), f3.applyAsDouble(j)), (y[j] + v[1 + 3 * j]) - v[1 + 3 * i]))) instanceof IntToDoubleFunction g
                && (y[i] = IntStream.range(0, i).mapToDouble(g).max().orElse(0)) >= 0)
            ? String.format(Locale.US, "%.8f", IntStream.range(0, n).mapToDouble(i -> y[i] + v[1 + 3 * i]).max().getAsDouble())
            : "");
    }
}



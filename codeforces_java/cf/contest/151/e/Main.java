import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Integer.valueOf(rd.getAsInt()) instanceof Integer c
            && IntStream.generate(rd).limit(n).toArray() instanceof int[] x
            && IntStream.generate(rd).limit(n - 1).toArray() instanceof int[] p
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, n - 1) * 2 - 1)) instanceof Integer sz
            && new double[2 * sz][] instanceof double[][] t
            && ((BinaryOperator<double[]>) (a, b) -> new double[]{a[0] + b[0], Math.max(a[1], a[0] + b[1]), Math.max(b[2], b[0] + a[2]), Math.max(Math.max(a[3], b[3]), a[2] + b[1])}) instanceof BinaryOperator<double[]> mg
            && ((DoubleFunction<double[]>) v -> new double[]{v, Math.max(0, v), Math.max(0, v), Math.max(0, v)}) instanceof DoubleFunction<double[]> leaf
            && IntStream.range(0, sz).allMatch(i -> (t[sz + i] = i < n - 1 ? leaf.apply((x[i + 1] - x[i]) / 2.0 - p[i] * c / 100.0) : new double[4]) != null)
            && IntStream.iterate(sz - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (t[i] = mg.apply(t[2 * i], t[2 * i + 1])) != null)
            ? String.format("%.9f", IntStream.range(0, m).mapToDouble(q ->
                Integer.valueOf(rd.getAsInt() - 1 + sz) instanceof Integer l0
                && Integer.valueOf(rd.getAsInt() - 1 + sz) instanceof Integer r0
                && new int[]{l0, r0} instanceof int[] w
                && new double[][]{new double[4], new double[4]} instanceof double[][] acc
                && IntStream.iterate(0, k -> w[0] < w[1], k -> k + 1).allMatch(k ->
                    ((w[0] & 1) == 1 ? (acc[0] = mg.apply(acc[0], t[w[0]++])) != null : true)
                    && ((w[1] & 1) == 1 ? (acc[1] = mg.apply(t[--w[1]], acc[1])) != null : true)
                    && (w[0] >>= 1) >= 0 && (w[1] >>= 1) >= 0)
                ? mg.apply(acc[0], acc[1])[3] : 0).sum())
            : "");
    }
}

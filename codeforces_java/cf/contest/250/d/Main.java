import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToDouble(Double::parseDouble).toArray() instanceof double[] v
            && Integer.valueOf((int) v[0]) instanceof Integer n
            && Integer.valueOf((int) v[1]) instanceof Integer m
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> v[4 + i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && Arrays.stream(ord).mapToDouble(i -> v[4 + i]).toArray() instanceof double[] ys
            && IntStream.range(0, m).boxed().flatMap(j -> Integer.valueOf(Arrays.binarySearch(ys, v[4 + n + j] * v[2] / v[3])) instanceof Integer r
                    && Integer.valueOf(r < 0 ? -r - 1 : r) instanceof Integer ins
                ? IntStream.of(ins - 1, ins).filter(k -> k >= 0 && k < n).mapToObj(k -> new double[]{Math.hypot(v[2], ys[k]) + Math.hypot(v[3] - v[2], v[4 + n + j] - ys[k]) + v[4 + n + m + j], ord[k] + 1, j + 1})
                : Stream.<double[]>empty()).min(Comparator.comparingDouble(x -> x[0])).get() instanceof double[] best
            ? (int) best[1] + " " + (int) best[2] : "");
    }
}

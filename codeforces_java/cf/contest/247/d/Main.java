import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToDouble(Double::parseDouble).toArray() instanceof double[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n && Integer.valueOf((int) in[1]) instanceof Integer m && Double.valueOf(in[2]) instanceof Double a && Double.valueOf(in[3]) instanceof Double b
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble((Integer i) -> in[4 + i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && Arrays.stream(ord).mapToDouble(i -> in[4 + i]).toArray() instanceof double[] sy
            && IntStream.range(0, m).mapToObj(j -> Double.valueOf(in[4 + n + j] * a / b) instanceof Double ys
                && Integer.valueOf(Arrays.binarySearch(sy, ys)) instanceof Integer r && Integer.valueOf(r >= 0 ? r : -r - 1) instanceof Integer ins
                && IntStream.rangeClosed(ins - 2, ins + 1).filter(k -> k >= 0 && k < n).boxed().min(Comparator.comparingDouble((Integer k) -> Math.hypot(a, sy[k]) + Math.hypot(b - a, in[4 + n + j] - sy[k]))).get() instanceof Integer k
                ? new double[]{Math.hypot(a, sy[k]) + Math.hypot(b - a, in[4 + n + j] - sy[k]) + in[4 + n + m + j], ord[k] + 1, j + 1} : null).min(Comparator.comparingDouble((double[] d) -> d[0])).get() instanceof double[] best
            ? (int) best[1] + " " + (int) best[2] : "");
    }
}

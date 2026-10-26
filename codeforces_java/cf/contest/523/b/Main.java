import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer t && (Double) Double.parseDouble(s.next()) instanceof Double c
            && new long[n + 1] instanceof long[] pre && new double[n + 1] instanceof double[] ap
            && IntStream.rangeClosed(1, n).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (pre[i] = pre[i - 1] + a) > 0 && (ap[i] = (ap[i - 1] + a / (double) t) / c) >= 0)
            && (Integer) s.nextInt() instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> (Integer) s.nextInt() instanceof Integer p && (Double) ((pre[p] - pre[p - t]) / (double) t) instanceof Double real
                ? String.format(Locale.ROOT, "%.6f %.6f %.6f", real, ap[p], Math.abs(ap[p] - real) / real) : "").collect(Collectors.joining("\n")) : "");
    }
}

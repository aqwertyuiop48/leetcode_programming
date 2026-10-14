import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && new long[n] instanceof long[] x
            && new long[n] instanceof long[] v
            && IntStream.range(0, n).allMatch(i -> (x[i] = s.nextLong()) == x[i] && (v[i] = s.nextLong()) == v[i])
            && new long[n] instanceof long[] stV
            && new long[n] instanceof long[] stX
            && new int[1] instanceof int[] top
            && new double[]{-1} instanceof double[] best
            && IntStream.range(0, n).allMatch(i -> v[i] < 0
                ? IntStream.range(0, top[0]).allMatch(k ->
                    Double.valueOf((double) (x[i] - stX[k]) / (stV[k] - v[i])) instanceof Double t
                    && (!(best[0] < 0 || t < best[0]) || (best[0] = t) == t))
                : ((top[0] = (int) IntStream.range(0, top[0]).filter(k -> stV[k] > v[i]).count()) >= 0
                    && (stV[top[0]] = v[i]) == v[i]
                    && (stX[top[0]] = x[i]) == x[i]
                    && ++top[0] > 0))
            ? (best[0] < 0 ? "-1" : String.format(Locale.ROOT, "%.10f", best[0]))
            : ""));
    }
}

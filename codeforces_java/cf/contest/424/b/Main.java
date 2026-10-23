import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Long) s.nextLong() instanceof Long p
            && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextInt(), s.nextInt(), s.nextInt()}).map(t -> new double[]{Math.hypot(t[0], t[1]), t[2]}).sorted(Comparator.comparingDouble(t -> t[0])).toList() instanceof List<double[]> l
            && new long[]{p} instanceof long[] acc
            ? l.stream().filter(t -> (acc[0] += (long) t[1]) >= 1000000).findFirst().map(t -> String.format("%.7f", t[0])).orElse("-1") : "");
    }
}

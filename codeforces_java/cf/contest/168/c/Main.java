import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Double.valueOf(s.nextDouble()) instanceof Double a
            && Double.valueOf(s.nextDouble()) instanceof Double d
            && new double[]{0} instanceof double[] prev
            ? IntStream.range(0, n).mapToObj(i -> Double.valueOf(s.nextDouble()) instanceof Double t && Double.valueOf(s.nextDouble()) instanceof Double v
                    && Double.valueOf(t + (v * v / (2 * a) >= d ? Math.sqrt(2 * d / a) : v / a + (d - v * v / (2 * a)) / v)) instanceof Double arrive
                    && (prev[0] = Math.max(prev[0], arrive)) >= 0 ? String.format("%.10f", prev[0]) : "").collect(Collectors.joining("\n"))
            : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextInt(), s.nextInt()}).mapToDouble(p -> Math.atan2(p[1], p[0])).sorted().toArray() instanceof double[] a
            ? String.format(Locale.US, "%.10f", 360 - Math.toDegrees(IntStream.range(0, n).mapToDouble(i -> i + 1 < n ? a[i + 1] - a[i] : a[0] + 2 * Math.PI - a[n - 1]).max().getAsDouble())) : "");
    }
}

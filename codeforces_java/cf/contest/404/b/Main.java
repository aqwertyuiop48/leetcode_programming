import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Double) s.nextDouble() instanceof Double a && (Double) s.nextDouble() instanceof Double d && (Integer) s.nextInt() instanceof Integer n
            ? IntStream.rangeClosed(1, n).mapToObj(i -> (Double) (i * d % (4 * a)) instanceof Double t
                ? t < a ? String.format("%.10f %.10f", t, 0.0) : t < 2 * a ? String.format("%.10f %.10f", a, t - a) : t < 3 * a ? String.format("%.10f %.10f", 3 * a - t, a) : String.format("%.10f %.10f", 0.0, 4 * a - t) : "")
                .collect(Collectors.joining("\n")) : "");
    }
}

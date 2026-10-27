import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Stream.generate(() -> new double[]{s.nextDouble(), s.nextDouble()}).limit(n).toList() instanceof List<double[]> p
            ? String.format("%.9f", p.stream().flatMapToDouble(a -> p.stream().mapToDouble(b -> Math.hypot(a[0] - b[0], a[1] - b[1]))).max().orElse(0))
            : "");
    }
}


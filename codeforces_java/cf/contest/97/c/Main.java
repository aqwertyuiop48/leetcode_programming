import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToDouble(i -> s.nextDouble()).toArray() instanceof double[] p
            ? String.format(Locale.US, "%.10f", IntStream.rangeClosed(0, n / 2).mapToDouble(i ->
                IntStream.rangeClosed((n + 1) / 2, n).mapToDouble(j ->
                    i == j ? p[i] : p[i] + (p[j] - p[i]) * (n / 2.0 - i) / (j - i)).max().getAsDouble()).max().getAsDouble())
            : "");
    }
}






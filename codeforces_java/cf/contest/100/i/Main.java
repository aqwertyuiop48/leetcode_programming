import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble()}).ifPresent(v -> System.out.print(Arrays.stream(new double[]{v[1] * Math.cos(Math.toRadians(v[0])) - v[2] * Math.sin(Math.toRadians(v[0])), v[1] * Math.sin(Math.toRadians(v[0])) + v[2] * Math.cos(Math.toRadians(v[0]))}).mapToObj(d -> String.format(Locale.US, "%.8f", Math.abs(d) < 5e-9 ? 0.0 : d)).collect(Collectors.joining(" ")))));
    }
}






import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(2).toArray()).ifPresent(v -> Optional.of(new double[v[0] + 1][v[1] + 1]).ifPresent(f -> System.out.print(IntStream.rangeClosed(0, v[0]).allMatch(w -> IntStream.rangeClosed(0, v[1]).allMatch(b -> (f[w][b] = w == 0 ? 0 : b == 0 ? 1 : (double) w / (w + b) + (b >= 2 ? (double) b / (w + b) * (b - 1) / (w + b - 1) * ((double) w / (w + b - 2) * f[w - 1][b - 2] + (b >= 3 ? (double) (b - 2) / (w + b - 2) * f[w][b - 3] : 0)) : 0)) >= 0)) ? String.format(Locale.US, "%.9f", f[v[0]][v[1]]) : ""))));
    }
}


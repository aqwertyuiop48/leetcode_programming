import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.generate(sc::nextInt).limit(n).mapToDouble(v -> v / 100.0).toArray() instanceof double[] p
            && Arrays.stream(p).map(x -> 1 - x).toArray() instanceof double[] q
            && Arrays.copyOf(q, n) instanceof double[] pw
            && IntStream.range(0, n).mapToDouble(i -> (1 - pw[i] * q[i]) / (1 - pw[i])).toArray() instanceof double[] g
            && new double[]{Arrays.stream(p).reduce(1, (x, y) -> x * y), 0} instanceof double[] s
            && (s[1] = n + (1 - s[0])) >= 0
            && IntStream.range(0, 300000).filter(it -> Integer.valueOf(IntStream.range(0, n).reduce((u, w) -> g[w] > g[u] ? w : u).getAsInt()) instanceof Integer j
                && (s[0] *= g[j]) >= 0 && (pw[j] *= q[j]) >= 0 && (g[j] = (1 - pw[j] * q[j]) / (1 - pw[j])) >= 0 && (s[1] += 1 - s[0]) < 0).count() >= 0
            ? String.format(Locale.US, "%.9f", s[1]) : "");
    }
}

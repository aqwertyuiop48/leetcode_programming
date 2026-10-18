import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k && (Integer) s.nextInt() instanceof Integer a && new int[n] instanceof int[] lv && new int[n] instanceof int[] ld && IntStream.range(0, n).allMatch(i -> (lv[i] = s.nextInt()) > 0 && (ld[i] = s.nextInt()) >= 0) && IntStream.range(0, 1 << n).mapToDouble(mask -> 2 * Integer.bitCount(mask) > n ? 1.0 : (double) a / (a + IntStream.range(0, n).filter(i -> (mask >> i & 1) == 0).map(i -> lv[i]).sum())).toArray() instanceof double[] f ? String.format(java.util.Locale.US, "%.10f", IntStream.range(0, n).boxed().reduce(List.of(new int[n + 1]), (L, i) -> L.stream().flatMap(c -> IntStream.rangeClosed(0, k - c[n]).mapToObj(x -> IntStream.range(0, n + 1).map(j -> j == i ? x : j == n ? c[n] + x : c[j]).toArray())).collect(Collectors.toList()), (x, y) -> x).stream().filter(c -> c[n] == k).mapToDouble(c -> IntStream.range(0, n).mapToDouble(i -> Math.min(100, ld[i] + 10 * c[i]) / 100.0).toArray() instanceof double[] p ? IntStream.range(0, n).boxed().reduce(new double[] {1}, (g, i) -> IntStream.range(0, 2 * g.length).mapToDouble(m -> g[m % g.length] * (m >= g.length ? p[i] : 1 - p[i])).toArray(), (x, y) -> x) instanceof double[] g2 ? IntStream.range(0, 1 << n).mapToDouble(m -> g2[m] * f[m]).sum() : 0.0 : 0.0).max().orElse(0)) : "").ifPresent(System.out::println);
    }
}

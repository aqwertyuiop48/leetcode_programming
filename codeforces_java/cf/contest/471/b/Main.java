import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(IntStream.range(0, n).map(i -> s.nextInt()).toArray()).ifPresent(h -> Optional.of(IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> h[i])).mapToInt(i -> i + 1).toArray()).ifPresent(p -> Optional.of(IntStream.range(0, n - 1).filter(i -> h[p[i] - 1] == h[p[i + 1] - 1]).toArray()).ifPresent(e -> System.out.print(e.length < 2 ? "NO" : "YES\n" + Stream.of(new int[]{-5, -5}, new int[]{e[0], -5}, new int[]{e[1] == e[0] + 1 ? e[1] : e[0], e[1]}).map(xy -> IntStream.range(0, n).mapToObj(k -> String.valueOf(k == xy[0] || k == xy[1] ? p[k + 1] : k == xy[0] + 1 || k == xy[1] + 1 ? p[k - 1] : p[k])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))))))));
    }
}

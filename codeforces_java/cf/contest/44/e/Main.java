import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(v -> Optional.of(s.next()).ifPresent(t -> System.out.println(
            v[0] * v[1] <= t.length() && t.length() <= v[0] * v[2]
            ? (new int[]{0} instanceof int[] p ? IntStream.range(0, v[0]).mapToObj(i -> t.substring(p[0], p[0] += i == 0 ? Math.max(v[1], t.length() - (v[0] - 1) * v[2]) : Math.min(v[2], t.length() - p[0] - (v[0] - 1 - i) * v[1]))).collect(Collectors.joining("\n")) : "")
            : "No solution"))));
    }
}





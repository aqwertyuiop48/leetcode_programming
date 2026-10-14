import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, 4).map(i -> s.nextInt()).toArray()).ifPresent(a ->
            System.out.println(
                IntStream.range(0, 4).boxed().flatMap(i -> IntStream.range(i + 1, 4).boxed().flatMap(j -> IntStream.range(j + 1, 4).boxed().map(k -> new int[]{a[i], a[j], a[k]})))
                    .map(t -> t instanceof int[] tr && new int[]{Math.max(Math.max(tr[0], tr[1]), tr[2]), tr[0] + tr[1] + tr[2] - Math.max(Math.max(tr[0], tr[1]), tr[2])} instanceof int[] mx
                        ? mx[1] - mx[0]
                        : -1)
                    .collect(Collectors.toList()) instanceof List<Integer> diffs
                ? (diffs.stream().anyMatch(d -> d > 0) ? "TRIANGLE" : diffs.stream().anyMatch(d -> d == 0) ? "SEGMENT" : "IMPOSSIBLE")
                : "")));
    }
}


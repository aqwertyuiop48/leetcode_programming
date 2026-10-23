import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> sc.nextInt()).collect(Collectors.toList()) instanceof List<Integer> given
            && IntStream.rangeClosed(1, 500).boxed().flatMap(x1 -> IntStream.rangeClosed(x1, 2 * x1)
                .mapToObj(x2 -> new ArrayList<>(List.of(x1, x2, 4 * x1 - x2, 3 * x1)))
                .filter(c -> given.stream().allMatch(v -> c.remove(v)))).findFirst() instanceof Optional<ArrayList<Integer>> res
            && res.isPresent()
            ? "YES" + res.get().stream().map(v -> "\n" + v).collect(Collectors.joining())
            : "NO");
    }
}

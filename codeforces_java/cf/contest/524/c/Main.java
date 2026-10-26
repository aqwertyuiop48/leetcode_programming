import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && Arrays.stream(a).boxed().collect(Collectors.toSet()) instanceof Set<Integer> set
            && (Integer) s.nextInt() instanceof Integer q
            ? IntStream.range(0, q).mapToObj(qi -> (Integer) s.nextInt() instanceof Integer x
                ? String.valueOf((Integer) IntStream.rangeClosed(1, k).map(c1 -> IntStream.of(a).filter(v -> (long) c1 * v <= x).map(v -> x - c1 * v == 0 ? c1
                    : IntStream.rangeClosed(1, k - c1).filter(c2 -> (x - c1 * v) % c2 == 0 && set.contains((x - c1 * v) / c2)).map(c2 -> c1 + c2).min().orElse(1000)).min().orElse(1000)).min().orElse(1000) instanceof Integer r ? r >= 1000 ? -1 : r : -1) : "").collect(Collectors.joining("\n")) : "");
    }
}

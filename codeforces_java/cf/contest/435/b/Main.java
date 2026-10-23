import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String a && (Integer) s.nextInt() instanceof Integer k0
            && a.chars().map(c -> c - '0').boxed().collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<Integer> d && new int[]{k0} instanceof int[] k
            && IntStream.range(0, d.size()).allMatch(i -> k[0] <= 0 || IntStream.rangeClosed(i, Math.min(d.size() - 1, i + k[0])).boxed().max(Comparator.comparingInt((Integer j) -> d.get(j)).thenComparing(Comparator.reverseOrder())).get() instanceof Integer j
                && (k[0] -= j - i) >= 0 && d.addAll(i, List.of(d.remove((int) j))))
            ? d.stream().map(String::valueOf).collect(Collectors.joining()) : "");
    }
}

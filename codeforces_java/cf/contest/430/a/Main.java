import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] x
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt(i -> x[i])).toList() instanceof List<Integer> ord
            && new int[n] instanceof int[] col && IntStream.range(0, n).allMatch(r -> (col[ord.get(r)] = r % 2) >= 0)
            ? IntStream.of(col).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && new int[n + 1] instanceof int[] d && IntStream.range(0, 2 * m).allMatch(i -> ++d[s.nextInt()] > 0)
            && IntStream.rangeClosed(1, n).map(i -> d[i]).sorted().boxed().toList() instanceof List<Integer> ds
            ? (m == n && ds.stream().allMatch(x -> x == 2) ? "ring" : m == n - 1 && ds.get(0) == 1 && ds.get(1) == 1 && ds.get(n - 1) == 2 && ds.get(n - 2) == 2 ? "bus" : m == n - 1 && ds.get(n - 2) == 1 && ds.get(n - 1) == n - 1 ? "star" : "unknown") + " topology" : "");
    }
}


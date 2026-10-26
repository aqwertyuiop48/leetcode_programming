import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a && new long[1] instanceof long[] sum
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> a[i])).takeWhile(i -> (sum[0] += a[i]) <= k).sorted().toList() instanceof List<Integer> r
            ? r.size() + "\n" + r.stream().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" ")) : "");
    }
}

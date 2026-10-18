import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && Integer.valueOf(s.nextInt()) instanceof Integer h
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] m
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] v
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> m[i]).thenComparingInt(i -> v[i]).thenComparingInt(i -> i)).toList() instanceof List<Integer> ord
            && ((DoubleFunction<List<Integer>>) t -> ord.stream().filter(new int[]{0} instanceof int[] c ? i -> c[0] < k && v[i] * t >= (c[0] + 1.0) * h && ++c[0] > 0 : i -> false).toList()) instanceof DoubleFunction<List<Integer>> pick
            && new double[]{0, 1e15} instanceof double[] range
            && IntStream.range(0, 200).allMatch(it -> pick.apply((range[0] + range[1]) / 2).size() >= k
                ? (range[1] = (range[0] + range[1]) / 2) >= 0
                : (range[0] = (range[0] + range[1]) / 2) >= 0)
            ? pick.apply(range[1]).stream().map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : "");
    }
}

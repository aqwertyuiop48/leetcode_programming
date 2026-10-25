import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] m
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] v
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingInt((Integer i) -> m[i]).thenComparingInt(i -> v[i]).thenComparingInt(i -> i)).mapToInt(i -> i).toArray() instanceof int[] ord
            && ((DoubleFunction<IntStream>) t -> new int[]{0} instanceof int[] c ? IntStream.range(0, n).map(j -> ord[n - 1 - j]).filter(i -> c[0] < k && v[i] * t >= (k - c[0]) * (double) h && ++c[0] > 0) : IntStream.empty()) instanceof DoubleFunction<IntStream> pick
            && new double[]{0, 1e15} instanceof double[] range
            && IntStream.range(0, 100).allMatch(it -> pick.apply((range[0] + range[1]) / 2).count() >= k
                ? (range[1] = (range[0] + range[1]) / 2) >= 0
                : (range[0] = (range[0] + range[1]) / 2) >= 0)
            ? IntStream.of(pick.apply(range[1]).toArray()).boxed().sorted(Comparator.comparingInt((Integer i) -> m[i]).thenComparingInt(i -> v[i]).thenComparingInt(i -> i)).map(i -> String.valueOf(i + 1)).collect(Collectors.joining(" "))
            : "");
    }
}



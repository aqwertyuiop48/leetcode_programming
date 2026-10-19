import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, n).filter(i -> i == 0 || a[i] != a[i - 1]).map(i -> a[i]).toArray() instanceof int[] b
            && Integer.valueOf(b.length) instanceof Integer m
            && IntStream.rangeClosed(0, k).map(g -> m - 1).toArray() instanceof int[] cost
            && IntStream.range(0, m).allMatch(i -> (cost[b[i]] -= (i > 0 ? 1 : 0) + (i < m - 1 ? 1 : 0)) > -10 && (i == 0 || i == m - 1 || b[i - 1] == b[i + 1] || ++cost[b[i]] > -10))
            ? IntStream.rangeClosed(1, k).boxed().filter(g -> Arrays.stream(b).anyMatch(x -> x == g)).min(Comparator.comparingInt((Integer g) -> cost[g]).thenComparingInt(g -> g)).get() : "");
    }
}

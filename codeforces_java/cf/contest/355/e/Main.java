import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer k
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).min().getAsInt()) instanceof Integer mn && Integer.valueOf(Arrays.stream(a).max().getAsInt()) instanceof Integer mx
            && new int[mx + 1] instanceof int[] pre && Arrays.stream(a).allMatch(x -> ++pre[x] > 0)
            && IntStream.rangeClosed(1, mx).allMatch(v -> (pre[v] += pre[v - 1]) >= 0)
            ? mn <= k + 1 ? mn : IntStream.iterate(mn, d -> d - 1).filter(d -> IntStream.iterate(d, j -> j <= mx, j -> j + d).allMatch(j -> j + k >= mx || pre[Math.min(j + d - 1, mx)] - pre[j + k] == 0)).findFirst().getAsInt() : "");
    }
}

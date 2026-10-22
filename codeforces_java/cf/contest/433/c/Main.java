import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, m).map(i -> it.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(1, m).mapToLong(i -> Math.abs(a[i] - a[i - 1])).sum()
                - IntStream.range(0, m).boxed().flatMap(i -> Stream.of(new int[]{a[i], i > 0 ? a[i - 1] : a[i]}, new int[]{a[i], i < m - 1 ? a[i + 1] : a[i]})).filter(p -> p[0] != p[1])
                    .collect(Collectors.groupingBy(p -> p[0], Collectors.mapping(p -> p[1], Collectors.toList()))).entrySet().stream()
                    .mapToLong(e -> e.getValue().stream().sorted().mapToLong(Integer::longValue).toArray() instanceof long[] v
                        ? Arrays.stream(v).map(y -> Math.abs(y - e.getKey())).sum() - Arrays.stream(v).map(y -> Math.abs(y - v[v.length / 2])).sum() : 0).max().orElse(0) : "");
    }
}

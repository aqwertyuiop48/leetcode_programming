import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && new String[n] instanceof String[] out && new int[]{0} instanceof int[] prev
            && IntStream.range(0, n).allMatch(i -> (out[i] = "pushBack") != null)
            && IntStream.range(0, n).filter(e -> a[e] == 0).allMatch(e -> IntStream.range(prev[0], e).boxed().sorted(Comparator.comparingInt((Integer i) -> -a[i])).limit(3).sorted().toList() instanceof List<Integer> top
                && IntStream.range(0, top.size()).allMatch(j -> (out[top.get(j)] = new String[]{"pushStack", "pushQueue", "pushFront"}[j]) != null)
                && (out[e] = top.size() + new String[]{"", " popStack", " popStack popQueue", " popStack popQueue popFront"}[top.size()]) != null
                && (prev[0] = e + 1) > 0)
            ? String.join("\n", out) : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] a
            && IntStream.range(0, n).boxed().collect(Collectors.groupingBy(i -> a[i], TreeMap::new, Collectors.toList())) instanceof TreeMap<Integer, List<Integer>> m
            && m.entrySet().stream().filter(e -> IntStream.range(2, e.getValue().size()).allMatch(j -> e.getValue().get(j) - e.getValue().get(j - 1) == e.getValue().get(1) - e.getValue().get(0)))
                .map(e -> e.getKey() + " " + (e.getValue().size() < 2 ? 0 : e.getValue().get(1) - e.getValue().get(0))).toList() instanceof List<String> r
            ? r.size() + "\n" + String.join("\n", r) : "");
    }
}

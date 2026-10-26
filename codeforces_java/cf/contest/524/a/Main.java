import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer k
            && new TreeMap<Integer, Set<Integer>>() instanceof TreeMap<Integer, Set<Integer>> g
            && IntStream.range(0, m).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
                && g.computeIfAbsent(a, x -> new TreeSet<>()).add(b) && g.computeIfAbsent(b, x -> new TreeSet<>()).add(a))
            ? g.keySet().stream().map(x -> x + ": " + (g.keySet().stream().filter(y -> !y.equals(x) && !g.get(x).contains(y)
                && g.get(x).stream().filter(g.get(y)::contains).count() * 100 >= (long) k * g.get(x).size()).toList() instanceof List<Integer> r
                ? r.size() + r.stream().map(y -> " " + y).collect(Collectors.joining()) : "")).collect(Collectors.joining("\n")) : "");
    }
}

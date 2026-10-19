import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] c
            && new HashMap<Integer, Set<Integer>>() instanceof HashMap<Integer, Set<Integer>> nb
            && Arrays.stream(c).allMatch(x -> nb.computeIfAbsent(x, kk -> new HashSet<>()) != null)
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(c[it.next() - 1]) instanceof Integer a && Integer.valueOf(c[it.next() - 1]) instanceof Integer b
                && (a.equals(b) || nb.get(a).add(b) && nb.get(b).add(a) || true))
            ? nb.keySet().stream().min(Comparator.<Integer>comparingInt(k -> -nb.get(k).size()).thenComparingInt(k -> k)).get() : "");
    }
}

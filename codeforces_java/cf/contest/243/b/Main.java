import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer h && Integer.valueOf(it.next()) instanceof Integer t
            && IntStream.rangeClosed(0, n).mapToObj(i -> new HashSet<Integer>()).toList() instanceof List<HashSet<Integer>> adj
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next(), it.next()}).toList() instanceof List<int[]> edges
            && edges.stream().allMatch(e -> adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
            && ((BiFunction<Integer, Integer, String>) (u, v) -> adj.get(u).size() > h && adj.get(v).size() > t
                && adj.get(u).stream().filter(x -> !x.equals(v)).toList() instanceof List<Integer> A && adj.get(v).stream().filter(x -> !x.equals(u)).toList() instanceof List<Integer> B
                && A.size() >= h && B.size() >= t
                && (A.size() <= B.size() ? A : B) instanceof List<Integer> small && (A.size() <= B.size() ? adj.get(v) : adj.get(u)) instanceof HashSet<Integer> other
                && small.stream().filter(other::contains).toList() instanceof List<Integer> C
                && A.size() + B.size() - C.size() >= h + t
                ? A.stream().filter(x -> !adj.get(v).contains(x)).limit(h).toList() instanceof List<Integer> h1
                    && Stream.concat(h1.stream(), A.stream().filter(x -> adj.get(v).contains(x)).limit(h - h1.size())).toList() instanceof List<Integer> heads
                    && B.stream().filter(x -> !heads.contains(x)).limit(t).toList() instanceof List<Integer> tails
                    && tails.size() == t
                    ? "YES\n" + u + " " + v + "\n" + heads.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "\n" + tails.stream().map(String::valueOf).collect(Collectors.joining(" ")) : null : null) instanceof BiFunction<Integer, Integer, String> tryHydra
            ? edges.stream().flatMap(e -> Stream.of(tryHydra.apply(e[0], e[1]), tryHydra.apply(e[1], e[0]))).filter(Objects::nonNull).findFirst().orElse("NO") : "");
    }
}

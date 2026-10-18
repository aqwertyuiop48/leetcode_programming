import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer u && Integer.valueOf(rd.getAsInt()) instanceof Integer v && adj.get(u).add(v) && adj.get(v).add(u))
            && new int[n + 1] instanceof int[] mark
            && new ArrayList<Integer>(IntStream.rangeClosed(1, n).boxed().toList()) instanceof ArrayList<Integer> rest
            && new ArrayList<List<Integer>> () instanceof ArrayList<List<Integer>> comps
            && Stream.generate(() -> rest.isEmpty() ? null : rest.remove(0)).takeWhile(Objects::nonNull).allMatch(root ->
                new ArrayList<Integer>(List.of(root)) instanceof ArrayList<Integer> comp
                && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().allMatch(u -> (mark[u] = v) > 0)
                    && rest.stream().filter(u -> mark[u] != v).toList() instanceof List<Integer> free
                    && free.stream().allMatch(u -> comp.add(u) && dq.add(u))
                    && rest.removeAll(new HashSet<>(free)) || true)
                && comps.add(comp.stream().sorted().toList()))
            ? comps.size() + "\n" + comps.stream().map(c -> c.size() + " " + c.stream().map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "");
    }
}

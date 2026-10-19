import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>(List.of(i))).toList() instanceof List<ArrayList<Integer>> nb
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer u && Integer.valueOf(it.next()) instanceof Integer v && nb.get(u).add(v) && nb.get(v).add(u))
            && IntStream.range(0, n + 1).map(i -> i == 0 ? 0 : it.next()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] val && new boolean[n + 1] instanceof boolean[] pressed
            && new ArrayDeque<Integer>(IntStream.rangeClosed(1, n).filter(i -> a[i] == 0).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).filter(j -> !pressed[j] && val[j] == a[j])
                .map(j -> (pressed[j] = true) && res.add(j) && nb.get(j).stream().allMatch(u -> ++val[u] != a[u] || dq.add(u) || true)).count() >= 0
            ? res.size() + "\n" + res.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

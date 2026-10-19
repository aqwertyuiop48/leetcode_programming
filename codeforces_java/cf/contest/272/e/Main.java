import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && Stream.generate(ArrayList<Integer>::new).limit(n + 1).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.nextInt()) instanceof Integer a && Integer.valueOf(it.nextInt()) instanceof Integer b && adj.get(a).add(b) && adj.get(b).add(a))
            && new int[n + 1] instanceof int[] col
            && IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(ArrayDeque::new)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(u -> col[u] == col[v]).count() < 2
                || (col[v] ^= 1) >= 0 && adj.get(v).stream().allMatch(dq::add))
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(col[i])).collect(Collectors.joining()) : "");
    }
}

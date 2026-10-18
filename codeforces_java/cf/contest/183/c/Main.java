import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(0, m).mapToObj(i -> new int[]{Integer.parseInt((String) it.next()), Integer.parseInt((String) it.next())}).toList() instanceof List<int[]> es
            && es.stream().allMatch(e -> adj.get(e[0]).add(new int[]{e[1], 1}) && adj.get(e[1]).add(new int[]{e[0], -1}))
            && new long[n + 1] instanceof long[] d
            && new boolean[n + 1] instanceof boolean[] seen
            && IntStream.rangeClosed(1, n).filter(v -> !seen[v]).allMatch(root -> (seen[root] = true)
                && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(e -> !seen[e[0]]).allMatch(e -> (seen[e[0]] = true) && (d[e[0]] = d[v] + e[1]) > Long.MIN_VALUE && dq.add(e[0]))))
            && Long.valueOf(es.stream().mapToLong(e -> Math.abs(d[e[0]] + 1 - d[e[1]])).reduce(0, (a, b) -> BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue())) instanceof Long g
            ? g == 0 ? n : g
            : 0);
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(t ->
            System.out.println(
                Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer n
                && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer m
                && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer k
                && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
                && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer u
                    && Integer.valueOf(Integer.parseInt(t.nextToken())) instanceof Integer v
                    && adj.get(u).add(v) && adj.get(v).add(u))
                && IntStream.range(0, k).mapToObj(i -> Long.parseLong(t.nextToken()) << 24 | Long.parseLong(t.nextToken()) << 12 | Long.parseLong(t.nextToken())).collect(Collectors.toSet()) instanceof Set<Long> forb
                && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> par
                && par.put(1, 0) == null
                && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> q
                ? Stream.generate(q::poll).takeWhile(Objects::nonNull)
                    .peek(st -> adj.get(st % 4096).stream()
                        .filter(w -> !forb.contains((long) (st / 4096) << 24 | (long) (st % 4096) << 12 | w) && par.putIfAbsent(st % 4096 * 4096 + w, st) == null)
                        .forEach(w -> q.add(st % 4096 * 4096 + w)))
                    .filter(st -> st % 4096 == n)
                    .findFirst()
                    .map(st -> Stream.iterate(st, x -> x > 0, x -> par.get(x)).map(x -> x % 4096).toList() instanceof List<Integer> p
                        ? (p.size() - 1) + "\n" + IntStream.range(0, p.size()).mapToObj(i -> String.valueOf(p.get(p.size() - 1 - i))).collect(Collectors.joining(" "))
                        : "")
                    .orElse("-1")
                : ""));
    }
}






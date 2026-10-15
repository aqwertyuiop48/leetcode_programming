import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1}).toList() instanceof List<int[]> es
            && es.stream().collect(Collectors.groupingBy(e -> e[0], Collectors.mapping(e -> e[1], Collectors.toList()))) instanceof Map<Integer, List<Integer>> adj
            && IntStream.range(0, n).map(i -> i == 0 ? 0 : -1).toArray() instanceof int[] d
            && new int[]{0} instanceof int[] lvl
            && Stream.iterate(List.of(0), fr -> lvl[0]++ >= 0
                    ? fr.stream().flatMap(u -> adj.getOrDefault(u, List.of()).stream()).filter(v -> d[v] < 0 && (d[v] = lvl[0]) >= 0).toList()
                    : fr)
                .takeWhile(fr -> !fr.isEmpty()).allMatch(fr -> true)
            && Integer.valueOf(es.stream().filter(e -> d[e[0]] >= 0).mapToInt(e -> Math.abs(d[e[0]] + 1 - d[e[1]]))
                .reduce(0, (x, y) -> BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue())) instanceof Integer g
            && IntStream.range(0, n).filter(i -> d[i] >= 0 && d[i] % g == 0).mapToObj(i -> "" + (i + 1)).toList() instanceof List<String> cam
            ? g + "\n" + cam.size() + "\n" + String.join(" ", cam) : ""));
    }
}




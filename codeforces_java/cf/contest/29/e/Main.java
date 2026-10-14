import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
            && IntStream.range(0, 2 * nm[1]).map(i -> s.nextInt()).toArray() instanceof int[] edges
            && new HashMap<Integer, List<Integer>>() instanceof HashMap<Integer, List<Integer>> adj
            && IntStream.range(0, nm[1]).allMatch(i -> adj.computeIfAbsent(edges[2 * i], k -> new ArrayList<Integer>()).add(edges[2 * i + 1]) && adj.computeIfAbsent(edges[2 * i + 1], k -> new ArrayList<Integer>()).add(edges[2 * i]))
            && new long[]{nm[0] + 1L} instanceof long[] baseArr
            && new long[]{1L * baseArr[0] + nm[0], (long) nm[0] * baseArr[0] + 1L} instanceof long[] se
            && new HashMap<Long, Long>() instanceof HashMap<Long, Long> parentMap
            && parentMap.put(se[0], -1L) == null
            && Stream.iterate(List.of(se[0]), fr -> !fr.isEmpty(), fr ->
                    fr.stream().flatMap(code ->
                        adj.getOrDefault((int) (code / baseArr[0]), Collections.<Integer>emptyList()).stream().flatMap(u2 ->
                            adj.getOrDefault((int) (code % baseArr[0]), Collections.<Integer>emptyList()).stream()
                                .filter(v2 -> !u2.equals(v2))
                                .map(v2 -> (long) u2 * baseArr[0] + v2)
                        ).filter(code2 -> parentMap.putIfAbsent(code2, code) == null)
                    ).distinct().collect(Collectors.toList())
                ).count() >= 0
            && new boolean[]{parentMap.containsKey(se[1])} instanceof boolean[] foundArr
            ? (!foundArr[0] ? "-1"
                : Stream.iterate(se[1], cd -> cd != -1L, cd -> parentMap.get(cd)).collect(Collectors.toList()) instanceof List<Long> revPath
                  && new int[]{revPath.size() - 1} instanceof int[] kLen
                  ? kLen[0] + "\n"
                    + IntStream.rangeClosed(0, kLen[0]).mapToObj(t -> String.valueOf(revPath.get(kLen[0] - t) / baseArr[0])).collect(Collectors.joining(" "))
                    + "\n"
                    + IntStream.rangeClosed(0, kLen[0]).mapToObj(t -> String.valueOf(revPath.get(kLen[0] - t) % baseArr[0])).collect(Collectors.joining(" "))
                  : "-1")
            : "-1"
        );
    }
}

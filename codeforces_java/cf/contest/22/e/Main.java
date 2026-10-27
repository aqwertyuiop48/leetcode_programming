import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner s
            && (Integer) s.nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : s.nextInt()).toArray() instanceof int[] f
            && Stream.iterate(new int[][]{f, IntStream.rangeClosed(0, n).toArray()}, st -> new int[][]{
                    IntStream.rangeClosed(0, n).map(i -> st[0][st[0][i]]).toArray(),
                    IntStream.rangeClosed(0, n).map(i -> Math.min(st[1][i], st[1][st[0][i]])).toArray()}).skip(17).findFirst().get() instanceof int[][] st
            && IntStream.rangeClosed(0, n).map(i -> st[1][st[0][i]]).toArray() instanceof int[] comp
            && new int[n + 1] instanceof int[] indeg
            && IntStream.rangeClosed(1, n).allMatch(i -> ++indeg[f[i]] > 0)
            && IntStream.rangeClosed(1, n).filter(i -> indeg[i] == 0).boxed().collect(Collectors.groupingBy(i -> comp[i])) instanceof Map<Integer, List<Integer>> srcMap
            && IntStream.rangeClosed(1, n).map(i -> comp[i]).distinct().sorted().toArray() instanceof int[] ids
            && Arrays.stream(ids).mapToObj(id -> srcMap.getOrDefault(id, List.of(id))).toList() instanceof List<List<Integer>> srcs
            ? ids.length == 1 && srcMap.isEmpty()
                ? "0"
                : srcs.stream().mapToInt(List::size).sum() + "\n" + Stream.concat(
                        IntStream.range(0, ids.length).mapToObj(j -> ids[j] + " " + srcs.get((j + 1) % ids.length).get(0)),
                        IntStream.range(0, ids.length).boxed().flatMap(j -> srcs.get(j).stream().skip(1).map(e -> ids[j] + " " + e)))
                    .collect(Collectors.joining("\n"))
            : "");
    }
}





import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof int[] htr
                && Integer.valueOf(s.nextInt()) instanceof Integer n
                && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] hg
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] tg
                && ((Function<int[], Stream<int[]>>) p -> Stream.concat(
                        IntStream.rangeClosed(1, Math.min(n, p[0])).mapToObj(i -> new int[]{p[0] - i + hg[i - 1][0], p[1] + hg[i - 1][1]}),
                        IntStream.rangeClosed(1, Math.min(m, p[1])).mapToObj(j -> new int[]{p[0] + tg[j - 1][0], p[1] - j + tg[j - 1][1]}))) instanceof Function<int[], Stream<int[]>> mv
                && ((Predicate<int[]>) q -> q[0] + q[1] <= htr[2]) instanceof Predicate<int[]> ok
                && new boolean[htr[2] + 1][htr[2] + 1] instanceof boolean[][] vis
                && (vis[htr[0]][htr[1]] = true)
                && Stream.iterate(List.of(new int[]{htr[0], htr[1]}), fr -> !fr.isEmpty(),
                        fr -> fr.stream().flatMap(mv).filter(ok).filter(q -> !vis[q[0]][q[1]] && (vis[q[0]][q[1]] = true)).toList()).toList() instanceof List<List<int[]>> levels
                && IntStream.range(0, levels.size()).filter(i -> levels.get(i).stream().anyMatch(p -> p[0] == 0 && p[1] == 0)).findFirst() instanceof OptionalInt iv
                ? (iv.isPresent() ? "Ivan\n" + iv.getAsInt()
                    : levels.stream().flatMap(List::stream).toList() instanceof List<int[]> reach
                    && new int[htr[2] + 1][htr[2] + 1] instanceof int[][] indeg
                    && reach.stream().allMatch(p -> mv.apply(p).filter(ok).allMatch(q -> ++indeg[q[0]][q[1]] > 0))
                    && Stream.iterate(reach.stream().filter(p -> indeg[p[0]][p[1]] == 0).toList(), fr -> !fr.isEmpty(),
                            fr -> fr.stream().flatMap(mv).filter(ok).filter(q -> --indeg[q[0]][q[1]] == 0).toList()).toList() instanceof List<List<int[]>> topo
                    ? (topo.stream().mapToInt(List::size).sum() < reach.size() ? "Draw"
                        : new int[htr[2] + 1][htr[2] + 1] instanceof int[][] val
                        && IntStream.iterate(topo.size() - 1, i -> i >= 0, i -> i - 1).allMatch(i -> topo.get(i).stream().allMatch(p ->
                            (val[p[0]][p[1]] = mv.apply(p).mapToInt(q -> q[0] + q[1] > htr[2] ? 1 : 1 + val[q[0]][q[1]]).max().getAsInt()) > 0))
                        ? "Zmey\n" + val[htr[0]][htr[1]] : "")
                    : "")
                : ""));
    }
}

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
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] color
            && new int[n + 1] instanceof int[] comp
            && new ArrayList<int[]>() instanceof ArrayList<int[]> cc
            && new boolean[]{true} instanceof boolean[] ok
            && IntStream.rangeClosed(1, n).filter(v -> color[v] < 0).allMatch(root -> (color[root] = 0) == 0 && (comp[root] = cc.size()) >= 0 && cc.add(new int[]{0, 0})
                && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> ++cc.get(comp[root])[color[v]] > 0
                    && adj.get(v).stream().allMatch(u -> color[u] < 0 ? (color[u] = 1 - color[v]) >= 0 && (comp[u] = comp[root]) >= 0 && dq.add(u) : color[u] != color[v] || !(ok[0] = false))))
            && ok[0]
            && Integer.valueOf(cc.size()) instanceof Integer c
            && new int[c + 1][9] instanceof int[][] from
            && (from[0][0] = -2) == -2
            && IntStream.range(0, c).allMatch(i -> IntStream.range(0, 9).filter(s -> from[i][s] != 0).allMatch(s ->
                (from[i + 1][(s / 3 + cc.get(i)[0]) % 3 * 3 + (s % 3 + cc.get(i)[1]) % 3] != 0 || (from[i + 1][(s / 3 + cc.get(i)[0]) % 3 * 3 + (s % 3 + cc.get(i)[1]) % 3] = s * 2 + 1) > 0)
                && (from[i + 1][(s / 3 + cc.get(i)[1]) % 3 * 3 + (s % 3 + cc.get(i)[0]) % 3] != 0 || (from[i + 1][(s / 3 + cc.get(i)[1]) % 3 * 3 + (s % 3 + cc.get(i)[0]) % 3] = s * 2 + 2) > 0)))
            && from[c][0] != 0
            && new int[c] instanceof int[] orient
            && new int[]{0} instanceof int[] cur
            && IntStream.iterate(c, i -> i > 0, i -> i - 1).allMatch(i -> (orient[i - 1] = (from[i][cur[0]] - 1) % 2) >= 0 && (cur[0] = (from[i][cur[0]] - 1) / 2) >= 0)
            ? "YES\n" + IntStream.rangeClosed(1, n).mapToObj(v -> String.valueOf(1 + (color[v] ^ orient[comp[v]]))).collect(Collectors.joining(" "))
            : "NO");
    }
}

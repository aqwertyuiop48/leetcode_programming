import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 2] instanceof long[] tk && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] == 45 ? (st[3] = 1) > 0 : raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tk[(int) st[0]++] = st[3] > 0 ? -st[1] : st[1]) > Long.MIN_VALUE & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tk[0]) instanceof Integer n
            && Stream.<IntFunction<int[][]>>of(off -> new int[n + 2] instanceof int[] sx && new int[2 * n] instanceof int[] adj && new int[n + 1] instanceof int[] par && new int[n] instanceof int[] ord && new int[]{1} instanceof int[] tl
                    && IntStream.range(0, n - 1).filter(j -> ++sx[(int) tk[off + 2 * j] + 1] > 0 & ++sx[(int) tk[off + 2 * j + 1] + 1] > 0).count() >= 0
                    && IntStream.rangeClosed(1, n + 1).filter(i -> (sx[i] += sx[i - 1]) >= 0).count() >= 0
                    && Arrays.copyOf(sx, n + 2) instanceof int[] fp
                    && IntStream.range(0, n - 1).filter(j -> (adj[fp[(int) tk[off + 2 * j]]++] = (int) tk[off + 2 * j + 1]) > 0 & (adj[fp[(int) tk[off + 2 * j + 1]]++] = (int) tk[off + 2 * j]) > 0).count() >= 0
                    && (ord[0] = 1) == 1
                    && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i]) instanceof Integer u && IntStream.range(sx[u], sx[u + 1]).filter(e -> adj[e] != 1 && par[adj[e]] == 0 && (par[adj[e]] = u) > 0 && (ord[tl[0]++] = adj[e]) > 0).count() >= 0).count() >= 0
                    ? new int[][]{par, ord} : null).findFirst().get() instanceof IntFunction<int[][]> bfs
            && bfs.apply(1) instanceof int[][] t1 && bfs.apply(2 * n - 1) instanceof int[][] t2
            && t1[0] instanceof int[] p1 && t2[0] instanceof int[] p2 && t2[1] instanceof int[] o2 && t1[1] instanceof int[] o1
            && new int[n + 1] instanceof int[] top2
            && IntStream.range(0, n).filter(i -> Integer.valueOf(o2[i]) instanceof Integer v && (top2[v] = p2[v] != 0 && (p1[v] == p2[v] || p1[p2[v]] == v) ? top2[p2[v]] : v) > 0).count() >= 0
            && IntStream.range(1, n).map(i -> o1[n - i]).filter(v -> p2[v] != p1[v] && p2[p1[v]] != v).mapToObj(v -> v + " " + p1[v] + " " + top2[v] + " " + p2[top2[v]]).toList() instanceof List<String> ops
            ? ops.isEmpty() ? "0" : ops.size() + "\n" + String.join("\n", ops) : "");
    }
}

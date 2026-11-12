import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer n && Integer.valueOf(tk[1]) instanceof Integer m
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk[2 + 3 * i])).toArray() instanceof int[] eu
            && IntStream.range(0, m).map(i -> Integer.parseInt(tk[3 + 3 * i])).toArray() instanceof int[] ev
            && IntStream.range(0, m).map(i -> tk[4 + 3 * i].charAt(0) == 'B' ? 1 : 0).toArray() instanceof int[] ec
            && new int[n + 2] instanceof int[] st
            && IntStream.range(0, m).filter(i -> ++st[eu[i] + 1] > 0 & ++st[ev[i] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(v -> (st[v] += st[v - 1]) >= 0).count() >= 0
            && st.clone() instanceof int[] cur && new int[2 * m] instanceof int[] adj && new int[2 * m] instanceof int[] eid
            && IntStream.range(0, m).filter(i -> (adj[cur[eu[i]]] = ev[i]) > 0 & (eid[cur[eu[i]]++] = i) >= 0 & (adj[cur[ev[i]]] = eu[i]) > 0 & (eid[cur[ev[i]]++] = i) >= 0).count() >= 0
            && IntStream.range(0, 2).mapToObj(t -> IntStream.generate(() -> -1).limit(n + 1).toArray()).toArray(int[][]::new) instanceof int[][] col
            && new int[2][n + 1] instanceof int[][] comp && new int[2][n + 1] instanceof int[][] q
            && new int[2][n + 1] instanceof int[][] sz && new int[2][n + 1] instanceof int[][] on
            && new int[2] instanceof int[] bad && new int[2] instanceof int[] nc && new int[2] instanceof int[] cost
            && IntStream.range(0, 2).filter(T -> new int[]{0} instanceof int[] tl && new int[]{1} instanceof int[] pt
                && IntStream.range(0, n).filter(i -> (i < tl[0] || (Integer.valueOf(IntStream.rangeClosed(pt[0], n).filter(z -> col[T][z] < 0).findFirst().getAsInt()) instanceof Integer s
                        && (pt[0] = s) > 0 && (col[T][s] = 0) == 0 && (comp[T][s] = nc[T]++) >= 0 && (q[T][tl[0]++] = s) > 0))
                    && Integer.valueOf(q[T][i]) instanceof Integer v
                    && IntStream.range(st[v], st[v + 1]).filter(e -> Integer.valueOf(adj[e]) instanceof Integer w
                        && Integer.valueOf(col[T][v] ^ (ec[eid[e]] != T ? 1 : 0)) instanceof Integer want
                        && (col[T][w] < 0 ? (col[T][w] = want) >= 0 & (comp[T][w] = comp[T][v]) >= 0 & (q[T][tl[0]++] = w) > 0 : (col[T][w] != want ? (bad[T] = 1) > 0 : true))).count() >= 0).count() >= 0
                && IntStream.rangeClosed(1, n).filter(x -> ++sz[T][comp[T][x]] > 0 & (on[T][comp[T][x]] += col[T][x]) >= 0).count() >= 0
                && (cost[T] = bad[T] == 1 ? Integer.MAX_VALUE : IntStream.range(0, nc[T]).map(c -> Math.min(on[T][c], sz[T][c] - on[T][c])).sum()) != -1).count() >= 0
            ? (cost[0] == Integer.MAX_VALUE && cost[1] == Integer.MAX_VALUE ? "-1"
                : Integer.valueOf(cost[0] <= cost[1] ? 0 : 1) instanceof Integer bt
                    ? cost[bt] + "\n" + IntStream.rangeClosed(1, n).filter(x -> col[bt][x] == (on[bt][comp[bt][x]] <= sz[bt][comp[bt][x]] - on[bt][comp[bt][x]] ? 1 : 0)).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                    : "")
            : "");
    }
}

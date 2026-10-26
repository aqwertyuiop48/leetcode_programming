import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new int[m] instanceof int[] ea && new int[m] instanceof int[] eb && new int[n + 2] instanceof int[] start
            && IntStream.range(0, m).allMatch(i -> (ea[i] = Integer.parseInt(tk.nextToken()) - 1) >= 0 && (eb[i] = Integer.parseInt(tk.nextToken()) - 1) >= 0 && ++start[ea[i] + 1] > 0 && ++start[eb[i] + 1] > 0)
            && IntStream.range(0, n).allMatch(i -> (start[i + 1] += start[i]) >= 0) && new int[2 * m] instanceof int[] adj && start.clone() instanceof int[] fill
            && IntStream.range(0, m).allMatch(i -> (adj[fill[ea[i]]++] = eb[i]) >= 0 && (adj[fill[eb[i]]++] = ea[i]) >= 0)
            && new short[n][n] instanceof short[][] d
            && IntStream.range(0, n).allMatch(v -> d[v] instanceof short[] r && new int[n] instanceof int[] q && (q[0] = v) >= 0 && IntStream.range(0, n).allMatch(i -> (r[i] = -1) < 0) && (r[v] = 0) == 0 && new int[]{0, 1} instanceof int[] st
                && Stream.generate(() -> 0).takeWhile(z -> st[0] < st[1]).allMatch(z -> (Integer) q[st[0]++] instanceof Integer u
                    && IntStream.range(start[u], start[u + 1]).allMatch(e -> r[adj[e]] >= 0 || (r[adj[e]] = (short) (r[u] + 1)) > 0 && (q[st[1]++] = adj[e]) >= 0)))
            && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer s1 && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer t1 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l1
            && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer s2 && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer t2 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l2
            ? d[s1][t1] > l1 || d[s2][t2] > l2 ? "-1"
                : String.valueOf(m - IntStream.range(0, n * n).map(t -> (Integer) (t / n) instanceof Integer x && (Integer) (t % n) instanceof Integer y
                    ? Math.min(
                        d[s1][x] + d[x][y] + d[y][t1] <= l1 && d[s2][x] + d[x][y] + d[y][t2] <= l2 ? d[s1][x] + d[x][y] + d[y][t1] + d[s2][x] + d[y][t2] : Integer.MAX_VALUE,
                        d[s1][x] + d[x][y] + d[y][t1] <= l1 && d[t2][x] + d[x][y] + d[y][s2] <= l2 ? d[s1][x] + d[x][y] + d[y][t1] + d[t2][x] + d[y][s2] : Integer.MAX_VALUE) : 0)
                    .reduce(d[s1][t1] + d[s2][t2], Math::min)) : "");
    }
}

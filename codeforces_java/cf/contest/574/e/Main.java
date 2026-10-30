import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[n + 2] instanceof int[] deg && new int[n - 1 < 0 ? 0 : n - 1] instanceof int[] ea && new int[n - 1 < 0 ? 0 : n - 1] instanceof int[] eb
            && IntStream.range(0, n - 1).filter(e -> (ea[e] = Integer.parseInt(tk.nextToken())) > 0 && (eb[e] = Integer.parseInt(tk.nextToken())) > 0 && ++deg[ea[e]] > 0 && ++deg[eb[e]] > 0 && false).count() >= 0
            && new int[n + 2] instanceof int[] st && IntStream.rangeClosed(1, n).filter(v -> (st[v + 1] = st[v] + deg[v]) < 0).count() >= 0
            && IntStream.rangeClosed(0, n + 1).map(v -> st[v]).toArray() instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).filter(e -> (adj[pos[ea[e]]++] = eb[e]) > 0 && (adj[pos[eb[e]]++] = ea[e]) > 0 && false).count() >= 0
            && new boolean[n + 1] instanceof boolean[] del && new int[1] instanceof int[] prevH && new int[n + 1] instanceof int[] legs
            && IntStream.rangeClosed(1, n).filter(l -> deg[l] == 1 && !del[l] && (prevH[0] = 0) == 0
                && IntStream.iterate(l, c -> c > 0, c -> (Integer) IntStream.range(st[c], st[c + 1]).map(k -> adj[k]).filter(u -> u != prevH[0] && !del[u] && deg[u] <= 2).findFirst().orElse(0) instanceof Integer u2 && (prevH[0] = c) > 0 ? u2 : 0)
                    .filter(c -> (del[c] = true) && false).count() >= 0 && false).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (legs[v] = (int) Math.min(2, IntStream.range(st[v], st[v + 1]).filter(k -> del[adj[k]]).count())) < 0).count() >= 0
            && IntStream.rangeClosed(1, n).allMatch(v -> del[v] || IntStream.range(st[v], st[v + 1]).filter(k -> !del[adj[k]] && deg[adj[k]] - legs[adj[k]] > 1).count() <= 2) ? "Yes" : "No");
    }
}

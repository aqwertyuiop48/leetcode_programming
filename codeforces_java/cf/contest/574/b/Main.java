import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new boolean[n + 1][n + 1] instanceof boolean[][] adj && new int[n + 1] instanceof int[] deg && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev
            && IntStream.range(0, m).filter(e -> (eu[e] = Integer.parseInt(tk.nextToken())) > 0 && (ev[e] = Integer.parseInt(tk.nextToken())) > 0 && (adj[eu[e]][ev[e]] = true) && (adj[ev[e]][eu[e]] = true) && ++deg[eu[e]] > 0 && ++deg[ev[e]] > 0 && false).count() >= 0
            ? IntStream.range(0, m).flatMap(e -> IntStream.rangeClosed(1, n).filter(w -> adj[eu[e]][w] && adj[ev[e]][w]).map(w -> deg[eu[e]] + deg[ev[e]] + deg[w] - 6)).min().orElse(-1) : -2);
    }
}

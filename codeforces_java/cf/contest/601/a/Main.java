import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n
            && new boolean[n][n] instanceof boolean[][] g
            && IntStream.range(0, a[1]).allMatch(e -> (g[a[2 + 2 * e] - 1][a[3 + 2 * e] - 1] = g[a[3 + 2 * e] - 1][a[2 + 2 * e] - 1] = true))
            && (Boolean) g[0][n - 1] instanceof Boolean t
            && new int[n] instanceof int[] dist
            && IntStream.range(0, n).allMatch(i -> (dist[i] = i == 0 ? 0 : -1) < 1)
            && IntStream.range(0, n).allMatch(d -> IntStream.range(0, n).filter(v -> dist[v] == d).allMatch(v -> IntStream.range(0, n).filter(u -> u != v && dist[u] < 0 && g[v][u] != t).allMatch(u -> (dist[u] = d + 1) > 0)))
            ? dist[n - 1] : "");
    }
}

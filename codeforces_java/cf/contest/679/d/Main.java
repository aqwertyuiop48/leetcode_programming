
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer n && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] ed
            && new int[n + 1] instanceof int[] off && new int[n] instanceof int[] deg
            && IntStream.range(0, 2 * m).filter(i -> ++deg[ed[i]] < 0).count() == 0
            && IntStream.range(0, n).filter(v -> (off[v + 1] = off[v] + deg[v]) < 0).count() == 0
            && Arrays.copyOf(off, n) instanceof int[] pos && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).filter(e -> (adj[pos[ed[2 * e]]++] = ed[2 * e + 1]) < 0 | (adj[pos[ed[2 * e + 1]]++] = ed[2 * e]) < 0).count() == 0
            && new int[n * n] instanceof int[] dist && new int[n] instanceof int[] qu && new int[1] instanceof int[] qt
            && IntStream.range(0, n).allMatch(s -> Stream.of(0).peek(z -> Arrays.fill(dist, s * n, s * n + n, -1)).findFirst().isPresent()
                && (dist[s * n + s] = 0) == 0 && (qu[0] = s) >= 0 && (qt[0] = 1) > 0
                && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> IntStream.range(off[qu[i]], off[qu[i] + 1]).allMatch(e -> dist[s * n + adj[e]] >= 0
                    || ((dist[s * n + adj[e]] = dist[s * n + qu[i]] + 1) > 0 && (qu[qt[0]++] = adj[e]) >= 0))))
            && new double[n] instanceof double[] q && new int[n] instanceof int[] stamp && new int[n] instanceof int[] T && new int[2] instanceof int[] tg
            && new double[n * n] instanceof double[] mx && new int[n * n] instanceof int[] ep && new double[n] instanceof double[] acc && IntStream.range(0, n).mapToDouble(u -> 1.0 / ((double) n * deg[u])).toArray() instanceof double[] wt
            ? String.format(Locale.US, "%.12f", IntStream.range(0, n).mapToDouble(a -> IntStream.range(0, n).map(v -> dist[a * n + v] * 512 + v).sorted().toArray() instanceof int[] ord
                && new int[(ord[n - 1] >> 9) + 2] instanceof int[] gs
                && IntStream.range(0, n).filter(i -> ++gs[(ord[i] >> 9) + 1] < 0).count() == 0
                && IntStream.range(1, gs.length).filter(i -> (gs[i] += gs[i - 1]) < 0).count() == 0
                ? IntStream.range(0, gs.length - 1).mapToDouble(d1 -> ++tg[0] > 0 && (tg[1] = 0) == 0
                    && IntStream.range(gs[d1], gs[d1 + 1]).allMatch(ix -> Integer.valueOf(ord[ix] & 511) instanceof Integer u
                        && IntStream.range(off[u], off[u + 1]).allMatch(e -> (stamp[adj[e]] == tg[0] || ((stamp[adj[e]] = tg[0]) > 0 && (q[adj[e]] = 0) == 0 && (T[tg[1]++] = adj[e]) >= 0))
                            && (q[adj[e]] += wt[u]) > 0))
                    && Stream.of(0).peek(z -> Arrays.fill(acc, 0.0)).findFirst().isPresent()
                    && (tg[1] < 24 ? IntStream.range(0, tg[1]).allMatch(j -> Integer.valueOf(T[j]) instanceof Integer v
                        && IntStream.range(0, n).filter(b -> ep[dist[v * n + b] * n + b] != tg[0]
                            ? (ep[dist[v * n + b] * n + b] = tg[0]) > 0 && (mx[dist[v * n + b] * n + b] = q[v]) > -1 && (acc[b] += q[v]) > -1
                            : mx[dist[v * n + b] * n + b] < q[v] && (acc[b] += q[v] - mx[dist[v * n + b] * n + b]) > -1 && (mx[dist[v * n + b] * n + b] = q[v]) > -1).count() >= 0)
                        : IntStream.range(0, n).filter(b -> IntStream.range(0, tg[1]).filter(jj -> ep[b * n + dist[b * n + T[jj]]] != tg[0]
                            ? (ep[b * n + dist[b * n + T[jj]]] = tg[0]) > 0 && (mx[b * n + dist[b * n + T[jj]]] = q[T[jj]]) > -1 && (acc[b] += q[T[jj]]) > -1
                            : mx[b * n + dist[b * n + T[jj]]] < q[T[jj]] && (acc[b] += q[T[jj]] - mx[b * n + dist[b * n + T[jj]]]) > -1 && (mx[b * n + dist[b * n + T[jj]]] = q[T[jj]]) > -1).count() < 0).count() >= 0)
                    ? Math.max(1.0 / n, Arrays.stream(acc).max().getAsDouble()) : 0).sum() : 0).max().getAsDouble()) : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && new int[n] instanceof int[] deg && new int[n + 1] instanceof int[] off
            && IntStream.range(0, 2 * m).filter(k -> deg[Integer.parseInt(t[2 + k]) - 1]++ < 0).count() == 0
            && IntStream.range(0, n).filter(v -> (off[v + 1] = off[v] + deg[v]) < 0).count() == 0
            && Arrays.copyOf(off, n) instanceof int[] pos && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).filter(k -> Integer.valueOf(Integer.parseInt(t[2 + 2 * k]) - 1) instanceof Integer u && Integer.valueOf(Integer.parseInt(t[3 + 2 * k]) - 1) instanceof Integer w
                && ((adj[pos[u]++] = w) < 0 || (adj[pos[w]++] = u) < 0)).count() == 0
            && IntStream.range(0, n * n).map(ij -> ij / n == ij % n ? 0 : 1000000).toArray() instanceof int[] dist
            && IntStream.range(0, m).filter(k -> (dist[(Integer.parseInt(t[2 + 2 * k]) - 1) * n + Integer.parseInt(t[3 + 2 * k]) - 1] = 1) < 0 || (dist[(Integer.parseInt(t[3 + 2 * k]) - 1) * n + Integer.parseInt(t[2 + 2 * k]) - 1] = 1) < 0).count() == 0
            && IntStream.range(0, n).filter(k -> IntStream.range(0, n * n).filter(ij -> (dist[ij] = Math.min(dist[ij], dist[ij / n * n + k] + dist[k * n + ij % n])) < 0).count() > 0).count() == 0
            ? String.format(Locale.US, "%.12f", IntStream.range(0, n).parallel().mapToDouble(a -> new double[n] instanceof double[] q && new double[n * n] instanceof double[] r2
                && new double[n] instanceof double[] mx && new int[n * n] instanceof int[] touched && new int[n] instanceof int[] tl && new int[2] instanceof int[] cn && new double[1] instanceof double[] acc
                ? IntStream.rangeClosed(0, IntStream.range(0, n).map(c -> dist[a * n + c]).max().getAsInt()).mapToDouble(d1 -> Stream.of(0).peek(z -> Arrays.fill(q, 0)).findFirst().isPresent()
                    && IntStream.range(0, n).filter(c -> dist[a * n + c] == d1 && IntStream.range(off[c], off[c + 1]).filter(e -> (q[adj[e]] += 1.0 / (n * deg[c])) < 0).count() >= 0).count() >= 0
                    && (cn[0] = 0) == 0 && IntStream.range(0, n).filter(v -> q[v] > 0 && (tl[cn[0]++] = v) >= 0).count() >= 0
                    ? Math.max(1.0 / n, IntStream.range(0, n).mapToDouble(b -> (acc[0] = q[b]) >= 0 && (cn[1] = 0) == 0
                        && IntStream.range(0, cn[0]).filter(ti -> Integer.valueOf(tl[ti]) instanceof Integer v && v != b && Integer.valueOf(dist[b * n + v]) instanceof Integer d2 && (touched[cn[1]++] = d2 * n + v) >= 0 && (r2[d2 * n + v] += q[v]) < 0).count() == 0
                        && IntStream.range(0, cn[1]).filter(k -> (mx[touched[k] / n] = Math.max(mx[touched[k] / n], r2[touched[k]])) < 0).count() == 0
                        && IntStream.range(0, cn[1]).filter(k -> (acc[0] += mx[touched[k] / n]) < 0 || (mx[touched[k] / n] = 0) < 0 || (r2[touched[k]] = 0) < 0).count() == 0
                        ? acc[0] : -1).max().getAsDouble()) : -1).sum() : -1).max().getAsDouble()) : "");
    }
}

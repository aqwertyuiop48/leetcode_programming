import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && ((IntSupplier) (() -> Integer.parseInt(z.nextToken()))) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> nx.getAsInt()).toArray() instanceof int[] ed && new int[n + 2] instanceof int[] sx
            && IntStream.range(0, 2 * m).filter(i -> ++sx[ed[i] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(v -> (sx[v] += sx[v - 1]) >= 0).count() >= 0
            && Arrays.copyOf(sx, n + 2) instanceof int[] pos && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).filter(e -> (adj[pos[ed[2 * e]]++] = ed[2 * e + 1]) > 0 & (adj[pos[ed[2 * e + 1]]++] = ed[2 * e]) > 0).count() >= 0
            && Integer.valueOf(nx.getAsInt()) instanceof Integer w
            && IntStream.range(0, w).mapToLong(i -> ((long) nx.getAsInt() << 40) | ((long) nx.getAsInt() << 20) | nx.getAsInt()).toArray() instanceof long[] raw
            && new int[w] instanceof int[] sc && new int[w] instanceof int[] sk && new int[w] instanceof int[] sp
            && IntStream.range(0, w).boxed().sorted((x, y) -> Long.compare(raw[x] & 1048575L, raw[y] & 1048575L)).mapToInt(x -> x).toArray() instanceof int[] ord
            && IntStream.range(0, w).filter(j -> (sc[j] = (int) (raw[ord[j]] >> 40)) > 0 & (sk[j] = (int) ((raw[ord[j]] >> 20) & 1048575L)) > 0 & (sp[j] = (int) (raw[ord[j]] & 1048575L)) > 0).count() >= 0
            && Integer.valueOf(nx.getAsInt()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(i -> new int[]{nx.getAsInt(), nx.getAsInt(), nx.getAsInt()}).toArray(int[][]::new) instanceof int[][] qs
            ? IntStream.range(0, q).parallel().mapToObj(qi -> Integer.valueOf(qs[qi][0]) instanceof Integer g && Integer.valueOf(qs[qi][1]) instanceof Integer r && Integer.valueOf(qs[qi][2]) instanceof Integer a
                && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] dist && new int[n + 1] instanceof int[] qu && new int[]{0, 1} instanceof int[] h && (dist[g] = 0) == 0 && (qu[0] = g) > 0
                && new int[]{0, sx[g]} instanceof int[] cur
                && IntStream.iterate(0, t -> cur[0] < h[1], t -> t + 1).filter(t -> cur[1] < sx[qu[cur[0]] + 1]
                    ? (dist[adj[cur[1]]] >= 0 || ((dist[adj[cur[1]]] = dist[qu[cur[0]]] + 1) > 0 && (qu[h[1]++] = adj[cur[1]]) > 0)) && ++cur[1] > 0
                    : ++cur[0] > 0 && (cur[0] >= h[1] || (cur[1] = sx[qu[cur[0]]]) >= 0)).count() >= 0
                && IntStream.range(0, w).map(j -> dist[sc[j]] < 0 ? Integer.MAX_VALUE : dist[sc[j]]).toArray() instanceof int[] sd
                && ((IntPredicate) (d -> new long[]{0, r} instanceof long[] st
                    && (IntStream.range(0, w).anyMatch(j -> sd[j] <= d && (st[0] += Math.min(st[1], sk[j]) * sp[j]) >= 0 && (st[1] -= Math.min(st[1], sk[j])) >= 0 && (st[1] == 0 || st[0] > a)) || true)
                    && st[1] == 0 && st[0] <= a)) instanceof IntPredicate ok
                && new int[]{0, dist[qu[h[1] - 1]] + 1} instanceof int[] bs
                && IntStream.range(0, 14).filter(z2 -> bs[0] < bs[1] && Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid && (ok.test(mid) ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) > 0)).count() >= 0
                ? String.valueOf(bs[0] == dist[qu[h[1] - 1]] + 1 ? -1 : bs[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}

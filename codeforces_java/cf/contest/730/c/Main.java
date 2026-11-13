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
            && Integer.valueOf(nx.getAsInt()) instanceof Integer q && new int[n + 1] instanceof int[] dist && new int[n + 1] instanceof int[] qu && new int[]{0, 0} instanceof int[] h
            ? IntStream.range(0, q).mapToObj(qi -> Integer.valueOf(nx.getAsInt()) instanceof Integer g && Integer.valueOf(nx.getAsInt()) instanceof Integer r && Integer.valueOf(nx.getAsInt()) instanceof Integer a
                && Stream.of(0).peek(x -> Arrays.setAll(dist, i -> -1)).findFirst().isPresent() && (dist[g] = 0) == 0 && (qu[0] = g) > 0 && (h[0] = 0) == 0 && (h[1] = 1) == 1
                && (IntStream.range(0, n).allMatch(x -> h[0] < h[1] && Integer.valueOf(qu[h[0]++]) instanceof Integer u
                    && IntStream.range(sx[u], sx[u + 1]).filter(k -> dist[adj[k]] < 0 && (dist[adj[k]] = dist[u] + 1) > 0 && (qu[h[1]++] = adj[k]) > 0).count() >= 0) || true)
                && ((IntPredicate) (d -> new long[]{0, r} instanceof long[] st
                    && IntStream.range(0, w).filter(j -> st[1] > 0 && dist[sc[j]] >= 0 && dist[sc[j]] <= d && Long.valueOf(Math.min(st[1], sk[j])) instanceof Long take
                        && (st[0] += take * sp[j]) >= 0 && (st[1] -= take) >= 0).count() >= 0 && st[1] == 0 && st[0] <= a)) instanceof IntPredicate ok
                && new int[]{0, n} instanceof int[] bs
                && IntStream.range(0, 14).filter(z2 -> bs[0] < bs[1] && Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid && (ok.test(mid) ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) > 0)).count() >= 0
                ? String.valueOf(bs[0] == n ? -1 : bs[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}

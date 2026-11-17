import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && ((IntSupplier) () -> Integer.parseInt(tk.nextToken())) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m
            && IntStream.range(0, 2 * m).map(i -> nx.getAsInt() - 1).toArray() instanceof int[] ed && new int[n + 2] instanceof int[] sx
            && IntStream.range(0, 2 * m).filter(i -> ++sx[ed[i] + 1] < 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(v -> (sx[v] += sx[v - 1]) < 0).count() == 0
            && Arrays.copyOf(sx, n + 1) instanceof int[] pos && new int[2 * m] instanceof int[] adj
            && IntStream.range(0, m).filter(e -> (adj[pos[ed[2 * e]]++] = ed[2 * e + 1]) < 0 | (adj[pos[ed[2 * e + 1]]++] = ed[2 * e]) < 0).count() == 0
            && Integer.valueOf(nx.getAsInt()) instanceof Integer w
            && IntStream.range(0, w).mapToObj(i -> new int[]{nx.getAsInt() - 1, nx.getAsInt(), nx.getAsInt()}).mapToLong(s -> ((long) s[2] << 40) | ((long) s[1] << 20) | s[0]).sorted().toArray() instanceof long[] keys
            && Arrays.stream(keys).mapToInt(k -> (int) (k & 1048575)).toArray() instanceof int[] sc
            && Arrays.stream(keys).mapToInt(k -> (int) (k >> 20 & 1048575)).toArray() instanceof int[] sk
            && Arrays.stream(keys).mapToInt(k -> (int) (k >> 40)).toArray() instanceof int[] sp
            && Integer.valueOf(nx.getAsInt()) instanceof Integer q && new int[n] instanceof int[] dist && new int[n] instanceof int[] qu && new int[n + 2 * m + 2] instanceof int[] scr && new int[w + 1] instanceof int[] scr2 && new int[3] instanceof int[] h
            ? IntStream.range(0, q).mapToObj(qi -> Integer.valueOf(nx.getAsInt() - 1) instanceof Integer g && Integer.valueOf(nx.getAsInt()) instanceof Integer r && Integer.valueOf(nx.getAsInt()) instanceof Integer a
                && Stream.of(0).peek(z -> Arrays.fill(dist, 1000000000)).findFirst().isPresent() && (h[0] = 1) == 1 && (h[1] = 0) == 0
                && (dist[g] = 0) == 0 && (qu[0] = g) >= 0 && (h[2] = sx[g]) >= 0
                && Stream.of(0).peek(z -> Arrays.setAll(scr, t -> h[1] < h[0] && (h[2] < sx[qu[h[1]] + 1]
                    ? ((dist[adj[h[2]]] == 1000000000 && (dist[adj[h[2]]] = dist[qu[h[1]]] + 1) > 0 && (qu[h[0]++] = adj[h[2]]) >= 0) | true) && ++h[2] > 0
                    : ++h[1] > 0 && (h[1] >= h[0] || (h[2] = sx[qu[h[1]]]) >= 0)) ? 0 : 0)).findFirst().isPresent()
                && IntStream.range(0, w).filter(j -> dist[sc[j]] < 1000000000).toArray() instanceof int[] rj
                && Arrays.stream(rj).map(j -> dist[sc[j]]).toArray() instanceof int[] rd && Arrays.stream(rj).map(j -> sk[j]).toArray() instanceof int[] rk && Arrays.stream(rj).map(j -> sp[j]).toArray() instanceof int[] rp
                && Integer.valueOf(dist[qu[h[0] - 1]] + 1) instanceof Integer hi && new int[]{0, hi} instanceof int[] bs
                && IntStream.range(0, 14).filter(z -> bs[0] < bs[1] && Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer mid
                    && (new long[]{r, 0} instanceof long[] st
                        && Stream.of(0).peek(zz -> Arrays.setAll(scr2, j -> j < rj.length && st[0] > 0 && rd[j] <= mid ? (int) ((st[1] += Math.min(st[0], (long) rk[j]) * rp[j]) * 0 + (st[0] -= Math.min(st[0], (long) rk[j])) * 0) : 0)).findFirst().isPresent()
                        && st[0] == 0 && st[1] <= a ? (bs[1] = mid) >= 0 : (bs[0] = mid + 1) > 0)).count() >= 0
                ? String.valueOf(bs[0] == hi ? -1 : bs[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) ((n + 63) / 64) instanceof Integer w && new long[n][w] instanceof long[][] adj
            && IntStream.range(0, m).allMatch(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer a && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer b
                && (adj[a][b >> 6] |= 1L << (b & 63)) != 0 && (adj[b][a >> 6] |= 1L << (a & 63)) != 0)
            && new int[n] instanceof int[] ecc && new int[n] instanceof int[] label && new boolean[]{true} instanceof boolean[] bip
            && IntStream.range(0, n).allMatch(v -> new int[n] instanceof int[] d && new long[w] instanceof long[] vis && new long[n][w] instanceof long[][] lev && new int[n] instanceof int[] q && (q[0] = v) >= 0 && (vis[v >> 6] |= 1L << (v & 63)) != 0 && (lev[0][v >> 6] |= 1L << (v & 63)) != 0 && new int[]{0, 1} instanceof int[] st
                && Stream.generate(() -> 0).takeWhile(z -> st[0] < st[1]).allMatch(z -> (Integer) q[st[0]++] instanceof Integer u
                    && IntStream.range(0, w).filter(k -> adj[u][k] != 0 && (adj[u][k] & ~vis[k]) != 0).allMatch(k -> (Long) (adj[u][k] & ~vis[k]) instanceof Long nb && (vis[k] |= nb) != 0
                        && LongStream.iterate(nb, b -> b != 0, b -> b & (b - 1)).allMatch(b -> (Integer) (k * 64 + Long.numberOfTrailingZeros(b)) instanceof Integer x && (d[x] = d[u] + 1) > 0 && (lev[d[x]][x >> 6] |= 1L << (x & 63)) != 0 && (q[st[1]++] = x) >= 0))
                    && (bip[0] &= IntStream.range(0, w).noneMatch(k -> (adj[u][k] & lev[d[u]][k]) != 0)) | true)
                && (ecc[v] = IntStream.of(d).max().getAsInt()) >= 0 && (label[v] = IntStream.range(0, n).filter(i -> (vis[i >> 6] >> (i & 63) & 1) == 1).min().getAsInt()) >= 0)
            ? !bip[0] ? "-1" : String.valueOf(IntStream.range(0, n).filter(v -> label[v] == v).map(r -> IntStream.range(0, n).filter(v -> label[v] == r).map(v -> ecc[v]).max().getAsInt()).sum()) : "");
    }
}

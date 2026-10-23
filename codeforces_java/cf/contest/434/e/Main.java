import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) Long.parseLong(tk.nextToken()) instanceof Long y && (Long) (Long.parseLong(tk.nextToken()) % y) instanceof Long k && (Long) (Long.parseLong(tk.nextToken()) % y) instanceof Long X
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken()) % y).toArray() instanceof long[] val
            && IntStream.range(0, 2 * n - 2).map(i -> Integer.parseInt(tk.nextToken()) - 1).toArray() instanceof int[] ee && new int[n] instanceof int[] deg
            && IntStream.range(0, n - 1).map(i -> ee[2 * i]).toArray() instanceof int[] eu && IntStream.range(0, n - 1).map(i -> ee[2 * i + 1]).toArray() instanceof int[] ev
            && IntStream.range(0, n - 1).allMatch(i -> deg[eu[i]]++ >= 0 && deg[ev[i]]++ >= 0)
            && Arrays.stream(deg).mapToObj(d -> new int[d]).toArray(int[][]::new) instanceof int[][] adj && new int[n] instanceof int[] pos
            && IntStream.range(0, n - 1).allMatch(i -> (adj[eu[i]][pos[eu[i]]++] = ev[i]) >= 0 && (adj[ev[i]][pos[ev[i]]++] = eu[i]) >= 0)
            && LongStream.iterate(1, p -> p * k % y).limit(n + 1).toArray() instanceof long[] powk
            && (Long) (k == 0 ? 0L : BigInteger.valueOf(k).modInverse(BigInteger.valueOf(y)).longValue()) instanceof Long ik
            && LongStream.iterate(1, p -> p * ik % y).limit(n + 1).toArray() instanceof long[] powik
            && new boolean[n] instanceof boolean[] dead && new long[n] instanceof long[] out && new long[n] instanceof long[] in
            && new int[n] instanceof int[] par && new int[n] instanceof int[] q && new int[1] instanceof int[] cnt && new int[n] instanceof int[] sz && new int[n] instanceof int[] mxc
            && new int[n] instanceof int[] dist && new int[n] instanceof int[] br && new long[n] instanceof long[] UP && new long[n] instanceof long[] DOWN && new long[n] instanceof long[] R
            && new int[n + 1] instanceof int[] stk && new int[]{1} instanceof int[] sp
            && ((BiFunction<long[], int[], Boolean>) (arr, ft) -> IntStream.of(0).peek(z -> Arrays.sort(arr, ft[0], ft[1])).sum() == 0 && new int[]{ft[0], 0} instanceof int[] st
                && IntStream.range(ft[0], ft[1]).allMatch(p -> ((arr[p] >>> 17 & 1) == 0 ? ++st[1] >= 0 : true)
                    && (p + 1 < ft[1] && arr[p + 1] >>> 18 == arr[p] >>> 18 || IntStream.rangeClosed(st[0], p).allMatch(j -> (Integer) q[(int) (arr[j] & 131071)] instanceof Integer x
                            && ((arr[j] >>> 17 & 1) == 1 ? (out[x] += (long) ft[2] * st[1]) >= Long.MIN_VALUE : (in[x] += (long) ft[2] * (p + 1 - st[0] - st[1])) >= Long.MIN_VALUE))
                        && (st[0] = p + 1) > 0 && (st[1] = 0) == 0))) instanceof BiFunction<long[], int[], Boolean> proc
            && IntStream.range(0, n).allMatch(it -> (Integer) stk[--sp[0]] instanceof Integer s && (par[s] = -1) < 0 && (q[0] = s) >= 0 && (cnt[0] = 1) == 1
                && Stream.iterate(0, h -> h + 1).takeWhile(h -> h < cnt[0]).allMatch(h -> Arrays.stream(adj[q[h]]).filter(v -> v != par[q[h]] && !dead[v] && (par[v] = q[h]) >= 0 && (q[cnt[0]++] = v) >= 0).count() >= 0)
                && (Integer) cnt[0] instanceof Integer c
                && IntStream.range(0, c).allMatch(i -> (sz[q[i]] = 1) == 1 && (mxc[q[i]] = 0) == 0)
                && IntStream.range(1, c).allMatch(j -> (Integer) (c - j) instanceof Integer i && (sz[par[q[i]]] += sz[q[i]]) > 0 && (mxc[par[q[i]]] = Math.max(mxc[par[q[i]]], sz[q[i]])) >= 0)
                && (Integer) q[IntStream.range(0, c).filter(i -> 2 * Math.max(c - sz[q[i]], mxc[q[i]]) <= c).findFirst().getAsInt()] instanceof Integer C
                && (par[C] = -1) < 0 && (q[0] = C) >= 0 && (cnt[0] = 1) == 1 && (dist[C] = 0) == 0 && (UP[C] = val[C]) >= 0 && (DOWN[C] = val[C]) >= 0 && (br[C] = C) >= 0
                && Stream.iterate(0, h -> h + 1).takeWhile(h -> h < cnt[0]).allMatch(h -> (Integer) q[h] instanceof Integer u && Arrays.stream(adj[u]).filter(v -> v != par[u] && !dead[v] && (par[v] = u) >= 0
                    && (q[cnt[0]++] = v) >= 0 && (dist[v] = dist[u] + 1) > 0 && (UP[v] = (val[v] + UP[u] * k) % y) >= 0 && (DOWN[v] = (DOWN[u] + val[v] * powk[dist[v]]) % y) >= 0 && (br[v] = u - C == 0 ? v : br[u]) >= 0).count() >= 0)
                && IntStream.range(0, c).allMatch(i -> (Integer) q[i] instanceof Integer x && (R[x] = (val[C] + (((X - UP[x]) % y + y) % y) * powik[dist[x]]) % y) >= 0)
                && new long[2 * c] instanceof long[] K && IntStream.range(0, c).allMatch(i -> (K[2 * i] = DOWN[q[i]] << 18 | i) >= 0 && (K[2 * i + 1] = (R[q[i]] << 1 | 1) << 17 | i) >= 0)
                && IntStream.range(0, c).mapToLong(i -> (long) br[q[i]] << 17 | i).sorted().toArray() instanceof long[] G && new long[2 * c] instanceof long[] L
                && IntStream.range(0, c).allMatch(p -> (Integer) (int) (G[p] & 131071) instanceof Integer i && (L[2 * p] = K[2 * i]) >= 0 && (L[2 * p + 1] = K[2 * i + 1]) >= 0)
                && IntStream.range(0, c).filter(p -> p == 0 || G[p] >>> 17 != G[p - 1] >>> 17).toArray() instanceof int[] ss
                && proc.apply(K, new int[]{0, 2 * c, 1})
                && IntStream.range(0, ss.length).allMatch(g -> proc.apply(L, new int[]{2 * ss[g], 2 * (g + 1 < ss.length ? ss[g + 1] : c), -1}))
                && (dead[C] = true)
                && Arrays.stream(adj[C]).filter(v -> !dead[v] && (stk[sp[0]++] = v) >= 0).count() >= 0)
            && IntStream.range(0, n).allMatch(i -> val[i] != X || (out[i]++ >= 0 && in[i]++ >= 0))
            ? (long) n * n * n - 3L * n * LongStream.of(out).sum() + IntStream.range(0, n).mapToLong(i -> out[i] * out[i] + in[i] * in[i] + out[i] * in[i]).sum() : "");
    }
}

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
            && IntStream.range(0, n - 1).map(i -> (deg[ee[2 * i]]++ >= 0 && deg[ee[2 * i + 1]]++ >= 0) ? 0 : 0).sum() == 0
            && Arrays.stream(deg).mapToObj(d -> new int[d]).toArray(int[][]::new) instanceof int[][] adj && new int[n] instanceof int[] pos
            && IntStream.range(0, n - 1).map(i -> ((adj[ee[2 * i]][pos[ee[2 * i]]++] = ee[2 * i + 1]) >= 0 && (adj[ee[2 * i + 1]][pos[ee[2 * i + 1]]++] = ee[2 * i]) >= 0) ? 0 : 0).sum() == 0
            && LongStream.iterate(1, t -> t * k % y).limit(n + 1).toArray() instanceof long[] powk
            && (Long) (k == 0 ? 0L : BigInteger.valueOf(k).modInverse(BigInteger.valueOf(y)).longValue()) instanceof Long ik
            && LongStream.iterate(1, t -> t * ik % y).limit(n + 1).toArray() instanceof long[] powik
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] p0 && new int[]{1} instanceof int[] tl && (ord[0] = 0) == 0 && (p0[0] = -1) < 0
            && IntStream.range(0, n).map(h -> (Arrays.stream(adj[ord[h]]).filter(v -> v != p0[ord[h]] && (p0[v] = ord[h]) >= 0 && (ord[tl[0]++] = v) >= 0).count() >= 0) ? 0 : 0).sum() == 0
            && new boolean[n] instanceof boolean[] dead && new int[n] instanceof int[] top && new int[n] instanceof int[] sz && new int[n] instanceof int[] mxc && new int[n] instanceof int[] cent
            && new int[n] instanceof int[] cidx && new int[n] instanceof int[] q && new int[]{0} instanceof int[] ns && new int[]{0} instanceof int[] mm && new int[]{0} instanceof int[] tail
            && new int[n] instanceof int[] par2 && new int[n] instanceof int[] cc && new int[n] instanceof int[] dist && new int[n] instanceof int[] br
            && new long[n] instanceof long[] UP && new long[n] instanceof long[] DOWN && new long[n] instanceof long[] R && new int[n] instanceof int[] bsz && new int[n] instanceof int[] bidx
            && new long[n] instanceof long[] out && new long[n] instanceof long[] in && new long[2 * n] instanceof long[] K && new int[2 * n + 1] instanceof int[] P0
            && new int[2 * n] instanceof int[] rs && new int[2 * n] instanceof int[] re && new int[]{0} instanceof int[] nbp && new int[]{0} instanceof int[] kp
            && ((IntBinaryOperator) (len, sg) -> Stream.of(0).peek(z -> Arrays.sort(K, 0, len)).findFirst().isPresent()
                && IntStream.range(0, len).map(p -> ((rs[p] = (p == 0 || K[p] >>> 18 != K[p - 1] >>> 18) ? p : rs[p - 1]) >= 0 && (P0[p + 1] = P0[p] + (int) (1 - (K[p] >>> 17 & 1))) >= 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, len).map(p -> len - 1 - p).map(p -> (((p == len - 1 || K[p] >>> 18 != K[p + 1] >>> 18) ? (re[0] = p + 1) : re[0]) > 0 && (Integer) (int) (K[p] & 131071) instanceof Integer x
                    && ((K[p] >>> 17 & 1) == 1 ? (out[x] += (long) sg * (P0[re[0]] - P0[rs[p]])) >= Long.MIN_VALUE : (in[x] += (long) sg * (re[0] - rs[p] - P0[re[0]] + P0[rs[p]])) >= Long.MIN_VALUE)) ? 0 : 0).sum() == 0 ? 0 : -1) instanceof IntBinaryOperator proc
            && ((IntBinaryOperator) (u, v) -> (v != par2[u] && !dead[v] && (par2[v] = u) >= 0 && (cc[v] = cc[u]) >= 0 && (q[tail[0]++] = v) >= 0
                && (dist[v] = dist[u] + 1) > 0 && (UP[v] = (val[v] + UP[u] * k) % y) >= 0 && (DOWN[v] = (DOWN[u] + val[v] * powk[dist[v]]) % y) >= 0 && (br[v] = u == cc[u] ? v : br[u]) >= 0) ? 1 : 0) instanceof IntBinaryOperator vis
            && IntStream.range(0, 20).map(lv -> (!IntStream.range(0, n).anyMatch(i -> !dead[i]) || (
                IntStream.range(0, n).map(i -> ord[i]).map(x -> (dead[x] || ((top[x] = (p0[x] >= 0 && !dead[p0[x]]) ? top[p0[x]] : x) >= 0 && (sz[x] = 1) > 0 && (mxc[x] = 0) == 0 && (top[x] != x || (cent[x] = -1) < 0))) ? 0 : 0).sum() == 0
                && IntStream.range(0, n).map(i -> ord[n - 1 - i]).map(x -> (dead[x] || p0[x] < 0 || dead[p0[x]] || ((sz[p0[x]] += sz[x]) > 0 && (mxc[p0[x]] = Math.max(mxc[p0[x]], sz[x])) >= 0)) ? 0 : 0).sum() == 0
                && (ns[0] = 0) == 0 && (mm[0] = 0) == 0
                && IntStream.range(0, n).map(i -> ord[i]).map(x -> (dead[x] || ((Integer) sz[top[x]] instanceof Integer c
                    && (c == 1 ? (dead[x] = true) : (mm[0]++ >= 0 && (2 * Math.max(c - sz[x], mxc[x]) > c || cent[top[x]] >= 0 || ((cent[top[x]] = x) >= 0 && (cidx[x] = ns[0]) >= 0 && (q[ns[0]++] = x) >= 0)))))) ? 0 : 0).sum() == 0
                && (tail[0] = ns[0]) >= 0
                && IntStream.range(0, ns[0]).map(s -> q[s]).map(x -> ((cc[x] = x) >= 0 && (dist[x] = 0) == 0 && (UP[x] = val[x]) >= 0 && (DOWN[x] = val[x]) >= 0 && (br[x] = x) >= 0 && (par2[x] = -1) < 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, mm[0]).map(h -> ((Integer) q[h] instanceof Integer u && (Integer) adj[u].length instanceof Integer dg
                    && (dg > 0 ? vis.applyAsInt(u, adj[u][0]) : 0) + (dg > 1 ? vis.applyAsInt(u, adj[u][1]) : 0) + (dg > 2 ? vis.applyAsInt(u, adj[u][2]) : 0) + (dg > 3 ? IntStream.range(3, dg).map(e -> vis.applyAsInt(u, adj[u][e])).sum() : 0) >= 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, mm[0]).map(h -> q[h]).map(x -> ((R[x] = (k == 0 && dist[x] > 0 && UP[x] != X) ? y : (val[cc[x]] + (((X - UP[x]) % y + y) % y) * powik[dist[x]]) % y) >= 0 && (bsz[x] = 0) == 0 && (bidx[x] = -1) < 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, mm[0]).map(h -> q[h]).map(x -> (++bsz[br[x]] > 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, mm[0]).map(h -> ((Integer) q[h] instanceof Integer x && (K[2 * h] = ((long) cidx[cc[x]] << 48) | (DOWN[x] << 18) | x) >= Long.MIN_VALUE && (K[2 * h + 1] = ((long) cidx[cc[x]] << 48) | (R[x] << 18) | (1L << 17) | x) >= Long.MIN_VALUE) ? 0 : 0).sum() == 0
                && proc.applyAsInt(2 * mm[0], 1) >= 0
                && (nbp[0] = 0) == 0 && (kp[0] = 0) == 0
                && IntStream.range(0, mm[0]).map(h -> q[h]).map(x -> (bsz[br[x]] < 2 || bidx[br[x]] >= 0 || (bidx[br[x]] = nbp[0]++) >= 0) ? 0 : 0).sum() == 0
                && IntStream.range(0, mm[0]).map(h -> q[h]).map(x -> (bsz[br[x]] < 2 || ((K[2 * kp[0]] = ((long) bidx[br[x]] << 48) | (DOWN[x] << 18) | x) >= Long.MIN_VALUE
                    && (K[2 * kp[0] + 1] = ((long) bidx[br[x]] << 48) | (R[x] << 18) | (1L << 17) | x) >= Long.MIN_VALUE && ++kp[0] > 0)) ? 0 : 0).sum() == 0
                && proc.applyAsInt(2 * kp[0], -1) >= 0
                && IntStream.range(0, mm[0]).map(h -> q[h]).map(x -> (bsz[br[x]] != 1 || DOWN[x] != R[x] || (--out[x] > Long.MIN_VALUE && --in[x] > Long.MIN_VALUE)) ? 0 : 0).sum() == 0
                && IntStream.range(0, ns[0]).map(s -> ((dead[q[s]] = true)) ? 0 : 0).sum() == 0)) ? 0 : 0).sum() == 0
            && IntStream.range(0, n).map(i -> (val[i] != X || (out[i]++ >= 0 && in[i]++ >= 0)) ? 0 : 0).sum() == 0
            ? (long) n * n * n - 3L * n * LongStream.of(out).sum() + IntStream.range(0, n).mapToLong(i -> out[i] * out[i] + in[i] * in[i] + out[i] * in[i]).sum() : "");
    }
}


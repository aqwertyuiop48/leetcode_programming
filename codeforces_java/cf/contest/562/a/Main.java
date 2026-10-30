import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[r0.length / 2 + 4] instanceof int[] v && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] == 1 && (v[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0).count() >= 0
            && (Integer) v[0] instanceof Integer n
            ? n == 1 ? "1 0.000000000" : new int[n] instanceof int[] deg && new int[n] instanceof int[] xr && new int[n] instanceof int[] xw && new int[n] instanceof int[] par && new int[n] instanceof int[] pw && new int[n] instanceof int[] q && new int[3] instanceof int[] qs
                && IntStream.range(0, n - 1).allMatch(e -> (Integer) (v[1 + n + 3 * e] - 1) instanceof Integer x && (Integer) (v[2 + n + 3 * e] - 1) instanceof Integer y && (Integer) v[3 + n + 3 * e] instanceof Integer l
                    && ++deg[x] > 0 && ++deg[y] > 0 && (xr[x] ^= y) >= 0 && (xr[y] ^= x) >= 0 && (xw[x] ^= l) >= 0 && (xw[y] ^= l) >= 0)
                && IntStream.range(0, n).filter(x -> deg[x] == 1 && (q[qs[0]++] = x) >= 0).count() >= 0
                && IntStream.iterate(0, i -> i < qs[0], i -> i + 1).filter(i -> deg[q[i]] == 0 ? (qs[1] = q[i]) >= 0 : (par[q[i]] = xr[q[i]]) >= 0 && (pw[q[i]] = xw[q[i]]) >= 0 && (xr[par[q[i]]] ^= q[i]) >= 0 && (xw[par[q[i]]] ^= pw[q[i]]) >= 0
                    && (--deg[par[q[i]]] != 1 || (q[qs[0]++] = par[q[i]]) >= 0) && (deg[q[i]] = 0) == 0).count() >= 0
                && (Integer) qs[1] instanceof Integer root && IntStream.range(0, n).map(i -> 1).toArray() instanceof int[] szs && new int[n] instanceof int[] tin && new int[n] instanceof int[] off
                && IntStream.range(0, n - 1).filter(i -> (szs[par[q[i]]] += szs[q[i]]) >= 0).count() >= 0
                && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).filter(i -> (tin[q[i]] = tin[par[q[i]]] + 1 + off[par[q[i]]]) >= 0 && (off[par[q[i]]] += szs[q[i]]) >= 0).count() >= 0
                && IntStream.range(0, n).mapToDouble(i -> v[1 + i]).toArray() instanceof double[] w && new double[n] instanceof double[] g && new double[n] instanceof double[] sub && new int[n] instanceof int[] d && new int[n] instanceof int[] sz && new int[n] instanceof int[] mark
                && new boolean[n] instanceof boolean[] alive && IntStream.range(0, n).filter(x -> (alive[x] = true)).count() >= 0 && new double[]{Double.MAX_VALUE} instanceof double[] bv && new int[1] instanceof int[] bi
                && IntStream.iterate(1, r -> r + 1).anyMatch(r -> IntStream.range(0, n).filter(x -> (sz[x] = alive[x] ? 1 : 0) >= 0).count() >= 0
                    && IntStream.range(0, n - 1).filter(i -> (sz[par[q[i]]] += sz[q[i]]) >= 0).count() >= 0
                    && (Integer) IntStream.range(0, n).filter(x -> alive[x]).map(x -> sz[x]).max().getAsInt() instanceof Integer m
                    && (Integer) (int) (IntStream.range(0, n).filter(x -> alive[x] && 2 * sz[x] >= m).mapToLong(x -> (long) sz[x] * n + x).min().getAsLong() % n) instanceof Integer c
                    && (mark[c] = r) > 0 && (d[c] = 0) == 0
                    && IntStream.iterate(c, y -> y != root, y -> par[y]).filter(y -> (d[par[y]] = d[y] + pw[y]) >= 0 && (mark[par[y]] = r) > 0).count() >= 0
                    && IntStream.iterate(n - 2, i -> i >= 0, i -> i - 1).filter(i -> mark[q[i]] == r || (d[q[i]] = d[par[q[i]]] + pw[q[i]]) >= 0).count() >= 0
                    && IntStream.range(0, n).filter(x -> (sub[x] = g[x] = w[x] * Math.sqrt(d[x])) >= 0).count() >= 0
                    && (Double) Arrays.stream(g).sum() instanceof Double tt && (Double) IntStream.range(0, n).mapToDouble(x -> g[x] * d[x]).sum() instanceof Double fc
                    && (fc < bv[0] || fc == bv[0] && c < bi[0] ? (bv[0] = fc) >= 0 && (bi[0] = c) >= 0 : true)
                    && IntStream.range(0, n - 1).filter(i -> (sub[par[q[i]]] += sub[q[i]]) >= 0).count() >= 0
                    && (Integer) IntStream.range(0, n).filter(x -> x != root && par[x] == c && 2 * sub[x] > tt).findFirst().orElse(-1) instanceof Integer cu
                    && (Integer) (cu >= 0 ? cu : c != root && 2 * sub[c] < tt ? par[c] : -1) instanceof Integer u
                    && (u < 0 || !alive[u] || IntStream.range(0, n).filter(x -> (alive[x] = alive[x] && (cu >= 0 ? tin[x] >= tin[u] && tin[x] < tin[u] + szs[u] : tin[x] < tin[c] || tin[x] >= tin[c] + szs[c]))).count() < 0))
                ? String.format(Locale.ROOT, "%d %.9f", bi[0] + 1, bv[0]) : "" : "");
    }
}

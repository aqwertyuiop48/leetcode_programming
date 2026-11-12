import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[]{0, 0, 0, 0, 0} instanceof int[] ps
            && Stream.of(0).peek(z -> IntStream.rangeClosed(0, raw.length).forEach(i -> ps[4] = i < raw.length && raw[i] >= 48 ? (ps[3] = 1) + (ps[0] = ps[0] * 10 + raw[i] - 48)
                : i < raw.length && raw[i] == 45 ? (ps[2] = 1)
                : ps[3] == 1 ? (a[ps[1]++] = ps[2] == 1 ? -ps[0] : ps[0]) + (ps[0] = ps[2] = ps[3] = 0) : 0)).findFirst().isPresent()
            && Integer.valueOf(a[0]) instanceof Integer n && Integer.valueOf(a[1]) instanceof Integer m && Integer.valueOf(2 * n) instanceof Integer pb
            && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] xr && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep
            && new int[n + 1] instanceof int[] q && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n - 1).filter(i -> (deg[a[2 + 2 * i]]++) + (deg[a[3 + 2 * i]]++) + (xr[a[2 + 2 * i]] ^= a[3 + 2 * i]) + (xr[a[3 + 2 * i]] ^= a[2 + 2 * i]) >= 0).count() >= 0
            && IntStream.rangeClosed(2, n).filter(v -> deg[v] != 1 || (q[tail[0]++] = v) > 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(q[i]) instanceof Integer x && Integer.valueOf(xr[x]) instanceof Integer p
                && (par[x] = p) > 0 && (xr[p] ^= x) >= 0 && (--deg[p] != 1 || p == 1 || (q[tail[0]++] = p) > 0)).count() >= 0
            && IntStream.range(0, n - 1).map(i -> n - 2 - i).filter(i -> (dep[q[i]] = dep[par[q[i]]] + 1) > 0).count() >= 0
            && new int[n + 1] instanceof int[] hacc && new long[m + 1] instanceof long[] key && new long[m + 1] instanceof long[] lz
            && new int[m + 1] instanceof int[] lc && new int[m + 1] instanceof int[] rc && new int[m + 1] instanceof int[] dist && new int[m + 1] instanceof int[] yd
            && ((IntUnaryOperator) p -> lz[p] == 0 ? 0 : (int) (((key[lc[p]] += lz[p]) + (lz[lc[p]] += lz[p]) + (key[rc[p]] += lz[p]) + (lz[rc[p]] += lz[p]) + (lz[p] = 0)) * 0)) instanceof IntUnaryOperator pd
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
            && ref.getAndSet((p, r) -> p == 0 ? r : r == 0 ? p : key[p] > key[r] ? ref.get().applyAsInt(r, p)
                : pd.applyAsInt(p) == 0 && (rc[p] = ref.get().applyAsInt(rc[p], r)) >= 0
                    && (dist[lc[p]] < dist[rc[p]] ? (lc[p] = lc[p] ^ rc[p]) + (rc[p] = lc[p] ^ rc[p]) + (lc[p] = lc[p] ^ rc[p]) : 0) >= 0
                    && (dist[p] = dist[rc[p]] + 1) > 0 ? p : p) == null
            && IntStream.range(0, m).filter(i -> (yd[i + 1] = dep[a[pb + 3 * i + 1]]) >= 0 && (key[i + 1] = a[pb + 3 * i + 2]) > 0 && (dist[i + 1] = 1) > 0
                && (hacc[a[pb + 3 * i]] = ref.get().applyAsInt(hacc[a[pb + 3 * i]], i + 1)) >= 0).count() >= 0
            && new long[n + 1] instanceof long[] f && new long[n + 1] instanceof long[] Sx && new int[]{0, 0} instanceof int[] hh
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(q[i]) instanceof Integer x
                && (hh[0] = hacc[x]) >= 0
                && (hh[0] == 0 || ((key[hh[0]] += Sx[x]) > Long.MIN_VALUE && (lz[hh[0]] += Sx[x]) > Long.MIN_VALUE))
                && (hh[0] == 0 || yd[hh[0]] < dep[x]
                    || IntStream.iterate(0, t -> hh[0] != 0 && yd[hh[0]] >= dep[x], t -> t + 1).filter(t -> pd.applyAsInt(hh[0]) == 0 && (hh[0] = ref.get().applyAsInt(lc[hh[0]], rc[hh[0]])) >= 0).count() >= 0)
                && (hh[0] == 0 ? (hh[1] = 1) > 0
                    : (f[x] = key[hh[0]]) > Long.MIN_VALUE && (Sx[par[x]] += f[x]) > Long.MIN_VALUE && (key[hh[0]] -= f[x]) > Long.MIN_VALUE && (lz[hh[0]] -= f[x]) > Long.MIN_VALUE
                        && (hacc[par[x]] = ref.get().applyAsInt(hacc[par[x]], hh[0])) >= 0)).count() >= 0
            ? (hh[1] == 1 ? -1L : Sx[1]) : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k && IntStream.range(0, n).map(i -> tok[2 + i]).toArray() instanceof int[] a && IntStream.of(a).sorted().toArray() instanceof int[] sa
            && new int[n] instanceof int[] deg && new int[n] instanceof int[] xr
            && IntStream.range(0, n - 1).filter(j -> Integer.valueOf(tok[2 + n + 2 * j] - 1) instanceof Integer u && Integer.valueOf(tok[3 + n + 2 * j] - 1) instanceof Integer w
                && ++deg[u] > 0 & ++deg[w] > 0 & (xr[u] ^= w) >= 0 & (xr[w] ^= u) >= 0).count() >= 0
            && Integer.valueOf(IntStream.range(0, n).reduce((x, y) -> a[x] <= a[y] ? x : y).getAsInt()) instanceof Integer r
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[n] instanceof int[] pos && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).filter(v -> v != r && deg[v] == 1 && (ord[tail[0]++] = v) >= 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && Integer.valueOf(xr[v]) instanceof Integer p && (par[v] = p) >= 0 & (pos[v] = i) >= 0 & (sz[p] += sz[v]) > 0 & (xr[p] ^= v) >= 0
                && (--deg[p] != 1 || p - r == 0 || (ord[tail[0]++] = p) >= 0)).count() >= 0
            && (ord[n - 1] = r) >= 0 && (pos[r] = n - 1) >= 0 && (par[r] = r) >= 0
            && IntStream.range(0, n).map(i -> a[ord[i]]).toArray() instanceof int[] av && IntStream.range(0, n).map(i -> sz[ord[i]]).toArray() instanceof int[] szv && IntStream.range(0, n).map(i -> pos[par[ord[i]]]).toArray() instanceof int[] pp
            && new int[n] instanceof int[] sf && new int[n] instanceof int[] m1 && new int[n] instanceof int[] m2 && new int[n] instanceof int[] dpa && new int[1] instanceof int[] best
            && ((IntPredicate) x -> x <= sa[0] || ((best[0] = 0) == 0
                && IntStream.range(0, n).filter(i -> (dpa[i] = av[i] >= x ? 1 + sf[i] + m1[i] : 0) >= 0 && (best[0] = Math.max(best[0], dpa[i] > 0 ? dpa[i] + m2[i] : 0)) >= 0
                    && (i == n - 1 || (dpa[i] == szv[i] ? (sf[pp[i]] += dpa[i]) >= 0 : dpa[i] <= m1[pp[i]] ? (dpa[i] <= m2[pp[i]] || (m2[pp[i]] = dpa[i]) >= 0) : ((m2[pp[i]] = m1[pp[i]]) >= 0 & (m1[pp[i]] = dpa[i]) >= 0)))
                    && (sf[i] = 0) == 0 & (m1[i] = 0) == 0 & (m2[i] = 0) == 0).count() >= 0
                && best[0] >= k)) instanceof IntPredicate chk
            && new int[]{0, n - 1} instanceof int[] lh
            && IntStream.range(0, 20).allMatch(z -> lh[0] >= lh[1] || (Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid && (chk.test(sa[mid]) ? (lh[0] = mid) : (lh[1] = mid - 1)) >= 0))
            ? sa[lh[0]] : -1);
    }
}

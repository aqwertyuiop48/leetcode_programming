import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[n + 1]) instanceof Integer m
            && IntStream.range(0, n).mapToLong(i -> (long) g[1 + i] << 17 | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).map(k -> (int) (keys[n - 1 - k] & 131071)).toArray() instanceof int[] ord
            && IntStream.range(0, n).map(k -> (int) (keys[n - 1 - k] >> 17)).toArray() instanceof int[] hv
            && Integer.valueOf(n <= 1 ? 1 : Integer.highestOneBit(n - 1) << 1) instanceof Integer N
            && Integer.valueOf(n <= 1 ? 0 : 32 - Integer.numberOfLeadingZeros(n - 1)) instanceof Integer rounds
            && new int[2 * N] instanceof int[] tr
            && new int[n] instanceof int[] par
            && new int[n] instanceof int[] sz
            && new int[n] instanceof int[] rs
            && new int[n] instanceof int[] re
            && IntStream.range(0, m).map(j -> g[n + 2 + 3 * j] - 1).toArray() instanceof int[] ql
            && IntStream.range(0, m).map(j -> g[n + 3 + 3 * j] - 1).toArray() instanceof int[] qr
            && IntStream.range(0, m).map(j -> g[n + 4 + 3 * j]).toArray() instanceof int[] qw
            && new int[m] instanceof int[] lo
            && new int[m] instanceof int[] hi
            && IntStream.range(0, m).filter(j -> (lo[j] = 1) > 0 && (hi[j] = n) > 0).count() >= 0
            && new int[16] instanceof int[] c
            && new IntUnaryOperator[5] instanceof IntUnaryOperator[] H
            && new IntBinaryOperator[1] instanceof IntBinaryOperator[] U
            && (H[0] = x -> par[x] == x ? x : H[0].applyAsInt(par[x])) != null
            && (U[0] = (a, b) ->
                Integer.valueOf(sz[a] >= sz[b] ? a : b) instanceof Integer big
                && Integer.valueOf(sz[a] >= sz[b] ? b : a) instanceof Integer sm
                && (par[sm] = big) >= 0 && (sz[big] += sz[sm]) > 0
                && (rs[big] = Math.min(rs[a], rs[b])) >= 0 && (re[big] = Math.max(re[a], re[b])) >= 0
                ? big : -1) != null
            && (H[1] = i -> (c[8] >= 1 && tr[c[8]] < c[1] && (tr[c[8]] = c[1]) > 0 && (c[8] >>= 1) >= 0)
                && (c[8] >= 1 && tr[c[8]] < c[1] && (tr[c[8]] = c[1]) > 0 && (c[8] >>= 1) >= 0)
                && (c[8] >= 1 && tr[c[8]] < c[1] && (tr[c[8]] = c[1]) > 0 && (c[8] >>= 1) >= 0)
                && (c[8] >= 1 && tr[c[8]] < c[1] && (tr[c[8]] = c[1]) > 0 && (c[8] >>= 1) >= 0)
                ? H[1].applyAsInt(0) : 0) != null
            && (H[2] = d -> (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                && (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                && (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                && (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                && (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                && (c[2] >= c[3] || (((c[2] & 1) == 0 || (c[4] = Math.max(c[4], tr[c[2]++])) >= 0)
                    && ((c[3] & 1) == 0 || (c[4] = Math.max(c[4], tr[--c[3]])) >= 0)
                    && (c[2] >>= 1) >= 0 && (c[3] >>= 1) >= 0))
                ? (c[2] >= c[3] ? 0 : H[2].applyAsInt(0)) : -1) != null
            && (H[3] = p ->
                (par[p] = p) >= 0 && (sz[p] = 1) > 0 && (rs[p] = p) >= 0 && (re[p] = p) >= 0 && (c[0] = p) >= 0
                && (p > 0 && par[p - 1] >= 0 ? (c[0] = U[0].applyAsInt(H[0].applyAsInt(p - 1), c[0])) >= 0 : true)
                && (p < n - 1 && par[p + 1] >= 0 ? (c[0] = U[0].applyAsInt(H[0].applyAsInt(p + 1), c[0])) >= 0 : true)
                && (c[1] = re[c[0]] - rs[c[0]] + 1) > 0 && (c[8] = N + rs[c[0]]) > 0 && H[1].applyAsInt(0) >= 0
                ? 0 : -1) != null
            && (H[4] = j ->
                (c[4] = 0) == 0
                && (par[ql[j]] >= 0 ? (c[4] = Math.min(re[H[0].applyAsInt(ql[j])], qr[j]) - ql[j] + 1) > 0 : true)
                && (c[2] = N + ql[j] + 1) > 0
                && (par[qr[j]] >= 0
                    ? (c[5] = rs[H[0].applyAsInt(qr[j])]) >= 0 && (c[4] = Math.max(c[4], qr[j] - Math.max(c[5], ql[j]) + 1)) > 0 && (c[3] = N + c[5]) > 0
                    : (c[3] = N + qr[j] + 1) > 0)
                && H[2].applyAsInt(0) >= 0
                && (c[4] >= qw[j] ? (hi[j] = (lo[j] + hi[j]) >> 1) > 0 : (lo[j] = ((lo[j] + hi[j]) >> 1) + 1) > 0)
                ? 0 : -1) != null
            && new int[n + 3] instanceof int[] st
            && new int[n + 3] instanceof int[] pt
            && new int[n + m] instanceof int[] ev
            && IntStream.range(0, rounds).filter(rd ->
                Stream.of(0).peek(z -> Arrays.fill(tr, 0)).peek(z -> Arrays.fill(par, -1)).peek(z -> Arrays.fill(st, 0)).findFirst().isPresent()
                && IntStream.range(0, m).filter(j -> lo[j] >= hi[j] || ++st[((lo[j] + hi[j]) >> 1) + 1] > 0).count() >= 0
                && IntStream.rangeClosed(1, n + 1).filter(b -> (st[b] += st[b - 1]) >= 0).count() >= 0
                && IntStream.rangeClosed(1, n).filter(b -> (pt[b] = b + st[b]) > 0 && (ev[b - 1 + st[b]] = -b) < 0).count() >= 0
                && IntStream.range(0, m).filter(j -> lo[j] >= hi[j] || (ev[pt[(lo[j] + hi[j]) >> 1]++] = j) >= 0).count() >= 0
                && IntStream.range(0, n + st[n + 1]).filter(e ->
                    ev[e] < 0
                        ? H[3].applyAsInt(ord[-1 - ev[e]]) >= 0
                        : H[4].applyAsInt(ev[e]) >= 0).count() >= 0).count() >= 0
            ? IntStream.range(0, m).mapToObj(j -> String.valueOf(hv[lo[j] - 1])).collect(Collectors.joining("\n"))
            : "");
    }
}

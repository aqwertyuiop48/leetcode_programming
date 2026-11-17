import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && Integer.valueOf(raw.length) instanceof Integer len && new int[1] instanceof int[] ptr0
            && ((IntUnaryOperator) v -> ptr0[0] < len && raw[ptr0[0]] >= 48 && raw[ptr0[0]] <= 57 ? v * 10 + raw[ptr0[0]++] - 48 : v) instanceof IntUnaryOperator dg
            && ((IntSupplier) () -> (ptr0[0] < len && raw[ptr0[0]] <= 32 ? ++ptr0[0] : 0) * 0 + (ptr0[0] < len && raw[ptr0[0]] <= 32 ? ++ptr0[0] : 0) * 0 + (ptr0[0] < len && raw[ptr0[0]] <= 32 ? ++ptr0[0] : 0) * 0 + (ptr0[0] < len && raw[ptr0[0]] <= 32 ? ++ptr0[0] : 0) * 0 + dg.applyAsInt(dg.applyAsInt(dg.applyAsInt(dg.applyAsInt(dg.applyAsInt(dg.applyAsInt(dg.applyAsInt(0)))))))) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && IntStream.range(0, n).map(i -> nx.getAsInt() - 1).toArray() instanceof int[] ar
            && Integer.valueOf(nx.getAsInt()) instanceof Integer q && Integer.valueOf(500) instanceof Integer SQ
            && IntStream.range(0, q).mapToObj(i -> new int[]{nx.getAsInt() - 1, nx.getAsInt() - 1}).toArray(int[][]::new) instanceof int[][] qs
            && IntStream.range(0, q).mapToLong(i -> ((long) (qs[i][0] / SQ) << 40) | ((long) ((qs[i][0] / SQ & 1) == 1 ? 1048575 - qs[i][1] : qs[i][1]) << 20) | i).sorted().toArray() instanceof long[] ord
            && new long[q] instanceof long[] ans && new int[100001] instanceof int[] mf && new int[SQ] instanceof int[] af && (af[0] = n) > 0
            && new int[1024] instanceof int[] gl && new int[100001] instanceof int[] gp && new int[1] instanceof int[] gc && new long[8] instanceof long[] nzb && (nzb[0] = 1L) == 1L
            && ((IntUnaryOperator) f -> (nzb[f >> 6] = af[f] == 0 ? nzb[f >> 6] & ~(1L << f) : nzb[f >> 6] | (1L << f)) == 0 ? 0 : 0) instanceof IntUnaryOperator ub
            && ((IntUnaryOperator) val -> mf[val] >= SQ ? ++mf[val] * 0
                : mf[val] == SQ - 1 ? (--af[SQ - 1]) * 0 + ub.applyAsInt(SQ - 1) + (++mf[val]) * 0 + (gp[val] = gc[0]) * 0 + (gl[gc[0]++] = val) * 0
                : (--af[mf[val]]) * 0 + ub.applyAsInt(mf[val]) + (++mf[val]) * 0 + (++af[mf[val]]) * 0 + ub.applyAsInt(mf[val])) instanceof IntUnaryOperator add
            && ((IntUnaryOperator) val -> mf[val] < SQ ? (--af[mf[val]]) * 0 + ub.applyAsInt(mf[val]) + (--mf[val]) * 0 + (++af[mf[val]]) * 0 + ub.applyAsInt(mf[val])
                : mf[val] == SQ ? (gl[gp[val]] = gl[--gc[0]]) * 0 + (gp[gl[gp[val]]] = gp[val]) * 0 + (++af[SQ - 1]) * 0 + ub.applyAsInt(SQ - 1) + (--mf[val]) * 0
                : (--mf[val]) * 0) instanceof IntUnaryOperator rem
            && new int[]{0, -1} instanceof int[] pr && new int[4096] instanceof int[] buf && new int[4096] instanceof int[] m2 && new int[3] instanceof int[] ptr && new int[1] instanceof int[] md && new int[SQ] instanceof int[] scrQ
            && new int[1] instanceof int[] vv && ((IntUnaryOperator) v -> mf[v] >= SQ ? ++mf[v] : mf[v] == SQ - 1 ? (--af[SQ - 1]) * 0 + (++mf[v]) * 0 + (gp[v] = gc[0]) * 0 + (gl[gc[0]++] = v) * 0 : (--af[mf[v]]) * 0 + (++af[++mf[v]]) * 0) instanceof IntUnaryOperator ad
            && ((IntUnaryOperator) v -> mf[v] < SQ ? (--af[mf[v]]) * 0 + (++af[--mf[v]]) * 0 : mf[v] == SQ ? (gl[gp[v]] = gl[--gc[0]]) * 0 + (gp[gl[gp[v]]] = gp[v]) * 0 + (++af[SQ - 1]) * 0 + (--mf[v]) * 0 : --mf[v]) instanceof IntUnaryOperator rm
            && ((IntUnaryOperator) z -> md[0] == 0 ? ad.applyAsInt(ar[++pr[1]]) : md[0] == 1 ? ad.applyAsInt(ar[--pr[0]]) : md[0] == 2 ? rm.applyAsInt(ar[pr[1]--]) : rm.applyAsInt(ar[pr[0]++])) instanceof IntUnaryOperator mv
            && Arrays.stream(ord).allMatch(key -> Integer.valueOf((int) (key & 1048575)) instanceof Integer id && (qs[id][0] == qs[id][1] || (
                (md[0] = 0) == 0 && Stream.of(0).peek(zz -> Arrays.setAll(new int[Math.max(0, qs[id][1] - pr[1])], mv)).findFirst().isPresent()
                && (md[0] = 1) == 1 && Stream.of(0).peek(zz -> Arrays.setAll(new int[Math.max(0, pr[0] - qs[id][0])], mv)).findFirst().isPresent()
                && (md[0] = 2) == 2 && Stream.of(0).peek(zz -> Arrays.setAll(new int[Math.max(0, pr[1] - qs[id][1])], mv)).findFirst().isPresent()
                && (md[0] = 3) == 3 && Stream.of(0).peek(zz -> Arrays.setAll(new int[Math.max(0, qs[id][0] - pr[0])], mv)).findFirst().isPresent()
                && new long[1] instanceof long[] st && new int[]{-1} instanceof int[] lf && new int[1] instanceof int[] hh && af.clone() instanceof int[] cf && nzb.clone() instanceof long[] bits && (bits[0] &= ~1L) >= Long.MIN_VALUE && new int[2] instanceof int[] wd
                && IntStream.range(0, gc[0]).allMatch(g -> (buf[g] = mf[gl[g]]) > 0) && (ptr[0] = gc[0]) >= 0
                && ((IntUnaryOperator) i -> (hh[0] = cf[i]) == 0 || (
                    (lf[0] == -1 || ((st[0] += lf[0] + i) >= 0 && (lf[0] + i >= SQ ? (buf[ptr[0]++] = lf[0] + i) >= 0 : ++cf[lf[0] + i] > 0 && (bits[(lf[0] + i) >> 6] |= 1L << (lf[0] + i)) != 0) && (lf[0] = -1) < 0 && --hh[0] >= 0))
                    && ((hh[0] & 1) == 0 || ((lf[0] = i) > 0 && --hh[0] >= 0))
                    && (st[0] += (long) i * hh[0]) >= 0
                    && (2 * i >= SQ ? (hh[0] >> 1) == 0 || IntStream.range(0, hh[0] >> 1).allMatch(j -> (buf[ptr[0]++] = 2 * i) > 0) : (cf[2 * i] += hh[0] >> 1) >= 0 && ((hh[0] >> 1) == 0 || (bits[(2 * i) >> 6] |= 1L << (2 * i)) != 0))) ? 0 : 0) instanceof IntUnaryOperator heavy
                && Stream.of(0).peek(zq -> Arrays.setAll(scrQ, i -> i == 0 || cf[i] == 0 ? 0 : heavy.applyAsInt(i))).findFirst().isPresent()
                && (lf[0] == -1 || (buf[ptr[0]++] = lf[0]) > 0)
                && IntStream.of(0).peek(z -> Arrays.sort(buf, 0, ptr[0])).sum() == 0
                && new int[]{0, 0, 0, 0} instanceof int[] hp && ((IntSupplier) () -> hp[0] < ptr[0] && (hp[1] >= hp[2] || buf[hp[0]] <= m2[hp[1]]) ? buf[hp[0]++] : m2[hp[1]++]) instanceof IntSupplier take
                && IntStream.range(0, Math.max(0, ptr[0] - 1)).allMatch(z -> (hp[3] = take.getAsInt() + take.getAsInt()) > 0 && (st[0] += hp[3]) > 0 && (m2[hp[2]++] = hp[3]) > 0)
                && (ans[id] = st[0]) >= 0)) || true)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

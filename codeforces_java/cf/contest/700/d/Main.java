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
            && new int[1024] instanceof int[] gl && new int[100001] instanceof int[] gp && new int[1] instanceof int[] gc
            && new int[]{0, -1} instanceof int[] pr && new int[4096] instanceof int[] buf && new int[4096] instanceof int[] m2 && new int[3] instanceof int[] ptr && new int[2] instanceof int[] md && new int[SQ] instanceof int[] scrQ
            && new int[SQ] instanceof int[] cf && new long[1] instanceof long[] st && new int[2] instanceof int[] lf && new int[4] instanceof int[] hp && new int[100001] instanceof int[] scrM
            && ((IntUnaryOperator) v -> mf[v] >= SQ ? ++mf[v] * 0 : mf[v] == SQ - 1 ? (--af[SQ - 1]) * 0 + (++mf[v]) * 0 + (gp[v] = gc[0]) * 0 + (gl[gc[0]++] = v) * 0 : (--af[mf[v]]) * 0 + (++af[++mf[v]]) * 0) instanceof IntUnaryOperator ad
            && ((IntUnaryOperator) v -> mf[v] < SQ ? (--af[mf[v]]) * 0 + (++af[--mf[v]]) * 0 : mf[v] == SQ ? (gl[gp[v]] = gl[--gc[0]]) * 0 + (gp[gl[gp[v]]] = gp[v]) * 0 + (++af[SQ - 1]) * 0 + (--mf[v]) * 0 : --mf[v] * 0) instanceof IntUnaryOperator rm
            && ((IntUnaryOperator) z -> z >= md[1] ? 0 : md[0] == 0 ? ad.applyAsInt(ar[++pr[1]]) : md[0] == 1 ? ad.applyAsInt(ar[--pr[0]]) : md[0] == 2 ? rm.applyAsInt(ar[pr[1]--]) : rm.applyAsInt(ar[pr[0]++])) instanceof IntUnaryOperator mv
            && ((IntUnaryOperator) i -> (lf[1] = cf[i]) == 0 || (
                    (lf[0] == -1 || ((st[0] += lf[0] + i) >= 0 && (lf[0] + i >= SQ ? (buf[ptr[0]++] = lf[0] + i) >= 0 : ++cf[lf[0] + i] > 0) && (lf[0] = -1) < 0 && --lf[1] >= 0))
                    && ((lf[1] & 1) == 0 || ((lf[0] = i) > 0 && --lf[1] >= 0))
                    && (st[0] += (long) i * lf[1]) >= 0
                    && (2 * i >= SQ ? (lf[1] >> 1) == 0 || IntStream.range(0, lf[1] >> 1).allMatch(j -> (buf[ptr[0]++] = 2 * i) > 0) : (cf[2 * i] += lf[1] >> 1) >= 0)) ? 0 : 0) instanceof IntUnaryOperator heavy
            && ((IntUnaryOperator) i -> i == 0 || cf[i] == 0 ? 0 : heavy.applyAsInt(i)) instanceof IntUnaryOperator scan
            && ((IntSupplier) () -> hp[0] < ptr[0] && (hp[1] >= hp[2] || buf[hp[0]] <= m2[hp[1]]) ? buf[hp[0]++] : m2[hp[1]++]) instanceof IntSupplier take
            && ((IntUnaryOperator) z -> (hp[3] = take.getAsInt() + take.getAsInt()) * 0 + (int) ((st[0] += hp[3]) * 0) + (m2[hp[2]++] = hp[3]) * 0) instanceof IntUnaryOperator merge
            && ((IntBinaryOperator) (mode, cnt) -> (md[0] = mode) * 0 + (md[1] = Math.max(0, cnt)) * 0 + (md[1] == 0 ? 0 : Arrays.stream(scrM, 0, md[1]).map(mv).sum())) instanceof IntBinaryOperator run
            && Arrays.stream(ord).allMatch(key -> Integer.valueOf((int) (key & 1048575)) instanceof Integer id && (qs[id][0] == qs[id][1] || (
                run.applyAsInt(0, qs[id][1] - pr[1]) == 0 && run.applyAsInt(1, pr[0] - qs[id][0]) == 0 && run.applyAsInt(2, pr[1] - qs[id][1]) == 0 && run.applyAsInt(3, qs[id][0] - pr[0]) == 0
                && (st[0] = 0) == 0 && (lf[0] = -1) < 0 && IntStream.of(0).peek(z -> System.arraycopy(af, 0, cf, 0, SQ)).sum() == 0
                && IntStream.range(0, gc[0]).allMatch(g -> (buf[g] = mf[gl[g]]) > 0) && (ptr[0] = gc[0]) >= 0
                && IntStream.of(0).peek(zq -> Arrays.setAll(scrQ, scan)).sum() == 0
                && (lf[0] == -1 || (buf[ptr[0]++] = lf[0]) > 0)
                && IntStream.of(0).peek(z -> Arrays.sort(buf, 0, ptr[0])).sum() == 0
                && (hp[0] = 0) == 0 && (hp[1] = 0) == 0 && (hp[2] = 0) == 0
                && (ptr[0] < 2 || Arrays.stream(scrM, 0, ptr[0] - 1).map(merge).sum() == 0)
                && (ans[id] = st[0]) >= 0)) || true)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

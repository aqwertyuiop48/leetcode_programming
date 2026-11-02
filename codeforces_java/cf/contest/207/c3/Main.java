import java.util.*;
import java.util.function.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw ? CompletableFuture.supplyAsync(() -> new int[raw.length / 2 + 4] instanceof int[] nums && new int[raw.length / 4 + 4] instanceof int[] lets && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57 ? (ps[0] = ps[0] * 10 + raw[i] - 48) >= 0 && (ps[1] = 1) > 0
                : (ps[1] == 0 || (nums[ps[2]++] = ps[0]) >= 0 && (ps[0] = 0) == 0 && (ps[1] = 0) == 0) && (i < raw.length && raw[i] >= 97 ? (lets[ps[3]++] = raw[i] - 97) >= 0 : true))
            && (Integer) nums[0] instanceof Integer q
            && new int[q + 1] instanceof int[] ot && new int[q + 1] instanceof int[] ou && new int[q + 1] instanceof int[] oc
            && IntStream.rangeClosed(1, q).allMatch(i -> (ot[i] = nums[2 * i - 1]) > 0 && (ou[i] = nums[2 * i]) > 0 && (oc[i] = lets[i - 1]) >= 0)
            && (Integer) ((int) IntStream.rangeClosed(1, q).filter(i -> ot[i] == 1).count() + 3) instanceof Integer c1 && (Integer) (q - c1 + 9) instanceof Integer c2
            && new int[26 * c1] instanceof int[] tr && new int[c1] instanceof int[] tp && new int[c1] instanceof int[] tch && new int[c1] instanceof int[] val && new int[c1] instanceof int[] id1
            && new int[c2] instanceof int[] par2 && new int[c2] instanceof int[] x2 && new int[c2] instanceof int[] d2
            && new int[q + 1] instanceof int[] opn && new int[q + 1] instanceof int[] kill && new int[]{1, 1, 1} instanceof int[] cnt
            && (val[1] = 1) > 0 && (id1[1] = 1) > 0
            && IntStream.rangeClosed(1, q).allMatch(i -> ot[i] == 1
                ? (Integer) id1[ou[i]] instanceof Integer u0
                    && (tr[u0 * 26 + oc[i]] != 0 || (tr[u0 * 26 + oc[i]] = ++cnt[0]) > 0 && (tp[cnt[0]] = u0) > 0 && (tch[cnt[0]] = oc[i] + 1) > 0 && (kill[i] = 1) > 0)
                    && ++val[tr[u0 * 26 + oc[i]]] > 0 && (id1[++cnt[2]] = tr[u0 * 26 + oc[i]]) > 0 && (opn[i] = tr[u0 * 26 + oc[i]]) > 0
                : (par2[++cnt[1]] = ou[i]) > 0 && (x2[cnt[1]] = oc[i] + 1) > 0 && (d2[cnt[1]] = d2[ou[i]] + 1) > 0 && (opn[i] = cnt[1]) > 0)
            && (Integer) cnt[0] instanceof Integer n1 && (Integer) cnt[1] instanceof Integer n2
            && (Integer) Math.max(n1, n2) instanceof Integer mx
            && ((LongUnaryOperator) s -> (s & 2305843009213693951L) + (s >>> 61) >= 2305843009213693951L ? (s & 2305843009213693951L) + (s >>> 61) - 2305843009213693951L : (s & 2305843009213693951L) + (s >>> 61)) instanceof LongUnaryOperator red
            && ((LongBinaryOperator) (a, b) -> red.applyAsLong((a * b & 2305843009213693951L) + ((a * b >>> 61) | (Math.multiplyHigh(a, b) << 3)))) instanceof LongBinaryOperator mul
            && new long[mx + 2] instanceof long[] pw && (pw[0] = 1) > 0
            && IntStream.rangeClosed(1, mx + 1).allMatch(i -> (pw[i] = mul.applyAsLong(pw[i - 1], 1234567891011121L)) > 0)
            && new long[n2 + 1] instanceof long[] hv
            && IntStream.rangeClosed(2, n2).allMatch(v -> (hv[v] = red.applyAsLong(x2[v] + mul.applyAsLong(1234567891011121L, hv[par2[v]]))) >= 0)
            && new long[1 << 18] instanceof long[] tk0 && new int[1 << 18] instanceof int[] tv
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] probe
            && (probe[0] = (p, key) -> tv[(int) p] == 0 || tk0[(int) p] == key ? p : probe[0].applyAsLong((p + 1) & ((1 << 18) - 1), key)) != null
            && ((LongUnaryOperator) key -> probe[0].applyAsLong((key * 0x9E3779B97F4A7C15L) >>> 46, key)) instanceof LongUnaryOperator slot
            && new long[n1 + 1] instanceof long[] th && new int[n1 + 1] instanceof int[] dp1
            && IntStream.rangeClosed(2, n1).allMatch(u -> (dp1[u] = dp1[tp[u]] + 1) > 0
                && (th[u] = red.applyAsLong(th[tp[u]] + mul.applyAsLong(tch[u], pw[dp1[u] - 1]))) >= 0
                && (Integer) (int) slot.applyAsLong(th[u]) instanceof Integer sl && (tk0[sl] = th[u]) >= 0 && (tv[sl] = u) > 0)
            && new int[n2 + 1] instanceof int[] siz2 && IntStream.rangeClosed(1, n2).allMatch(v -> (siz2[v] = 1) > 0)
            && IntStream.iterate(n2, v -> v >= 2, v -> v - 1).allMatch(v -> (siz2[par2[v]] += siz2[v]) > 0)
            && new int[n2 + 2] instanceof int[] pos2 && new int[n2 + 2] instanceof int[] nf2 && new int[n2 + 2] instanceof int[] ord2 && (pos2[1] = 1) > 0 && (nf2[1] = 2) > 0 && (ord2[1] = 1) > 0
            && IntStream.rangeClosed(2, n2).allMatch(v -> (pos2[v] = nf2[par2[v]]) > 0 && (nf2[par2[v]] += siz2[v]) > 0 && (nf2[v] = pos2[v] + 1) > 0 && (ord2[pos2[v]] = v) > 0)
            && new int[n2 + 2] instanceof int[] path && new int[n2 + 1] instanceof int[] dcur && new int[n2 + 1] instanceof int[] mf && new int[1] instanceof int[] sc
            && IntStream.range(0, 17 * n2).map(t -> (Integer) ord2[t / 17 + 1] instanceof Integer v
                && ((16 - t % 17 != 16) || (path[d2[v]] = v) > 0 && (mf[v] = 1) > 0 && (dcur[v] = 0) == 0)
                && dcur[v] + (1 << (16 - t % 17)) <= d2[v]
                && (sc[0] = tv[(int) slot.applyAsLong((hv[v] - mul.applyAsLong(pw[dcur[v] + (1 << (16 - t % 17))], hv[path[d2[v] - dcur[v] - (1 << (16 - t % 17))]]) + 2305843009213693951L) % 2305843009213693951L)]) != 0
                && (mf[v] = sc[0]) > 0 && (dcur[v] += 1 << (16 - t % 17)) > 0 ? 1 : 0).sum() >= 0
            && new long[n1 + 1] instanceof long[] vs && (vs[1] = 1) > 0
            && IntStream.rangeClosed(2, n1).allMatch(u -> (vs[u] = vs[tp[u]] + val[u]) > 0)
            && new int[n1 + 1] instanceof int[] siz1 && IntStream.rangeClosed(1, n1).allMatch(u -> (siz1[u] = 1) > 0)
            && IntStream.iterate(n1, u -> u >= 2, u -> u - 1).allMatch(u -> (siz1[tp[u]] += siz1[u]) > 0)
            && new int[n1 + 2] instanceof int[] tin && new int[n1 + 2] instanceof int[] nf1 && (tin[1] = 1) > 0 && (nf1[1] = 2) > 0
            && IntStream.rangeClosed(2, n1).allMatch(u -> (tin[u] = nf1[tp[u]]) > 0 && (nf1[tp[u]] += siz1[u]) > 0 && (nf1[u] = tin[u] + 1) > 0)
            && new int[n1 + 2] instanceof int[] b1 && new int[n1 + 2] instanceof int[] b2 && new int[n1 + 2] instanceof int[] cq && new long[]{0} instanceof long[] total
            && IntStream.rangeClosed(1, n2).allMatch(v -> ++cq[mf[v]] > 0 && (total[0] += vs[mf[v]]) > 0)
            && IntStream.rangeClosed(1, n1).allMatch(u -> (b1[tin[u]] += cq[u]) >= 0)
            && IntStream.rangeClosed(1, n1).allMatch(i -> i + (i & -i) > n1 || (b1[i + (i & -i)] += b1[i]) >= 0)
            && new IntBinaryOperator[2] instanceof IntBinaryOperator[] add && new IntUnaryOperator[3] instanceof IntUnaryOperator[] pre
            && (add[0] = (i, d) -> i > n1 ? 0 : (b1[i] += d) * 0 + add[0].applyAsInt(i + (i & -i), d)) != null
            && (add[1] = (i, d) -> i > n1 ? 0 : (b2[i] += d) * 0 + add[1].applyAsInt(i + (i & -i), d)) != null
            && (pre[0] = i -> i == 0 ? 0 : b1[i] + pre[0].applyAsInt(i & (i - 1))) != null
            && (pre[1] = i -> i == 0 ? 0 : b2[i] + pre[1].applyAsInt(i & (i - 1))) != null
            && new int[n1 + 1] instanceof int[] dsu && IntStream.rangeClosed(1, n1).allMatch(u -> (dsu[u] = u) > 0)
            && (pre[2] = x -> dsu[x] == x ? x : (dsu[x] = pre[2].applyAsInt(dsu[x]))) != null
            && new long[q + 1] instanceof long[] res
            && IntStream.iterate(q, i -> i >= 1, i -> i - 1).allMatch(i -> (res[i] = total[0]) >= 0
                && (ot[i] == 1
                    ? (Integer) opn[i] instanceof Integer u && (total[0] -= pre[0].applyAsInt(tin[u] + siz1[u] - 1) - pre[0].applyAsInt(tin[u] - 1)) > Long.MIN_VALUE
                        && add[1].applyAsInt(tin[u], -1) == 0 && add[1].applyAsInt(tin[u] + siz1[u], 1) == 0
                        && (kill[i] == 0 || (Integer) tp[u] instanceof Integer pp && add[0].applyAsInt(tin[u], -cq[u]) == 0 && add[0].applyAsInt(tin[pp], cq[u]) == 0 && (cq[pp] += cq[u]) >= 0 && (cq[u] = 0) == 0 && (dsu[u] = pp) > 0)
                    : (Integer) pre[2].applyAsInt(mf[opn[i]]) instanceof Integer w && (total[0] -= vs[w] + pre[1].applyAsInt(tin[w])) > Long.MIN_VALUE && add[0].applyAsInt(tin[w], -1) == 0 && --cq[w] >= 0))
            ? IntStream.rangeClosed(1, q).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining("\n")) : "", r -> new Thread(null, r, "t", 1L << 26).start()).join() : "");
    }
}

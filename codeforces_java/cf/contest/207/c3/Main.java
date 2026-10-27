import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && new int[q + 1] instanceof int[] ot && new int[q + 1] instanceof int[] ou && new int[q + 1] instanceof int[] oc
            && IntStream.rangeClosed(1, q).allMatch(i -> (ot[i] = Integer.parseInt(tk.nextToken())) > 0 && (ou[i] = Integer.parseInt(tk.nextToken())) > 0 && (oc[i] = tk.nextToken().charAt(0) - 'a') >= 0)
            && (Integer) ((int) IntStream.rangeClosed(1, q).filter(i -> ot[i] == 1).count() + 3) instanceof Integer c1 && (Integer) (q - c1 + 9) instanceof Integer c2
            && new int[26 * c1] instanceof int[] tr1 && new int[c1] instanceof int[] fa1 && new int[c1] instanceof int[] ch1 && new int[c1] instanceof int[] val1
            && new int[26 * c2] instanceof int[] tr2 && new int[c2] instanceof int[] fa2 && new int[c2] instanceof int[] ch2
            && new int[c1] instanceof int[] id1 && new int[c2] instanceof int[] id2 && new int[]{1, 1, 1, 1} instanceof int[] cnt
            && (id1[1] = 1) > 0 && (id2[1] = 1) > 0 && (val1[1] = 1) > 0
            && IntStream.rangeClosed(1, q).allMatch(i -> ot[i] == 1
                ? ++cnt[2] > 0 && (tr1[id1[ou[i]] * 26 + oc[i]] != 0 || (tr1[id1[ou[i]] * 26 + oc[i]] = ++cnt[0]) > 0 && (fa1[cnt[0]] = id1[ou[i]]) > 0 && (ch1[cnt[0]] = oc[i] + 1) > 0)
                    && ++val1[tr1[id1[ou[i]] * 26 + oc[i]]] > 0 && (id1[cnt[2]] = tr1[id1[ou[i]] * 26 + oc[i]]) > 0
                : ++cnt[3] > 0 && (tr2[id2[ou[i]] * 26 + oc[i]] != 0 || (tr2[id2[ou[i]] * 26 + oc[i]] = ++cnt[1]) > 0 && (fa2[cnt[1]] = id2[ou[i]]) > 0 && (ch2[cnt[1]] = oc[i] + 1) > 0)
                    && (id2[cnt[3]] = tr2[id2[ou[i]] * 26 + oc[i]]) > 0)
            && (Integer) cnt[0] instanceof Integer n1 && (Integer) cnt[1] instanceof Integer n2 && (Integer) cnt[2] instanceof Integer v1 && (Integer) cnt[3] instanceof Integer v2
            && new long[(1 << 19) + 1] instanceof long[] pw1 && new long[(1 << 19) + 1] instanceof long[] pw2 && (pw1[0] = 1) > 0 && (pw2[0] = 1) > 0
            && IntStream.rangeClosed(1, 1 << 19).allMatch(i -> (pw1[i] = pw1[i - 1] * 131 % 998244353L) > 0 && (pw2[i] = pw2[i - 1] * 13331 % 998244853L) > 0)
            && new long[1 << 20] instanceof long[] tk0 && new int[1 << 20] instanceof int[] tv && IntStream.range(0, 1 << 20).allMatch(i -> (tk0[i] = -1) < 0)
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] probe
            && (probe[0] = (p, key) -> tk0[(int) p] == -1 || tk0[(int) p] == key ? p : probe[0].applyAsLong((p + 1) & ((1 << 20) - 1), key)) != null
            && ((LongUnaryOperator) key -> probe[0].applyAsLong((key * 0x9E3779B97F4A7C15L) >>> 44, key)) instanceof LongUnaryOperator slot
            && new long[n1 + 1] instanceof long[] ha && new long[n1 + 1] instanceof long[] hb
            && (Integer) (int) slot.applyAsLong(0L) instanceof Integer s0 && (tk0[s0] = 0L) == 0 && (tv[s0] = 1) > 0
            && IntStream.rangeClosed(2, n1).allMatch(v -> (ha[v] = (ha[fa1[v]] * 131 + ch1[v]) % 998244353L) >= 0 && (hb[v] = (hb[fa1[v]] * 13331 + ch1[v]) % 998244853L) >= 0
                && (Integer) (int) slot.applyAsLong(ha[v] << 32 | hb[v]) instanceof Integer sl && (tk0[sl] = ha[v] << 32 | hb[v]) >= 0 && (tv[sl] = v) > 0)
            && (Integer) (33 - Integer.numberOfLeadingZeros(c2)) instanceof Integer kk
            && new int[kk * c2] instanceof int[] f && new int[kk * c2] instanceof int[] g1 && new int[kk * c2] instanceof int[] g2
            && IntStream.rangeClosed(1, n2).allMatch(v -> (f[v] = fa2[v]) >= 0 && (g1[v] = ch2[v]) >= 0 && (g2[v] = ch2[v]) >= 0
                && IntStream.range(1, kk).allMatch(j -> (f[j * c2 + v] = f[(j - 1) * c2 + f[(j - 1) * c2 + v]]) >= 0
                    && (g1[j * c2 + v] = (int) ((g1[(j - 1) * c2 + v] * pw1[1 << (j - 1)] + g1[(j - 1) * c2 + f[(j - 1) * c2 + v]]) % 998244353L)) >= 0
                    && (g2[j * c2 + v] = (int) ((g2[(j - 1) * c2 + v] * pw2[1 << (j - 1)] + g2[(j - 1) * c2 + f[(j - 1) * c2 + v]]) % 998244853L)) >= 0))
            && new int[c2] instanceof int[] idm
            && IntStream.rangeClosed(1, n2).allMatch(v -> new long[]{0, 0, v} instanceof long[] st
                && IntStream.range(0, kk).map(jj -> kk - 1 - jj).allMatch(j -> f[j * c2 + (int) st[2]] == 0
                    || (Long) ((st[0] * pw1[1 << j] + g1[j * c2 + (int) st[2]]) % 998244353L) instanceof Long t1 && (Long) ((st[1] * pw2[1 << j] + g2[j * c2 + (int) st[2]]) % 998244853L) instanceof Long t2
                    && (tk0[(int) slot.applyAsLong(t1 << 32 | t2)] != (t1 << 32 | t2) || (st[0] = t1) >= 0 && (st[1] = t2) >= 0 && (st[2] = f[j * c2 + (int) st[2]]) >= 0))
                && (idm[v] = tv[(int) slot.applyAsLong(st[0] << 32 | (long) st[1])]) > 0)
            && new int[n1 + 1] instanceof int[] siz && IntStream.rangeClosed(1, n1).allMatch(v -> (siz[v] = 1) > 0)
            && IntStream.iterate(n1, v -> v >= 2, v -> v - 1).allMatch(v -> (siz[fa1[v]] += siz[v]) > 0)
            && IntStream.rangeClosed(2, n1).allMatch(v -> (val1[v] += val1[fa1[v]]) > 0)
            && new int[n1 + 1] instanceof int[] dfn && new int[n1 + 1] instanceof int[] nf && (dfn[1] = 1) > 0 && (nf[1] = 2) > 0
            && IntStream.rangeClosed(2, n1).allMatch(v -> (dfn[v] = nf[fa1[v]]) > 0 && (nf[fa1[v]] += siz[v]) > 0 && (nf[v] = dfn[v] + 1) > 0)
            && new long[n1 + 3] instanceof long[] base && IntStream.rangeClosed(1, n1).allMatch(v -> (base[dfn[v]] = val1[v]) > 0)
            && new long[n1 + 3] instanceof long[] ba && new long[n1 + 3] instanceof long[] bb
            && ((LongBinaryOperator) (pos, dv) -> IntStream.iterate((int) pos, i -> i <= n1 + 1, i -> i + (i & -i)).allMatch(i -> (ba[i] += dv) > Long.MIN_VALUE) ? 0L : 1L) instanceof LongBinaryOperator addA
            && ((LongBinaryOperator) (pos, dv) -> IntStream.iterate((int) pos, i -> i <= n1, i -> i + (i & -i)).allMatch(i -> (bb[i] += dv) > Long.MIN_VALUE) ? 0L : 1L) instanceof LongBinaryOperator addB
            && ((LongUnaryOperator) pos -> IntStream.iterate((int) pos, i -> i > 0, i -> i & (i - 1)).mapToLong(i -> ba[i]).sum()) instanceof LongUnaryOperator preA
            && ((LongUnaryOperator) pos -> IntStream.iterate((int) pos, i -> i > 0, i -> i & (i - 1)).mapToLong(i -> bb[i]).sum()) instanceof LongUnaryOperator preB
            && new long[]{0} instanceof long[] sum
            && IntStream.rangeClosed(1, v2).allMatch(i -> (Integer) idm[id2[i]] instanceof Integer u && addB.applyAsLong(dfn[u], 1) == 0 && (sum[0] += base[dfn[u]] + preA.applyAsLong(dfn[u])) > Long.MIN_VALUE)
            && new long[q + 1] instanceof long[] res && new int[]{v1, v2} instanceof int[] cur
            && IntStream.iterate(q, i -> i >= 1, i -> i - 1).allMatch(i -> (res[i] = sum[0]) >= 0
                && (ot[i] == 1
                    ? (Integer) id1[cur[0]] instanceof Integer v && (sum[0] -= preB.applyAsLong(dfn[v] + siz[v] - 1) - preB.applyAsLong(dfn[v] - 1)) > Long.MIN_VALUE
                        && addA.applyAsLong(dfn[v], -1) == 0 && addA.applyAsLong(dfn[v] + siz[v], 1) == 0 && --cur[0] >= 0
                    : (Integer) idm[id2[cur[1]]] instanceof Integer u && addB.applyAsLong(dfn[u], -1) == 0 && (sum[0] -= base[dfn[u]] + preA.applyAsLong(dfn[u])) > Long.MIN_VALUE && --cur[1] >= 0))
            ? IntStream.rangeClosed(1, q).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining("\n")) : "");
    }


}

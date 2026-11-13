import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] v
            && new long[]{0, 1, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).allMatch(k -> 0 * (raw[k] > 64 ? (v[(int) st[3]++] = raw[k]) : raw[k] > 47 ? (st[0] = st[0] * 10 + raw[k] - 48) + (st[2] = 1) : raw[k] == 45 ? (st[1] = -1) : st[2] == 1 ? (v[(int) st[3]++] = st[0] * st[1]) + (st[0] = 0) + (st[1] = 1) + (st[2] = 0) : 0) == 0)
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer m
            && Long.valueOf(v[2 + 4 * m]) instanceof Long bud
            && new long[m] instanceof long[] w && new long[m] instanceof long[] cc && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev
            && IntStream.range(0, m).allMatch(i -> (w[i] = v[2 + i]) + (cc[i] = v[2 + m + i]) + (eu[i] = (int) v[2 + 2 * m + 2 * i] - 1) + (ev[i] = (int) v[3 + 2 * m + 2 * i] - 1) > -5)
            && IntStream.range(0, m).mapToLong(i -> w[i] << 18 | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, n).toArray() instanceof int[] par && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && (IntUnaryOperator) (x -> par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[par[x]]]]]]]]]]]]]]]]]]) instanceof IntUnaryOperator find
            && new boolean[m] instanceof boolean[] in
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] head
            && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] id
            && new long[]{0, 0} instanceof long[] tw
            && IntStream.range(0, m).allMatch(k -> Integer.valueOf((int) (keys[k] & 262143)) instanceof Integer e
                && Integer.valueOf(find.applyAsInt(eu[e])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(ev[e])) instanceof Integer rb
                && (ra.equals(rb)
                    || (in[e] = true)
                    && Integer.valueOf(2 * (int) tw[1]) instanceof Integer sl
                    && 0 * ((sz[ra] >= sz[rb] ? (par[rb] = ra) + (sz[ra] += sz[rb]) : (par[ra] = rb) + (sz[rb] += sz[ra]))
                        + (to[sl] = ev[e]) + (id[sl] = e) + (nxt[sl] = head[eu[e]]) + (head[eu[e]] = sl)
                        + (to[sl + 1] = eu[e]) + (id[sl + 1] = e) + (nxt[sl + 1] = head[ev[e]]) + (head[ev[e]] = sl + 1)
                        + (tw[1] += 1) + (tw[0] += w[e])) == 0))
            && new int[n] instanceof int[] q && new int[n] instanceof int[] dep && new int[n] instanceof int[] pr
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] pe
            && new int[]{1} instanceof int[] qt && (dep[0] = 1) == 1
            && IntStream.range(0, n).allMatch(qi -> IntStream.iterate(head[q[qi]], s -> s >= 0, s -> nxt[s])
                .allMatch(s -> dep[to[s]] != 0 || 0 * ((dep[to[s]] = dep[q[qi]] + 1) + (pr[to[s]] = q[qi]) + (pe[to[s]] = id[s]) + (q[qt[0]++] = to[s])) == 0))
            && new int[18][n] instanceof int[][] up && new int[18][n] instanceof int[][] mx
            && (IntBinaryOperator) ((p, r) -> p < 0 ? r : r < 0 ? p : w[r] > w[p] ? r : p) instanceof IntBinaryOperator bt
            && IntStream.range(0, n).allMatch(x -> (up[0][x] = pr[x]) + (mx[0][x] = pe[x]) > -5)
            && IntStream.range(1, 18).allMatch(j -> IntStream.range(0, n).allMatch(x -> (up[j][x] = up[j - 1][up[j - 1][x]]) + (mx[j][x] = bt.applyAsInt(mx[j - 1][x], mx[j - 1][up[j - 1][x]])) > -5))
            && (IntBinaryOperator) ((x, y) -> new int[]{dep[x] >= dep[y] ? x : y, dep[x] >= dep[y] ? y : x, -1} instanceof int[] qs
                && Integer.valueOf(dep[qs[0]] - dep[qs[1]]) instanceof Integer df
                && IntStream.range(0, 18).allMatch(j -> (df >> j & 1) == 0 || 0 * ((qs[2] = bt.applyAsInt(qs[2], mx[j][qs[0]])) + (qs[0] = up[j][qs[0]])) == 0)
                && (qs[0] == qs[1]
                    || IntStream.iterate(17, j -> j - 1).limit(18).allMatch(j -> up[j][qs[0]] == up[j][qs[1]] || 0 * ((qs[2] = bt.applyAsInt(bt.applyAsInt(qs[2], mx[j][qs[0]]), mx[j][qs[1]])) + (qs[0] = up[j][qs[0]]) + (qs[1] = up[j][qs[1]])) == 0)
                    && 0 * (qs[2] = bt.applyAsInt(bt.applyAsInt(qs[2], pe[qs[0]]), pe[qs[1]])) == 0)
                ? qs[2] : -1) instanceof IntBinaryOperator qry
            && new long[m] instanceof long[] cand && new int[m] instanceof int[] rem
            && IntStream.range(0, m).allMatch(e -> 0 * (in[e] ? (cand[e] = tw[0] - bud / cc[e]) : (cand[e] = tw[0] - w[rem[e] = qry.applyAsInt(eu[e], ev[e])] + w[e] - bud / cc[e])) == 0)
            && IntStream.range(0, m).boxed().min(Comparator.comparingLong((Integer e) -> cand[e])).get() instanceof Integer b
            && new StringBuilder() instanceof StringBuilder sb
            && sb.append(cand[b]).append('\n').length() > 0
            && IntStream.range(0, m).filter(e -> e == b || (in[e] && e != (in[b] ? -1 : rem[b]))).allMatch(e -> sb.append(e + 1).append(' ').append(e == b ? w[e] - bud / cc[e] : w[e]).append('\n').length() > 0)
            ? sb.toString().trim() : "");
    }
}

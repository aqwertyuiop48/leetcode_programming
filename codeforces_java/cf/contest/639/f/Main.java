import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf((int) IntStream.range(0, raw.length).filter(i -> raw[i] > 47 && (i + 1 == raw.length || raw[i + 1] <= 47)).count() + 2) instanceof Integer tc
            && new int[tc] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer m && Integer.valueOf(v[2]) instanceof Integer q
            && ((Function<int[][], Integer>) (A -> A[0] instanceof int[] head && A[1] instanceof int[] nxt && A[2] instanceof int[] to && A[3] instanceof int[] tin
                && A[4] instanceof int[] low && A[5] instanceof int[] pe && A[6] instanceof int[] pv && A[7] instanceof int[] ptr && A[8] instanceof int[] stk
                && A[9] instanceof int[] ordv && A[10] instanceof int[] br && A[11] instanceof int[] comp && A[12] instanceof int[] z && A[13] instanceof int[] dim
                && IntStream.range(0, 3 * dim[0] + 2 * dim[1] + 5).filter(s -> 0 * (z[0] == 0
                    ? (z[2] >= dim[0] ? 0
                        : (z[2] += (int) IntStream.iterate(z[2], x -> x < dim[0] && tin[x] != 0, x -> x + 1).count()) < dim[0]
                            ? (pe[z[2]] = -1) + (pv[z[2]] = -1) + (tin[z[2]] = low[z[2]] = ++z[1]) + (ordv[z[1] - 1] = z[2]) + (stk[z[0]++] = z[2])
                            : 0)
                    : 0 * ((z[4] = stk[z[0] - 1]) + (z[5] = ptr[z[4]])) + (z[5] >= 0
                        ? (ptr[z[4]] = nxt[z[5]]) + 0 * (z[6] = to[z[5]])
                            + ((z[5] >> 1) == pe[z[4]] ? 0 : tin[z[6]] != 0 ? (low[z[4]] = Math.min(low[z[4]], tin[z[6]]))
                                : (pe[z[6]] = z[5] >> 1) + (pv[z[6]] = z[4]) + (tin[z[6]] = low[z[6]] = ++z[1]) + (ordv[z[1] - 1] = z[6]) + (stk[z[0]++] = z[6]))
                        : z[0]-- + (z[0] > 0 ? (low[pv[z[4]]] = Math.min(low[pv[z[4]]], low[z[4]])) + (low[z[4]] > tin[pv[z[4]]] ? (br[pe[z[4]]] = 1) : 0) : 0))) != 0).count() == 0
                && IntStream.range(0, dim[0]).filter(r -> 0 * (comp[ordv[r]] = pe[ordv[r]] < 0 || br[pe[ordv[r]]] == 1 ? ++z[3] : comp[pv[ordv[r]]]) != 0).count() == 0
                ? z[3] : -1)) instanceof Function<int[][], Integer> bridges
            && new int[n] instanceof int[] head && new int[Math.max(1, 2 * m)] instanceof int[] nxt && new int[Math.max(1, 2 * m)] instanceof int[] to
            && IntStream.range(0, n).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, 2 * m).filter(e -> 0 * ((to[e] = v[3 + 2 * (e >> 1) + ((e & 1) ^ 1)] - 1) + (nxt[e] = head[v[3 + 2 * (e >> 1) + (e & 1)] - 1])
                + (head[v[3 + 2 * (e >> 1) + (e & 1)] - 1] = e)) != 0).count() == 0
            && new int[n] instanceof int[] pe && new int[n] instanceof int[] pv && new int[n + 1] instanceof int[] ordv && new int[m + 1] instanceof int[] br
            && new int[n] instanceof int[] comp
            && bridges.apply(new int[][]{head, nxt, to, new int[n], new int[n], pe, pv, head, new int[n], ordv, br, comp, new int[8], new int[]{n, m}}) instanceof Integer C
            && new int[C + 1] instanceof int[] cpar && new int[C + 1] instanceof int[] sz && new int[C + 1] instanceof int[] pos && new int[C + 1] instanceof int[] off
            && new int[C + 1] instanceof int[] dep && new int[C + 1] instanceof int[] tout && new int[C + 1] instanceof int[] nodeAt
            && IntStream.range(0, n).filter(r -> 0 * ((pe[ordv[r]] < 0 || br[pe[ordv[r]]] == 1) ? (cpar[comp[ordv[r]]] = pv[ordv[r]] < 0 ? 0 : comp[pv[ordv[r]]]) : 0) != 0).count() == 0
            && IntStream.rangeClosed(0, C).filter(c -> (sz[c] = 1) < 0).count() == 0
            && IntStream.range(0, C).map(r -> C - r).filter(c -> 0 * (sz[cpar[c]] += sz[c]) != 0).count() == 0
            && (off[0] = 1) + (pos[0] = 0) == 1
            && IntStream.rangeClosed(1, C).filter(c -> 0 * ((pos[c] = off[cpar[c]]) + (off[cpar[c]] += sz[c]) + (off[c] = pos[c] + 1) + (dep[c] = dep[cpar[c]] + 1)) != 0).count() == 0
            && IntStream.rangeClosed(0, C).filter(c -> 0 * ((tout[c] = pos[c] + sz[c] - 1) + (nodeAt[pos[c]] = c)) != 0).count() == 0
            && Integer.valueOf(C + 1) instanceof Integer S && Integer.valueOf(32 - Integer.numberOfLeadingZeros(S)) instanceof Integer LV
            && new int[LV * S] instanceof int[] spt
            && IntStream.range(0, LV * S).filter(idx -> 0 * (idx < S ? (spt[idx] = nodeAt[idx])
                : idx % S + (1 << (idx / S)) <= S ? (spt[idx] = dep[spt[idx - S]] <= dep[spt[idx - S + (1 << (idx / S - 1))]] ? spt[idx - S] : spt[idx - S + (1 << (idx / S - 1))]) : 0) != 0).count() == 0
            && new int[4] instanceof int[] lt
            && ((IntBinaryOperator) ((a, b) -> a == b ? a
                : 0 * ((lt[0] = Math.min(pos[a], pos[b])) + (lt[1] = Math.max(pos[a], pos[b])) + (lt[2] = pos[a] < pos[b] ? a : b)
                    + (lt[3] = 31 - Integer.numberOfLeadingZeros(lt[1] - lt[0]))) == 0
                    ? (tout[lt[2]] >= lt[1] ? lt[2] : cpar[dep[spt[lt[3] * S + lt[0] + 1]] <= dep[spt[lt[3] * S + lt[1] - (1 << lt[3]) + 1]]
                        ? spt[lt[3] * S + lt[0] + 1] : spt[lt[3] * S + lt[1] - (1 << lt[3]) + 1]]) : 0)) instanceof IntBinaryOperator lca
            && ((Function<long[], long[]>) (a -> IntStream.range(0, a.length).filter(j -> j == 0 || a[j] != a[j - 1]).mapToLong(j -> a[j]).toArray())) instanceof Function<long[], long[]> dd
            && new int[]{3 + 2 * m, 0} instanceof int[] sq
            ? IntStream.rangeClosed(1, q).mapToObj(qi -> Integer.valueOf(v[sq[0]]) instanceof Integer K && Integer.valueOf(v[sq[0] + 1]) instanceof Integer M
                && IntStream.range(0, K + 2 * M + 2).map(j -> j < 2 ? v[sq[0] + j] : (v[sq[0] + j] - 1 + sq[1]) % n + 1).toArray() instanceof int[] w
                && (sq[0] += K + 2 * M + 2) > 0
                && Integer.valueOf(K + 2 * M) instanceof Integer TK
                && dd.apply(IntStream.range(0, TK).mapToLong(s -> pos[comp[w[2 + s] - 1]]).sorted().toArray()) instanceof long[] K1
                && dd.apply(LongStream.concat(LongStream.of(K1), IntStream.range(0, Math.max(0, K1.length - 1))
                    .mapToLong(j -> pos[lca.applyAsInt(nodeAt[(int) K1[j]], nodeAt[(int) K1[j + 1]])])).sorted().toArray()) instanceof long[] NL
                && Integer.valueOf(NL.length) instanceof Integer N
                && IntStream.range(0, N).map(i -> nodeAt[(int) NL[i]]).toArray() instanceof int[] nd
                && IntStream.range(0, N).map(i -> i == 0 ? -1 : Arrays.binarySearch(NL, 0, N, pos[lca.applyAsInt(nd[i - 1], nd[i])])).toArray() instanceof int[] vpar
                && IntStream.range(0, TK).map(s -> Arrays.binarySearch(NL, 0, N, pos[comp[w[2 + s] - 1]])).toArray() instanceof int[] sidx
                && new int[N] instanceof int[] h2 && new int[2 * (N + M)] instanceof int[] nx2 && new int[2 * (N + M)] instanceof int[] to2
                && IntStream.range(0, N).filter(i -> (h2[i] = -1) > 0).count() == 0
                && IntStream.range(0, N).filter(i -> 0 * (vpar[i] >= 0 && nd[vpar[i]] != 0
                    ? (to2[2 * i] = vpar[i]) + (nx2[2 * i] = h2[i]) + (h2[i] = 2 * i) + (to2[2 * i + 1] = i) + (nx2[2 * i + 1] = h2[vpar[i]]) + (h2[vpar[i]] = 2 * i + 1) : 0) != 0).count() == 0
                && IntStream.range(0, TK).filter(s -> 0 * (s - K >= 0 && (s - K) % 2 == 0 && sidx[s] != sidx[s + 1]
                    && Integer.valueOf(N + (s - K) / 2) instanceof Integer id
                    ? (to2[2 * id] = sidx[s + 1]) + (nx2[2 * id] = h2[sidx[s]]) + (h2[sidx[s]] = 2 * id)
                        + (to2[2 * id + 1] = sidx[s]) + (nx2[2 * id + 1] = h2[sidx[s + 1]]) + (h2[sidx[s + 1]] = 2 * id + 1) : 0) != 0).count() == 0
                && new int[N] instanceof int[] comp2
                && bridges.apply(new int[][]{h2, nx2, to2, new int[N], new int[N], new int[N], new int[N], h2, new int[N], new int[N + 1], new int[N + M + 1], comp2, new int[8], new int[]{N, N + M}}) instanceof Integer C2
                && Boolean.valueOf(IntStream.range(1, K).allMatch(s -> comp2[sidx[s]] == comp2[sidx[0]])) instanceof Boolean ok
                ? (ok && (sq[1] = (sq[1] + qi) % n) >= 0 ? "YES" : "NO") : "NO").collect(Collectors.joining("\n"))
            : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] rw && Arrays.copyOf(rw, rw.length + 1) instanceof byte[] raw && (raw[rw.length] = 10) == 10
            && (Integer) IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().getAsInt() instanceof Integer h
            && new StringTokenizer(new String(raw, 0, h)) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && (Integer) (IntStream.range(h + 1, raw.length).filter(i -> raw[i] == 10).skip(k - 1).findFirst().getAsInt() - h + 2) instanceof Integer maxN
            && new int[maxN] instanceof int[] first && new int[maxN] instanceof int[] nx && new int[maxN] instanceof int[] chr && new int[maxN] instanceof int[] par
            && new int[maxN] instanceof int[] dep && new int[maxN + 2] instanceof int[] start && new int[k] instanceof int[] endNode
            && new int[maxN] instanceof int[] row && new int[]{1} instanceof int[] rc && (row[0] = 1) == 1 && new int[18280 * 26] instanceof int[] dn0
            && (start[1] = 1) == 1 && new int[]{h + 1, 0, 0, 0, 0} instanceof int[] t
            && (IntStream.range(0, Integer.MAX_VALUE).allMatch(x -> raw[t[0]] == 10
                ? (endNode[t[4]++] = t[1]) >= 0 && (t[1] = 0) == 0 && (t[2] = 0) == 0 && (t[0]++) > 0 && t[4] < k
                : raw[t[0]] == 13 ? (t[0]++) > 0
                : row[t[1]] > 0 ? (t[2] = dn0[row[t[1]] * 26 + raw[t[0]] - 97]) > 0 ? (t[1] = t[2]) > 0 && (t[2] = first[t[1]]) >= 0 && (t[0]++) > 0
                    : (++t[3]) > 0 && (chr[t[3]] = raw[t[0]]) > 0 && (par[t[3]] = t[1]) >= 0 && (dep[t[3]] = dep[t[1]] + 1) > 0
                        && (start[dep[t[3]] + 1] += 1) > 0 && (dn0[row[t[1]] * 26 + raw[t[0]] - 97] = t[3]) > 0 && (dep[t[3]] > 3 || (row[t[3]] = ++rc[0]) > 0)
                        && (t[1] = t[3]) > 0 && (t[2] = 0) == 0 && (t[0]++) > 0
                : t[2] == 0 ? (++t[3]) > 0 && (chr[t[3]] = raw[t[0]]) > 0 && (par[t[3]] = t[1]) >= 0 && (dep[t[3]] = dep[t[1]] + 1) > 0
                    && (start[dep[t[3]] + 1] += 1) > 0 && (nx[t[3]] = first[t[1]]) >= 0 && (first[t[1]] = t[3]) > 0 && (t[1] = t[3]) > 0 && (t[2] = 0) == 0 && (t[0]++) > 0
                : chr[t[2]] == raw[t[0]] ? (t[1] = t[2]) > 0 && (t[2] = first[t[1]]) >= 0 && (t[0]++) > 0
                : (t[2] = nx[t[2]]) >= 0) || true)
            && (Integer) (t[3] + 1) instanceof Integer n && new int[n] instanceof int[] order
            && IntStream.range(0, maxN + 1).map(d -> start[d + 1] += start[d]).max().isPresent()
            && IntStream.range(0, n).map(v -> order[start[dep[v]]++] = v).max().isPresent()
            && new int[n] instanceof int[] cc && IntStream.range(1, n).map(v -> cc[par[v]]++).max().isPresent()
            && (Integer) rc[0] instanceof Integer r1 && IntStream.range(0, n).filter(v -> row[v] == 0 && cc[v] >= 5 && (row[v] = ++rc[0]) > 0).count() >= 0
            && Arrays.copyOf(dn0, (rc[0] + 1) * 26) instanceof int[] dn && IntStream.range(1, n).filter(v -> row[par[v]] > 0 && (dn[row[par[v]] * 26 + chr[v] - 97] = v) > 0).count() >= 0
            && ((IntBinaryOperator) (f, ch) -> row[f] > 0 ? dn[row[f] * 26 + Math.max(ch, 97) - 97] : first[f]) instanceof IntBinaryOperator ini
            && new int[n] instanceof int[] fail && new int[]{start[1], 0, 0, 0} instanceof int[] u
            && ((BooleanSupplier) () -> (u[3] = order[u[0]]) >= 0 && (u[1] = fail[par[u[3]]]) >= 0 && (u[2] = ini.applyAsInt(u[1], chr[u[3]])) >= 0) instanceof BooleanSupplier prep
            && (u[0] >= n || prep.getAsBoolean())
            && (IntStream.range(0, Integer.MAX_VALUE).allMatch(x -> u[0] >= n ? false
                : u[2] == 0 ? (u[1] == 0 ? (fail[u[3]] = 0) == 0 && (u[0]++) > 0 && (u[0] >= n || prep.getAsBoolean())
                    : (u[1] = fail[u[1]]) >= 0 && (u[2] = ini.applyAsInt(u[1], chr[u[3]])) >= 0)
                : chr[u[2]] == chr[u[3]] ? (fail[u[3]] = u[2]) > 0 && (u[0]++) > 0 && (u[0] >= n || prep.getAsBoolean())
                : (u[2] = nx[u[2]]) >= 0) || true)
            && IntStream.range(1, n).filter(i -> row[order[i]] > 0 && row[order[i]] <= r1
                && IntStream.range(0, 26).filter(cx -> dn[row[order[i]] * 26 + cx] == 0 && (dn[row[order[i]] * 26 + cx] = dn[row[fail[order[i]]] * 26 + cx]) >= 0).count() >= 0).count() >= 0
            && ((IntBinaryOperator) (f, ch) -> row[f] > 0 ? row[f] <= r1 ? -dn[row[f] * 26 + Math.max(ch, 97) - 97] - 1 : dn[row[f] * 26 + Math.max(ch, 97) - 97] : first[f]) instanceof IntBinaryOperator ini2
            && new int[n] instanceof int[] sz
            && IntStream.range(1, n).map(j -> sz[fail[order[n - j]]] += sz[order[n - j]] + 1).max().isPresent()
            && new int[n] instanceof int[] tin && new int[n] instanceof int[] nxt && (tin[0] = 1) == 1 && (nxt[0] = 2) == 2
            && IntStream.range(1, n).map(i -> nxt[order[i]] = (tin[order[i]] = nxt[fail[order[i]]]) + 1 + (nxt[fail[order[i]]] += sz[order[i]] + 1) * 0).max().isPresent()
            && new int[n + 3] instanceof int[] bit && new int[1] instanceof int[] c
            && ((IntBinaryOperator) (i0, val) -> (c[0] = i0) * 0 + (bit[c[0]] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0) instanceof IntBinaryOperator add
            && ((IntUnaryOperator) a0 -> (c[0] = a0) * 0 + bit[c[0]] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1]) instanceof IntUnaryOperator pre
            && ((IntBinaryOperator) (node, val) -> add.applyAsInt(tin[node], val) + add.applyAsInt(tin[node] + sz[node] + 1, -val)) instanceof IntBinaryOperator upd
            && new boolean[k] instanceof boolean[] on && IntStream.range(0, k).map(i -> (on[i] = true) ? upd.applyAsInt(endNode[i], 1) : 0).max().isPresent()
            && new long[q + 1] instanceof long[] res && new long[1] instanceof long[] acc && new int[]{t[0], 0, 0, 0, 0, 0, 0, 0} instanceof int[] w
            && ((IntUnaryOperator) pp -> (raw[pp + 1] >= 48 && raw[pp + 1] <= 57) ? ((raw[pp + 2] >= 48 && raw[pp + 2] <= 57) ? ((raw[pp + 3] >= 48 && raw[pp + 3] <= 57) ? ((raw[pp + 4] >= 48 && raw[pp + 4] <= 57) ? ((raw[pp + 5] >= 48 && raw[pp + 5] <= 57) ? (((((raw[pp] - 48) * 10 + raw[pp + 1] - 48) * 10 + raw[pp + 2] - 48) * 10 + raw[pp + 3] - 48) * 10 + raw[pp + 4] - 48) * 10 + raw[pp + 5] - 48 << 3 | 6
                : ((((raw[pp] - 48) * 10 + raw[pp + 1] - 48) * 10 + raw[pp + 2] - 48) * 10 + raw[pp + 3] - 48) * 10 + raw[pp + 4] - 48 << 3 | 5)
                : (((raw[pp] - 48) * 10 + raw[pp + 1] - 48) * 10 + raw[pp + 2] - 48) * 10 + raw[pp + 3] - 48 << 3 | 4)
                : ((raw[pp] - 48) * 10 + raw[pp + 1] - 48) * 10 + raw[pp + 2] - 48 << 3 | 3)
                : (raw[pp] - 48) * 10 + raw[pp + 1] - 48 << 3 | 2)
                : raw[pp] - 48 << 3 | 1) instanceof IntUnaryOperator pn
            && (IntStream.range(0, Integer.MAX_VALUE).allMatch(x -> w[0] > rw.length ? false
                : w[3] == 0 ? (raw[w[0]] == 10 || raw[w[0]] == 13 ? (w[0]++) > 0
                    : raw[w[0]] == 63 ? (w[3] = 2) > 0 && (w[1] = 0) == 0 && (w[2] = ini2.applyAsInt(0, raw[w[0] + 1])) * 0 == 0 && (acc[0] = 0) == 0 && (w[0]++) > 0
                    : (w[5] = raw[w[0]]) > 0 && (w[4] = pn.applyAsInt(w[0] + 1)) > 0 && (w[7] = w[4] & 7) > 0 && (w[4] >>= 3) > 0
                        && ((w[5] == 43) == on[w[4] - 1] || ((on[w[4] - 1] = w[5] == 43) | true) && upd.applyAsInt(endNode[w[4] - 1], w[5] == 43 ? 1 : -1) * 0 == 0) && (w[0] += 1 + w[7]) > 0)
                : raw[w[0]] == 10 ? (res[w[6]++] = acc[0]) >= 0 && (w[3] = 0) == 0 && (w[0]++) > 0
                : raw[w[0]] == 13 ? (w[0]++) > 0
                : w[2] < 0 ? (w[1] = -w[2] - 1) >= 0 && (acc[0] += w[1] == 0 ? 0 : pre.applyAsInt(tin[w[1]])) >= 0 && (w[2] = ini2.applyAsInt(w[1], raw[w[0] + 1])) * 0 == 0 && (w[0]++) > 0
                : w[2] == 0 ? (w[1] == 0 ? (w[0]++) > 0 && (w[2] = ini2.applyAsInt(0, raw[w[0]])) * 0 == 0 : (w[1] = fail[w[1]]) >= 0 && (w[2] = ini2.applyAsInt(w[1], raw[w[0]])) * 0 == 0)
                : chr[w[2]] == raw[w[0]] ? (w[1] = w[2]) > 0 && (acc[0] += pre.applyAsInt(tin[w[1]])) >= 0 && (w[2] = ini2.applyAsInt(w[1], raw[w[0] + 1])) * 0 == 0 && (w[0]++) > 0
                : (w[2] = nx[w[2]]) >= 0) || true)
            ? IntStream.range(0, w[6]).mapToObj(i -> Long.toString(res[i])).collect(Collectors.joining("\n")) : "");
    }
}

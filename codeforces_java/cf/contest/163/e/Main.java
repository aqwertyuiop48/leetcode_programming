import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> tk.nextToken()).toList() instanceof List<String> kw
            && (Integer) (kw.stream().mapToInt(String::length).sum() + 1) instanceof Integer maxN && new int[maxN * 26] instanceof int[] go && new int[maxN] instanceof int[] fch && new int[maxN] instanceof int[] sib && new int[maxN] instanceof int[] chr && new int[maxN] instanceof int[] dep && new int[maxN] instanceof int[] par && new int[]{0} instanceof int[] cnt
            && kw.stream().mapToInt(w -> w.chars().reduce(0, (cur, ch) -> go[cur * 26 + ch - 'a'] != 0 ? go[cur * 26 + ch - 'a'] : (go[cur * 26 + ch - 'a'] = ++cnt[0]) > 0 && (sib[cnt[0]] = fch[cur]) >= 0 && (fch[cur] = cnt[0]) > 0 && (chr[cnt[0]] = ch - 'a') >= 0 && (dep[cnt[0]] = dep[cur] + 1) > 0 && (par[cnt[0]] = cur) >= 0 ? cnt[0] : 0)).toArray() instanceof int[] endNode
            && (Integer) (cnt[0] + 1) instanceof Integer n && new int[n] instanceof int[] fail && new int[]{0, n} instanceof int[] qs
            && IntStream.range(0, n).mapToLong(v -> (long) dep[v] << 20 | v).sorted().mapToInt(x -> (int) (x & 1048575)).toArray() instanceof int[] order
            && IntStream.range(1, n).allMatch(i -> (Integer) order[i] instanceof Integer v && (Integer) par[v] instanceof Integer u && (Integer) chr[v] instanceof Integer c
                && (fail[v] = u == 0 ? 0 : go[fail[u] * 26 + c] != 0 || fail[u] == 0 ? go[fail[u] * 26 + c]
                    : go[IntStream.iterate(fail[fail[u]], f -> fail[f]).filter(f -> f == 0 || go[f * 26 + c] != 0).findFirst().getAsInt() * 26 + c]) >= 0)
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(qs[1] - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sz[fail[order[i]]] += sz[order[i]]) > 0)
            && new int[n] instanceof int[] tin && new int[n] instanceof int[] nxt && (nxt[0] = 1) == 1
            && IntStream.range(0, qs[1]).allMatch(i -> (Integer) order[i] instanceof Integer v && (tin[v] = nxt[fail[v]]) >= 0 && (nxt[fail[v]] += sz[v]) > 0 && (nxt[v] = tin[v] + 1) > 0)
            && new int[n + 2] instanceof int[] a0 && new int[(n >> 7) + 3] instanceof int[] a1 && new int[(n >> 14) + 3] instanceof int[] a2 && new int[1] instanceof int[] vs
            && ((IntBinaryOperator) (l, r) -> IntStream.range(l, r).allMatch(x -> (a0[x] += vs[0]) != Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator loop0
            && ((IntBinaryOperator) (l, r) -> IntStream.range(l, r).allMatch(x -> (a1[x] += vs[0]) != Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator loop1
            && ((IntBinaryOperator) (l, r) -> IntStream.range(l, r).allMatch(x -> (a2[x] += vs[0]) != Integer.MIN_VALUE) ? 0 : 1) instanceof IntBinaryOperator loop2
            && ((IntBinaryOperator) (lo, hi) -> lo >= hi ? 0 : (lo >> 7) == (hi >> 7) ? loop1.applyAsInt(lo, hi)
                : loop1.applyAsInt(lo, ((lo >> 7) + 1) << 7) + loop1.applyAsInt((hi >> 7) << 7, hi) + loop2.applyAsInt((lo >> 7) + 1, hi >> 7)) instanceof IntBinaryOperator blocks
            && ((IntBinaryOperator) (l, r) -> (l >> 7) == (r >> 7) ? loop0.applyAsInt(l, r)
                : loop0.applyAsInt(l, ((l >> 7) + 1) << 7) + loop0.applyAsInt((r >> 7) << 7, r) + blocks.applyAsInt((l >> 7) + 1, r >> 7)) instanceof IntBinaryOperator radd
            && ((IntBinaryOperator) (node, val) -> (vs[0] = val) * 0 + radd.applyAsInt(tin[node], tin[node] + sz[node])) instanceof IntBinaryOperator upd
            && ((IntUnaryOperator) pos -> a0[pos] + a1[pos >> 7] + a2[pos >> 14]) instanceof IntUnaryOperator qry
            && new boolean[k] instanceof boolean[] on && IntStream.range(0, k).allMatch(i -> (on[i] = true) && upd.applyAsInt(endNode[i], 1) == 0)
            ? IntStream.range(0, q).mapToObj(i -> tk.nextToken()).map(line -> line.charAt(0) == '?'
                    ? new int[]{0} instanceof int[] st ? String.valueOf(line.chars().skip(1).mapToLong(ch -> qry.applyAsInt(tin[st[0] = go[st[0] * 26 + ch - 'a'] != 0 || st[0] == 0 ? go[st[0] * 26 + ch - 'a'] : go[IntStream.iterate(fail[st[0]], f -> fail[f]).filter(f -> f == 0 || go[f * 26 + ch - 'a'] != 0).findFirst().getAsInt() * 26 + ch - 'a']])).sum()) : null
                    : (Integer) (Integer.parseInt(line.substring(1)) - 1) instanceof Integer idx && (line.charAt(0) == '+') != on[idx]
                        && (on[idx] = !on[idx]) == on[idx] && upd.applyAsInt(endNode[idx], line.charAt(0) == '+' ? 1 : -1) == 0 ? null : null)
                .filter(Objects::nonNull).collect(Collectors.joining("\n"))
            : "");
    }


}

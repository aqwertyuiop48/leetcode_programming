import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new String(raw, StandardCharsets.ISO_8859_1) instanceof String all
            && new StringTokenizer(all.substring(0, all.indexOf('\n'))) instanceof StringTokenizer head
            && (Integer) Integer.parseInt(head.nextToken()) instanceof Integer q && (Integer) Integer.parseInt(head.nextToken()) instanceof Integer k
            ? CompletableFuture.supplyAsync(() -> new int[k + q + 2] instanceof int[] ls && new int[k + q + 2] instanceof int[] le && (ls[0] = all.indexOf('\n') + 1) > 0
                && IntStream.range(0, k + q).map(i -> (Integer) all.indexOf('\n', ls[i]) instanceof Integer e
                    ? (le[i] = (e < 0 ? raw.length : e) > 0 && raw[(e < 0 ? raw.length : e) - 1] == 13 ? (e < 0 ? raw.length : e) - 1 : (e < 0 ? raw.length : e)) * 0 + (ls[i + 1] = (e < 0 ? raw.length : e) + 1) : 0).max().isPresent()
                && (Integer) (ls[k] - ls[0] + 1) instanceof Integer maxN
                && new int[maxN * 26] instanceof int[] go && new int[maxN] instanceof int[] chr && new int[maxN] instanceof int[] dep && new int[maxN] instanceof int[] par && new int[maxN + 1] instanceof int[] cd
                && new int[]{0, 0, 0, 0} instanceof int[] st && new int[k] instanceof int[] endNode
                && IntStream.range(ls[0], ls[k]).map(i -> raw[i] == 10 ? (endNode[st[1]++] = st[0]) * 0 + (st[0] = 0) : raw[i] == 13 ? 0
                    : (st[0] = go[st[0] * 26 + raw[i] - 97] != 0 ? go[st[0] * 26 + raw[i] - 97]
                        : (go[st[0] * 26 + raw[i] - 97] = ++st[2]) > 0 && (chr[st[2]] = raw[i] - 97) >= 0 && (dep[st[2]] = dep[st[0]] + 1) > 0 && (par[st[2]] = st[0]) >= 0
                            && cd[dep[st[2]]]++ >= 0 && (st[3] = Math.max(st[3], dep[st[2]])) >= 0 ? st[2] : 0)).max().isPresent()
                && (Integer) (st[2] + 1) instanceof Integer n && new int[n + 2] instanceof int[] start && new int[n] instanceof int[] order
                && (cd[0] = 1) == 1 && IntStream.rangeClosed(0, st[3]).map(d -> start[d + 1] = start[d] + cd[d]).max().isPresent()
                && IntStream.range(0, n).map(v -> order[start[dep[v]]++] = v).max().isPresent()
                && new int[n] instanceof int[] fail && new IntBinaryOperator[1] instanceof IntBinaryOperator[] sf
                && ((IntBinaryOperator) (v, c) -> (Integer) go[v * 26 + c] instanceof Integer x
                    ? x > 0 ? x : x < 0 ? -x - 1 : v == 0 ? 0
                        : (Integer) sf[0].applyAsInt(fail[v], c) instanceof Integer y ? (go[v * 26 + c] = -y - 1) * 0 + y : 0 : 0) instanceof IntBinaryOperator step
                && (sf[0] = step) != null
                && IntStream.range(1, n).map(i -> fail[order[i]] = par[order[i]] == 0 ? 0 : step.applyAsInt(fail[par[order[i]]], chr[order[i]])).max().isPresent()
                && new int[n] instanceof int[] sz
                && IntStream.range(1, n).map(j -> sz[fail[order[n - j]]] += sz[order[n - j]] + 1).max().isPresent()
                && new int[n] instanceof int[] tin && new int[n] instanceof int[] nxt && (tin[0] = 1) == 1 && (nxt[0] = 2) == 2
                && IntStream.range(1, n).map(i -> nxt[order[i]] = (tin[order[i]] = nxt[fail[order[i]]]) + 1 + (nxt[fail[order[i]]] += sz[order[i]] + 1) * 0).max().isPresent()
                && new int[n + 3] instanceof int[] bit && new int[1] instanceof int[] c
            && ((IntBinaryOperator) (i0, val) -> (c[0] = i0) * 0 + (bit[c[0]] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0 + (bit[c[0] = Math.min(c[0] + (c[0] & -c[0]), n + 2)] += val) * 0) instanceof IntBinaryOperator add
            && ((IntUnaryOperator) a0 -> (c[0] = a0) * 0 + bit[c[0]] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1] + bit[c[0] &= c[0] - 1]) instanceof IntUnaryOperator pre
            && ((IntBinaryOperator) (node, val) -> add.applyAsInt(tin[node], val) + add.applyAsInt(tin[node] + sz[node] + 1, -val)) instanceof IntBinaryOperator upd
            && new boolean[k] instanceof boolean[] on && IntStream.range(0, k).map(i -> (on[i] = true) ? upd.applyAsInt(endNode[i], 1) : 0).max().isPresent()
                ? IntStream.range(0, q).mapToObj(i -> raw[ls[i + k]] == '?'
                        ? new int[]{0} instanceof int[] sc ? String.valueOf(IntStream.range(ls[i + k] + 1, le[i + k]).mapToLong(pi -> pre.applyAsInt(tin[sc[0] = step.applyAsInt(sc[0], raw[pi] - 97)])).sum()) : null
                        : (Integer) (IntStream.range(ls[i + k] + 1, le[i + k]).reduce(0, (a, pi) -> a * 10 + raw[pi] - 48) - 1) instanceof Integer idx
                            && (raw[ls[i + k]] == '+') != on[idx] && (on[idx] = !on[idx]) == on[idx] && upd.applyAsInt(endNode[idx], raw[ls[i + k]] == '+' ? 1 : -1) == 0 ? null : null)
                    .filter(Objects::nonNull).collect(Collectors.joining("\n"))
                : "", r -> new Thread(null, r, "t", 1L << 28).start()).join()
            : "");
    }
}

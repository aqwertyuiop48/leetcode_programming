import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).toList() instanceof List<String> ss
            && (Integer) (ss.stream().mapToInt(String::length).sum() + 2) instanceof Integer maxN
            && new int[26 * maxN] instanceof int[] go && IntStream.range(0, 26 * maxN).allMatch(i -> (go[i] = -1) < 0) && new int[]{1} instanceof int[] cntNodes && new int[n] instanceof int[] endNode
            && IntStream.range(0, n).allMatch(i -> new int[]{0} instanceof int[] cur && ss.get(i).chars().allMatch(c -> (go[cur[0] * 26 + c - 'a'] >= 0 || (go[cur[0] * 26 + c - 'a'] = cntNodes[0]++) > 0) && (cur[0] = go[cur[0] * 26 + c - 'a']) >= 0) && (endNode[i] = cur[0]) >= 0)
            && (Integer) cntNodes[0] instanceof Integer nodes && new int[nodes] instanceof int[] fail && new int[nodes] instanceof int[] order && new int[]{0, 1} instanceof int[] qs
            && Stream.generate(() -> 0).takeWhile(z -> qs[0] < qs[1]).allMatch(z -> (Integer) order[qs[0]++] instanceof Integer u
                && IntStream.range(0, 26).allMatch(c -> go[u * 26 + c] >= 0 ? (fail[go[u * 26 + c]] = u == 0 ? 0 : go[fail[u] * 26 + c]) >= 0 && (order[qs[1]++] = go[u * 26 + c]) > 0
                    : (go[u * 26 + c] = u == 0 ? 0 : go[fail[u] * 26 + c]) >= 0))
            && new int[nodes] instanceof int[] sz && IntStream.range(0, nodes).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.iterate(nodes - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (sz[fail[order[i]]] += sz[order[i]]) > 0)
            && new int[nodes] instanceof int[] tin && new int[nodes] instanceof int[] nf && (nf[0] = 1) > 0
            && IntStream.range(1, nodes).allMatch(i -> (Integer) order[i] instanceof Integer v && (tin[v] = nf[fail[v]]) >= 0 && (nf[fail[v]] += sz[v]) > 0 && (nf[v] = tin[v] + 1) > 0)
            && new int[n + 1] instanceof int[] evHead && IntStream.rangeClosed(0, n).allMatch(i -> (evHead[i] = -1) < 0) && new int[2 * q] instanceof int[] evNext && new int[2 * q] instanceof int[] evK && new int[2 * q] instanceof int[] evSign
            && IntStream.range(0, q).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer l && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer r && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer k
                && (evK[2 * i] = k) >= 0 && (evSign[2 * i] = 1) > 0 && (evNext[2 * i] = evHead[r]) >= -1 && (evHead[r] = 2 * i) >= 0
                && (evK[2 * i + 1] = k) >= 0 && (evSign[2 * i + 1] = -1) < 0 && (l - 1 < 1 || (evNext[2 * i + 1] = evHead[l - 1]) >= -1 && (evHead[l - 1] = 2 * i + 1) >= 0))
            && new int[nodes + 2] instanceof int[] bit && new long[q] instanceof long[] ans
            && ((IntUnaryOperator) x -> IntStream.iterate(x, i -> i > 0, i -> i & (i - 1)).map(i -> bit[i]).sum()) instanceof IntUnaryOperator pre
            && IntStream.rangeClosed(1, n).allMatch(i -> new int[]{0} instanceof int[] cur && ss.get(i - 1).chars().allMatch(c -> (cur[0] = go[cur[0] * 26 + c - 'a']) >= 0
                    && IntStream.iterate(tin[cur[0]] + 1, j -> j <= nodes, j -> j + (j & -j)).peek(j -> bit[j]++).count() >= 0)
                && IntStream.iterate(evHead[i], e -> e >= 0, e -> evNext[e]).allMatch(e -> (Integer) endNode[evK[e]] instanceof Integer en
                    && (ans[e / 2] += (long) evSign[e] * (pre.applyAsInt(tin[en] + sz[en]) - pre.applyAsInt(tin[en]))) > Long.MIN_VALUE))
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

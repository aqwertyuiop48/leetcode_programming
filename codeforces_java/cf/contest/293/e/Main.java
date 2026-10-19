import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(x -> !x.isEmpty()).mapToLong(Long::parseLong).iterator() instanceof PrimitiveIterator.OfLong sc
            && Integer.valueOf((int) sc.nextLong()) instanceof Integer n && Integer.valueOf((int) sc.nextLong()) instanceof Integer L && Long.valueOf(sc.nextLong()) instanceof Long W
            && new int[n] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new long[2 * n] instanceof long[] wt && new int[]{0} instanceof int[] ec
            && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf((int) sc.nextLong() - 1) instanceof Integer p && Long.valueOf(sc.nextLong()) instanceof Long w
                && (to[ec[0]] = p) >= 0 && (wt[ec[0]] = w) >= 0 && (nxt[ec[0]] = head[i]) >= -1 && (head[i] = ec[0]++) >= 0
                && (to[ec[0]] = i) >= 0 && (wt[ec[0]] = w) >= 0 && (nxt[ec[0]] = head[p]) >= -1 && (head[p] = ec[0]++) >= 0)
            && new int[n + 3] instanceof int[] bit && new int[]{0} instanceof int[] lim
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> addRef && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> qryRef
            && addRef.compareAndSet(null, pos -> pos > lim[0] ? 0 : (bit[pos] -= 1) * 0 + addRef.get().applyAsInt(pos + (pos & -pos))) && qryRef.compareAndSet(null, pos -> pos <= 0 ? 0 : bit[pos] + qryRef.get().applyAsInt(pos - (pos & -pos)))
            && addRef.get() instanceof IntUnaryOperator rem1 && qryRef.get() instanceof IntUnaryOperator qry
            && ((ToLongFunction<long[]>) arr -> Arrays.stream(arr).sorted().toArray() instanceof long[] s && Integer.valueOf(s.length) instanceof Integer len
                && Integer.valueOf(Arrays.stream(s).mapToInt(x -> (int) (x & 131071)).max().getAsInt() + 1) instanceof Integer sizeB && (lim[0] = sizeB) > 0
                && Arrays.stream(s).allMatch(x -> ++bit[(int) (x & 131071) + 1] > 0)
                && IntStream.rangeClosed(1, sizeB).allMatch(q -> q + (q & -q) > sizeB || (bit[q + (q & -q)] += bit[q]) >= 0)
                && new int[]{len - 1} instanceof int[] jj && new long[1] instanceof long[] tot
                && IntStream.range(0, len).allMatch(i -> Long.valueOf(s[i] >> 17) instanceof Long wi
                    && (jj[0] < 0 || wi + (s[jj[0]] >> 17) <= W || IntStream.iterate(0, z -> jj[0] >= 0 && wi + (s[jj[0]] >> 17) > W, z -> z + 1).allMatch(z -> rem1.applyAsInt((int) (s[jj[0]] & 131071) + 1) >= 0 && jj[0]-- >= -1))
                    && (jj[0] < 0 || L - (int) (s[i] & 131071) < 0 || (tot[0] += qry.applyAsInt(Math.min(L - (int) (s[i] & 131071) + 1, sizeB)) - (i <= jj[0] && 2 * (int) (s[i] & 131071) <= L ? 1 : 0)) >= 0))
                && IntStream.rangeClosed(1, sizeB).allMatch(q -> (bit[q] = 0) == 0)
                ? tot[0] / 2 : 0L) instanceof ToLongFunction<long[]> cnt
            && new boolean[n] instanceof boolean[] rem && new int[n] instanceof int[] par && new int[n] instanceof int[] order && new int[n] instanceof int[] sz
            && new int[n] instanceof int[] dd && new long[n] instanceof long[] ww && new int[]{0} instanceof int[] len && new long[1] instanceof long[] ans
            && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(r -> (order[0] = r) >= 0 && (par[r] = -1) < 0 && (len[0] = 1) > 0
                && IntStream.iterate(0, i -> i < len[0], i -> i + 1).allMatch(i -> (sz[order[i]] = 1) > 0
                    && IntStream.iterate(head[order[i]], e -> e >= 0, e -> nxt[e]).allMatch(e -> rem[to[e]] || to[e] == par[order[i]] || (par[to[e]] = order[i]) >= 0 && (order[len[0]++] = to[e]) >= 0))
                && Integer.valueOf(len[0]) instanceof Integer tot
                && IntStream.iterate(tot - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[order[i]]] += sz[order[i]]) > 0)
                && Integer.valueOf(IntStream.range(0, tot).map(i -> order[i]).filter(u -> 2 * sz[u] >= tot).reduce((a, b) -> sz[a] <= sz[b] ? a : b).getAsInt()) instanceof Integer c
                && (order[0] = c) >= 0 && (par[c] = -1) < 0 && (dd[c] = 0) == 0 && (ww[c] = 0) == 0 && (len[0] = 1) > 0
                && IntStream.iterate(head[c], e -> e >= 0, e -> nxt[e]).allMatch(e0 -> rem[to[e0]] || wt[e0] > W || Integer.valueOf(len[0]) instanceof Integer st0
                    && (order[len[0]++] = to[e0]) >= 0 && (par[to[e0]] = c) >= 0 && (dd[to[e0]] = 1) > 0 && (ww[to[e0]] = wt[e0]) >= 0
                    && IntStream.iterate(st0, i -> i < len[0], i -> i + 1).allMatch(i -> IntStream.iterate(head[order[i]], e -> e >= 0, e -> nxt[e])
                        .allMatch(e -> rem[to[e]] || to[e] == par[order[i]] || (par[to[e]] = order[i]) >= 0 && (dd[to[e]] = dd[order[i]] + 1) > 0 && (ww[to[e]] = ww[order[i]] + wt[e]) >= 0
                            && (dd[to[e]] > L || ww[to[e]] > W || (order[len[0]++] = to[e]) >= 0)))
                    && (ans[0] -= cnt.applyAsLong(IntStream.range(st0, len[0]).mapToLong(i -> (ww[order[i]] << 17) | dd[order[i]]).toArray())) > Long.MIN_VALUE)
                && (ans[0] += cnt.applyAsLong(IntStream.range(0, len[0]).mapToLong(i -> (ww[order[i]] << 17) | dd[order[i]]).toArray())) >= 0
                && (rem[c] = true) && IntStream.iterate(head[c], e -> e >= 0, e -> nxt[e]).allMatch(e -> rem[to[e]] || dq.add(to[e])))
            ? ans[0] : "");
    }
}

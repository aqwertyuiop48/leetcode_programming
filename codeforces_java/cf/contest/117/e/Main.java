import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] hd
            && new int[2 * n] instanceof int[] nx
            && new int[2 * n] instanceof int[] to
            && new int[n] instanceof int[] deg
            && IntStream.range(0, n).allMatch(i ->
                (Integer) (t[2 + 2 * i] - 1) instanceof Integer a
                && (Integer) (t[3 + 2 * i] - 1) instanceof Integer b
                && (to[2 * i] = b) >= 0 && (nx[2 * i] = hd[a]) >= -1 && (hd[a] = 2 * i) >= 0
                && (to[2 * i + 1] = a) >= 0 && (nx[2 * i + 1] = hd[b]) >= -1 && (hd[b] = 2 * i + 1) >= 0
                && ++deg[a] > 0 && ++deg[b] > 0)
            && IntStream.range(0, n).filter(v -> deg[v] == 1).toArray() instanceof int[] leaves
            && Arrays.copyOf(leaves, n) instanceof int[] q
            && new int[]{0, leaves.length} instanceof int[] st
            && new boolean[n] instanceof boolean[] removed
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] par
            && IntStream.iterate(0, i -> i < st[1], i -> i + 1).allMatch(i ->
                (Integer) q[i] instanceof Integer v
                && (removed[v] = true)
                && (Integer) Stream.iterate(hd[v], e -> e >= 0, e -> nx[e]).filter(e -> !removed[to[e]]).findFirst().get() instanceof Integer e
                && (par[v] = to[e]) >= 0
                && (--deg[to[e]] == 1 ? (q[st[1]++] = to[e]) >= 0 : true))
            && Integer.valueOf(n - st[1]) instanceof Integer L
            && (Integer) IntStream.range(0, n).filter(v -> !removed[v]).findFirst().getAsInt() instanceof Integer c0
            && Stream.iterate(new int[]{-1, c0}, s -> new int[]{s[1],
                    Stream.iterate(hd[s[1]], e -> e >= 0, e -> nx[e]).map(e -> to[e]).filter(w -> !removed[w] && w != s[0]).findFirst().get()})
                .limit(L).mapToInt(s -> s[1]).toArray() instanceof int[] cyc
            && new int[n] instanceof int[] idx
            && IntStream.range(0, L).allMatch(i -> (idx[cyc[i]] = i) >= 0)
            && IntStream.range(0, n).toArray() instanceof int[] root
            && new int[n] instanceof int[] depth
            && IntStream.iterate(st[1] - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                (Integer) q[i] instanceof Integer v
                && (root[v] = root[par[v]]) >= 0
                && (depth[v] = depth[par[v]] + 1) > 0)
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] heavy
            && IntStream.range(0, st[1]).allMatch(i ->
                (Integer) q[i] instanceof Integer v
                && (Integer) par[v] instanceof Integer p
                && (sz[p] += sz[v]) > 0
                && (heavy[p] < 0 || sz[v] > sz[heavy[p]] ? (heavy[p] = v) >= 0 : true))
            && new int[n] instanceof int[] head
            && new int[n] instanceof int[] pos
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, n).filter(v -> par[v] < 0 || heavy[par[v]] != v).allMatch(h ->
                Stream.iterate(h, x -> x >= 0, x -> heavy[x]).allMatch(x -> (head[x] = h) >= 0 && (pos[x] = cnt[0]++) >= 0))
            && new int[][]{new int[2 * Integer.highestOneBit(2 * n - 1)], new int[2 * Integer.highestOneBit(2 * L - 1)]} instanceof int[][] S
            && new boolean[][]{new boolean[2 * Integer.highestOneBit(2 * n - 1)], new boolean[2 * Integer.highestOneBit(2 * L - 1)]} instanceof boolean[][] Fl
            && new int[]{Integer.highestOneBit(2 * n - 1), Integer.highestOneBit(2 * L - 1)} instanceof int[] SZ
            && IntStream.range(0, 2).mapToObj(w -> (IntPredicate) x ->
                (Fl[w][x] = !Fl[w][x]) | true ? (S[w][x] = SZ[w] / Integer.highestOneBit(x) - S[w][x]) >= 0 : false).toArray(IntPredicate[]::new) instanceof IntPredicate[] ap
            && IntStream.range(0, 2).mapToObj(w -> (IntPredicate) x ->
                (S[w][x] = Fl[w][x] ? SZ[w] / Integer.highestOneBit(x) - (S[w][2 * x] + S[w][2 * x + 1]) : S[w][2 * x] + S[w][2 * x + 1]) >= 0).toArray(IntPredicate[]::new) instanceof IntPredicate[] rb
            && ((ToIntFunction<int[]>) a ->
                a[1] >= a[2] ? 0
                : IntStream.rangeClosed(0, 17).allMatch(k ->
                    (SZ[a[0]] >> k) == 0
                    || ((k == 0 || (rb[a[0]].test((a[1] + SZ[a[0]]) >> k) && rb[a[0]].test((a[2] - 1 + SZ[a[0]]) >> k)))
                        && ((a[1] + SZ[a[0]] + (1 << k) - 1) >> k >= (a[2] + SZ[a[0]]) >> k
                            || ((((a[1] + SZ[a[0]] + (1 << k) - 1) >> k & 1) == 0 || ap[a[0]].test((a[1] + SZ[a[0]] + (1 << k) - 1) >> k))
                                && (((a[2] + SZ[a[0]]) >> k & 1) == 0 || ap[a[0]].test(((a[2] + SZ[a[0]]) >> k) - 1))))))
                ? 1 : -1) instanceof ToIntFunction<int[]> flip
            && ((ToIntFunction<int[]>) a ->
                Stream.iterate(new int[]{a[0], a[1]}, s -> head[s[0]] == head[s[1]] ? s
                        : depth[head[s[0]]] >= depth[head[s[1]]]
                            ? (flip.applyAsInt(new int[]{0, pos[head[s[0]]], pos[s[0]] + 1}) >= 0 ? new int[]{par[head[s[0]]], s[1]} : null)
                            : (flip.applyAsInt(new int[]{0, pos[head[s[1]]], pos[s[1]] + 1}) >= 0 ? new int[]{s[0], par[head[s[1]]]} : null))
                    .filter(s -> head[s[0]] == head[s[1]]).findFirst().get() instanceof int[] f
                    ? flip.applyAsInt(new int[]{0, Math.min(pos[f[0]], pos[f[1]]) + 1, Math.max(pos[f[0]], pos[f[1]]) + 1}) : -1) instanceof ToIntFunction<int[]> tp
            ? IntStream.range(0, m).mapToObj(qi ->
                (Integer) (t[2 + 2 * n + 2 * qi] - 1) instanceof Integer v
                && (Integer) (t[3 + 2 * n + 2 * qi] - 1) instanceof Integer u
                && (root[v] == root[u]
                    ? tp.applyAsInt(new int[]{v, u}) >= 0
                    : tp.applyAsInt(new int[]{v, root[v]}) >= 0
                        && tp.applyAsInt(new int[]{u, root[u]}) >= 0
                        && (Integer) idx[root[v]] instanceof Integer ia
                        && (Integer) idx[root[u]] instanceof Integer ib
                        && (Integer) ((ib - ia + L) % L) instanceof Integer dcw
                        && (Boolean) (dcw * 2 < L || (dcw * 2 == L && cyc[(ia + 1) % L] < cyc[(ia + L - 1) % L])) instanceof Boolean cw
                        && (Integer) (cw ? ia : ib) instanceof Integer start
                        && (Integer) (cw ? dcw : L - dcw) instanceof Integer len
                        && (start + len <= L
                            ? flip.applyAsInt(new int[]{1, start, start + len}) >= 0
                            : flip.applyAsInt(new int[]{1, start, L}) >= 0 && flip.applyAsInt(new int[]{1, 0, start + len - L}) >= 0))
                ? String.valueOf(n - (S[0][1] + S[1][1]) + (S[1][1] == L ? 1 : 0)) : "")
                .collect(Collectors.joining("\n"))
            : "");
    }
}


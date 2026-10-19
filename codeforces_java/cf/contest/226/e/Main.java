import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : it.next()).toArray() instanceof int[] par
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch
            && IntStream.rangeClosed(1, n).filter(i -> par[i] != 0).allMatch(i -> ch.get(par[i]).add(i))
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(i -> par[i] == 0).findFirst().getAsInt()) instanceof Integer root
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n + 1] instanceof int[] depth && new int[n + 1] instanceof int[] ord
            && (depth[0] = -1) < 0 && new int[]{0} instanceof int[] c && new ArrayDeque<Integer>(List.of(root)) instanceof ArrayDeque<Integer> stack
            && Stream.generate(stack::poll).takeWhile(Objects::nonNull).allMatch(v -> (ord[tin[v] = c[0]++] = v) > 0 && ch.get(v).stream().allMatch(w -> (depth[w] = depth[v] + 1) > 0 && stack.offerFirst(w)))
            && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && IntStream.rangeClosed(1, n).allMatch(v -> (tout[v] = tin[v] + sz[v] - 1) >= 0)
            && new int[17][] instanceof int[][] anc && (anc[0] = par) != null
            && IntStream.range(1, 17).allMatch(j -> (anc[j] = IntStream.rangeClosed(0, n).map(v -> anc[j - 1][anc[j - 1][v]]).toArray()) != null)
            && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf((m + 1) * 36 + 10) instanceof Integer cap
            && new int[cap] instanceof int[] sm && new int[cap] instanceof int[] lc && new int[cap] instanceof int[] rc && new int[]{0} instanceof int[] cnt
            && ((ToIntFunction<int[]>) t -> new int[]{++cnt[0], t[0]} instanceof int[] s && Integer.valueOf(s[0]) instanceof Integer nr
                && IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> (sm[s[0]] = sm[s[1]] + t[2]) > Integer.MIN_VALUE
                    && ((t[1] >> j & 1) == 1 ? (lc[s[0]] = lc[s[1]]) >= 0 && (rc[s[0]] = ++cnt[0]) > 0 && (s[1] = rc[s[1]]) >= 0 : (rc[s[0]] = rc[s[1]]) >= 0 && (lc[s[0]] = ++cnt[0]) > 0 && (s[1] = lc[s[1]]) >= 0)
                    && (s[0] = (t[1] >> j & 1) == 1 ? rc[s[0]] : lc[s[0]]) > 0)
                && (sm[s[0]] = sm[s[1]] + t[2]) > Integer.MIN_VALUE ? nr : 0) instanceof ToIntFunction<int[]> upd
            && ((IntBinaryOperator) (rt, u) -> new int[]{rt, 0} instanceof int[] st
                && IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> (tin[u] >> j & 1) == 1 ? (st[1] += sm[lc[st[0]]]) >= Integer.MIN_VALUE && (st[0] = rc[st[0]]) >= 0 : (st[0] = lc[st[0]]) >= 0)
                ? st[1] + sm[st[0]] : 0) instanceof IntBinaryOperator pre
            && ((IntBinaryOperator) (x, y) -> new int[]{depth[x] < depth[y] ? y : x, depth[x] < depth[y] ? x : y} instanceof int[] st
                && IntStream.range(0, 17).allMatch(j -> ((depth[st[0]] - depth[st[1]] >> j & 1) == 1 && (st[0] = anc[j][st[0]]) >= 0) | true)
                && IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> (st[0] != st[1] && anc[j][st[0]] != anc[j][st[1]] && (st[0] = anc[j][st[0]]) >= 0 && (st[1] = anc[j][st[1]]) >= 0) | true)
                ? (st[0] == st[1] ? st[0] : anc[0][st[0]]) : 0) instanceof IntBinaryOperator lca
            && new int[m + 1] instanceof int[] ver
            ? IntStream.rangeClosed(1, m).mapToObj(t -> Integer.valueOf(it.next()) instanceof Integer type
                ? (type == 1
                    ? (Integer.valueOf(it.next()) instanceof Integer v && (ver[t] = upd.applyAsInt(new int[]{upd.applyAsInt(new int[]{ver[t - 1], tin[v], 1}), tout[v] + 1, -1})) >= 0 ? (String) null : (String) null)
                    : (Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && Integer.valueOf(it.next()) instanceof Integer k && Integer.valueOf(it.next()) instanceof Integer y
                        && (ver[t] = ver[t - 1]) >= 0 && Integer.valueOf(ver[t]) instanceof Integer vc && Integer.valueOf(ver[Math.min(y, t - 1)]) instanceof Integer vy
                        && ((IntUnaryOperator) u -> u == 0 ? 0 : depth[u] + 1 - pre.applyAsInt(vc, u) + pre.applyAsInt(vy, u)) instanceof IntUnaryOperator g
                        && Integer.valueOf(lca.applyAsInt(a, b)) instanceof Integer L && Integer.valueOf(g.applyAsInt(a)) instanceof Integer gA
                        && Integer.valueOf(k + gA - g.applyAsInt(anc[0][a])) instanceof Integer kk && Integer.valueOf(gA - g.applyAsInt(anc[0][L])) instanceof Integer U
                        && Integer.valueOf(kk <= U
                            ? (gA - g.applyAsInt(anc[0][a]) >= kk ? a : new int[]{a} instanceof int[] cu
                                && IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> (anc[j][cu[0]] != 0 && depth[anc[j][cu[0]]] >= depth[L] && gA - g.applyAsInt(anc[0][anc[j][cu[0]]]) < kk && (cu[0] = anc[j][cu[0]]) >= 0) | true) ? anc[0][cu[0]] : 0)
                            : (kk - U > g.applyAsInt(b) - g.applyAsInt(L) ? -1 : new int[]{b} instanceof int[] cu && Integer.valueOf(g.applyAsInt(L)) instanceof Integer gL
                                && IntStream.iterate(16, j -> j >= 0, j -> j - 1).allMatch(j -> (depth[anc[j][cu[0]]] > depth[L] && g.applyAsInt(anc[j][cu[0]]) - gL >= kk - U && (cu[0] = anc[j][cu[0]]) >= 0) | true) ? cu[0] : 0)) instanceof Integer res
                        ? String.valueOf(res.equals(b) ? -1 : res) : (String) null))
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[m + 1] instanceof int[] oa && new int[m + 1] instanceof int[] ob && new int[n + 1] instanceof int[] oh && new int[2 * m + 2] instanceof int[] on
            && IntStream.rangeClosed(0, n).allMatch(i -> (oh[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (oa[i] = it.next()) > 0 && (ob[i] = it.next()) > 0 && (on[2 * i] = oh[oa[i]]) >= -1 && (oh[oa[i]] = 2 * i) >= 0 && (on[2 * i + 1] = oh[ob[i]]) >= -1 && (oh[ob[i]] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n + 1] instanceof int[] order && head.clone() instanceof int[] ptr
            && new int[]{1, 1} instanceof int[] sp && (order[0] = 1) == 1 && (tin[1] = 0) == 0 && new int[n + 1] instanceof int[] stk && (stk[0] = 1) == 1
            && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).allMatch(z -> Integer.valueOf(stk[sp[0] - 1]) instanceof Integer top
                && (ptr[top] >= 0 ? Integer.valueOf(to[ptr[top]]) instanceof Integer c && (ptr[top] = nxt[ptr[top]]) >= -1
                        && (c == par[top] || (par[c] = top) > 0 && (tin[c] = sp[1]++) > 0 && (order[tin[c]] = c) > 0 && (stk[sp[0]++] = c) > 0)
                    : (tout[top] = sp[1] - 1) >= 0 && --sp[0] >= 0))
            && Integer.valueOf(Integer.highestOneBit(Math.max(1, 2 * n - 1))) instanceof Integer N
            && new int[2 * N] instanceof int[] cv && new int[2 * N] instanceof int[] len && new int[2 * N] instanceof int[] sz
            && IntStream.iterate(2 * N - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (sz[i] = i >= N ? 1 : 2 * sz[2 * i]) > 0)
            && ((IntPredicate) i -> (len[i] = cv[i] > 0 ? sz[i] : i >= N ? 0 : len[2 * i] + len[2 * i + 1]) >= 0) instanceof IntPredicate pull
            && ((ToIntFunction<int[]>) a -> Integer.valueOf(a[0] + N) instanceof Integer l0 && Integer.valueOf(a[1] + 1 + N) instanceof Integer r0 && new int[]{l0, r0} instanceof int[] st
                && IntStream.iterate(0, z -> st[0] < st[1], z -> z + 1).allMatch(z -> ((st[0] & 1) == 0 || (cv[st[0]] += a[2]) > -10000000 && pull.test(st[0]++))
                    && ((st[1] & 1) == 0 || (cv[--st[1]] += a[2]) > -10000000 && pull.test(st[1])) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0)
                && IntStream.iterate(l0 >> 1, i -> i >= 1, i -> i >> 1).allMatch(pull::test)
                && IntStream.iterate((r0 - 1) >> 1, i -> i >= 1, i -> i >> 1).allMatch(pull::test) ? 0 : 1) instanceof ToIntFunction<int[]> upd
            && ((BiPredicate<Integer, Integer>) (v, d) -> Stream.iterate(oh[v], e -> e >= 0, e -> on[e]).allMatch(e -> upd.applyAsInt(new int[]{tin[oa[e / 2]], tout[oa[e / 2]], d}) == 0 && upd.applyAsInt(new int[]{tin[ob[e / 2]], tout[ob[e / 2]], d}) == 0)) instanceof BiPredicate<Integer, Integer> toggle
            && new int[n + 1] instanceof int[] ans && new int[n + 1] instanceof int[] ps && new int[]{0} instanceof int[] pp
            && IntStream.range(0, n).allMatch(p -> Integer.valueOf(order[p]) instanceof Integer v
                && IntStream.iterate(0, z -> pp[0] > 0 && tout[ps[pp[0] - 1]] < p, z -> z + 1).allMatch(z -> toggle.test(ps[--pp[0]], -1))
                && (ps[pp[0]++] = v) > 0 && toggle.test(v, 1) && (ans[v] = len[1] - (len[1] > 0 ? 1 : 0)) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining(" ")) : "");
    }
}

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] o && new int[4] instanceof int[] st
                && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).filter(x -> x >= 48 ? ((st[1] = st[1] * 10 + x - 48) | (st[2] = 1)) < 0 : x == 45 ? (st[3] = 1) < 0 : st[2] == 1 && ((o[st[0]++] = st[3] == 1 ? -st[1] : st[1]) | (st[1] = 0) | (st[2] = 0) | (st[3] = 0)) < 0).count() >= 0
                && (Integer) o[0] instanceof Integer n
                && new int[n] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
                && new int[n] instanceof int[] order && new int[n] instanceof int[] par && new int[]{1} instanceof int[] z
                && new long[n] instanceof long[] mx && new long[n] instanceof long[] sm && new long[n] instanceof long[] ans
                && IntStream.range(0, n).filter(i -> (head[i] = -1) < 0 && (par[i] = -1) < 0 && (mx[i] = 1) > 0 && (sm[i] = o[1 + i]) > 0).count() >= 0
                && IntStream.range(0, n - 1).filter(i -> (to[2 * i] = o[n + 2 + 2 * i] - 1) >= 0 && (nxt[2 * i] = head[o[n + 1 + 2 * i] - 1]) >= -1 && (head[o[n + 1 + 2 * i] - 1] = 2 * i) >= 0
                        && (to[2 * i + 1] = o[n + 1 + 2 * i] - 1) >= 0 && (nxt[2 * i + 1] = head[o[n + 2 + 2 * i] - 1]) >= -1 && (head[o[n + 2 + 2 * i] - 1] = 2 * i + 1) >= 0).count() >= 0
                && IntStream.range(0, n).filter(i -> IntStream.iterate(head[order[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[order[i]] && (par[to[e]] = order[i]) >= 0 && (order[z[0]++] = to[e]) >= 0).count() >= 0).count() >= 0
                && IntStream.range(0, n).mapToObj(i -> new HashMap<Integer, Integer>(Map.of(o[1 + i], 1))).collect(Collectors.toList()) instanceof List<HashMap<Integer, Integer>> mp
                && IntStream.range(0, n - 1).filter(k -> (Integer) order[n - 1 - k] instanceof Integer u && (Integer) par[u] instanceof Integer p && (ans[u] = sm[u]) > 0
                        && (mp.get(p).size() >= mp.get(u).size() || (mp.set(p, mp.set(u, mp.get(p))) != null && (mx[p] = mx[p] + mx[u] - (mx[u] = mx[p])) > 0 && (sm[p] = sm[p] + sm[u] - (sm[u] = sm[p])) > 0))
                        && mp.get(u).entrySet().stream().filter(en -> (Integer) mp.get(p).merge(en.getKey(), en.getValue(), Integer::sum) instanceof Integer nv
                                && (nv > mx[p] ? (mx[p] = nv) > 0 && (sm[p] = en.getKey()) > 0 : nv == mx[p] ? (sm[p] += en.getKey()) > 0 : true)).count() >= 0).count() >= 0
                && (ans[0] = sm[0]) > 0
                ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}

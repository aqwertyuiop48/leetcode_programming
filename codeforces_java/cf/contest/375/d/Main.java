import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(2 + n) instanceof Integer eb && Integer.valueOf(eb + 2 * (n - 1)) instanceof Integer qb
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, 2 * (n - 1)).allMatch(i -> ++st[Integer.parseInt(t[eb + i])] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(Integer.parseInt(t[eb + 2 * i]) - 1) instanceof Integer u && Integer.valueOf(Integer.parseInt(t[eb + 2 * i + 1]) - 1) instanceof Integer w
                && (adj[pos[u]++] = w) >= 0 && (adj[pos[w]++] = u) >= 0)
            && ((java.util.function.IntFunction<IntStream>) v -> IntStream.range(st[v], st[v + 1]).map(e -> adj[e])) instanceof java.util.function.IntFunction<IntStream> nb
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[]{1} instanceof int[] tl && (par[0] = -1) < 0
            && IntStream.range(0, n).allMatch(i -> nb.apply(ord[i]).filter(u -> u != par[ord[i]]).allMatch(u -> (par[u] = ord[i]) >= 0 && (ord[tl[0]++] = u) >= 0))
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new int[n] instanceof int[] tin && new int[n] instanceof int[] nxt && (nxt[0] = 1) > 0
            && IntStream.range(0, n).allMatch(i -> nb.apply(ord[i]).filter(u -> u != par[ord[i]]).allMatch(c -> (tin[c] = nxt[ord[i]]) >= 0 && (nxt[ord[i]] += sz[c]) > 0 && (nxt[c] = tin[c] + 1) > 0))
            && new int[n] instanceof int[] ce
            && IntStream.range(0, n).allMatch(v -> (ce[tin[v]] = Integer.parseInt(t[2 + v])) >= 0)
            && Integer.valueOf(Math.max(1, (int) (n / Math.sqrt(m)))) instanceof Integer B
            && new int[m] instanceof int[] ql && new int[m] instanceof int[] qr && new int[m] instanceof int[] qk
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Integer.parseInt(t[qb + 2 * i]) - 1) instanceof Integer v && (ql[i] = tin[v]) >= 0 && (qr[i] = tin[v] + sz[v] - 1) >= 0 && (qk[i] = Math.min(Integer.parseInt(t[qb + 2 * i + 1]), n + 1)) > 0)
            && IntStream.range(0, m).mapToLong(i -> (((long) (ql[i] / B) << 17 | ((ql[i] / B) % 2 == 0 ? qr[i] : 131071 - qr[i])) << 17) | i).sorted().toArray() instanceof long[] ks
            && new int[100002] instanceof int[] cnt && new int[n + 3] instanceof int[] ge && new int[]{0, -1} instanceof int[] cur && new int[m] instanceof int[] ans
            && Arrays.stream(ks).allMatch(key -> Integer.valueOf((int) (key & 131071)) instanceof Integer q && Integer.valueOf(ql[q]) instanceof Integer l && Integer.valueOf(qr[q]) instanceof Integer r
                && IntStream.range(l, cur[0]).filter(i -> ge[++cnt[ce[i]]]++ >= 0).count() >= 0
                && IntStream.range(cur[1] + 1, r + 1).filter(i -> ge[++cnt[ce[i]]]++ >= 0).count() >= 0
                && IntStream.range(cur[0], l).filter(i -> ge[cnt[ce[i]]--]-- >= 0).count() >= 0
                && IntStream.range(r + 1, cur[1] + 1).filter(i -> ge[cnt[ce[i]]--]-- >= 0).count() >= 0
                && (cur[0] = l) >= 0 && (cur[1] = r) >= 0 && (ans[q] = ge[qk[q]]) >= 0)
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

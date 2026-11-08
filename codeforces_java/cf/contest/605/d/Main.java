import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> i < raw.length && raw[i] > 47 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(1 << (32 - Integer.numberOfLeadingZeros(n))) instanceof Integer N
            && new int[n + 1] instanceof int[] cx && new int[n + 1] instanceof int[] cy && new int[2 * N] instanceof int[] mn && new int[n + 2] instanceof int[] queue && new int[n + 1] instanceof int[] dist && new int[n + 1] instanceof int[] par && new int[]{0, 1} instanceof int[] qs && new int[3] instanceof int[] ctx
            && IntStream.range(0, n).mapToLong(i -> ((long) tok[1 + 4 * i] << 17) | i).sorted().toArray() instanceof long[] keys
            && IntStream.range(0, N).filter(j -> (mn[N + j] = j < n ? tok[2 + 4 * (int) (keys[j] & 131071)] : Integer.MAX_VALUE) >= 0 & (j >= n || ((cx[(int) (keys[j] & 131071)] = tok[3 + 4 * (int) (keys[j] & 131071)]) >= 0 & (cy[(int) (keys[j] & 131071)] = tok[4 + 4 * (int) (keys[j] & 131071)]) >= 0))).count() >= 0
            && IntStream.range(1, N).filter(x -> Integer.valueOf(N - x) instanceof Integer i && (mn[i] = Math.min(mn[2 * i], mn[2 * i + 1])) >= 0).count() >= 0
            && (queue[0] = n) == n && new IntBinaryOperator[1] instanceof IntBinaryOperator[] f
            && (f[0] = (node, len) -> node * len - N >= ctx[0] || mn[node] > ctx[1] ? 0
                : len == 1 ? (dist[(int) (keys[node - N] & 131071)] = dist[ctx[2]] + 1) + (par[(int) (keys[node - N] & 131071)] = ctx[2]) + (queue[qs[1]++] = (int) (keys[node - N] & 131071)) + (mn[node] = Integer.MAX_VALUE) * 0
                : f[0].applyAsInt(2 * node, len / 2) + f[0].applyAsInt(2 * node + 1, len / 2) + (mn[node] = Math.min(mn[2 * node], mn[2 * node + 1])) * 0) != null
            && (IntStream.range(0, n + 1).allMatch(h -> h < qs[1] && Integer.valueOf(queue[h]) instanceof Integer u && Integer.valueOf(-(Arrays.binarySearch(keys, ((long) cx[u] << 17) | 131071) + 1)) instanceof Integer k
                && (ctx[0] = k) >= 0 && (ctx[1] = cy[u]) >= 0 && (ctx[2] = u) >= 0 && f[0].applyAsInt(1, N) >= 0) || true)
            ? (dist[n - 1] == 0 ? "-1" : dist[n - 1] + "\n" + (new int[dist[n - 1]] instanceof int[] path && IntStream.iterate(n - 1, x -> x != n, x -> par[x]).filter(x -> (path[dist[x] - 1] = x + 1) > 0).count() >= 0
                ? Arrays.toString(path).replace("[", "").replace("]", "").replace(",", "") : "")) : "");
    }
}

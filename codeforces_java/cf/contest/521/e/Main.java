
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] a
            && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : ps[1] == 1 ? (a[ps[2]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0) >= 0).count() >= 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer m
            && new int[n + 1] instanceof int[] adj && new int[2 * m + 2] instanceof int[] to && new int[2 * m + 2] instanceof int[] nxt && new int[]{0} instanceof int[] c
            && IntStream.range(0, m).filter(e -> (Integer) a[2 + 2 * e] instanceof Integer x && (Integer) a[3 + 2 * e] instanceof Integer y
                && (to[++c[0]] = y) * 0 + (nxt[c[0]] = adj[x]) * 0 + (adj[x] = c[0]) >= 0
                && (to[++c[0]] = x) * 0 + (nxt[c[0]] = adj[y]) * 0 + (adj[y] = c[0]) >= 0).count() >= 0
            && new int[n + 1] instanceof int[] cur && new int[n + 1] instanceof int[] vis && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] stk && new int[]{0} instanceof int[] sp
            && IntStream.rangeClosed(1, n).filter(v -> (cur[v] = adj[v]) >= 0).count() >= 0
            && IntStream.rangeClosed(1, n).filter(r -> vis[r] != 0 || ((vis[r] = 1) + (stk[0] = r) + (sp[0] = 1) > 0
                && IntStream.iterate(0, z -> sp[0] > 0, z -> z + 1).filter(z -> (Integer) stk[sp[0] - 1] instanceof Integer v
                    && (cur[v] == 0 ? sp[0]-- > 0 : (Integer) to[cur[v]] instanceof Integer w && (cur[v] = nxt[cur[v]]) >= 0
                        && (vis[w] == 0 ? (vis[w] = 1) + (par[w] = v) + (dep[w] = dep[v] + 1) + (stk[sp[0]++] = w) > 0 : true))).count() >= 0)).count() >= 0
            && new int[n + 1] instanceof int[] mark && new int[3] instanceof int[] cf
            && (IntStream.range(0, m).anyMatch(e -> (Integer) a[2 + 2 * e] instanceof Integer x && (Integer) a[3 + 2 * e] instanceof Integer y
                && par[x] != y && par[y] != x && (Integer) (dep[x] > dep[y] ? x : y) instanceof Integer u && (Integer) (dep[x] > dep[y] ? y : x) instanceof Integer an
                && IntStream.iterate(u, v -> v != an && cf[0] == 0, v -> par[v]).filter(v -> mark[v] != 0 ? (cf[0] = v) + (cf[1] = mark[v]) + (cf[2] = e + 1) > 0 : (mark[v] = e + 1) < 0).count() >= 0
                && cf[0] != 0) || true)
            ? (cf[0] == 0 ? "NO"
                : (Integer) cf[0] instanceof Integer vk
                && (Integer) (dep[a[2 + 2 * (cf[1] - 1)]] > dep[a[3 + 2 * (cf[1] - 1)]] ? a[2 + 2 * (cf[1] - 1)] : a[3 + 2 * (cf[1] - 1)]) instanceof Integer u1
                && (Integer) (dep[a[2 + 2 * (cf[1] - 1)]] > dep[a[3 + 2 * (cf[1] - 1)]] ? a[3 + 2 * (cf[1] - 1)] : a[2 + 2 * (cf[1] - 1)]) instanceof Integer a1
                && (Integer) (dep[a[2 + 2 * (cf[2] - 1)]] > dep[a[3 + 2 * (cf[2] - 1)]] ? a[2 + 2 * (cf[2] - 1)] : a[3 + 2 * (cf[2] - 1)]) instanceof Integer u2
                && (Integer) (dep[a[2 + 2 * (cf[2] - 1)]] > dep[a[3 + 2 * (cf[2] - 1)]] ? a[3 + 2 * (cf[2] - 1)] : a[2 + 2 * (cf[2] - 1)]) instanceof Integer a2
                && (Integer) (dep[a1] > dep[a2] ? a1 : a2) instanceof Integer z
                && ((BiFunction<Integer, Integer, int[]>) (x, y) -> IntStream.iterate(x, v -> par[v]).limit(dep[x] - dep[y] + 1).toArray()) instanceof BiFunction<Integer, Integer, int[]> up
                && ((UnaryOperator<int[]>) arr -> IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray()) instanceof UnaryOperator<int[]> rev
                && ((Function<int[], String>) p -> p.length + " " + Arrays.stream(p).mapToObj(String::valueOf).collect(Collectors.joining(" "))) instanceof Function<int[], String> fmt
                ? "YES\n" + fmt.apply(up.apply(vk, z)) + "\n"
                    + fmt.apply(IntStream.concat(Arrays.stream(rev.apply(up.apply(u1, vk))), Arrays.stream(rev.apply(up.apply(z, a1)))).toArray()) + "\n"
                    + fmt.apply(IntStream.concat(Arrays.stream(rev.apply(up.apply(u2, vk))), Arrays.stream(rev.apply(up.apply(z, a2)))).toArray()) : "") : "");
    }
}




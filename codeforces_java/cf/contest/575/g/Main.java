import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && IntStream.range(0, 3 * m).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] ed && new int[n + 2] instanceof int[] deg && new int[n + 2] instanceof int[] st
            && IntStream.range(0, m).filter(e -> ++deg[ed[3 * e]] > 0 && ++deg[ed[3 * e + 1]] > 0 && false).count() >= 0
            && IntStream.range(0, n).filter(v -> (st[v + 1] = st[v] + deg[v]) < 0).count() >= 0
            && IntStream.range(0, n + 1).map(v -> st[v]).toArray() instanceof int[] pos && new int[2 * m] instanceof int[] adjTo && new int[2 * m] instanceof int[] adjW
            && IntStream.range(0, m).filter(e -> (adjTo[pos[ed[3 * e]]] = ed[3 * e + 1]) >= 0 && (adjW[pos[ed[3 * e]]++] = ed[3 * e + 2]) >= 0 && (adjTo[pos[ed[3 * e + 1]]] = ed[3 * e]) >= 0 && (adjW[pos[ed[3 * e + 1]]++] = ed[3 * e + 2]) >= 0 && false).count() >= 0
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] dz && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] nxt && new int[n] instanceof int[] q1 && new int[]{1} instanceof int[] t1
            && (dz[n - 1] = 0) == 0 && (q1[0] = n - 1) >= 0
            && IntStream.iterate(0, i -> i < t1[0], i -> i + 1).filter(i -> (Integer) q1[i] instanceof Integer u && IntStream.range(st[u], st[u + 1]).filter(e -> adjW[e] == 0 && dz[adjTo[e]] < 0 && (dz[adjTo[e]] = dz[u] + 1) > 0 && (nxt[adjTo[e]] = u) >= 0 && (q1[t1[0]++] = adjTo[e]) >= 0 && false).count() >= 0 && false).count() >= 0
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] d0 && new int[n] instanceof int[] q2 && new int[]{1} instanceof int[] t2 && (d0[0] = 0) == 0
            && IntStream.iterate(0, i -> i < t2[0], i -> i + 1).filter(i -> (Integer) q2[i] instanceof Integer u && IntStream.range(st[u], st[u + 1]).filter(e -> d0[adjTo[e]] < 0 && (d0[adjTo[e]] = d0[u] + 1) > 0 && (q2[t2[0]++] = adjTo[e]) >= 0 && false).count() >= 0 && false).count() >= 0
            && new int[d0[q2[t2[0] - 1]] + 3] instanceof int[] first && IntStream.range(0, t2[0]).filter(i -> (first[d0[q2[i]] + 1] = i + 1) < 0).count() >= 0
            && (Integer) IntStream.range(0, n).filter(v -> dz[v] >= 0 && d0[v] >= 0).map(v -> d0[v]).min().getAsInt() instanceof Integer L
            && new boolean[n] instanceof boolean[] good && new int[L + 2] instanceof int[] dig && new boolean[n] instanceof boolean[] reach && new int[n] instanceof int[] par
            && IntStream.range(0, n).filter(v -> dz[v] >= 0 && d0[v] == L && (good[v] = true) && false).count() >= 0
            && IntStream.iterate(L, k -> k >= 1, k -> k - 1).filter(k -> (Integer) IntStream.range(first[k - 1], first[k]).flatMap(i -> IntStream.range(st[q2[i]], st[q2[i] + 1]).filter(e -> good[adjTo[e]] && d0[adjTo[e]] == k).map(e -> adjW[e])).min().getAsInt() instanceof Integer dk
                && (dig[k] = dk) >= 0 && IntStream.range(first[k - 1], first[k]).filter(i -> IntStream.range(st[q2[i]], st[q2[i] + 1]).anyMatch(e -> good[adjTo[e]] && d0[adjTo[e]] == k && adjW[e] == dk) && (good[q2[i]] = true) && false).count() >= 0 && false).count() >= 0
            && (reach[0] = true)
            && IntStream.iterate(1, k -> k <= L, k -> k + 1).filter(k -> IntStream.range(first[k - 1], first[k]).filter(i -> reach[q2[i]] && IntStream.range(st[q2[i]], st[q2[i] + 1]).filter(e -> good[adjTo[e]] && d0[adjTo[e]] == k && adjW[e] == dig[k] && (reach[adjTo[e]] = true) && (par[adjTo[e]] = q2[i]) >= 0 && false).count() >= 0 && false).count() >= 0 && false).count() >= 0
            && (Integer) (dz[0] >= 0 ? 0 : IntStream.range(first[L], first[L + 1]).map(i -> q2[i]).filter(v -> reach[v] && dz[v] >= 0).boxed().min(Comparator.comparingInt(v -> dz[v])).get()) instanceof Integer z
            ? dz[0] >= 0 ? "0" + (char) 10 + (dz[0] + 1) + (char) 10 + IntStream.iterate(0, v -> v >= 0, v -> nxt[v]).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : IntStream.iterate(L, k -> k >= 1, k -> k - 1).mapToObj(k -> "" + dig[k]).collect(Collectors.joining()) + (char) 10 + (L + 1 + dz[z]) + (char) 10
                    + Stream.concat(IntStream.iterate(z, v -> v >= 0, v -> v == 0 ? -1 : par[v]).boxed().collect(ArrayDeque<Integer>::new, ArrayDeque::addFirst, (a, b) -> a.addAll(b)).stream(), IntStream.iterate(nxt[z], v -> v >= 0, v -> nxt[v]).boxed()).map(String::valueOf).collect(Collectors.joining(" "))
            : "");
    }
}

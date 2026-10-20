import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && new int[n] instanceof int[] head && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0)
            && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to && new int[2 * m] instanceof int[] orig && new int[2 * m] instanceof int[] cap
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Integer.parseInt(it.next()) - 1) instanceof Integer u && Integer.valueOf(Integer.parseInt(it.next()) - 1) instanceof Integer v && Integer.valueOf(it.next()) instanceof Integer c
                && (to[2 * i] = v) >= 0 & (to[2 * i + 1] = u) >= 0 & (orig[2 * i] = orig[2 * i + 1] = c) > 0 & (nxt[2 * i] = head[u]) >= -1 & (head[u] = 2 * i) >= 0 & (nxt[2 * i + 1] = head[v]) >= -1 & (head[v] = 2 * i + 1) >= 0)
            && new int[n] instanceof int[] lv && new int[n] instanceof int[] cur && new int[n] instanceof int[] q && new int[]{0, 0, 0} instanceof int[] qt && new AtomicReference<BiFunction<Integer, Integer, Integer>>() instanceof AtomicReference<BiFunction<Integer, Integer, Integer>> rec
            && rec.compareAndSet(null, (u, f) -> u == qt[2] ? f : IntStream.iterate(cur[u], e -> e >= 0, e -> nxt[e]).map(e -> (cur[u] = e) >= 0 && cap[e] > 0 && lv[to[e]] == lv[u] + 1 && Integer.valueOf(rec.get().apply(to[e], Math.min(f, cap[e]))) instanceof Integer g && g > 0 && (cap[e] -= g) >= 0 && (cap[e ^ 1] += g) > 0 ? g : 0).filter(g -> g > 0).findFirst().orElse(0))
            && ((IntBinaryOperator) (s, t) -> IntStream.range(0, 2 * m).allMatch(i -> (cap[i] = orig[i]) >= 0) && (qt[2] = t) >= 0
                ? IntStream.generate(() -> 0).takeWhile(z -> IntStream.range(0, n).allMatch(i -> (lv[i] = -1) < 0) && (lv[s] = 0) == 0 && (q[0] = s) >= 0 && (qt[0] = 1) > 0
                        && IntStream.iterate(0, i -> i < qt[0], i -> i + 1).allMatch(i -> IntStream.iterate(head[q[i]], e -> e >= 0, e -> nxt[e]).filter(e -> cap[e] > 0 && lv[to[e]] < 0).allMatch(e -> (q[(lv[to[e]] = lv[q[i]] + 1) * 0 + qt[0]++] = to[e]) >= 0)) && lv[t] >= 0)
                    .map(z -> IntStream.range(0, n).allMatch(i -> (cur[i] = head[i]) >= -1) ? IntStream.generate(() -> rec.get().apply(s, 1 << 29)).takeWhile(g -> g > 0).sum() : 0).sum() : 0) instanceof IntBinaryOperator flow
            && new int[n] instanceof int[] par && new int[n] instanceof int[] w
            && IntStream.range(1, n).allMatch(i -> (w[i] = flow.applyAsInt(i, par[i])) >= 0 && IntStream.range(i + 1, n).filter(j -> par[j] == par[i] && lv[j] >= 0).allMatch(j -> (par[j] = i) >= 0))
            && new int[n] instanceof int[] comp && IntStream.range(0, n).allMatch(i -> (comp[i] = i) >= 0)
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<>(List.of(i))).toList() instanceof List<ArrayList<Integer>> lists
            && IntStream.range(1, n).boxed().sorted((a, b) -> w[b] - w[a]).allMatch(i -> Integer.valueOf(comp[i]) instanceof Integer ca && Integer.valueOf(comp[par[i]]) instanceof Integer cb && lists.get(ca).addAll(lists.get(cb)) && IntStream.range(0, n).filter(k -> comp[k] == cb).allMatch(k -> (comp[k] = ca) >= 0))
            ? IntStream.range(1, n).map(i -> w[i]).sum() + "\n" + lists.get(comp[0]).stream().map(x -> String.valueOf(x + 1)).collect(Collectors.joining(" ")) : "");
    }
}

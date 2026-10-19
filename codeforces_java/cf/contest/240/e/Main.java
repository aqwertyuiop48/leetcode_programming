import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{it.next() - 1, it.next() - 1, it.next(), i}).toList() instanceof List<int[]> es
            && new AtomicReference<Function<Object[], List<Integer>>>() instanceof AtomicReference<Function<Object[], List<Integer>>> solve
            && solve.compareAndSet(null, a -> Integer.valueOf((Integer) a[0]) instanceof Integer nn && Integer.valueOf((Integer) a[1]) instanceof Integer root && (List<int[]>) a[2] instanceof List<int[]> edges
                && new int[nn] instanceof int[] in && new int[nn] instanceof int[] pe
                && IntStream.range(0, nn).allMatch(v -> (in[v] = Integer.MAX_VALUE) > 0 && (pe[v] = -1) < 0)
                && IntStream.range(0, edges.size()).allMatch(i -> edges.get(i)[0] == edges.get(i)[1] || edges.get(i)[1] == root || edges.get(i)[2] >= in[edges.get(i)[1]] || (in[edges.get(i)[1]] = edges.get(i)[2]) >= 0 && (pe[edges.get(i)[1]] = i) >= 0)
                && IntStream.range(0, nn).noneMatch(v -> v != root && pe[v] < 0)
                && (in[root] = 0) == 0
                && new int[nn] instanceof int[] id && new int[nn] instanceof int[] vis && new boolean[nn] instanceof boolean[] inCyc && new int[]{0} instanceof int[] cnt
                && IntStream.range(0, nn).allMatch(v -> (id[v] = -1) < 0 && (vis[v] = -1) < 0)
                && IntStream.range(0, nn).allMatch(v -> new int[]{v} instanceof int[] x
                    && IntStream.iterate(0, z -> x[0] != root && vis[x[0]] != v && id[x[0]] == -1, z -> z + 1).allMatch(z -> (vis[x[0]] = v) >= 0 && (x[0] = edges.get(pe[x[0]])[0]) >= 0)
                    && (x[0] == root || id[x[0]] != -1 || new int[]{edges.get(pe[x[0]])[0]} instanceof int[] y
                        && IntStream.iterate(0, z -> y[0] != x[0], z -> z + 1).allMatch(z -> (id[y[0]] = cnt[0]) >= 0 && (inCyc[y[0]] = true) && (y[0] = edges.get(pe[y[0]])[0]) >= 0)
                        && (id[x[0]] = cnt[0]++) >= 0 && (inCyc[x[0]] = true)))
                && (cnt[0] == 0 || true)
                && Integer.valueOf(cnt[0]) instanceof Integer ncyc
                ? ncyc == 0 ? IntStream.range(0, nn).filter(v -> v != root).mapToObj(v -> pe[v]).toList()
                    : IntStream.range(0, nn).allMatch(v -> id[v] != -1 || (id[v] = cnt[0]++) >= 0)
                        && IntStream.range(0, edges.size()).filter(i -> id[edges.get(i)[0]] != id[edges.get(i)[1]]).mapToObj(i -> new int[]{id[edges.get(i)[0]], id[edges.get(i)[1]], edges.get(i)[2] - in[edges.get(i)[1]], i}).toList() instanceof List<int[]> ne
                        && solve.get().apply(new Object[]{cnt[0], id[root], ne}) instanceof List<Integer> rs
                        && new int[nn] instanceof int[] enter && IntStream.range(0, nn).allMatch(v -> (enter[v] = -1) < 0)
                        && rs.stream().allMatch(x -> (enter[edges.get(ne.get(x)[3])[1]] = ne.get(x)[3]) >= 0)
                        ? IntStream.range(0, nn).filter(v -> v != root).mapToObj(v -> enter[v] >= 0 ? enter[v] : pe[v]).toList() : null : null)
            && solve.get().apply(new Object[]{n, 0, es}) instanceof List<Integer> chosen
            ? chosen.stream().map(i -> es.get(i)).filter(e -> e[2] == 1).map(e -> e[3] + 1).toList() instanceof List<Integer> rep
                ? rep.size() + (rep.isEmpty() ? "" : "\n" + rep.stream().map(String::valueOf).collect(Collectors.joining(" "))) : "" : "-1"), "", 1 << 28).start();
    }
}

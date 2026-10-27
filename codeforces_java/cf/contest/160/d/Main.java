import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.print(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<int[]> e
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && IntStream.rangeClosed(0, n).map(i -> 1).toArray() instanceof int[] sz
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, x -> par[x] == x ? x : (par[x] = find.get().applyAsInt(par[x])))
            && Stream.generate(() -> "none").limit(m).toArray(String[]::new) instanceof String[] res
            && IntStream.range(0, m).boxed().collect(Collectors.groupingBy(i -> e.get(i)[2], TreeMap::new, Collectors.toList())) instanceof TreeMap<Integer, List<Integer>> groups
            && groups.values().stream().allMatch(g ->
                g.stream().filter(i -> find.get().applyAsInt(e.get(i)[0]) != find.get().applyAsInt(e.get(i)[1])).toList() instanceof List<Integer> cand
                && cand.stream().allMatch(i -> (res[i] = "at least one") != null)
                && new HashMap<Integer, List<int[]>>() instanceof HashMap<Integer, List<int[]>> adj
                && cand.stream().allMatch(i -> Integer.valueOf(find.get().applyAsInt(e.get(i)[0])) instanceof Integer u
                    && Integer.valueOf(find.get().applyAsInt(e.get(i)[1])) instanceof Integer v
                    && adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new int[]{v, i})
                    && adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new int[]{u, i}))
                && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> tin
                && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> low
                && new int[]{0} instanceof int[] timer
                && new AtomicReference<BiFunction<Integer, Integer, Integer>>() instanceof AtomicReference<BiFunction<Integer, Integer, Integer>> dfs
                && dfs.compareAndSet(null, (v, pe) -> tin.put(v, ++timer[0]) == null && low.put(v, timer[0]) == null
                    && adj.get(v).stream().allMatch(ed -> ed[1] == pe || (tin.containsKey(ed[0])
                        ? low.merge(v, tin.get(ed[0]), Math::min) != null
                        : dfs.get().apply(ed[0], ed[1]) >= 0 && low.merge(v, low.get(ed[0]), Math::min) != null && (low.get(ed[0]) <= tin.get(v) || (res[ed[1]] = "any") != null)))
                    ? 0 : 0)
                && adj.keySet().stream().allMatch(v -> tin.containsKey(v) || dfs.get().apply(v, -1) >= 0)
                && cand.stream().allMatch(i -> Integer.valueOf(find.get().applyAsInt(e.get(i)[0])) instanceof Integer u
                    && Integer.valueOf(find.get().applyAsInt(e.get(i)[1])) instanceof Integer v
                    && (u.equals(v) || (sz[u] < sz[v] ? (par[u] = v) > 0 && (sz[v] += sz[u]) > 0 : (par[v] = u) > 0 && (sz[u] += sz[v]) > 0))))
            ? String.join("\n", res) : ""), "", 1L << 28).start();
    }
}


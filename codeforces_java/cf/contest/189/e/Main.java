import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && Integer.valueOf(rd.getAsInt()) instanceof Integer m
            && Integer.valueOf(rd.getAsInt()) instanceof Integer k
            && IntStream.range(0, k).map(i -> rd.getAsInt()).toArray() instanceof int[] vol
            && IntStream.range(0, m).mapToObj(i -> new int[]{rd.getAsInt(), rd.getAsInt()}).toList() instanceof List<int[]> es
            && Integer.valueOf(rd.getAsInt()) instanceof Integer s
            && Integer.valueOf(rd.getAsInt()) instanceof Integer t
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && es.stream().allMatch(e -> adj.get(e[0]).add(e[1]) && adj.get(e[1]).add(e[0]))
            && IntStream.concat(Arrays.stream(vol), IntStream.of(s, t)).distinct().toArray() instanceof int[] src
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] dist
            && new int[n + 1] instanceof int[] owner
            && new ArrayDeque<Integer>(Arrays.stream(src).boxed().toList()) instanceof ArrayDeque<Integer> dq
            && Arrays.stream(src).allMatch(v -> (dist[v] = 0) == 0 && (owner[v] = v) > 0)
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(v -> adj.get(v).stream().filter(u -> dist[u] < 0).allMatch(u -> (dist[u] = dist[v] + 1) > 0 && (owner[u] = owner[v]) > 0 && dq.add(u)))
            && es.stream().filter(e -> dist[e[0]] >= 0 && dist[e[1]] >= 0 && owner[e[0]] != owner[e[1]]).map(e -> new int[]{dist[e[0]] + dist[e[1]] + 1, owner[e[0]], owner[e[1]]}).sorted(Comparator.comparingInt((int[] e) -> e[0])).toList() instanceof List<int[]> cand
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] par
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> find
            && find.compareAndSet(null, x -> par[x] == x ? x : (par[x] = find.get().applyAsInt(par[x])))
            ? cand.stream().filter(e -> find.get().applyAsInt(s) != find.get().applyAsInt(t) && find.get().applyAsInt(e[1]) != find.get().applyAsInt(e[2]) && (par[find.get().applyAsInt(e[1])] = find.get().applyAsInt(e[2])) >= 0 && find.get().applyAsInt(s) == find.get().applyAsInt(t))
                .mapToInt(e -> e[0]).findFirst().orElse(s.equals(t) ? 0 : -1)
            : -2);
    }
}


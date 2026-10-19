import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> (String) t).iterator() instanceof Iterator<String> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new HashMap<String, Integer>() instanceof HashMap<String, Integer> ids
            && new int[n + 1] instanceof int[] nm && new int[n + 1] instanceof int[] par
            && IntStream.rangeClosed(1, n).allMatch(i -> (nm[i] = ids.computeIfAbsent(it.next(), k -> ids.size())) >= 0 && (par[i] = Integer.parseInt(it.next())) >= 0)
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch
            && IntStream.rangeClosed(1, n).allMatch(i -> ch.get(par[i]).add(i))
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n + 1] instanceof int[] dep && new int[]{0} instanceof int[] timer
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
            && dfs.compareAndSet(null, v -> (tin[v] = timer[0]++) >= 0 && ch.get(v).stream().allMatch(u -> (dep[u] = dep[v] + 1) > 0 && dfs.get().test(u)) && (tout[v] = timer[0] - 1) >= 0)
            && dfs.get().test(0)
            && IntStream.rangeClosed(1, n).boxed().sorted(Comparator.comparingInt((Integer v) -> dep[v]).thenComparingInt(v -> tin[v])).mapToInt(Integer::intValue).toArray() instanceof int[] ord
            && Arrays.stream(ord).map(v -> tin[v]).toArray() instanceof int[] tg && Arrays.stream(ord).map(v -> nm[v]).toArray() instanceof int[] ng
            && Integer.valueOf(Arrays.stream(dep).max().getAsInt()) instanceof Integer maxD
            && new int[maxD + 3] instanceof int[] start
            && Arrays.stream(ord).allMatch(v -> ++start[dep[v] + 1] > 0)
            && IntStream.rangeClosed(1, maxD + 2).allMatch(d -> (start[d] += start[d - 1]) >= 0)
            && Integer.valueOf(it.next()) instanceof Integer q
            && IntStream.range(0, q).mapToObj(i -> Integer.valueOf(it.next()) instanceof Integer v && Integer.valueOf(it.next()) instanceof Integer k
                && Integer.valueOf(dep[v] + k) instanceof Integer d
                ? d > maxD ? new int[]{i, 0, 0} : Integer.valueOf(Arrays.binarySearch(tg, start[d], start[d + 1], tin[v])) instanceof Integer r1 && Integer.valueOf(Arrays.binarySearch(tg, start[d], start[d + 1], tout[v])) instanceof Integer r2
                    ? new int[]{i, r1 >= 0 ? r1 : -r1 - 1, r2 >= 0 ? r2 + 1 : -r2 - 1} : null : null).toList() instanceof List<int[]> qs
            && new int[n + 2] instanceof int[] bit && new int[ids.size() + 1] instanceof int[] last && IntStream.range(0, last.length).allMatch(i -> (last[i] = -1) < 0)
            && new int[q] instanceof int[] ans
            && qs.stream().collect(Collectors.groupingBy(x -> x[2] - 1)) instanceof Map<Integer, List<int[]>> byR
            ? IntStream.range(0, n).allMatch(p -> (last[ng[p]] < 0 || IntStream.iterate(last[ng[p]] + 1, j -> j <= n, j -> j + (j & -j)).allMatch(j -> --bit[j] > Integer.MIN_VALUE))
                && IntStream.iterate(p + 1, j -> j <= n, j -> j + (j & -j)).allMatch(j -> ++bit[j] > Integer.MIN_VALUE) && (last[ng[p]] = p) >= 0
                && byR.getOrDefault(p, List.of()).stream().allMatch(x -> x[1] >= x[2] || (ans[x[0]] = IntStream.iterate(p + 1, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum() - IntStream.iterate(x[1], j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()) >= 0))
                ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "" : ""), "", 1 << 28).start();
    }
}

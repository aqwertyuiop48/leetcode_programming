import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((IntSupplier) () -> Integer.parseInt((String) it.next())) instanceof IntSupplier rd
            && Integer.valueOf(rd.getAsInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch
            && new int[17][n + 1] instanceof int[][] up
            && IntStream.rangeClosed(1, n).allMatch(i -> (up[0][i] = rd.getAsInt()) >= 0 && ch.get(up[0][i]).add(i))
            && IntStream.range(1, 17).allMatch(j -> IntStream.rangeClosed(0, n).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) >= 0))
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] ord && new int[1] instanceof int[] timer
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
            && dfs.compareAndSet(null, v -> (ord[tin[v] = timer[0]++] = v) >= 0 && ch.get(v).stream().allMatch(u -> (dep[u] = dep[v] + 1) > 0 && dfs.get().test(u)) && (tout[v] = timer[0] - 1) >= 0)
            && dfs.get().test(0)
            && IntStream.rangeClosed(0, n).boxed().collect(Collectors.groupingBy(t -> dep[ord[t]], Collectors.collectingAndThen(Collectors.toList(), l -> l.stream().mapToInt(i -> i).toArray()))) instanceof Map<Integer, int[]> byDepth
            && ((ToIntBiFunction<int[], Integer>) (arr, x) -> Integer.valueOf(Arrays.binarySearch(arr, x)) instanceof Integer r ? r >= 0 ? r + 1 : -r - 1 : 0) instanceof ToIntBiFunction<int[], Integer> ub
            && Integer.valueOf(rd.getAsInt()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(rd.getAsInt()) instanceof Integer v && Integer.valueOf(rd.getAsInt()) instanceof Integer p
                ? dep[v] <= p ? "0" : Integer.valueOf(IntStream.range(0, 17).filter(j -> (p >> j & 1) == 1).reduce(v, (x, j) -> up[j][x])) instanceof Integer a
                    && byDepth.get(dep[v]) instanceof int[] arr
                    ? String.valueOf(ub.applyAsInt(arr, tout[a]) - ub.applyAsInt(arr, tin[a] - 1) - 1) : "0" : "").collect(Collectors.joining(" ")) : ""), "", 1 << 28).start();
    }
}


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Long.valueOf(1000000007L) instanceof Long P && Integer.valueOf(100000) instanceof Integer N
            && new int[N + 2] instanceof int[] ge && IntStream.range(0, n).allMatch(i -> ++ge[it.next()] > 0)
            && IntStream.iterate(N - 1, x -> x >= 1, x -> x - 1).allMatch(x -> (ge[x] += ge[x + 1]) >= 0)
            && IntStream.rangeClosed(0, N).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> divs
            && IntStream.rangeClosed(1, N).allMatch(d -> IntStream.iterate(d, m -> m <= N, m -> m + d).allMatch(m -> divs.get(m).add(d)))
            && ((BiFunction<Long, Integer, Long>) (b, e) -> new long[]{1, b, e} instanceof long[] st
                && IntStream.iterate(0, z -> st[2] > 0, z -> z + 1).allMatch(z -> (st[2] % 2 == 0 || (st[0] = st[0] * st[1] % P) >= 0) && (st[1] = st[1] * st[1] % P) >= 0 && (st[2] /= 2) >= 0)
                ? st[0] : 0L) instanceof BiFunction<Long, Integer, Long> pow
            ? IntStream.rangeClosed(1, N).mapToLong(M -> divs.get(M) instanceof ArrayList<Integer> d && Integer.valueOf(d.size()) instanceof Integer k
                && Long.valueOf(IntStream.range(0, k - 1).mapToLong(j -> pow.apply((long) j + 1, ge[d.get(j)] - ge[d.get(j + 1)])).reduce(1, (x, y) -> x * y % P)) instanceof Long pre
                ? pre * ((pow.apply((long) k, ge[M]) - pow.apply((long) k - 1, ge[M]) + P) % P) % P : 0).sum() % P : "");
    }
}

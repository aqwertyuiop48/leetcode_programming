import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m
            && IntStream.range(0, n * m).map(i -> it.nextInt()).toArray() instanceof int[] g
            && Integer.valueOf(Arrays.stream(g).sum()) instanceof Integer total
            && new int[n * m] instanceof int[] hl && new int[n * m] instanceof int[] vl
            && IntStream.range(0, n * m).allMatch(i -> (hl[i] = g[i] == 0 ? 0 : (i % m > 0 ? hl[i - 1] : 0) + 1) >= 0 & (vl[i] = g[i] == 0 ? 0 : (i >= m ? vl[i - m] : 0) + 1) >= 0)
            && Integer.valueOf(Math.max(Arrays.stream(hl).max().getAsInt(), Arrays.stream(vl).max().getAsInt())) instanceof Integer L
            && IntStream.range(0, n * m).filter(i -> hl[i] == L).findFirst() instanceof OptionalInt hf
            && Integer.valueOf(hf.isPresent() ? hf.getAsInt() - (L - 1) : IntStream.range(0, n * m).filter(i -> vl[i] == L).findFirst().getAsInt() - (L - 1) * m) instanceof Integer s0
            && Integer.valueOf(s0 / m) instanceof Integer r0 && Integer.valueOf(s0 % m) instanceof Integer c0
            && new int[n * (m + 1)] instanceof int[] ph && new int[(n + 1) * m] instanceof int[] pv
            && IntStream.range(0, n * m).allMatch(i -> (ph[i / m * (m + 1) + i % m + 1] = ph[i / m * (m + 1) + i % m] + g[i]) >= 0 & (pv[(i / m + 1) * m + i % m] = pv[i / m * m + i % m] + g[i]) >= 0)
            ? IntStream.rangeClosed(2, L - 1).filter(k -> (L - 1) % k == 0
                && new int[n * m] instanceof int[] deg && IntStream.range(0, n * m).toArray() instanceof int[] p && IntStream.generate(() -> 1).limit(n * m).toArray() instanceof int[] sz && new int[2] instanceof int[] cnt
                && ((IntUnaryOperator) x -> IntStream.iterate(x, i -> p[i] != i, i -> p[i]).reduce(x, (a, b) -> p[b])) instanceof IntUnaryOperator find
                && ((BiPredicate<Integer, Integer>) (u, v) -> Integer.valueOf(find.applyAsInt(u)) instanceof Integer ru && Integer.valueOf(find.applyAsInt(v)) instanceof Integer rv
                    && (deg[u]++ >= 0 & deg[v]++ >= 0 & cnt[0]++ >= 0) && (ru == rv.intValue() || (sz[ru] < sz[rv] ? (p[ru] = rv) + (sz[rv] += sz[ru]) : (p[rv] = ru) + (sz[ru] += sz[rv])) >= 0 && cnt[1]++ >= 0)) instanceof BiPredicate<Integer, Integer> add
                && IntStream.iterate(r0 % k, r -> r < n, r -> r + k).allMatch(r -> IntStream.iterate(c0 % k, c -> c < m, c -> c + k).allMatch(c ->
                    (c + k >= m || ph[r * (m + 1) + c + k + 1] - ph[r * (m + 1) + c] != k + 1 || add.test(r * m + c, r * m + c + k))
                    && (r + k >= n || pv[(r + k + 1) * m + c] - pv[r * m + c] != k + 1 || add.test(r * m + c, (r + k) * m + c))))
                && Long.valueOf(Arrays.stream(deg).filter(d -> d > 0).count()) instanceof Long D && Long.valueOf(Arrays.stream(deg).filter(d -> d % 2 == 1).count()) instanceof Long O
                && cnt[0] * (k - 1) + D == total && D - cnt[1] == 1 && (O == 0 || O == 2)).boxed().map(String::valueOf).collect(Collectors.joining(" ")) instanceof String res
                ? res.isEmpty() ? "-1" : res : "" : "");
    }
}

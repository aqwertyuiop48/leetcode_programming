import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && Integer.valueOf(it.nextInt()) instanceof Integer m && Integer.valueOf(it.nextInt()) instanceof Integer p && Integer.valueOf(it.nextInt()) instanceof Integer q
            && new int[m] instanceof int[] x && new int[m] instanceof int[] y && new int[m] instanceof int[] len
            && IntStream.range(0, m).allMatch(i -> (x[i] = it.nextInt()) > 0 & (y[i] = it.nextInt()) > 0 & (len[i] = it.nextInt()) > 0)
            && IntStream.range(0, n + 1).toArray() instanceof int[] par && IntStream.generate(() -> 1).limit(n + 1).toArray() instanceof int[] sz
            && ((IntUnaryOperator) u -> IntStream.iterate(u, i -> par[i] != i, i -> par[i]).reduce(u, (a, b) -> par[b])) instanceof IntUnaryOperator find
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(find.applyAsInt(x[i])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(y[i])) instanceof Integer rb
                && (ra == rb.intValue() || (sz[ra] < sz[rb] ? (par[ra] = rb) + (sz[rb] += sz[ra]) : (par[rb] = ra) + (sz[ra] += sz[rb])) > 0))
            && new long[n + 1] instanceof long[] sum && IntStream.range(0, m).allMatch(i -> (sum[find.applyAsInt(x[i])] += len[i]) > 0)
            && IntStream.rangeClosed(1, n).filter(i -> find.applyAsInt(i) == i).toArray() instanceof int[] roots && Integer.valueOf(roots.length) instanceof Integer c
            && new PriorityQueue<long[]>(Comparator.comparingLong(e -> e[0])) instanceof PriorityQueue<long[]> pq
            && Arrays.stream(roots).allMatch(r -> pq.add(new long[]{sum[r], r}))
            && new ArrayList<String>() instanceof ArrayList<String> out
            ? q > c || p < c - q ? "NO" : IntStream.range(0, c - q).allMatch(z -> pq.poll() instanceof long[] A && pq.poll() instanceof long[] B && out.add(A[1] + " " + B[1])
                && pq.add(new long[]{A[0] + B[0] + Math.min(1000000000L, A[0] + B[0] + 1), A[1]}))
                && (c > q ? out.get(out.size() - 1) : m > 0 ? x[0] + " " + y[0] : (String) null) instanceof String pair
                    ? (out.addAll(Collections.nCopies(p - (c - q), pair)) | true) ? "YES" + (out.isEmpty() ? "" : "\n") + String.join("\n", out) : "" : p == c - q ? "YES" : "NO" : "");
    }
}

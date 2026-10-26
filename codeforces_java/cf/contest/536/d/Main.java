import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer s && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer t
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] p
            && new int[2 * m] instanceof int[] to && new long[2 * m] instanceof long[] w && new int[2 * m] instanceof int[] nxt && new int[n] instanceof int[] head && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer a && (Integer) (Integer.parseInt(tk.nextToken()) - 1) instanceof Integer b && (w[2 * i] = w[2 * i + 1] = Long.parseLong(tk.nextToken())) >= 0
                && (to[2 * i] = b) >= 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) >= 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && ((IntFunction<long[]>) src -> new long[n] instanceof long[] dist && IntStream.range(0, n).allMatch(i -> (dist[i] = Long.MAX_VALUE) > 0) && (dist[src] = 0) == 0
                && new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, src})
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(top -> top[0] != dist[(int) top[1]] || IntStream.iterate(head[(int) top[1]], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                    top[0] + w[e] >= dist[to[e]] || (dist[to[e]] = top[0] + w[e]) >= 0 && pq.add(new long[]{dist[to[e]], to[e]}))) ? dist : null) instanceof IntFunction<long[]> dijk
            && dijk.apply(s) instanceof long[] ds && dijk.apply(t) instanceof long[] dt
            && LongStream.of(ds).distinct().sorted().toArray() instanceof long[] us && LongStream.of(dt).distinct().sorted().toArray() instanceof long[] ut
            && (Integer) us.length instanceof Integer A && (Integer) ut.length instanceof Integer B
            && IntStream.range(0, n).map(v -> Arrays.binarySearch(us, ds[v])).toArray() instanceof int[] rs && IntStream.range(0, n).map(v -> Arrays.binarySearch(ut, dt[v])).toArray() instanceof int[] rt
            && new long[A + 1][B + 1] instanceof long[][] val && new int[A + 1][B + 1] instanceof int[][] cnt
            && IntStream.range(0, n).allMatch(v -> (val[rs[v]][rt[v]] += p[v]) > Long.MIN_VALUE && ++cnt[rs[v]][rt[v]] > 0)
            && new long[B + 2] instanceof long[] vPrev && new long[B + 2] instanceof long[] fPrev && new long[B + 2] instanceof long[] colSum && new int[B + 2] instanceof int[] colCnt
            && new long[1] instanceof long[] res
            && IntStream.iterate(A - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(0, B).allMatch(j -> (colSum[j] += val[i][j]) > Long.MIN_VALUE && (colCnt[j] += cnt[i][j]) >= 0)
                && new long[B + 2] instanceof long[] rowSum && new int[B + 2] instanceof int[] rowCnt
                && IntStream.iterate(B - 1, j -> j >= 0, j -> j - 1).allMatch(j -> (rowSum[j] = rowSum[j + 1] + val[i][j]) > Long.MIN_VALUE && (rowCnt[j] = rowCnt[j + 1] + cnt[i][j]) >= 0)
                && new long[B + 2] instanceof long[] f && new long[B + 2] instanceof long[] g && new long[B + 2] instanceof long[] v1 && new long[B + 2] instanceof long[] v2
                && IntStream.iterate(B - 1, j -> j >= 0, j -> j - 1).allMatch(j ->
                    (f[j] = rowCnt[j] > 0 ? rowSum[j] + vPrev[j] : fPrev[j]) > Long.MIN_VALUE
                    && (g[j] = colCnt[j] > 0 ? colSum[j] + v2[j + 1] : g[j + 1]) > Long.MIN_VALUE
                    && (v1[j] = Math.max(-g[j], rowSum[j] + vPrev[j])) > Long.MIN_VALUE && (v2[j] = Math.max(-f[j], colSum[j] + v2[j + 1])) > Long.MIN_VALUE)
                && IntStream.range(0, B + 2).allMatch(j -> (vPrev[j] = v1[j]) > Long.MIN_VALUE && (fPrev[j] = f[j]) > Long.MIN_VALUE) && (res[0] = f[0]) > Long.MIN_VALUE)
            ? res[0] > 0 ? "Break a heart" : res[0] < 0 ? "Cry" : "Flowers" : "");
    }
}

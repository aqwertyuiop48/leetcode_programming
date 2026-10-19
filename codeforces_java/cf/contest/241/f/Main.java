import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer m && Integer.valueOf(tk[1]) instanceof Integer n && Long.valueOf(tk[2]) instanceof Long k
            && IntStream.range(0, m * n).map(c -> tk[3 + c / n].charAt(c % n) == '#' ? -1 : Character.isDigit(tk[3 + c / n].charAt(c % n)) ? tk[3 + c / n].charAt(c % n) - '0' : 1).toArray() instanceof int[] cost
            && new int[26] instanceof int[] where && IntStream.range(0, m * n).allMatch(c -> !Character.isLetter(tk[3 + c / n].charAt(c % n)) || (where[tk[3 + c / n].charAt(c % n) - 'a'] = c) >= 0)
            && Integer.valueOf((Integer.parseInt(tk[3 + m]) - 1) * n + Integer.parseInt(tk[4 + m]) - 1) instanceof Integer st
            && Integer.valueOf((Integer.parseInt(tk[6 + m]) - 1) * n + Integer.parseInt(tk[7 + m]) - 1) instanceof Integer en
            && IntStream.concat(IntStream.of(st), IntStream.concat(tk[5 + m].chars().map(ch -> where[ch - 'a']), IntStream.of(en))).toArray() instanceof int[] pts
            && new HashMap<Integer, int[][]>() instanceof HashMap<Integer, int[][]> memo
            && new int[]{1, -1, 0, 0} instanceof int[] dr && new int[]{0, 0, 1, -1} instanceof int[] dc
            && (IntFunction<int[][]>) (u -> IntStream.generate(() -> Integer.MAX_VALUE).limit(m * n).toArray() instanceof int[] dist && new int[m * n] instanceof int[] par
                && new PriorityQueue<long[]>(Comparator.<long[]>comparingLong(x -> x[0]).thenComparingLong(x -> x[1])) instanceof PriorityQueue<long[]> pq
                && (dist[u] = 0) == 0 && pq.add(new long[]{0, u})
                && IntStream.iterate(0, z -> !pq.isEmpty(), z -> z + 1).allMatch(z -> pq.poll() instanceof long[] t && Integer.valueOf((int) t[1]) instanceof Integer x
                    && (t[0] != dist[x] || IntStream.range(0, 4).allMatch(d -> Integer.valueOf(x / n + dr[d]) instanceof Integer r2 && Integer.valueOf(x % n + dc[d]) instanceof Integer c2
                        && (r2 < 0 || r2 >= m || c2 < 0 || c2 >= n || cost[r2 * n + c2] < 0 || dist[x] + cost[x] >= dist[r2 * n + c2]
                            || (dist[r2 * n + c2] = dist[x] + cost[x]) >= 0 && (par[r2 * n + c2] = x) >= 0 && pq.add(new long[]{dist[r2 * n + c2], r2 * n + c2})))))
                ? new int[][]{dist, par} : null) instanceof IntFunction<int[][]> dijk
            && new long[]{k} instanceof long[] rem && new int[]{en} instanceof int[] res
            && (IntStream.range(0, pts.length - 1).anyMatch(i -> memo.computeIfAbsent(pts[i], u -> dijk.apply(u)) instanceof int[][] D
                && (rem[0] < D[0][pts[i + 1]]
                    ? (res[0] = IntStream.concat(IntStream.iterate(pts[i + 1], x -> x != pts[i], x -> D[1][x]), IntStream.of(pts[i])).boxed().filter(x -> D[0][x] <= rem[0]).max(Comparator.comparingInt(x -> D[0][x])).get()) >= 0
                    : (rem[0] -= D[0][pts[i + 1]]) < 0)) || true)
            ? (res[0] / n + 1) + " " + (res[0] % n + 1) : "");
    }
}

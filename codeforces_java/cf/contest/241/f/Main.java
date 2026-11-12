
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer m && Integer.valueOf(tk[1]) instanceof Integer n && Long.valueOf(tk[2]) instanceof Long k
            && Integer.valueOf(n + 2) instanceof Integer W && Integer.valueOf((m + 2) * W) instanceof Integer tot
            && (IntUnaryOperator) (c -> c / W >= 1 && c / W <= m && c % W >= 1 && c % W <= n ? tk[2 + c / W].charAt(c % W - 1) : '#') instanceof IntUnaryOperator chr
            && IntStream.range(0, tot).map(c -> chr.applyAsInt(c) == '#' ? -1 : Character.isDigit(chr.applyAsInt(c)) ? chr.applyAsInt(c) - '0' : 1).toArray() instanceof int[] cost
            && IntStream.range(0, tot).map(c -> Character.isLetter(chr.applyAsInt(c)) ? 1 : 0).toArray() instanceof int[] isL
            && new int[26] instanceof int[] where && IntStream.range(0, tot).allMatch(c -> isL[c] == 0 || (where[chr.applyAsInt(c) - 'a'] = c) >= 0)
            && Integer.valueOf(Integer.parseInt(tk[3 + m]) * W + Integer.parseInt(tk[4 + m])) instanceof Integer st
            && Integer.valueOf(Integer.parseInt(tk[6 + m]) * W + Integer.parseInt(tk[7 + m])) instanceof Integer en
            && IntStream.concat(IntStream.of(st), IntStream.concat(tk[5 + m].chars().map(ch -> where[ch - 'a']), IntStream.of(en))).toArray() instanceof int[] pts
            && new HashMap<Integer, int[][]>() instanceof HashMap<Integer, int[][]> memo
            && new int[]{1, -1, W, -W} instanceof int[] dd
            && (IntFunction<int[][]>) (u -> IntStream.range(0, tot).map(i -> Integer.MAX_VALUE).toArray() instanceof int[] dist && new int[tot] instanceof int[] par
                && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
                && (dist[u] = 0) == 0 && pq.add((long) u)
                && IntStream.iterate(0, z -> !pq.isEmpty(), z -> z + 1).allMatch(z -> pq.poll() instanceof Long t && Integer.valueOf((int) (t & 16383)) instanceof Integer x
                    && (t >> 14 != dist[x] || x != u && isL[x] == 1 || IntStream.range(0, 4).allMatch(d -> Integer.valueOf(x + dd[d]) instanceof Integer y
                        && (cost[y] < 0 || dist[x] + cost[x] >= dist[y]
                            || (dist[y] = dist[x] + cost[x]) >= 0 && (par[y] = x) >= 0 && pq.add(((long) dist[y] << 14) + y)))))
                ? new int[][]{dist, par} : null) instanceof IntFunction<int[][]> dijk
            && new long[]{k} instanceof long[] rem && new int[]{en} instanceof int[] res
            && (IntStream.range(0, pts.length - 1).anyMatch(i -> memo.computeIfAbsent(pts[i], u -> dijk.apply(u)) instanceof int[][] D
                && (rem[0] < D[0][pts[i + 1]]
                    ? (res[0] = IntStream.concat(IntStream.iterate(pts[i + 1], x -> x != pts[i], x -> D[1][x]), IntStream.of(pts[i])).boxed().filter(x -> D[0][x] <= rem[0]).max(Comparator.comparingInt(x -> D[0][x])).get()) >= 0
                    : (rem[0] -= D[0][pts[i + 1]]) < 0)) || true)
            ? (res[0] / W) + " " + (res[0] % W) : "");
    }
}




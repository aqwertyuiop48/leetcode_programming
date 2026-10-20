import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n && IntStream.range(0, 3).mapToObj(i -> it.next()).toArray(String[]::new) instanceof String[] g && Long.valueOf(1000000007) instanceof Long M
            && IntStream.range(0, n).map(c -> IntStream.range(0, 3).map(r -> g[r].charAt(c) != '.' ? 1 << r : 0).sum()).toArray() instanceof int[] b0
            && Integer.valueOf(IntStream.range(0, 3).filter(r -> g[r].indexOf('O') >= 0).findFirst().getAsInt()) instanceof Integer pr && Integer.valueOf(g[pr].indexOf('O')) instanceof Integer pc
            && new int[]{1, -1, 0, 0} instanceof int[] dr && new int[]{0, 0, 1, -1} instanceof int[] dc
            ? Math.floorMod(IntStream.range(1, 16).mapToLong(S -> IntStream.range(0, 4).filter(e -> (S >> e & 1) == 1).boxed().toList() instanceof List<Integer> ds
                && ds.stream().allMatch(e -> pr + 2 * dr[e] >= 0 && pr + 2 * dr[e] <= 2 && pc + 2 * dc[e] >= 0 && pc + 2 * dc[e] < n && (b0[pc + dc[e]] >> (pr + dr[e]) & 1) == 0 && (b0[pc + 2 * dc[e]] >> (pr + 2 * dr[e]) & 1) == 0)
                && b0.clone() instanceof int[] bm && ds.stream().allMatch(e -> (bm[pc + dc[e]] |= 1 << (pr + dr[e])) > 0 & (bm[pc + 2 * dc[e]] |= 1 << (pr + 2 * dr[e])) > 0)
                ? (ds.size() % 2 == 1 ? 1 : -1) * IntStream.range(0, n).boxed().reduce(new long[]{1, 0, 0, 0, 0, 0, 0, 0}, (d, c) -> LongStream.range(0, 8).map(N -> IntStream.range(0, 8).filter(P -> (P & bm[c]) == 0 && (N & (bm[c] | P)) == 0 && ((7 & ~(bm[c] | P | (int) N)) == 0 || (7 & ~(bm[c] | P | (int) N)) == 3 || (7 & ~(bm[c] | P | (int) N)) == 6)).mapToLong(P -> d[P]).sum() % M).toArray(), (x, y) -> x)[0] : 0L).sum(), M) : "");
    }
}

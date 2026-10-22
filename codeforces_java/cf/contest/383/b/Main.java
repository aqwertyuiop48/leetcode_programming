import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Long.valueOf(t[0]) instanceof Long n && Integer.valueOf((int) t[1]) instanceof Integer m
            && IntStream.range(0, m).mapToLong(i -> t[2 + 2 * i] << 32 | t[3 + 2 * i]).sorted().boxed().collect(Collectors.groupingBy(k -> k >> 32, TreeMap::new, Collectors.mapping(k -> k & 0xffffffffL, Collectors.toList()))) instanceof TreeMap<Long, List<Long>> rows
            && rows.entrySet().stream().reduce(new Object[]{0L, new long[]{1}, new long[]{1}}, (st, e) -> st[0] instanceof Long last && st[1] instanceof long[] S && st[2] instanceof long[] E && e.getValue() instanceof List<Long> cols
                && (last + 1 < e.getKey() && S.length > 0 ? new long[][]{{S[0]}, {n}} : new long[][]{S, E}) instanceof long[][] cur
                && IntStream.rangeClosed(0, cols.size()).mapToObj(i -> new long[]{i == 0 ? 1 : cols.get(i - 1) + 1, i == cols.size() ? n : cols.get(i) - 1}).filter(sg -> sg[0] <= sg[1])
                    .map(sg -> Integer.valueOf(Arrays.binarySearch(cur[1], sg[0])) instanceof Integer b0 && Integer.valueOf(b0 >= 0 ? b0 : -b0 - 1) instanceof Integer p && p < cur[1].length && cur[0][p] <= sg[1] ? new long[]{Math.max(sg[0], cur[0][p]), sg[1]} : null)
                    .filter(Objects::nonNull).toList() instanceof List<long[]> pr
                ? new Object[]{e.getKey(), pr.stream().mapToLong(x -> x[0]).toArray(), pr.stream().mapToLong(x -> x[1]).toArray()} : null, (x, y) -> x) instanceof Object[] fin
            && fin[0] instanceof Long last && fin[1] instanceof long[] S && fin[2] instanceof long[] E
            ? (S.length > 0 && (last < n || E[E.length - 1] == n) ? 2 * n - 2 : -1) : "");
    }
}

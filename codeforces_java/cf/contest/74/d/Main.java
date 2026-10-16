import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Long.valueOf(s.nextLong()) instanceof Long n
                && Integer.valueOf(s.nextInt()) instanceof Integer q
                && new TreeSet<Long>() instanceof TreeSet<Long> occ
                && new TreeSet<long[]>(Comparator.<long[]>comparingLong(g -> -((g[1] - g[0]) / 2)).thenComparingLong(g -> -(g[0] + (g[1] - g[0] + 1) / 2))) instanceof TreeSet<long[]> gaps
                && gaps.add(new long[]{0, n + 1})
                && new HashMap<Integer, Long>() instanceof HashMap<Integer, Long> where
                && IntStream.range(0, q).mapToObj(i ->
                    Integer.valueOf(s.nextInt()) instanceof Integer id
                    ? (id == 0
                        ? new long[]{0, s.nextLong(), s.nextLong()}
                        : where.containsKey(id)
                            ? (Long.valueOf(where.remove(id)) instanceof Long p
                                && Long.valueOf(occ.lower(p) == null ? 0L : occ.lower(p)) instanceof Long l
                                && Long.valueOf(occ.higher(p) == null ? n + 1 : occ.higher(p)) instanceof Long r
                                && occ.remove(p)
                                && (gaps.remove(new long[]{l, p}) || true)
                                && (gaps.remove(new long[]{p, r}) || true)
                                && gaps.add(new long[]{l, r})
                                ? new long[]{2, p, 0}
                                : null)
                            : (gaps.pollFirst() instanceof long[] g
                                && Long.valueOf(g[0] + (g[1] - g[0] + 1) / 2) instanceof Long p
                                && occ.add(p)
                                && where.put(id, p) == null
                                && Stream.of(new long[]{g[0], p}, new long[]{p, g[1]}).filter(x -> x[1] - x[0] >= 2).allMatch(gaps::add)
                                ? new long[]{1, p, 0}
                                : null))
                    : null).toList() instanceof List<long[]> ev
                && ev.stream().filter(e -> e[0] != 0).mapToLong(e -> e[1]).sorted().distinct().toArray() instanceof long[] ps
                && new int[ps.length + 1] instanceof int[] bit
                && ((IntUnaryOperator) k -> IntStream.iterate(k, v -> v > 0, v -> v - (v & -v)).map(v -> bit[v]).sum()) instanceof IntUnaryOperator pre
                && ((LongToIntFunction) x -> Integer.valueOf(Arrays.binarySearch(ps, x)) instanceof Integer r ? (r >= 0 ? r + 1 : -r - 1) : 0) instanceof LongToIntFunction le
                ? ev.stream()
                    .map(e -> e[0] == 0
                        ? String.valueOf(pre.applyAsInt(le.applyAsInt(e[2])) - pre.applyAsInt(le.applyAsInt(e[1] - 1)))
                        : IntStream.iterate(le.applyAsInt(e[1]), v -> v <= ps.length, v -> v + (v & -v)).map(v -> bit[v] += e[0] == 1 ? 1 : -1).sum() == Integer.MIN_VALUE ? "" : null)
                    .filter(Objects::nonNull)
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}




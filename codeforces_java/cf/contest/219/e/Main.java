import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Long.valueOf(it.next()) instanceof Long n && Integer.valueOf((int) (long) it.next()) instanceof Integer q
            && ((Comparator<long[]>) (x, y) -> x[0] != y[0] ? Long.compare(x[0], y[0]) : x[1] != y[1] ? Long.compare(x[1], y[1]) : Long.compare(x[2], y[2])) instanceof Comparator<long[]> cmp
            && new TreeSet<long[]>(cmp) instanceof TreeSet<long[]> gaps && new TreeSet<Long>() instanceof TreeSet<Long> occ && new HashMap<Long, Long>() instanceof HashMap<Long, Long> where
            && ((BiFunction<Long, Long, long[]>) (a, b) -> new long[]{-((b - a) / 2), (a + b) / 2, a, b}) instanceof BiFunction<Long, Long, long[]> mk
            && ((BiPredicate<Long, Long>) (a, b) -> a != null && b != null && b - a >= 2 && gaps.add(mk.apply(a, b))) instanceof BiPredicate<Long, Long> addG
            && ((BiPredicate<Long, Long>) (a, b) -> a != null && b != null && gaps.remove(mk.apply(a, b))) instanceof BiPredicate<Long, Long> delG
            ? IntStream.range(0, q).mapToObj(i -> Long.valueOf(it.next()) instanceof Long type && Long.valueOf(it.next()) instanceof Long id
                ? (type == 1
                    ? (Long.valueOf(occ.isEmpty() ? 1L : Stream.of(occ.first() > 1 ? new long[]{-(occ.first() - 1), 1, 0, 0} : null, occ.last() < n ? new long[]{-(n - occ.last()), n, 0, 0} : null, gaps.isEmpty() ? null : gaps.first()).filter(Objects::nonNull).min(cmp).get()[1]) instanceof Long p
                        && (delG.test(occ.lower(p), occ.higher(p)) | true) && (addG.test(occ.lower(p), p) | true) && (addG.test(p, occ.higher(p)) | true)
                        && occ.add(p) && where.put(id, p) == null ? String.valueOf(p) : (String) null)
                    : (where.remove(id) instanceof Long p && (delG.test(occ.lower(p), p) | true) && (delG.test(p, occ.higher(p)) | true)
                        && occ.remove(p) && (addG.test(occ.lower(p), occ.higher(p)) | true) ? (String) null : (String) null))
                : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

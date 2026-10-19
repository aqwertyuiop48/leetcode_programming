import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Long.parseLong((String) t)).iterator() instanceof Iterator<Long> it
            && Integer.valueOf((int) (long) it.next()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new long[]{it.next(), it.next()}).toList() instanceof List<long[]> pts0
            && Integer.valueOf((int) (long) it.next() - 1) instanceof Integer s0 && Integer.valueOf((int) (long) it.next() - 1) instanceof Integer t0
            && Integer.valueOf(IntStream.range(0, n).mapToObj(i -> BigInteger.valueOf(pts0.get(i)[0] * pts0.get((i + 1) % n)[1] - pts0.get((i + 1) % n)[0] * pts0.get(i)[1])).reduce(BigInteger.ZERO, BigInteger::add).signum()) instanceof Integer sg
            && IntStream.range(0, n).mapToLong(i -> pts0.get(sg > 0 ? i : n - 1 - i)[0]).toArray() instanceof long[] x
            && IntStream.range(0, n).mapToLong(i -> pts0.get(sg > 0 ? i : n - 1 - i)[1]).toArray() instanceof long[] y
            && Integer.valueOf(sg > 0 ? s0 : n - 1 - s0) instanceof Integer s && Integer.valueOf(sg > 0 ? t0 : n - 1 - t0) instanceof Integer t
            && IntStream.range(0, n).filter(i -> x[i] != x[(i + 1) % n]).mapToObj(i -> x[i] < x[(i + 1) % n] ? new long[]{x[i], y[i], x[(i + 1) % n], y[(i + 1) % n], i} : new long[]{x[(i + 1) % n], y[(i + 1) % n], x[i], y[i], i}).toList() instanceof List<long[]> segs
            && segs.stream().sorted(Comparator.comparingLong(a -> a[0])).toList() instanceof List<long[]> byL
            && segs.stream().sorted(Comparator.comparingLong(a -> a[2])).toList() instanceof List<long[]> byR
            && ((Comparator<long[]>) new Comparator<long[]>() {
                public int compare(long[] a, long[] b) {
                    return a[4] == b[4] ? 0 : b[4] < 0 && a[4] >= 0 ? -Long.signum((a[2] - a[0]) * (b[1] - a[1]) - (a[3] - a[1]) * (b[0] - a[0]))
                        : a[4] < 0 && b[4] >= 0 ? Long.signum((b[2] - b[0]) * (a[1] - b[1]) - (b[3] - b[1]) * (a[0] - b[0]))
                        : a[0] > b[0] ? -compare(b, a)
                        : (Long.valueOf((a[2] - a[0]) * (b[1] - a[1]) - (a[3] - a[1]) * (b[0] - a[0])) instanceof Long c && c != 0 ? -Long.signum(c) : -Long.signum((a[2] - a[0]) * (b[3] - a[1]) - (a[3] - a[1]) * (b[2] - a[0])));
                }
            }) instanceof Comparator<long[]> cmp
            && new TreeSet<long[]>(cmp) instanceof TreeSet<long[]> tree
            && new double[3 * n] instanceof double[] nx && new double[3 * n] instanceof double[] ny
            && IntStream.range(0, n).allMatch(i -> (nx[i] = x[i]) * 0 == 0 && (ny[i] = y[i]) * 0 == 0)
            && new int[]{n, 0, 0} instanceof int[] ptr
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ex
            && IntStream.range(0, 3 * n).mapToObj(i -> new ArrayList<double[]>()).toList() instanceof List<ArrayList<double[]>> adj
            && ((BiPredicate<Integer, Integer>) (v, dy) -> Integer.valueOf((v + 1) % n) instanceof Integer q && Integer.valueOf((v + n - 1) % n) instanceof Integer p
                && Long.valueOf(x[q] - x[v]) instanceof Long ax && Long.valueOf(y[q] - y[v]) instanceof Long ay && Long.valueOf(x[p] - x[v]) instanceof Long bx && Long.valueOf(y[p] - y[v]) instanceof Long by
                && Long.valueOf(ax * by - ay * bx) instanceof Long cr
                ? (cr > 0 ? ax * dy > 0 && -dy * bx > 0 : cr < 0 ? !(bx * dy >= 0 && -dy * ax >= 0) : ax * dy > 0) : false) instanceof BiPredicate<Integer, Integer> inside
            && ((BiFunction<long[], Long, Integer>) (sg2, X) -> Integer.valueOf(ptr[0]++) instanceof Integer id && (nx[id] = X) > -1e300 && (ny[id] = sg2[1] + (double) (sg2[3] - sg2[1]) * (X - sg2[0]) / (sg2[2] - sg2[0])) > -1e300 && ex.get((int) sg2[4]).add(id) ? id : -1) instanceof BiFunction<long[], Long, Integer> mk
            && ((BiConsumer<Integer, Integer>) (from, to) -> adj.get(from).add(new double[]{to, Math.abs(ny[from] - ny[to])})) instanceof BiConsumer<Integer, Integer> desc
            && IntStream.range(0, n).boxed().sorted(Comparator.<Integer>comparingLong(i -> x[i]).thenComparingLong(i -> y[i])).collect(Collectors.groupingBy(i -> x[i], TreeMap::new, Collectors.toList())) instanceof TreeMap<Long, List<Integer>> groups
            && groups.entrySet().stream().allMatch(en -> Long.valueOf(en.getKey()) instanceof Long X && en.getValue() instanceof List<Integer> g
                && Stream.generate(() -> byR.get(ptr[2]++)).limit(0).count() == 0
                && IntStream.iterate(0, i -> i < 1, i -> i + 1).allMatch(zz -> (Stream.iterate(0, o -> ptr[2] < byR.size() && byR.get(ptr[2])[2] == X, o -> o + 1).allMatch(o -> tree.remove(byR.get(ptr[2]++)) | true)) | true)
                && IntStream.range(0, g.size()).allMatch(k -> Integer.valueOf(g.get(k)) instanceof Integer v && new long[]{X, y[v], X, y[v], -1} instanceof long[] pr
                    && ((inside.test(v, 1) ? (Integer.valueOf(tree.higher(pr) == null ? g.get(k + 1) : k + 1 >= g.size() ? mk.apply(tree.higher(pr), X) : (tree.higher(pr)[2] - tree.higher(pr)[0]) * (y[g.get(k + 1)] - tree.higher(pr)[1]) - (tree.higher(pr)[3] - tree.higher(pr)[1]) * (X - tree.higher(pr)[0]) < 0 ? g.get(k + 1) : mk.apply(tree.higher(pr), X)) instanceof Integer u && (desc.accept(u, v) | true) ? true : true) : true)
                    && (inside.test(v, -1) ? (Integer.valueOf(tree.lower(pr) == null ? g.get(k - 1) : k == 0 ? mk.apply(tree.lower(pr), X) : (tree.lower(pr)[2] - tree.lower(pr)[0]) * (y[g.get(k - 1)] - tree.lower(pr)[1]) - (tree.lower(pr)[3] - tree.lower(pr)[1]) * (X - tree.lower(pr)[0]) > 0 ? g.get(k - 1) : mk.apply(tree.lower(pr), X)) instanceof Integer u && (desc.accept(v, u) | true) ? true : true) : true)))
                && Stream.iterate(0, o -> ptr[1] < byL.size() && byL.get(ptr[1])[0] == X, o -> o + 1).allMatch(o -> tree.add(byL.get(ptr[1]++)) | true))
            ? "" : "");
    }
}

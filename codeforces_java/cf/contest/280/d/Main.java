import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).iterator() instanceof PrimitiveIterator.OfInt it
            && Integer.valueOf(it.nextInt()) instanceof Integer n && IntStream.range(0, n).map(i -> it.nextInt()).toArray() instanceof int[] a
            && new int[4 * n][][] instanceof int[][][] nd && new boolean[4 * n] instanceof boolean[] lz
            && IntStream.range(0, 4 * n).allMatch(i -> (nd[i] = new int[][]{new int[8], new int[8]}) != null)
            && ((Predicate<int[][]>) q -> q[0] instanceof int[] o && q[1] instanceof int[] x && q[2] instanceof int[] y
                && (o[0] = x[0] + y[0]) != Integer.MIN_VALUE
                && (o[1] = x[0] + y[1] > x[1] ? x[0] + y[1] : x[1]) != Integer.MIN_VALUE && (o[2] = x[0] + y[1] > x[1] ? y[2] : x[2]) != Integer.MIN_VALUE
                && (o[3] = y[0] + x[3] > y[3] ? y[0] + x[3] : y[3]) != Integer.MIN_VALUE && (o[4] = y[0] + x[3] > y[3] ? x[4] : y[4]) != Integer.MIN_VALUE
                && (o[5] = Math.max(Math.max(x[5], y[5]), x[3] + y[1])) != Integer.MIN_VALUE
                && (o[6] = x[3] + y[1] == o[5] ? x[4] : x[5] == o[5] ? x[6] : y[6]) != Integer.MIN_VALUE && (o[7] = x[3] + y[1] == o[5] ? y[2] : x[5] == o[5] ? x[7] : y[7]) != Integer.MIN_VALUE) instanceof Predicate<int[][]> mg
            && ((IntPredicate) v -> Collections.swap(Arrays.asList(nd[v]), 0, 1) instanceof Object && (lz[v] = !lz[v]) | true) instanceof IntPredicate flip
            && ((IntPredicate) v -> !lz[v] || flip.test(2 * v) && flip.test(2 * v + 1) && !(lz[v] = false)) instanceof IntPredicate push
            && ((IntPredicate) v -> mg.test(new int[][]{nd[v][0], nd[2 * v][0], nd[2 * v + 1][0]}) && mg.test(new int[][]{nd[v][1], nd[2 * v][1], nd[2 * v + 1][1]})) instanceof IntPredicate pull
            && ((BiPredicate<Integer, int[]>) (v, p) -> IntStream.range(0, 2).allMatch(t -> new int[]{(t == 0 ? 1 : -1) * p[1], p[0], p[0]} instanceof int[] z
                && (nd[v][t][0] = z[0]) != Integer.MIN_VALUE && (nd[v][t][1] = z[0]) != Integer.MIN_VALUE && (nd[v][t][2] = z[1]) >= 0 && (nd[v][t][3] = z[0]) != Integer.MIN_VALUE
                && (nd[v][t][4] = z[1]) >= 0 && (nd[v][t][5] = z[0]) != Integer.MIN_VALUE && (nd[v][t][6] = z[1]) >= 0 && (nd[v][t][7] = z[1]) >= 0)) instanceof BiPredicate<Integer, int[]> setLeaf
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> build
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> upd
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> frange
            && new AtomicReference<Function<int[], int[]>>() instanceof AtomicReference<Function<int[], int[]>> qry
            && build.compareAndSet(null, p -> p[1] == p[2] ? setLeaf.test(p[0], new int[]{p[1], a[p[1]]})
                : build.get().apply(new int[]{2 * p[0], p[1], (p[1] + p[2]) / 2}) && build.get().apply(new int[]{2 * p[0] + 1, (p[1] + p[2]) / 2 + 1, p[2]}) && pull.test(p[0]))
            && upd.compareAndSet(null, p -> p[1] == p[2] ? setLeaf.test(p[0], new int[]{p[1], p[3]})
                : push.test(p[0]) && upd.get().apply(p[3 + 0] >= Integer.MIN_VALUE && p[4] <= (p[1] + p[2]) / 2 ? new int[]{2 * p[0], p[1], (p[1] + p[2]) / 2, p[3], p[4]} : new int[]{2 * p[0] + 1, (p[1] + p[2]) / 2 + 1, p[2], p[3], p[4]}) && pull.test(p[0]))
            && frange.compareAndSet(null, p -> p[3] <= p[1] && p[2] <= p[4] ? flip.test(p[0])
                : push.test(p[0]) && (p[3] > (p[1] + p[2]) / 2 || frange.get().apply(new int[]{2 * p[0], p[1], (p[1] + p[2]) / 2, p[3], p[4]})) && (p[4] <= (p[1] + p[2]) / 2 || frange.get().apply(new int[]{2 * p[0] + 1, (p[1] + p[2]) / 2 + 1, p[2], p[3], p[4]})) && pull.test(p[0]))
            && qry.compareAndSet(null, p -> p[3] <= p[1] && p[2] <= p[4] ? nd[p[0]][0]
                : push.test(p[0]) && (p[3] > (p[1] + p[2]) / 2 ? qry.get().apply(new int[]{2 * p[0] + 1, (p[1] + p[2]) / 2 + 1, p[2], p[3], p[4]}) : p[4] <= (p[1] + p[2]) / 2 ? qry.get().apply(new int[]{2 * p[0], p[1], (p[1] + p[2]) / 2, p[3], p[4]})
                    : new int[8] instanceof int[] o && mg.test(new int[][]{o, qry.get().apply(new int[]{2 * p[0], p[1], (p[1] + p[2]) / 2, p[3], p[4]}), qry.get().apply(new int[]{2 * p[0] + 1, (p[1] + p[2]) / 2 + 1, p[2], p[3], p[4]})}) ? o : null) instanceof int[] r ? r : null)
            && build.get().apply(new int[]{1, 0, n - 1})
            && Integer.valueOf(it.nextInt()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(qi -> it.nextInt() == 0
                ? Integer.valueOf(it.nextInt() - 1) instanceof Integer i && Integer.valueOf(it.nextInt()) instanceof Integer v && upd.get().apply(new int[]{1, 0, n - 1, v, i}) ? (String) null : (String) null
                : Integer.valueOf(it.nextInt() - 1) instanceof Integer l && Integer.valueOf(it.nextInt() - 1) instanceof Integer r && Integer.valueOf(it.nextInt()) instanceof Integer k
                    && new ArrayList<int[]>() instanceof ArrayList<int[]> done && new long[]{0} instanceof long[] ans
                    && IntStream.range(0, k).allMatch(z -> qry.get().apply(new int[]{1, 0, n - 1, l, r}) instanceof int[] res && res[5] > 0
                        && (ans[0] += res[5]) > 0 && done.add(new int[]{res[6], res[7]}) && frange.get().apply(new int[]{1, 0, n - 1, res[6], res[7]})) | true
                    && done.stream().allMatch(d -> frange.get().apply(new int[]{1, 0, n - 1, d[0], d[1]}))
                    ? String.valueOf(ans[0]) : (String) null).filter(Objects::nonNull).collect(Collectors.joining("\n")) : "");
    }
}

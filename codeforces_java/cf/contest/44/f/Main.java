import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(h -> System.out.println(
            IntStream.range(0, h[2]).mapToObj(i -> Optional.of(new double[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).map(q -> q[0] > q[2] || (q[0] == q[2] && q[1] > q[3]) ? new double[]{q[2], q[3], q[0], q[1]} : q).get()).toArray(double[][]::new) instanceof double[][] sg
            && ((DoubleBinaryOperator) (k, x) -> sg[(int) k][1] + (sg[(int) k][3] - sg[(int) k][1]) * (x - sg[(int) k][0]) / (sg[(int) k][2] - sg[(int) k][0])) instanceof DoubleBinaryOperator yAt
            && ((ToDoubleBiFunction<Integer, double[]>) (k, p) -> (sg[k][2] - sg[k][0]) * (p[1] - sg[k][1]) - (sg[k][3] - sg[k][1]) * (p[0] - sg[k][0])) instanceof ToDoubleBiFunction<Integer, double[]> sd
            && ((BiPredicate<Integer, double[]>) (k, p) -> sd.applyAsDouble(k, p) == 0 && Math.min(sg[k][0], sg[k][2]) <= p[0] && p[0] <= Math.max(sg[k][0], sg[k][2]) && Math.min(sg[k][1], sg[k][3]) <= p[1] && p[1] <= Math.max(sg[k][1], sg[k][3])) instanceof BiPredicate<Integer, double[]> on
            && ((BiPredicate<Integer, Integer>) (k, l) -> Math.signum(sd.applyAsDouble(k, new double[]{sg[l][0], sg[l][1]})) * Math.signum(sd.applyAsDouble(k, new double[]{sg[l][2], sg[l][3]})) < 0
                && Math.signum(sd.applyAsDouble(l, new double[]{sg[k][0], sg[k][1]})) * Math.signum(sd.applyAsDouble(l, new double[]{sg[k][2], sg[k][3]})) < 0
                || on.test(k, new double[]{sg[l][0], sg[l][1]}) || on.test(k, new double[]{sg[l][2], sg[l][3]}) || on.test(l, new double[]{sg[k][0], sg[k][1]}) || on.test(l, new double[]{sg[k][2], sg[k][3]})) instanceof BiPredicate<Integer, Integer> touch
            && IntStream.range(0, h[2]).toArray() instanceof int[] us
            && ((BiFunction<int[], Integer, Integer>) (u, x) -> IntStream.iterate(x, y -> u[y] != y, y -> u[y]).map(y -> u[y]).reduce((p, q) -> q).orElse(x)) instanceof BiFunction<int[], Integer, Integer> find
            && IntStream.range(0, h[2]).allMatch(k -> IntStream.range(k + 1, h[2]).filter(l -> touch.test(k, l)).allMatch(l -> (us[find.apply(us, k)] = find.apply(us, l)) >= 0))
            && DoubleStream.concat(DoubleStream.of(0, h[0]), DoubleStream.concat(Arrays.stream(sg).flatMapToDouble(q -> DoubleStream.of(q[0], q[2])),
                IntStream.range(0, h[2]).boxed().flatMapToDouble(k -> IntStream.range(k + 1, h[2]).mapToDouble(l -> Optional.of((sg[k][2] - sg[k][0]) * (sg[l][3] - sg[l][1]) - (sg[k][3] - sg[k][1]) * (sg[l][2] - sg[l][0]))
                    .map(d -> d == 0 ? Double.NaN : Optional.of(new double[]{((sg[l][0] - sg[k][0]) * (sg[l][3] - sg[l][1]) - (sg[l][1] - sg[k][1]) * (sg[l][2] - sg[l][0])) / d, ((sg[l][0] - sg[k][0]) * (sg[k][3] - sg[k][1]) - (sg[l][1] - sg[k][1]) * (sg[k][2] - sg[k][0])) / d})
                        .map(t -> t[0] >= -1e-9 && t[0] <= 1 + 1e-9 && t[1] >= -1e-9 && t[1] <= 1 + 1e-9 ? sg[k][0] + t[0] * (sg[k][2] - sg[k][0]) : Double.NaN).get()).get()).filter(v -> !Double.isNaN(v))))).sorted().toArray() instanceof double[] cand
            && IntStream.range(0, cand.length).filter(i -> i == 0 || cand[i] - cand[i - 1] > 1e-9).mapToDouble(i -> cand[i]).toArray() instanceof double[] xs
            && Integer.valueOf(xs.length - 1) instanceof Integer S
            && IntStream.range(0, S).mapToObj(i -> IntStream.range(0, h[2]).filter(k -> sg[k][0] < sg[k][2] && sg[k][0] <= xs[i] + 1e-9 && sg[k][2] >= xs[i + 1] - 1e-9).boxed()
                .sorted(Comparator.comparingDouble((Integer k) -> yAt.applyAsDouble(k, (xs[i] + xs[i + 1]) / 2))).mapToInt(k -> k).toArray()).toArray(int[][]::new) instanceof int[][] cr
            && IntStream.rangeClosed(0, S).map(i -> IntStream.range(0, i).map(j -> cr[j].length + 1).sum()).toArray() instanceof int[] base
            && Integer.valueOf(base[S]) instanceof Integer C
            && new int[C] instanceof int[] cs
            && new int[C] instanceof int[] cg
            && IntStream.range(0, S).allMatch(i -> IntStream.rangeClosed(0, cr[i].length).allMatch(g -> (cs[base[i] + g] = i) >= 0 && (cg[base[i] + g] = g) >= 0))
            && ((ToDoubleBiFunction<Integer, Double>) (c, x) -> cg[c] == 0 ? 0 : yAt.applyAsDouble(cr[cs[c]][cg[c] - 1], x)) instanceof ToDoubleBiFunction<Integer, Double> lo
            && ((ToDoubleBiFunction<Integer, Double>) (c, x) -> cg[c] == cr[cs[c]].length ? h[1] : yAt.applyAsDouble(cr[cs[c]][cg[c]], x)) instanceof ToDoubleBiFunction<Integer, Double> hi
            && new double[C] instanceof double[] ll
            && new double[C] instanceof double[] lh
            && new double[C] instanceof double[] rl
            && new double[C] instanceof double[] rh
            && new double[C] instanceof double[] ar
            && IntStream.range(0, C).allMatch(c -> (ll[c] = lo.applyAsDouble(c, xs[cs[c]])) >= -1 && (lh[c] = hi.applyAsDouble(c, xs[cs[c]])) >= -1 && (rl[c] = lo.applyAsDouble(c, xs[cs[c] + 1])) >= -1 && (rh[c] = hi.applyAsDouble(c, xs[cs[c] + 1])) >= -1
                && (ar[c] = (lh[c] - ll[c] + rh[c] - rl[c]) / 2 * (xs[cs[c] + 1] - xs[cs[c]])) >= -1)
            && IntStream.range(0, C).toArray() instanceof int[] uf
            && IntStream.range(0, S - 1).allMatch(i -> IntStream.range(0, h[2]).filter(k -> sg[k][0] == sg[k][2] && Math.abs(sg[k][0] - xs[i + 1]) < 1e-9).boxed().sorted(Comparator.comparingDouble((Integer k) -> sg[k][1])).toList() instanceof List<Integer> vs
                && IntStream.rangeClosed(0, cr[i].length).allMatch(ga -> IntStream.rangeClosed(0, cr[i + 1].length).filter(gb -> Optional.of(new double[]{Math.max(rl[base[i] + ga], ll[base[i + 1] + gb]), Math.min(rh[base[i] + ga], lh[base[i + 1] + gb])})
                    .map(r -> r[1] - r[0] > 1e-9 && vs.stream().reduce(r[0], (cur, k) -> sg[k][1] <= cur + 1e-9 ? Math.max(cur, sg[k][3]) : cur, (p, q) -> p) < r[1] - 1e-9).get())
                    .allMatch(gb -> (uf[find.apply(uf, base[i] + ga)] = find.apply(uf, base[i + 1] + gb)) >= 0)))
            && new HashMap<Integer, Set<Integer>>() instanceof HashMap<Integer, Set<Integer>> adj
            && ((BiPredicate<Integer, Integer>) (u, v) -> (adj.computeIfAbsent(u, z -> new HashSet<>()).add(v) & adj.computeIfAbsent(v, z -> new HashSet<>()).add(u)) | true) instanceof BiPredicate<Integer, Integer> link
            && IntStream.range(0, S).allMatch(i -> IntStream.range(0, cr[i].length).allMatch(j -> link.test(find.apply(uf, base[i] + j), C + find.apply(us, cr[i][j])) && link.test(find.apply(uf, base[i] + j + 1), C + find.apply(us, cr[i][j]))))
            && IntStream.range(0, h[2]).filter(k -> sg[k][0] == sg[k][2]).allMatch(k -> IntStream.range(1, S).filter(i -> Math.abs(xs[i] - sg[k][0]) < 1e-9).allMatch(i ->
                IntStream.rangeClosed(0, cr[i - 1].length).filter(ga -> Math.min(rh[base[i - 1] + ga], sg[k][3]) - Math.max(rl[base[i - 1] + ga], sg[k][1]) > 1e-9).allMatch(ga -> link.test(find.apply(uf, base[i - 1] + ga), C + find.apply(us, k)))
                && IntStream.rangeClosed(0, cr[i].length).filter(gb -> Math.min(lh[base[i] + gb], sg[k][3]) - Math.max(ll[base[i] + gb], sg[k][1]) > 1e-9).allMatch(gb -> link.test(find.apply(uf, base[i] + gb), C + find.apply(us, k)))))
            && new HashMap<Integer, String>() instanceof HashMap<Integer, String> col
            && ((Function<Integer, String>) u -> col.getOrDefault(u, u >= C ? "black" : "white")) instanceof Function<Integer, String> colOf
            && IntStream.range(0, s.nextInt()).allMatch(f -> Optional.of(new double[]{s.nextInt(), s.nextInt()}).map(pt -> Optional.of(s.next()).map(nc ->
                Integer.valueOf(IntStream.range(0, h[2]).filter(k -> on.test(k, pt)).map(k -> C + find.apply(us, k)).findFirst().orElseGet(() -> find.apply(uf, Optional.of(IntStream.range(0, S).filter(j -> xs[j] <= pt[0] + 1e-9).max().getAsInt())
                    .map(i -> base[i] + (int) Arrays.stream(cr[i]).filter(k -> yAt.applyAsDouble(k, pt[0]) < pt[1]).count()).get()))) instanceof Integer u0
                && Optional.of(colOf.apply(u0)).map(old -> old.equals(nc) || (Objects.isNull(col.put(u0, nc)) | true) && new ArrayDeque<Integer>(List.of(u0)) instanceof ArrayDeque<Integer> q
                    && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> adj.getOrDefault(u, Set.of()).stream().filter(w -> colOf.apply(w).equals(old)).allMatch(w -> (Objects.isNull(col.put(w, nc)) | true) && q.add(w)))).get()).get()).get())
            && new double[C] instanceof double[] fa
            && IntStream.range(0, C).allMatch(c -> (fa[find.apply(uf, c)] += ar[c]) >= 0)
            && new TreeMap<String, Double>() instanceof TreeMap<String, Double> res
            && IntStream.range(0, C).filter(c -> find.apply(uf, c) == c).allMatch(c -> res.merge(colOf.apply(c), fa[c], Double::sum) >= 0)
            && IntStream.range(0, h[2]).filter(k -> find.apply(us, k) == k).allMatch(k -> res.merge(colOf.apply(C + k), 0.0, Double::sum) >= 0)
            ? res.entrySet().stream().map(e -> String.format(Locale.US, "%s %.8f", e.getKey(), e.getValue())).collect(Collectors.joining("\n"))
            : "")));
    }
}




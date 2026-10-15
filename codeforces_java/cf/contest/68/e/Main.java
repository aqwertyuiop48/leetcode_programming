import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(IntStream.range(0, 4).mapToObj(i -> IntStream.range(0, 6).mapToDouble(j -> s.nextInt()).toArray()).toArray(double[][]::new)).ifPresent(T ->
            Optional.of((BiFunction<double[], double[], Double>) (a, b) -> Math.hypot(a[0] - b[0], a[1] - b[1])).ifPresent(dd ->
            Optional.of((BiFunction<Integer, Integer, double[]>) (i, k) -> new double[]{T[i][2 * k], T[i][2 * k + 1]}).ifPresent(tv ->
            Optional.of((BiFunction<Integer, List<double[]>, Stream<List<double[]>>>) (i, set) -> Optional.of(set.size()).map(n -> IntStream.range(0, n * n * 18)
                .filter(c -> c / 18 / n != c / 18 % n && c / 2 % 9 / 3 != c / 2 % 9 % 3
                    && Math.abs(dd.apply(set.get(c / 18 / n), set.get(c / 18 % n)) - dd.apply(tv.apply(i, c / 2 % 9 / 3), tv.apply(i, c / 2 % 9 % 3))) < 1e-7)
                .mapToObj(c -> Optional.of(set.get(c / 18 / n)).map(p -> Optional.of(set.get(c / 18 % n)).map(q -> Optional.of(c / 2 % 9 / 3).map(u -> Optional.of(c / 2 % 9 % 3).map(v ->
                    Optional.of(dd.apply(p, q)).map(d -> Optional.of(dd.apply(tv.apply(i, u), tv.apply(i, 3 - u - v))).map(r1 -> Optional.of(dd.apply(tv.apply(i, v), tv.apply(i, 3 - u - v))).map(r2 ->
                    Optional.of((r1 * r1 - r2 * r2 + d * d) / (2 * d)).map(a -> new double[]{
                        p[0] + a * (q[0] - p[0]) / d - (1 - 2 * (c % 2)) * Math.sqrt(Math.max(0, r1 * r1 - a * a)) * (q[1] - p[1]) / d,
                        p[1] + a * (q[1] - p[1]) / d + (1 - 2 * (c % 2)) * Math.sqrt(Math.max(0, r1 * r1 - a * a)) * (q[0] - p[0]) / d}).get()).get()).get()).get()).get()).get()).get()).get())
                .map(w -> set.stream().anyMatch(x -> dd.apply(x, w) < 1e-7) ? set : Stream.concat(set.stream(), Stream.of(w)).collect(Collectors.toList()))).get()).ifPresent(place ->
            Optional.of((Function<List<double[]>, String>) set -> set.stream().map(pt -> Math.round(pt[0] * 1e4) + "," + Math.round(pt[1] * 1e4)).sorted().collect(Collectors.joining("|"))).ifPresent(key ->
            Optional.of(new ArrayList<List<List<double[]>>>(Collections.<List<List<double[]>>>nCopies(16, null))).ifPresent(S ->
            Optional.of((Function<List<double[]>, Boolean>) ds -> true).ifPresent(unused ->
            Optional.of((Function<List<double[]>, double[]>) set -> IntStream.range(0, set.size() * set.size()).filter(c -> c / set.size() < c % set.size())
                .mapToDouble(c -> dd.apply(set.get(c / set.size()), set.get(c % set.size()))).map(x -> Math.round(x * 1e6) / 1e6).distinct().toArray()).ifPresent(dists ->
            Optional.of((Function<List<double[]>, Boolean>) ds -> ds.stream().reduce(Collections.<double[]>singletonList(new double[]{0, 0}),
                (st, arr) -> st.stream().flatMap(t -> Arrays.stream(arr).mapToObj(x -> new double[]{t[0] + x, Math.max(t[1], x)})).collect(Collectors.toList()),
                (x, y) -> x).stream().anyMatch(t -> 2 * t[1] <= t[0] + 1e-5)).ifPresent(poly ->
            Optional.of(IntStream.rangeClosed(1, 15).boxed().collect(Collectors.toList())).ifPresent(masks ->
            Optional.of(masks.stream().filter(mask -> null == S.set(mask, Optional.<List<List<double[]>>>of(Integer.bitCount(mask) == 1
                    ? List.of(List.of(tv.apply(Integer.numberOfTrailingZeros(mask), 0), tv.apply(Integer.numberOfTrailingZeros(mask), 1), tv.apply(Integer.numberOfTrailingZeros(mask), 2)))
                    : IntStream.range(0, 4).filter(i -> (mask >> i & 1) == 1).boxed().flatMap(i -> S.get(mask ^ (1 << i)).stream().flatMap(set -> place.apply(i, set))).collect(Collectors.toList()))
                .map(raw -> (List<List<double[]>>) new ArrayList<List<double[]>>(raw.stream().collect(Collectors.toMap(key, Function.identity(), (x, y) -> x, LinkedHashMap::new)).values())).get())).count()).ifPresent(done ->
            System.out.println(IntStream.range(0, 256).map(code -> Optional.of(IntStream.range(0, 4).map(l -> IntStream.range(0, 4).filter(i -> (code >> (2 * i) & 3) == l).map(i -> 1 << i).sum()).filter(m -> m > 0).boxed().collect(Collectors.toList()))
                .map(ms -> ms.stream().reduce(Collections.<List<List<double[]>>>singletonList(new ArrayList<List<double[]>>()),
                    (acc, m) -> acc.stream().flatMap(pre -> S.get(m).stream().map(set -> Stream.concat(pre.stream(), Stream.of(set)).collect(Collectors.toList()))).collect(Collectors.toList()),
                    (x, y) -> x).stream().mapToInt(cl -> Optional.of(cl.stream().map(dists).collect(Collectors.toList())).map(D ->
                        cl.stream().mapToInt(List::size).sum() - (cl.size() - 1)
                        - (cl.size() == 3 ? (poly.apply(D) ? 1 : 0)
                            : cl.size() == 4 ? (poly.apply(D) || IntStream.range(0, 4).anyMatch(k -> poly.apply(IntStream.range(0, 4).filter(j -> j != k).mapToObj(D::get).collect(Collectors.toList()))) ? 1 : 0)
                            : 0)).get()).min().orElse(99)).get()).min().getAsInt())))))))))))));
    }
}


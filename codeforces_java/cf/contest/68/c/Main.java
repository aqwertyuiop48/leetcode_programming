import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(sc.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, n * (n - 1) / 2).mapToObj(i -> LongStream.generate(sc::nextLong).limit(5).toArray()).sorted(Comparator.comparingLong(x -> x[0] * 10 + x[1])).toArray(long[][]::new)).ifPresent(ed ->
                System.out.print(IntStream.rangeClosed(0, 25).mapToObj(F ->
                    Optional.of(new HashMap<String, Long>()).map(memo ->
                    Optional.of(new AtomicReference<BiFunction<Integer, int[], Long>>()).map(r ->
                        r.updateAndGet(o -> (e, st) ->
                            e == ed.length ? 0L
                            : memo.containsKey(e + Arrays.toString(st)) ? memo.get(e + Arrays.toString(st))
                            : memo.merge(e + Arrays.toString(st),
                                Optional.of((int) ed[e][0] - 1).map(s ->
                                Optional.of((int) ed[e][1] - 1).map(f ->
                                Optional.of(e == 0 || ed[e - 1][0] != ed[e][0] ? (s == 0 ? F : st[s]) : st[6]).map(rem ->
                                Optional.of(e == ed.length - 1 || ed[e + 1][0] != ed[e][0]).map(last ->
                                    IntStream.rangeClosed(last ? (int) Math.max(ed[e][2], rem) : (int) ed[e][2], (int) Math.min(ed[e][3], rem)).mapToLong(c ->
                                        Optional.of(st.clone()).filter(ns -> (ns[f] += c) >= 0 & (ns[6] = rem - c) >= 0).map(ns -> r.get().apply(e + 1, ns)).map(v -> v < 0 ? -1L : v + (c > 0 ? ed[e][4] + c * c : 0)).get()).max().orElse(-1)).get()).get()).get()).get(),
                                (x, y) -> x)).apply(0, new int[7])).get())
                    .map(v -> v < 0 ? "" : F + " " + v).get()).filter(x -> !x.isEmpty()).findFirst().orElse("-1 -1")))));
    }
}




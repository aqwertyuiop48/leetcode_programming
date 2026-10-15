import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && Long.valueOf(s.nextLong()) instanceof Long gc
                && Long.valueOf(s.nextLong()) instanceof Long sc
                && IntStream.range(0, m).mapToObj(i -> new long[]{s.nextLong() - 1, s.nextLong() - 1, s.nextLong(), s.nextLong()}).sorted(Comparator.comparingLong(e -> e[2])).toList() instanceof List<long[]> es
                && new int[n] instanceof int[] p
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> ref
                && ref.getAndSet(x -> p[x] == x ? x : (p[x] = ref.get().applyAsInt(p[x]))) == null
                && ref.get() instanceof IntUnaryOperator f
                && new AtomicReference<List<long[]>>(List.of()) instanceof AtomicReference<List<long[]>> mst
                && new long[]{Long.MAX_VALUE} instanceof long[] best
                && es.stream().allMatch(e ->
                    ((mst.get().size() == n - 1 && e[3] >= mst.get().get(n - 2)[3])
                        || (IntStream.range(0, n).allMatch(i -> (p[i] = i) >= 0)
                            && mst.getAndSet(Stream.concat(mst.get().stream(), Stream.of(e))
                                .sorted(Comparator.comparingLong(q -> q[3]))
                                .filter(q -> f.applyAsInt((int) q[0]) != f.applyAsInt((int) q[1]) && (p[f.applyAsInt((int) q[0])] = f.applyAsInt((int) q[1])) >= 0)
                                .toList()) != null))
                    && (mst.get().size() < n - 1 || (best[0] = Math.min(best[0], gc * e[2] + sc * mst.get().get(mst.get().size() - 1)[3])) >= 0))
                ? (best[0] == Long.MAX_VALUE ? -1L : best[0])
                : 0L));
    }
}


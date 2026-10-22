import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gref
            && gref.compareAndSet(null, (p, q) -> q == 0 ? p : gref.get().applyAsLong(q, p % q))
            && new Random(20240607L) instanceof Random rnd && new long[]{1} instanceof long[] best
            && IntStream.range(0, 10).allMatch(z -> Long.valueOf(a[rnd.nextInt(n)]) instanceof Long x
                && (x <= best[0] || LongStream.of(a).map(y -> gref.get().applyAsLong(x, y)).boxed().collect(Collectors.groupingBy(g -> g, HashMap::new, Collectors.counting())) instanceof HashMap<Long, Long> gc
                    && LongStream.rangeClosed(1, (long) Math.sqrt(x) + 1).filter(d -> d * d <= x && x % d == 0).flatMap(d -> LongStream.of(d, x / d)).distinct().filter(d -> d > best[0]).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Long> divs
                    && (divs.stream().filter(d -> 2 * gc.entrySet().stream().filter(e -> e.getKey() % d == 0).mapToLong(Map.Entry::getValue).sum() >= n).findFirst() instanceof Optional<Long> hit
                        && (hit.isEmpty() || (best[0] = hit.get()) > 0))
                    || true))
            ? best[0] : "");
    }
}

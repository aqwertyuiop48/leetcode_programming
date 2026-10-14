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
                && Integer.valueOf(s.nextInt()) instanceof Integer k
                && IntStream.range(0, n).toArray() instanceof int[] p
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> ref
                && ref.getAndSet(x -> p[x] == x ? x : (p[x] = ref.get().applyAsInt(p[x]))) == null
                && ref.get() instanceof IntUnaryOperator f
                && IntStream.range(0, m).allMatch(i -> (p[f.applyAsInt(s.nextInt() - 1)] = f.applyAsInt(s.nextInt() - 1)) >= 0)
                && IntStream.range(0, n).map(f).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values() instanceof Collection<Long> sz
                && Long.valueOf(sz.stream().mapToLong(v -> Math.min(v, k)).sum()) instanceof Long sum
                ? (k == 1
                    ? Math.max(0L, sz.size() - 2L)
                    : Math.max(0L, (2L * (sz.size() - 1) - sum + 1) / 2))
                : 0L));
    }
}

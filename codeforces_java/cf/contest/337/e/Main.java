import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && LongStream.range(0, n).map(i -> sc.nextLong()).boxed().sorted(Comparator.reverseOrder()).mapToLong(x -> x).toArray() instanceof long[] a
            && Arrays.stream(a).map(x -> new long[]{x, 0} instanceof long[] st
                && (LongStream.rangeClosed(2, 1000000).allMatch(p -> p * p <= st[0] && (st[0] % p != 0 || LongStream.range(0, 41).allMatch(z -> st[0] % p != 0 || ((st[0] /= p) > 0 && ++st[1] > 0)) || true)) || true)
                && (st[0] == 1 || ++st[1] > 0) ? st[1] : 0).toArray() instanceof long[] w
            && new AtomicReference<BiFunction<Integer, long[], Integer>>() instanceof AtomicReference<BiFunction<Integer, long[], Integer>> ref
            && ref.compareAndSet(null, (i, s) -> i == n
                ? (int) (n + IntStream.range(0, n).mapToLong(j -> w[j] == 1 ? 0 : s[n + 1 + j]).sum() + (s[n] > 1 ? 1 : 0))
                : Math.min(ref.get().apply(i + 1, s.clone() instanceof long[] c && ++c[n] > 0 ? c : s),
                    IntStream.range(0, i).filter(j -> s[j] % a[i] == 0).map(j -> ref.get().apply(i + 1, s.clone() instanceof long[] c && (c[j] /= a[i]) != 0 && (c[n + 1 + j] -= w[i]) >= 0 ? c : s)).min().orElse(Integer.MAX_VALUE)))
            && Arrays.copyOf(a, 2 * n + 1) instanceof long[] init
            && IntStream.range(0, n).allMatch(j -> (init[n + 1 + j] = w[j]) >= 0)
            && (init[n] = 0) == 0
            ? ref.get().apply(0, init) : "");
    }
}

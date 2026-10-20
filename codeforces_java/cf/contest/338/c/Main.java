import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Arrays.stream(t, 1, n + 1).boxed().sorted(Comparator.reverseOrder()).mapToLong(x -> x).toArray() instanceof long[] a
            && new HashMap<Long, Integer>() instanceof HashMap<Long, Integer> memo
            && ((ToIntFunction<Long>) x -> memo.containsKey(x) ? memo.get(x) : new long[]{x, 0} instanceof long[] st
                && LongStream.iterate(2, p -> p * p <= st[0], p -> p + 1).allMatch(p -> LongStream.range(0, 41).allMatch(z -> st[0] % p != 0 || ((st[0] /= p) > 0 && ++st[1] > 0)))
                && (st[0] == 1 || ++st[1] > 0) && memo.put(x, (int) st[1]) == null ? (int) st[1] : 0) instanceof ToIntFunction<Long> omega
            && new AtomicReference<BiFunction<Integer, long[], Integer>>() instanceof AtomicReference<BiFunction<Integer, long[], Integer>> ref
            && ref.compareAndSet(null, (i, rem) -> i == n
                ? n + IntStream.range(0, n).map(j -> omega.applyAsInt(a[j]) == 1 ? 0 : omega.applyAsInt(rem[j])).sum() + (rem[n] > 1 ? 1 : 0)
                : Math.min(ref.get().apply(i + 1, rem.clone() instanceof long[] c && ++c[n] > 0 ? c : rem),
                    IntStream.range(0, i).filter(j -> rem[j] % a[i] == 0).map(j -> ref.get().apply(i + 1, rem.clone() instanceof long[] c && (c[j] /= a[i]) != 0 ? c : rem)).min().orElse(Integer.MAX_VALUE)))
            ? ref.get().apply(0, Arrays.copyOf(a, n + 1)) : "");
    }
}

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && Integer.valueOf(Integer.parseInt((String) it.next())) instanceof Integer n
            && Long.valueOf(Long.parseLong((String) it.next())) instanceof Long k
            && new long[n + 1] instanceof long[] p
            && IntStream.rangeClosed(1, n).allMatch(i -> (p[i] = p[i - 1] + Long.parseLong((String) it.next())) > Long.MIN_VALUE)
            && IntStream.rangeClosed(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> p[i])).mapToInt(i -> i).toArray() instanceof int[] ord
            && ((LongUnaryOperator) x -> new int[n + 2] instanceof int[] bit && new int[]{0} instanceof int[] ptr
                ? Arrays.stream(ord).mapToLong(j -> IntStream.iterate(ptr[0], q -> q <= n && p[ord[q]] <= p[j] - x, q -> q + 1)
                        .allMatch(q -> IntStream.iterate(ord[q] + 1, i -> i <= n + 1, i -> i + (i & -i)).allMatch(i -> ++bit[i] > 0) && (ptr[0] = q + 1) > 0)
                    ? IntStream.iterate(j, i -> i > 0, i -> i - (i & -i)).map(i -> bit[i]).sum() : 0).sum() : 0) instanceof LongUnaryOperator count
            && new long[]{-1_000_000_000_000_000L, 1_000_000_000_000_000L} instanceof long[] r
            && IntStream.range(0, 64).allMatch(z -> r[0] >= r[1] || (count.applyAsLong(r[0] + (r[1] - r[0] + 1) / 2) >= k ? (r[0] = r[0] + (r[1] - r[0] + 1) / 2) > Long.MIN_VALUE : (r[1] = r[0] + (r[1] - r[0] + 1) / 2 - 1) > Long.MIN_VALUE))
            ? r[0]
            : 0);
    }
}

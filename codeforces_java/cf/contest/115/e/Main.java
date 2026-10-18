import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) t[1]) instanceof Integer m
            && new long[n + 1] instanceof long[] C
            && IntStream.rangeClosed(1, n).allMatch(i -> (C[i] = C[i - 1] + t[1 + i]) >= 0)
            && IntStream.range(0, m).boxed().collect(Collectors.groupingBy(q -> (int) t[3 + n + 3 * q])) instanceof Map<Integer, List<Integer>> byR
            && new TreeMap<Integer, Long>() instanceof TreeMap<Integer, Long> tm
            && new long[1] instanceof long[] st
            && new long[n + 1] instanceof long[] dp
            && ((BiPredicate<Integer, Long>) (l, p) -> tm.floorKey(l) == null
                || (tm.merge(tm.firstKey(), p, Long::sum) != null
                    && (st[0] += p) != Long.MIN_VALUE
                    && (tm.higherKey(tm.floorKey(l)) == null
                        || ((Integer) tm.higherKey(tm.floorKey(l)) instanceof Integer nk
                            && tm.merge(nk, -p, Long::sum) != null
                            && (st[0] -= p) != Long.MIN_VALUE
                            && Stream.iterate(nk, k -> k != null && tm.get(k) <= 0,
                                k -> tm.higherKey(k) instanceof Integer nx
                                    ? (tm.merge(nx, tm.remove(k), Long::sum) != null ? nx : nx)
                                    : ((st[0] -= tm.remove(k)) != 0 ? null : null)).count() >= 0)))) instanceof BiPredicate<Integer, Long> ap
            && IntStream.rangeClosed(1, n).allMatch(i ->
                (Long) (dp[i - 1] + C[i - 1]) instanceof Long h
                && (tm.isEmpty() || h > st[0]
                    ? (tm.put(i, tm.isEmpty() ? h : h - st[0]) == null && (st[0] = h) == h)
                    : true)
                && byR.getOrDefault(i, List.of()).stream().allMatch(q -> ap.test((int) t[2 + n + 3 * q], t[4 + n + 3 * q]))
                && (dp[i] = Math.max(dp[i - 1], st[0] - C[i])) >= 0)
            ? dp[n] : -1);
    }
}

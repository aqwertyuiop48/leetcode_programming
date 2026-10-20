import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(1000000000) instanceof Integer BIG
            && IntStream.range(0, 3).mapToObj(r -> IntStream.range(0, n).map(i -> sc.nextInt()).toArray()).toList() instanceof List<int[]> arr
            && new HashMap<Integer, int[]>() instanceof HashMap<Integer, int[]> pos
            && IntStream.range(0, 3).allMatch(r -> IntStream.range(0, n).allMatch(i -> pos.computeIfAbsent(arr.get(r)[i], x -> new int[]{n + 1, n + 1, n + 1}) instanceof int[] p && (p[r] = Math.min(p[r], i + 1)) > 0))
            && new int[4 * n + 8] instanceof int[] mn && new int[4 * n + 8] instanceof int[] tag
            && IntStream.range(0, 4 * n + 8).allMatch(i -> (tag[i] = -1) < 0)
            && ((Predicate<int[]>) a -> (tag[a[0]] = a[2]) >= 0 && (mn[a[0]] = a[1] + a[2]) >= 0) instanceof Predicate<int[]> ap
            && ap.test(new int[]{1, 0, 0})
            && new AtomicReference<Predicate<int[]>>() instanceof AtomicReference<Predicate<int[]>> up
            && up.compareAndSet(null, a -> a[3] > a[2] || a[4] < a[1] || (a[3] <= a[1] && a[2] <= a[4] ? ap.test(new int[]{a[0], a[1], a[5]})
                : Integer.valueOf((a[1] + a[2]) / 2) instanceof Integer mid
                    && (tag[a[0]] < 0 || ap.test(new int[]{2 * a[0], a[1], tag[a[0]]}) && ap.test(new int[]{2 * a[0] + 1, mid + 1, tag[a[0]]}) && (tag[a[0]] = -1) < 0)
                    && up.get().test(new int[]{2 * a[0], a[1], mid, a[3], a[4], a[5]})
                    && up.get().test(new int[]{2 * a[0] + 1, mid + 1, a[2], a[3], a[4], a[5]})
                    && (mn[a[0]] = Math.min(mn[2 * a[0]], mn[2 * a[0] + 1])) >= 0))
            && ((IntUnaryOperator) v -> new int[]{1, 0, n} instanceof int[] st
                && (IntStream.iterate(0, z -> tag[st[0]] < 0 && st[1] < st[2], z -> z + 1).allMatch(z -> Integer.valueOf((st[1] + st[2]) / 2) instanceof Integer mid
                    && (v <= mid ? (st[0] = 2 * st[0]) >= 0 && (st[2] = mid) >= 0 : (st[0] = 2 * st[0] + 1) >= 0 && (st[1] = mid + 1) >= 0)) || true)
                ? Math.max(0, tag[st[0]]) : 0) instanceof IntUnaryOperator query
            && ((Predicate<int[]>) p -> Integer.valueOf(p[2] > n ? BIG : p[2]) instanceof Integer pc && new int[]{0, p[1]} instanceof int[] bs
                && (IntStream.iterate(0, z -> bs[0] < bs[1], z -> z + 1).allMatch(z -> Integer.valueOf((bs[0] + bs[1]) / 2) instanceof Integer m
                    && (query.applyAsInt(m) < pc ? (bs[1] = m) >= 0 : (bs[0] = m + 1) >= 0)) || true)
                && (bs[0] >= p[1] || up.get().test(new int[]{1, 0, n, bs[0], p[1] - 1, pc}))) instanceof Predicate<int[]> add
            && pos.values().stream().collect(Collectors.groupingBy(p -> p[0])) instanceof Map<Integer, List<int[]>> g
            && g.getOrDefault(n + 1, List.of()).stream().allMatch(add)
            ? IntStream.iterate(n, u -> u >= 0, u -> u - 1).map(u -> Integer.valueOf(mn[1] < BIG ? u + mn[1] : Integer.MAX_VALUE) instanceof Integer cand
                && g.getOrDefault(u, List.of()).stream().allMatch(add) ? cand : Integer.MAX_VALUE).min().getAsInt() : "");
    }
}

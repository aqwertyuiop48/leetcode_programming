import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, n).map(i -> it.next()).sorted().toArray() instanceof int[] s
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> ev
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(Arrays.binarySearch(s, it.next())) instanceof Integer lo && Integer.valueOf(Arrays.binarySearch(s, it.next())) instanceof Integer hi
                && Integer.valueOf(lo >= 0 ? lo : -lo - 1) instanceof Integer l && Integer.valueOf(hi >= 0 ? hi : -hi - 2) instanceof Integer r
                && (l > r || ev.get(l).add(new int[]{l, r}) && ev.get(r + 1).add(new int[]{l, r})))
            && new int[4 * n + 4] instanceof int[] ones && new int[4 * n + 4] instanceof int[] fl
            && new AtomicReference<Function<int[], Boolean>>() instanceof AtomicReference<Function<int[], Boolean>> tg
            && new AtomicReference<Function<int[], Integer>>() instanceof AtomicReference<Function<int[], Integer>> qf
            && tg.compareAndSet(null, x -> x[3] > x[2] || x[4] < x[1] || (x[3] <= x[1] && x[2] <= x[4]
                ? (fl[x[0]] ^= 1) >= 0 && (ones[x[0]] = x[2] - x[1] + 1 - ones[x[0]]) >= 0
                : Integer.valueOf((x[1] + x[2]) / 2) instanceof Integer mid
                    && tg.get().apply(new int[]{2 * x[0], x[1], mid, x[3], x[4]}) && tg.get().apply(new int[]{2 * x[0] + 1, mid + 1, x[2], x[3], x[4]})
                    && (ones[x[0]] = fl[x[0]] == 1 ? x[2] - x[1] + 1 - (ones[2 * x[0]] + ones[2 * x[0] + 1]) : ones[2 * x[0]] + ones[2 * x[0] + 1]) >= 0))
            && qf.compareAndSet(null, x -> x[3] > x[2] || x[4] < x[1] ? 0
                : x[3] <= x[1] && x[2] <= x[4] ? (x[5] == 1 ? x[2] - x[1] + 1 - ones[x[0]] : ones[x[0]])
                : Integer.valueOf((x[1] + x[2]) / 2) instanceof Integer mid
                    ? qf.get().apply(new int[]{2 * x[0], x[1], mid, x[3], x[4], x[5] ^ fl[x[0]]}) + qf.get().apply(new int[]{2 * x[0] + 1, mid + 1, x[2], x[3], x[4], x[5] ^ fl[x[0]]}) : 0)
            ? Long.valueOf(n) * (n - 1) * (n - 2) / 6 - IntStream.range(0, n).mapToLong(i -> ev.get(i).stream().allMatch(e -> tg.get().apply(new int[]{1, 0, n - 1, e[0], e[1]}))
                ? Long.valueOf(i - qf.get().apply(new int[]{1, 0, n - 1, 0, i - 1, 0}) + qf.get().apply(new int[]{1, 0, n - 1, i + 1, n - 1, 0})) instanceof Long w ? w * (w - 1) / 2 : 0 : 0).sum() : "");
    }
}

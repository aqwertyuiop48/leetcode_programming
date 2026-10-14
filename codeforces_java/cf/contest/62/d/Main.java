import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new int[]{sc.nextInt(), sc.nextInt()}).ifPresent(nm ->
            System.out.println(
                Integer.valueOf(nm[0]) instanceof Integer n
                && Integer.valueOf(nm[1]) instanceof Integer m
                && IntStream.rangeClosed(0, m).map(i -> sc.nextInt()).toArray() instanceof int[] a
                && new int[n + 1][n + 1] instanceof int[][] cnt
                && ((BiFunction<Integer, Integer, Boolean>) (v, rem) -> rem == 0
                    ? v == a[0]
                    : (new boolean[n + 1] instanceof boolean[] vis
                        && (vis[v] = true)
                        && Stream.iterate(List.of(v), f -> !f.isEmpty(),
                            f -> f.stream().flatMap(u -> IntStream.rangeClosed(1, n).filter(w -> cnt[u][w] > 0 && !vis[w] && (vis[w] = true)).boxed()).toList()).mapToInt(List::size).sum() > 0
                        && IntStream.rangeClosed(1, n).allMatch(u -> vis[u] || Arrays.stream(cnt[u]).sum() == 0)
                        && Arrays.stream(cnt[v]).sum() > 0)) instanceof BiFunction<Integer, Integer, Boolean> ok
                && ((Function<int[], Boolean>) t -> cnt[t[0]][t[1]]-- > 0 && cnt[t[1]][t[0]]-- > 0
                    && (ok.apply(t[1], t[2]) || !(cnt[t[0]][t[1]]++ >= 0 && cnt[t[1]][t[0]]++ >= 0))) instanceof Function<int[], Boolean> take
                && new String[]{"No solution"} instanceof String[] res
                && IntStream.iterate(m, p -> p >= 1, p -> p - 1).anyMatch(p ->
                    cnt[a[p - 1]][a[p]]++ >= 0 && cnt[a[p]][a[p - 1]]++ >= 0
                    && IntStream.rangeClosed(a[p] + 1, n).filter(v -> cnt[a[p - 1]][v] > 0 && take.apply(new int[]{a[p - 1], v, m - p})).findFirst() instanceof OptionalInt o
                    && o.isPresent()
                    && new int[]{o.getAsInt()} instanceof int[] cur
                    && (res[0] = IntStream.concat(IntStream.concat(Arrays.stream(a, 0, p), IntStream.of(o.getAsInt())),
                        IntStream.rangeClosed(p + 1, m).map(q -> cur[0] = IntStream.rangeClosed(1, n).filter(w -> cnt[cur[0]][w] > 0 && take.apply(new int[]{cur[0], w, m - q})).findFirst().getAsInt()))
                        .mapToObj(String::valueOf).collect(Collectors.joining(" "))) != null)
                ? res[0] : "No solution")));
    }
}

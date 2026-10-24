import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && LongStream.range(0, (long) n * n).map(i -> Long.parseLong(tk.nextToken())).sorted().toArray() instanceof long[] all
            && (Long) (LongStream.of(all).sum() / n) instanceof Long S
            && LongStream.of(all).distinct().toArray() instanceof long[] vals
            && Arrays.stream(vals).mapToInt(v -> (int) LongStream.of(all).filter(x -> x == v).count()).toArray() instanceof int[] cnt
            && Stream.concat(Stream.concat(IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).map(c -> r * n + c).toArray()), IntStream.range(0, n).mapToObj(c -> IntStream.range(0, n).map(r -> r * n + c).toArray())),
                Stream.of(IntStream.range(0, n).map(i -> i * n + i).toArray(), IntStream.range(0, n).map(i -> i * n + n - 1 - i).toArray())).toList() instanceof List<int[]> lines
            && (n == 1 ? new int[][]{{0, -1}}
                : n == 2 ? new int[][]{{0, -1}, {1, 0}, {2, 2}, {3, 1}}
                : n == 3 ? new int[][]{{0, -1}, {1, -1}, {2, 0}, {4, -1}, {8, 6}, {6, 7}, {3, 3}, {7, 4}, {5, 1}}
                : new int[][]{{0, -1}, {1, -1}, {2, -1}, {3, 0}, {5, -1}, {10, -1}, {15, 8}, {6, -1}, {9, -1}, {12, 9}, {13, 5}, {14, 3}, {4, -1}, {8, 4}, {7, 1}, {11, 2}}) instanceof int[][] ord
            && new int[n * n] instanceof int[] posOf && IntStream.range(0, n * n).allMatch(p -> (posOf[ord[p][0]] = p) >= 0)
            && IntStream.range(0, n * n).mapToObj(c -> IntStream.concat(IntStream.range(0, 2 * n + 2).filter(l -> Arrays.stream(lines.get(l)).anyMatch(x -> x == c)), IntStream.generate(() -> 10)).limit(4).toArray()).toArray(int[][]::new) instanceof int[][] cl
            && IntStream.range(0, n * n).mapToObj(p -> IntStream.concat(IntStream.range(0, 2 * n + 2).filter(l -> Arrays.stream(lines.get(l)).map(c -> posOf[c]).max().getAsInt() == p), IntStream.generate(() -> 11)).limit(4).toArray()).toArray(int[][]::new) instanceof int[][] dn
            && new long[12] instanceof long[] ls && (ls[11] = S) == S && new long[n * n] instanceof long[] grid
            && ((BiPredicate<Integer, Long>) (cell, d) -> (ls[cl[cell][0]] += d) >= Long.MIN_VALUE && (ls[cl[cell][1]] += d) >= Long.MIN_VALUE && (ls[cl[cell][2]] += d) >= Long.MIN_VALUE && (ls[cl[cell][3]] += d) >= Long.MIN_VALUE) instanceof BiPredicate<Integer, Long> upd
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
            && dfs.compareAndSet(null, p -> p == n * n || (Integer) ord[p][0] instanceof Integer cell
                && (ord[p][1] < 0 ? IntStream.range(0, vals.length).filter(i -> cnt[i] > 0)
                    : IntStream.of(Arrays.binarySearch(vals, S - ls[ord[p][1]])).filter(i -> i >= 0 && cnt[i] > 0))
                    .anyMatch(i -> --cnt[i] >= 0 && (grid[cell] = vals[i]) == vals[i] && upd.test(cell, vals[i])
                        && ((ls[dn[p][0]] == S && ls[dn[p][1]] == S && ls[dn[p][2]] == S && ls[dn[p][3]] == S && dfs.get().test(p + 1)) || (++cnt[i] > 0 && upd.test(cell, -vals[i]) && false))))
            && dfs.get().test(0)
            ? S + "\n" + IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).mapToObj(c -> String.valueOf(grid[r * n + c])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "");
    }
}

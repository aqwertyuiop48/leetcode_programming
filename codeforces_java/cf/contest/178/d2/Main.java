import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && LongStream.generate(sc::nextLong).limit(n * n).sorted().toArray() instanceof long[] all
            && Long.valueOf(Arrays.stream(all).sum() / n) instanceof Long s
            && Arrays.stream(all).distinct().toArray() instanceof long[] vals
            && Arrays.stream(vals).map(v -> Arrays.stream(all).filter(x -> x == v).count()).mapToInt(c -> (int) c).toArray() instanceof int[] cnt
            && IntStream.range(0, vals.length).boxed().collect(Collectors.toMap(i -> vals[i], i -> i)) instanceof Map<Long, Integer> idx
            && Stream.concat(Stream.concat(IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).map(c -> r * n + c).toArray()), IntStream.range(0, n).mapToObj(c -> IntStream.range(0, n).map(r -> r * n + c).toArray())),
                Stream.of(IntStream.range(0, n).map(i -> i * n + i).toArray(), IntStream.range(0, n).map(i -> i * n + n - 1 - i).toArray())).toList() instanceof List<int[]> lines
            && (n == 1 ? new int[][]{{0, -1}}
                : n == 2 ? new int[][]{{0, -1}, {1, 0}, {2, 2}, {3, 1}}
                : n == 3 ? new int[][]{{0, -1}, {1, -1}, {2, 0}, {4, -1}, {8, 6}, {6, 7}, {3, 3}, {7, 4}, {5, 1}}
                : new int[][]{{0, -1}, {1, -1}, {2, -1}, {3, 0}, {5, -1}, {10, -1}, {15, 8}, {6, -1}, {9, -1}, {12, 9}, {13, 5}, {14, 3}, {4, -1}, {8, 4}, {7, 1}, {11, 2}}) instanceof int[][] ord
            && new int[n * n] instanceof int[] posOf
            && IntStream.range(0, n * n).allMatch(p -> (posOf[ord[p][0]] = p) >= 0)
            && IntStream.range(0, n * n).mapToObj(p -> lines.stream().filter(l -> Arrays.stream(l).map(c -> posOf[c]).max().getAsInt() == p).toList()).toList() instanceof List<List<int[]>> done
            && new long[n * n] instanceof long[] grid
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
            && dfs.compareAndSet(null, p -> p == n * n || Integer.valueOf(ord[p][0]) instanceof Integer cell
                && (ord[p][1] < 0 ? IntStream.range(0, vals.length).filter(i -> cnt[i] > 0)
                    : Optional.ofNullable(idx.get(s - Arrays.stream(lines.get(ord[p][1])).filter(c -> c != cell).mapToLong(c -> grid[c]).sum())).stream().mapToInt(x -> x).filter(i -> cnt[i] > 0))
                    .anyMatch(i -> (--cnt[i] >= 0 && (grid[cell] = vals[i]) == vals[i]
                        && done.get(p).stream().allMatch(l -> Arrays.stream(l).mapToLong(c -> grid[c]).sum() == s) && dfs.get().test(p + 1)) || ++cnt[i] < 0))
            && dfs.get().test(0)
            ? s + "\n" + IntStream.range(0, n).mapToObj(r -> IntStream.range(0, n).mapToObj(c -> String.valueOf(grid[r * n + c])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "");
    }
}

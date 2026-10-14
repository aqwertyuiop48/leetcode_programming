import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                (new String[]{s.next(), s.next(), s.next(), s.next(), s.next(), s.next()} instanceof String[] w
                && new AtomicReference<Function<int[], Stream<int[]>>>() instanceof AtomicReference<Function<int[], Stream<int[]>>> pg
                && pg.getAndSet(avail -> avail.length == 0 ? Stream.of(new int[0]) :
                    IntStream.range(0, avail.length).boxed().flatMap(k ->
                        pg.get().apply(IntStream.range(0, avail.length).filter(idx -> idx != k).map(idx -> avail[idx]).toArray())
                          .map(rest -> IntStream.concat(IntStream.of(avail[k]), Arrays.stream(rest)).toArray()))) == null)
                ? pg.get().apply(new int[]{0, 1, 2, 3, 4, 5}).map(perm ->
                    w[perm[0]] instanceof String TH && w[perm[1]] instanceof String LV && w[perm[2]] instanceof String MV
                    && w[perm[3]] instanceof String MH && w[perm[4]] instanceof String BH && w[perm[5]] instanceof String RV
                    && MH.length() == TH.length() + BH.length() - 1
                    && MV.length() == LV.length() + RV.length() - 1
                    && TH.charAt(0) == LV.charAt(0)
                    && TH.charAt(TH.length() - 1) == MV.charAt(0)
                    && LV.charAt(LV.length() - 1) == MH.charAt(0)
                    && MV.charAt(LV.length() - 1) == MH.charAt(TH.length() - 1)
                    && MV.charAt(MV.length() - 1) == BH.charAt(0)
                    && MH.charAt(MH.length() - 1) == RV.charAt(0)
                    && RV.charAt(RV.length() - 1) == BH.charAt(BH.length() - 1)
                    && new int[]{LV.length() + RV.length() - 1, TH.length() + BH.length() - 1} instanceof int[] hw
                    && new char[hw[0]][hw[1]] instanceof char[][] grid
                    && IntStream.range(0, hw[0]).allMatch(r -> IntStream.range(0, hw[1]).allMatch(c -> (grid[r][c] = '.') == '.'))
                    && IntStream.range(0, TH.length()).allMatch(c -> (grid[0][c] = TH.charAt(c)) == TH.charAt(c))
                    && IntStream.range(0, LV.length()).allMatch(r -> (grid[r][0] = LV.charAt(r)) == LV.charAt(r))
                    && IntStream.range(0, hw[0]).allMatch(r -> (grid[r][TH.length() - 1] = MV.charAt(r)) == MV.charAt(r))
                    && IntStream.range(0, hw[1]).allMatch(c -> (grid[LV.length() - 1][c] = MH.charAt(c)) == MH.charAt(c))
                    && IntStream.range(0, BH.length()).allMatch(j -> (grid[hw[0] - 1][TH.length() - 1 + j] = BH.charAt(j)) == BH.charAt(j))
                    && IntStream.range(0, RV.length()).allMatch(i -> (grid[LV.length() - 1 + i][hw[1] - 1] = RV.charAt(i)) == RV.charAt(i))
                    ? IntStream.range(0, hw[0]).mapToObj(r -> new String(grid[r])).collect(Collectors.joining("\n"))
                    : null)
                  .filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse("Impossible")
                : "Impossible"
            )
        );
    }
}

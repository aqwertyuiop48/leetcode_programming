import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(t ->
            System.out.println(
                IntStream.range(0, t).mapToObj(ti ->
                    new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                    && new char[nm[0]][] instanceof char[][] grid
                    && IntStream.range(0, nm[0]).allMatch(r -> (grid[r] = s.next().toCharArray()) != null)
                    && new int[nm[0] * nm[1]] instanceof int[] par
                    && IntStream.range(0, nm[0] * nm[1]).allMatch(idx -> (par[idx] = idx) == idx)
                    && new int[nm[0] * nm[1]] instanceof int[] sz
                    && new long[nm[0] * nm[1]] instanceof long[] minR
                    && new long[nm[0] * nm[1]] instanceof long[] maxR
                    && new long[nm[0] * nm[1]] instanceof long[] minC
                    && new long[nm[0] * nm[1]] instanceof long[] maxC
                    && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> findRef
                    && findRef.getAndSet(x -> par[x] == x ? x : (par[x] = findRef.get().applyAsInt(par[x]))) == null
                    && ((BiFunction<Integer, Integer, Boolean>) ((keep, drop) ->
                            (par[drop] = keep) >= 0
                            && (sz[keep] += sz[drop]) >= 0
                            && (minR[keep] = Math.min(minR[keep], minR[drop])) >= 0
                            && (maxR[keep] = Math.max(maxR[keep], maxR[drop])) >= 0
                            && (minC[keep] = Math.min(minC[keep], minC[drop])) >= 0
                            && (maxC[keep] = Math.max(maxC[keep], maxC[drop])) >= 0)) instanceof BiFunction<Integer, Integer, Boolean> mergeInto
                    && ((BiFunction<Integer, Integer, Boolean>) ((p, q) ->
                            findRef.get().applyAsInt(p) == findRef.get().applyAsInt(q)
                            || (sz[findRef.get().applyAsInt(p)] >= sz[findRef.get().applyAsInt(q)]
                                ? mergeInto.apply(findRef.get().applyAsInt(p), findRef.get().applyAsInt(q))
                                : mergeInto.apply(findRef.get().applyAsInt(q), findRef.get().applyAsInt(p))))) instanceof BiFunction<Integer, Integer, Boolean> union
                    && ((BiFunction<Integer, Integer, Boolean>) ((r, c) -> r >= 0 && r < nm[0] && c >= 0 && c < nm[1] && grid[r][c] == '1')) instanceof BiFunction<Integer, Integer, Boolean> isOne
                    && ((Function<Integer, Boolean>) (root ->
                            new long[]{maxC[root] - minC[root] + 1, maxR[root] - minR[root] + 1} instanceof long[] wh
                            && wh[0] == wh[1] && wh[0] >= 2 && sz[root] == 4 * (wh[0] - 1)
                            && LongStream.rangeClosed(minR[root], maxR[root]).allMatch(r -> isOne.apply((int) r, (int) (long) minC[root]) && isOne.apply((int) r, (int) (long) maxC[root]))
                            && LongStream.rangeClosed(minC[root], maxC[root]).allMatch(c -> isOne.apply((int) (long) minR[root], (int) c) && isOne.apply((int) (long) maxR[root], (int) c)))) instanceof Function<Integer, Boolean> validAxis
                    && ((Function<Integer, Boolean>) (root ->
                            new long[]{maxC[root] - minC[root] + 1, maxR[root] - minR[root] + 1, (maxC[root] - minC[root]) / 2} instanceof long[] whr
                            && whr[0] == whr[1] && whr[0] % 2 == 1 && whr[2] >= 1 && sz[root] == 4 * whr[2]
                            && LongStream.rangeClosed(minR[root], maxR[root]).allMatch(x ->
                                new long[]{whr[2] - Math.abs(x - (minR[root] + whr[2]))} instanceof long[] dy
                                && isOne.apply((int) x, (int) (minC[root] + whr[2] - dy[0])) && isOne.apply((int) x, (int) (minC[root] + whr[2] + dy[0]))))) instanceof Function<Integer, Boolean> validDiamond
                    && IntStream.range(0, nm[0]).boxed().flatMap(r -> IntStream.range(0, nm[1]).mapToObj(c -> new int[]{r, c}))
                        .filter(rc -> grid[rc[0]][rc[1]] == '1')
                        .allMatch(rc ->
                            (sz[rc[0] * nm[1] + rc[1]] = 1) >= 0
                            && (minR[rc[0] * nm[1] + rc[1]] = rc[0]) >= 0
                            && (maxR[rc[0] * nm[1] + rc[1]] = rc[0]) >= 0
                            && (minC[rc[0] * nm[1] + rc[1]] = rc[1]) >= 0
                            && (maxC[rc[0] * nm[1] + rc[1]] = rc[1]) >= 0)
                    && IntStream.range(0, nm[0]).boxed().flatMap(r -> IntStream.range(0, nm[1]).mapToObj(c -> new int[]{r, c}))
                        .filter(rc -> grid[rc[0]][rc[1]] == '1')
                        .allMatch(rc ->
                            (isOne.apply(rc[0] - 1, rc[1] - 1) ? union.apply(rc[0] * nm[1] + rc[1], (rc[0] - 1) * nm[1] + (rc[1] - 1)) : true)
                            && (isOne.apply(rc[0] - 1, rc[1]) ? union.apply(rc[0] * nm[1] + rc[1], (rc[0] - 1) * nm[1] + rc[1]) : true)
                            && (isOne.apply(rc[0] - 1, rc[1] + 1) ? union.apply(rc[0] * nm[1] + rc[1], (rc[0] - 1) * nm[1] + (rc[1] + 1)) : true)
                            && (isOne.apply(rc[0], rc[1] - 1) ? union.apply(rc[0] * nm[1] + rc[1], rc[0] * nm[1] + (rc[1] - 1)) : true))
                    ? String.valueOf(IntStream.range(0, nm[0] * nm[1])
                        .filter(idxv -> grid[idxv / nm[1]][idxv % nm[1]] == '1' && findRef.get().applyAsInt(idxv) == idxv)
                        .filter(idxv -> validAxis.apply(idxv) || validDiamond.apply(idxv))
                        .count())
                    : "0")
                .collect(Collectors.joining("\n")))));
    }
}



/*
 * @lc app=leetcode id=3276 lang=java
 *
 * [3276] Select Cells in Grid With Maximum Score
 */

class Solution { public int maxScore(List<List<Integer>> grid) { return ((Function<Integer, Integer>) N -> ((Function<int[], Integer>) sortedVals -> ((Function<int[], Integer>) rowMasks -> ((Function<Object[], Integer>) box -> ((Function<BiFunction<Integer, Integer, Integer>, Integer>) dfs -> dfs.apply(0, 0)).apply((BiFunction<Integer, Integer, Integer>) (box[0] = (BiFunction<Integer, Integer, Integer>) (mask, depth) -> depth == sortedVals.length ? 0 : (rowMasks[depth] & ~mask) == 0 ? ((BiFunction<Integer, Integer, Integer>) box[0]).apply(mask, depth + 1) : IntStream.range(0, N).filter(r -> ((rowMasks[depth] & ~mask) & (1 << r)) != 0).map(r -> sortedVals[depth] + ((BiFunction<Integer, Integer, Integer>) box[0]).apply(mask | (1 << r), depth + 1)).max().getAsInt()))).apply(new Object[1])).apply(IntStream.range(0, sortedVals.length).map(i -> IntStream.range(0, N).filter(r -> grid.get(r).contains(sortedVals[i])).reduce(0, (m, r) -> m | (1 << r))).toArray())).apply(grid.stream().flatMap(List::stream).distinct().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray())).apply(grid.size()); } }

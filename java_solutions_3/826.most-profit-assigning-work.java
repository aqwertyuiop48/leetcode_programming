/*
 * @lc app=leetcode id=826 lang=java
 *
 * [826] Most Profit Assigning Work
 */

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        return new java.util.TreeMap<Integer, Integer>() instanceof java.util.TreeMap<Integer, Integer> t && new int[1] instanceof int[] best
            && java.util.stream.IntStream.range(0, difficulty.length).boxed().sorted(java.util.Comparator.comparingInt((Integer i) -> difficulty[i]))
                .peek(i -> t.put(difficulty[i], best[0] = Math.max(best[0], profit[i]))).allMatch(x -> true)
            ? java.util.Arrays.stream(worker).map(w -> java.util.Optional.ofNullable(t.floorEntry(w)).map(java.util.Map.Entry::getValue).orElse(0)).sum() : 0;
    }
}

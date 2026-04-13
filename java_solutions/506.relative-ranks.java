/*
 * @lc app=leetcode id=506 lang=java
 *
 * [506] Relative Ranks
 */

class Solution {
    public String[] findRelativeRanks(int[] score) {
        return Optional.of(IntStream.range(0, score.length).boxed().sorted((a, b) -> Integer.compare(score[b], score[a])).collect(Collectors.toList())).map(sortedIndices -> IntStream.range(0, score.length).mapToObj(i -> Optional.of(sortedIndices.indexOf(i)).map(rank -> rank == 0 ? "Gold Medal" : rank == 1 ? "Silver Medal" : rank == 2 ? "Bronze Medal" : String.valueOf(rank + 1)).get()).toArray(String[]::new)).get();
    }
}

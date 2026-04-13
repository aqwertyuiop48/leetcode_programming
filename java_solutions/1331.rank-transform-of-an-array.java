/*
 * @lc app=leetcode id=1331 lang=java
 *
 * [1331] Rank Transform of an Array
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        return Optional.of(Arrays.stream(arr).distinct().sorted().toArray())
            .map(sortedUnique -> IntStream.range(0, sortedUnique.length)
                .boxed()
                .collect(Collectors.toMap(i -> sortedUnique[i], i -> i + 1)))
            .map(rankMap -> Arrays.stream(arr).map(rankMap::get).toArray())
            .get();
    }
}

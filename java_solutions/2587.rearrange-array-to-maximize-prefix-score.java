/*
 * @lc app=leetcode id=2587 lang=java
 *
 * [2587] Rearrange Array to Maximize Prefix Score
 */

class Solution {
    public int maxScore(int[] nums) {
        return (int) Arrays.stream(nums)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .map(new AtomicLong()::addAndGet)
            .filter(sum -> sum > 0)
            .count();
    }
}

/*
 * @lc app=leetcode id=961 lang=java
 *
 * [961] N-Repeated Element in Size 2N Array
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        return Optional.of(new HashSet<Integer>()).map(seen -> Arrays.stream(nums).filter(n -> !seen.add(n)).findFirst().getAsInt()).get();
    }
}

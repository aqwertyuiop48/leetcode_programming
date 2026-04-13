/*
 * @lc app=leetcode id=2640 lang=java
 *
 * [2640] Find the Score of All Prefixes of an Array
 */

class Solution {
    public long[] findPrefixScore(int[] nums) {
        return IntStream.of(nums.length).mapToObj(long[]::new)
            .peek(ans -> IntStream.range(0, nums.length)
                .collect(() -> new long[2],
                    (s, i) -> ans[i] = (s[1] += (nums[i] + (s[0] = Math.max(s[0], nums[i])))), 
                    (a, b) -> {}))
            .findFirst().get();
    }
}

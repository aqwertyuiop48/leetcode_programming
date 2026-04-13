/*
 * @lc app=leetcode id=1991 lang=java
 *
 * [1991] Find the Middle Index in Array
 */

class Solution {
    public int findMiddleIndex(int[] nums) {
        return IntStream.range(0, nums.length)
            .filter(i -> IntStream.range(0, i).map(l -> nums[l]).sum() == 
                         IntStream.range(i + 1, nums.length).map(r -> nums[r]).sum())
            .findFirst()
            .orElse(-1);
    }
}

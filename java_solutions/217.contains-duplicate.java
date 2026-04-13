/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        return nums.length > Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
    }
}

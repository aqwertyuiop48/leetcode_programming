/*
 * @lc app=leetcode id=553 lang=java
 *
 * [553] Optimal Division
 */

class Solution {
    public String optimalDivision(int[] nums) {
        return nums.length == 1 ? String.valueOf(nums[0]) : nums.length == 2 ? nums[0] + "/" + nums[1] : nums[0] + "/(" + java.util.Arrays.stream(nums).skip(1).mapToObj(String::valueOf).collect(java.util.stream.Collectors.joining("/")) + ")";
    }
}

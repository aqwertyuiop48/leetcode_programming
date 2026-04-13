/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        return Optional.of(new long[]{Arrays.stream(nums).asLongStream().sum(), Arrays.stream(nums).distinct().asLongStream().sum(), (long)nums.length * (nums.length + 1) / 2}).map(s -> new int[]{(int)(s[0] - s[1]), (int)(s[2] - s[1])}).get();
    }
}

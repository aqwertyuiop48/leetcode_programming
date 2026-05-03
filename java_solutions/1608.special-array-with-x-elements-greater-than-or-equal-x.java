/*
 * @lc app=leetcode id=1608 lang=java
 *
 * [1608] Special Array With X Elements Greater Than or Equal X
 */

class Solution {
    public int specialArray(int[] nums) {
        return java.util.stream.IntStream.rangeClosed(0, nums.length).filter(x -> java.util.Arrays.stream(nums).filter(n -> n >= x).count() == x).findFirst().orElse(-1);
    }
}

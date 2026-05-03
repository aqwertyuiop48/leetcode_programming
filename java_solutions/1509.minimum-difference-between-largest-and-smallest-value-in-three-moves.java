/*
 * @lc app=leetcode id=1509 lang=java
 *
 * [1509] Minimum Difference Between Largest and Smallest Value in Three Moves
 */

class Solution {
    public int minDifference(int[] nums) {
        return nums.length <= 4 ? 0 : java.util.stream.Stream.of(java.util.Arrays.stream(nums).sorted().toArray()).mapToInt(a -> java.util.stream.IntStream.rangeClosed(0, 3).map(i -> a[a.length - 1 - 3 + i] - a[i]).min().getAsInt()).findFirst().getAsInt();
    }
}

/*
 * @lc app=leetcode id=2605 lang=java
 *
 * [2605] Form Smallest Number From Two Digit Arrays
 */

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        return IntStream.of(Arrays.stream(nums1).reduce(0, (m, v) -> m | (1 << v)))
            .map(m1 -> IntStream.of(Arrays.stream(nums2).reduce(0, (m, v) -> m | (1 << v)))
                .map(m2 -> (m1 & m2) > 0 ? Integer.numberOfTrailingZeros(m1 & m2) : 
                    Math.min(Integer.numberOfTrailingZeros(m1), Integer.numberOfTrailingZeros(m2)) * 10 + 
                    Math.max(Integer.numberOfTrailingZeros(m1), Integer.numberOfTrailingZeros(m2)))
                .findFirst().getAsInt())
            .findFirst().getAsInt();
    }
}

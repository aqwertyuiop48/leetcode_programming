/*
 * @lc app=leetcode id=3551 lang=java
 *
 * [3551] Minimum Swaps to Sort by Digit Sum
 */

class Solution {
    public int minSwaps(int[] nums) {
        return new Object[]{
            java.util.stream.IntStream.range(0, nums.length)
                .mapToObj(i -> new int[]{
                    nums[i], 
                    i, 
                    java.util.stream.IntStream.iterate(nums[i], n -> n > 0, n -> n / 10).map(n -> n % 10).sum()
                })
                .sorted((a, b) -> a[2] != b[2] ? a[2] - b[2] : a[0] - b[0])
                .toArray(int[][]::new),
            new boolean[nums.length]
        } instanceof Object[] state 
        ? (int) java.util.stream.IntStream.range(0, nums.length)
            .mapToLong(i -> Math.max(0L, 
                java.util.stream.Stream.iterate(
                    i, 
                    j -> !((boolean[])state[1])[j], 
                    j -> (((boolean[])state[1])[j] = true) ? ((int[][])state[0])[j][1] : 0
                ).count() - 1
            )).sum() 
        : 0;
    }
}

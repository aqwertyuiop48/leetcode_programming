/*
 * @lc app=leetcode id=1877 lang=java
 *
 * [1877] Minimize Maximum Pair Sum in Array
 */

class Solution {
    public int minPairSum(int[] nums) {
        return java.util.Optional.of(java.util.Arrays.stream(nums).sorted().toArray()).map(a -> java.util.stream.IntStream.range(0, a.length / 2).map(i -> a[i] + a[a.length - 1 - i]).max().getAsInt()).get();
    }
}

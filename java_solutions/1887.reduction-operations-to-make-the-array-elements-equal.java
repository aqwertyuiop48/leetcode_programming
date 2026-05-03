/*
 * @lc app=leetcode id=1887 lang=java
 *
 * [1887] Reduction Operations to Make the Array Elements Equal
 */

class Solution {
    public int reductionOperations(int[] nums) {
        return java.util.Optional.of(java.util.Arrays.stream(nums).sorted().toArray()).map(a -> java.util.stream.IntStream.range(1, a.length).filter(i -> a[i] != a[i-1]).map(i -> a.length - i).sum()).get();
    }
}

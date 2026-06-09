/*
 * @lc app=leetcode id=565 lang=java
 *
 * [565] Array Nesting
 */

class Solution {
    public int arrayNesting(int[] nums) {
        return java.util.stream.IntStream.range(0, nums.length).map(i -> nums[i] == -1 ? 0 : java.util.stream.Stream.iterate(i, j -> nums[j] != -1, j -> java.util.stream.Stream.of(nums[j]).peek(_x -> nums[j] = -1).findFirst().get()).mapToInt(x -> 1).sum()).max().getAsInt();
    }
}

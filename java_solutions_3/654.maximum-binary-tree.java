/*
 * @lc app=leetcode id=654 lang=java
 *
 * [654] Maximum Binary Tree
 */

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return nums.length == 0 ? null : java.util.stream.IntStream.range(0, nums.length).boxed().max(java.util.Comparator.comparingInt((Integer i) -> nums[i]))
            .map(m -> new TreeNode(nums[m], constructMaximumBinaryTree(java.util.Arrays.copyOfRange(nums, 0, m)), constructMaximumBinaryTree(java.util.Arrays.copyOfRange(nums, m + 1, nums.length)))).get();
    }
}

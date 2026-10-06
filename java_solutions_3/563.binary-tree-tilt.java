/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
 */

class Solution {
    public int findTilt(TreeNode root) {
        return new java.util.ArrayList<TreeNode>(root == null ? java.util.List.<TreeNode>of() : java.util.List.of(root)) instanceof java.util.ArrayList<TreeNode> all
            && java.util.stream.IntStream.iterate(0, i -> i < all.size(), i -> i + 1).allMatch(i -> java.util.stream.Stream.of(all.get(i).left, all.get(i).right).filter(java.util.Objects::nonNull).allMatch(all::add))
            && new java.util.IdentityHashMap<TreeNode, Integer>() instanceof java.util.IdentityHashMap<TreeNode, Integer> sum && new int[1] instanceof int[] tilt
            && java.util.stream.IntStream.iterate(all.size() - 1, i -> i >= 0, i -> i - 1)
                .peek(i -> tilt[0] += Math.abs(sum.getOrDefault(all.get(i).left, 0) - sum.getOrDefault(all.get(i).right, 0))
                    + 0 * sum.merge(all.get(i), all.get(i).val + sum.getOrDefault(all.get(i).left, 0) + sum.getOrDefault(all.get(i).right, 0), Integer::sum)).allMatch(x -> true)
            ? tilt[0] : 0;
    }
}

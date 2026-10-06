/*
 * @lc app=leetcode id=687 lang=java
 *
 * [687] Longest Univalue Path
 */

class Solution {
    public int longestUnivaluePath(TreeNode root) {
        return new java.util.ArrayList<TreeNode>(root == null ? java.util.List.<TreeNode>of() : java.util.List.of(root)) instanceof java.util.ArrayList<TreeNode> all
            && java.util.stream.IntStream.iterate(0, i -> i < all.size(), i -> i + 1).allMatch(i -> java.util.stream.Stream.of(all.get(i).left, all.get(i).right).filter(java.util.Objects::nonNull).allMatch(all::add))
            && new java.util.IdentityHashMap<TreeNode, Integer>() instanceof java.util.IdentityHashMap<TreeNode, Integer> arm && new int[1] instanceof int[] best
            && ((java.util.function.IntUnaryOperator) i -> all.get(i).left != null && all.get(i).left.val == all.get(i).val ? arm.get(all.get(i).left) + 1 : 0) instanceof java.util.function.IntUnaryOperator lf
            && ((java.util.function.IntUnaryOperator) i -> all.get(i).right != null && all.get(i).right.val == all.get(i).val ? arm.get(all.get(i).right) + 1 : 0) instanceof java.util.function.IntUnaryOperator rt
            && java.util.stream.IntStream.iterate(all.size() - 1, i -> i >= 0, i -> i - 1)
                .peek(i -> best[0] = Math.max(best[0], lf.applyAsInt(i) + rt.applyAsInt(i)) + 0 * arm.merge(all.get(i), Math.max(lf.applyAsInt(i), rt.applyAsInt(i)), Integer::sum)).allMatch(x -> true)
            ? best[0] : 0;
    }
}

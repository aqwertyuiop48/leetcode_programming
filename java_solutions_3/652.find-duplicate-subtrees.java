/*
 * @lc app=leetcode id=652 lang=java
 *
 * [652] Find Duplicate Subtrees
 */

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        return new java.util.ArrayList<TreeNode>(root == null ? java.util.List.<TreeNode>of() : java.util.List.of(root)) instanceof java.util.ArrayList<TreeNode> all
            && java.util.stream.IntStream.iterate(0, i -> i < all.size(), i -> i + 1).allMatch(i -> java.util.stream.Stream.of(all.get(i).left, all.get(i).right).filter(java.util.Objects::nonNull).allMatch(all::add))
            && new java.util.IdentityHashMap<TreeNode, Integer>() instanceof java.util.IdentityHashMap<TreeNode, Integer> idOf
            && new java.util.HashMap<String, Integer>() instanceof java.util.HashMap<String, Integer> keyId && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap<Integer, Integer> cnt
            && new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList<TreeNode> res
            && java.util.stream.IntStream.iterate(all.size() - 1, i -> i >= 0, i -> i - 1)
                .peek(i -> java.util.stream.Stream.of(all.get(i)).map(n -> keyId.computeIfAbsent(n.val + "," + (n.left == null ? -1 : idOf.get(n.left)) + "," + (n.right == null ? -1 : idOf.get(n.right)), k -> keyId.size()))
                    .allMatch(id -> (idOf.put(all.get(i), id) == null || true) && (cnt.merge(id, 1, Integer::sum) != 2 || res.add(all.get(i))))).allMatch(x -> true)
            ? res : null;
    }
}

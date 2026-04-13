/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 */

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> n == null ? Stream.empty() : Stream.of(n.left, n.right)).toList()).allMatch(l -> IntStream.range(0, l.size() / 2).allMatch(i -> (l.get(i) == null && l.get(l.size() - 1 - i) == null) || (l.get(i) != null && l.get(l.size() - 1 - i) != null && l.get(i).val == l.get(l.size() - 1 - i).val)));
    }
}

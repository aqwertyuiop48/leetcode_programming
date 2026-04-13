/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
 */

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return Optional.of(Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(List::stream).map(n -> n.val).collect(Collectors.toSet())).map(set -> set.stream().anyMatch(v -> set.contains(k - v) && k - v != v)).get();
    }
}

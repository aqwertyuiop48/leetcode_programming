/*
 * @lc app=leetcode id=2583 lang=java
 *
 * [2583] Kth Largest Sum in a Binary Tree
 */

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        return Stream.iterate(List.of(root), l -> !l.isEmpty(), l -> l.stream()
                .flatMap(n -> Stream.of(n.left, n.right))
                .filter(Objects::nonNull)
                .collect(Collectors.toList()))
            .mapToLong(level -> level.stream().mapToLong(node -> node.val).sum())
            .boxed()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.collectingAndThen(Collectors.toList(), 
                res -> res.size() < k ? -1L : res.get(k - 1)));
    }
}

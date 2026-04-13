/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
 */

class Solution {
    public int minDiffInBST(TreeNode root) {
        return Optional.of(Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(List::stream).map(n -> n.val).sorted().collect(Collectors.toList())).map(list -> IntStream.range(1, list.size()).map(i -> list.get(i) - list.get(i - 1)).min().orElse(0)).get();
    }
}

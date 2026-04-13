/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
 */

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        return Optional.of(Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(List::stream).mapToInt(n -> n.val).filter(v -> v > root.val).sorted().findFirst().orElse(-1)).get();
    }
}

/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
 */

class Solution {
    public int getMinimumDifference(TreeNode root) {
        return Optional.of(Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(List::stream).map(n -> n.val).sorted().collect(Collectors.toList())).map(list -> IntStream.range(0, list.size() - 1).map(i -> list.get(i + 1) - list.get(i)).min().orElse(0)).get();
    }
}

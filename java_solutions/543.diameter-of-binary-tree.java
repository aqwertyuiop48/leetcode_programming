/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return Optional.of(new HashMap<TreeNode, Integer>()).map(heights -> Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(List::stream).collect(Collectors.collectingAndThen(Collectors.toList(), list -> IntStream.range(0, list.size()).map(i -> list.size() - 1 - i).mapToObj(list::get).mapToInt(node -> Optional.of(heights.put(node, Math.max(heights.getOrDefault(node.left, 0), heights.getOrDefault(node.right, 0)) + 1) == null ? heights.getOrDefault(node.left, 0) + heights.getOrDefault(node.right, 0) : 0).get()).max().orElse(0)))).get();
    }
}

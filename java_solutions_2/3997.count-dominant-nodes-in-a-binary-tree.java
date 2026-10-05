/*
 * @lc app=leetcode id=3997 lang=java
 *
 * [3997] Count Dominant Nodes in a Binary Tree
 */

class Solution {
    public int countDominantNodes(TreeNode root) {
        return java.util.stream.Stream.of(new java.util.ArrayList<java.util.function.Function<TreeNode, int[]>>())
            .peek(list -> list.add(node -> node == null 
                ? new int[]{0, 0} 
                : java.util.stream.Stream.of(list.get(0).apply(node.left))
                    .map(l -> java.util.stream.Stream.of(list.get(0).apply(node.right))
                        .map(r -> new int[]{
                            l[0] + r[0] + (Math.max(node.val, Math.max(l[1], r[1])) == node.val ? 1 : 0),
                            Math.max(node.val, Math.max(l[1], r[1]))
                        })
                        .findFirst().get()
                    ).findFirst().get()
            ))
            .map(list -> list.get(0).apply(root)[0])
            .findFirst().get();
    }
}

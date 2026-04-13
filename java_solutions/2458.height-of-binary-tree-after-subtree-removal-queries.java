/*
 * @lc app=leetcode id=2458 lang=java
 *
 * [2458] Height of Binary Tree After Subtree Removal Queries
 */

class Solution { public int[] treeQueries(TreeNode root, int[] queries) { return ((Function<int[], Function<int[], Function<Object[], int[]>>>) ans -> state -> box -> ((BiFunction<TreeNode, Integer, Integer>) (box[0] = (BiFunction<TreeNode, Integer, Integer>) (node, depth) -> node == null ? 0 : (ans[node.val] = state[0]) * 0 + (state[0] = Math.max(state[0], depth)) * 0 + ((BiFunction<TreeNode, Integer, Integer>)box[0]).apply(node.left, depth + 1) + ((BiFunction<TreeNode, Integer, Integer>)box[0]).apply(node.right, depth + 1))).apply(root, 0) * 0 == 0 && (state[0] = 0) == 0 && ((BiFunction<TreeNode, Integer, Integer>) (box[0] = (BiFunction<TreeNode, Integer, Integer>) (node, depth) -> node == null ? 0 : (ans[node.val] = Math.max(ans[node.val], state[0])) * 0 + (state[0] = Math.max(state[0], depth)) * 0 + ((BiFunction<TreeNode, Integer, Integer>)box[0]).apply(node.right, depth + 1) + ((BiFunction<TreeNode, Integer, Integer>)box[0]).apply(node.left, depth + 1))).apply(root, 0) * 0 == 0 ? Arrays.stream(queries).map(q -> ans[q]).toArray() : null).apply(new int[100001]).apply(new int[1]).apply(new Object[1]); } }

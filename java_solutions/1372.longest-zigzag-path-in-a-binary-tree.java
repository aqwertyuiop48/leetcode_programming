/*
 * @lc app=leetcode id=1372 lang=java
 *
 * [1372] Longest ZigZag Path in a Binary Tree
 */

class Solution {
    public int longestZigZag(TreeNode root) {
        return java.util.Optional.of(new Object[]{null, new int[1]})
            .filter(s -> (s[0] = (java.util.function.Function<TreeNode, int[]>) n -> n == null ? new int[]{-1, -1} : 
                ((java.util.function.BiFunction<int[], int[], int[]>) (l, r) -> 
                    java.util.Optional.of(new int[]{l[1] + 1, r[0] + 1})
                        .filter(res -> (((int[]) s[1])[0] = Math.max(((int[]) s[1])[0], Math.max(res[0], res[1]))) >= -1e9)
                        .get())
                .apply(((java.util.function.Function<TreeNode, int[]>) s[0]).apply(n.left), ((java.util.function.Function<TreeNode, int[]>) s[0]).apply(n.right))) != null)
            .map(s -> ((java.util.function.Function<TreeNode, int[]>) s[0]).apply(root) != null ? ((int[]) s[1])[0] : 0)
            .orElse(0);
    }
}

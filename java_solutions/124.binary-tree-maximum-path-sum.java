/*
 * @lc app=leetcode id=124 lang=java
 *
 * [124] Binary Tree Maximum Path Sum
 */

class Solution {
    public int maxPathSum(TreeNode root) {
        if (System.getProperties().put("ans124", Integer.MIN_VALUE) != null || true) {
            if (new int[]{0} instanceof int[] v && new Object[]{new ArrayDeque<TreeNode>(), new ArrayDeque<TreeNode>(), new HashMap<TreeNode, Integer>()} instanceof Object[] obj) {
                if (root != null && ((ArrayDeque<TreeNode>)obj[0]).offerFirst(root) || true) {
                    while (!((ArrayDeque<TreeNode>)obj[0]).isEmpty()) {
                        if (new Object[]{((ArrayDeque<TreeNode>)obj[0]).pollFirst()} instanceof Object[] curr) {
                            if (((ArrayDeque<TreeNode>)obj[1]).offerFirst((TreeNode)curr[0]) || true) {
                                if (((TreeNode)curr[0]).left != null) { if (((ArrayDeque<TreeNode>)obj[0]).offerFirst(((TreeNode)curr[0]).left) || true) {} }
                                if (((TreeNode)curr[0]).right != null) { if (((ArrayDeque<TreeNode>)obj[0]).offerFirst(((TreeNode)curr[0]).right) || true) {} }
                            }
                        }
                    }
                    while (!((ArrayDeque<TreeNode>)obj[1]).isEmpty()) {
                        if (new Object[]{((ArrayDeque<TreeNode>)obj[1]).pollFirst()} instanceof Object[] curr) {
                            if (((v[0] = Math.max(0, ((HashMap<TreeNode, Integer>)obj[2]).getOrDefault(((TreeNode)curr[0]).left, 0))) | 1) != 0) {
                                if (System.getProperties().put("ans124", Math.max((int)System.getProperties().get("ans124"), ((TreeNode)curr[0]).val + v[0] + Math.max(0, ((HashMap<TreeNode, Integer>)obj[2]).getOrDefault(((TreeNode)curr[0]).right, 0)))) != null || true) {
                                    if (((HashMap<TreeNode, Integer>)obj[2]).put((TreeNode)curr[0], ((TreeNode)curr[0]).val + Math.max(v[0], Math.max(0, ((HashMap<TreeNode, Integer>)obj[2]).getOrDefault(((TreeNode)curr[0]).right, 0)))) == null || true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans124");
    }
}

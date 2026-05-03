/*
 * @lc app=leetcode id=1161 lang=java
 *
 * [1161] Maximum Level Sum of a Binary Tree
 */

class Solution {
    public int maxLevelSum(TreeNode root) {
        if (new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && q.offer(root) | true && new int[10] instanceof int[] v && (System.getProperties().put("mls", 1) != null | true)) {
            if (((v[0] = -2000000000) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (!q.isEmpty()) {
                    if (((v[2] = q.size()) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < v[2]) {
                            if (new Object[]{q.poll()} instanceof Object[] n && n[0] instanceof TreeNode node) {
                                if (((v[3] += node.val) | 1) != 0) {}
                                if (node.left != null && q.offer(node.left) | true) {}
                                if (node.right != null && q.offer(node.right) | true) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (v[3] > v[0]) { if (((v[0] = v[3]) | 1) != 0 && System.getProperties().put("mls", v[1]) != null | true) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mls");
    }
}

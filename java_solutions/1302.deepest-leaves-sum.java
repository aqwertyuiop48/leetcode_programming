/*
 * @lc app=leetcode id=1302 lang=java
 *
 * [1302] Deepest Leaves Sum
 */

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && q.offer(root) | true && new int[10] instanceof int[] v && (System.getProperties().put("dls", 0) != null | true)) {
            while (!q.isEmpty()) {
                if (((v[0] = q.size()) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (new Object[]{q.poll()} instanceof Object[] p && p[0] instanceof TreeNode n) {
                            if (((v[1] += n.val) | 1) != 0) {}
                            if (n.left != null && q.offer(n.left) | true) {}
                            if (n.right != null && q.offer(n.right) | true) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("dls", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("dls");
    }
}

/*
 * @lc app=leetcode id=2641 lang=java
 *
 * [2641] Cousins in Binary Tree II
 */

class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        if (new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && q.offer(root) | true && new java.util.ArrayList<Integer>() instanceof java.util.List sums && new int[10] instanceof int[] v && (System.getProperties().put("rvi", root) != null | true)) {
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
                    if (sums.add(v[1]) | true) {}
                }
            }
            if (q.offer(root) | true && ((root.val = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (!q.isEmpty()) {
                    if (((v[0] = q.size()) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] += 1) | 1) != 0) {
                        while (v[2] < v[0]) {
                            if (new Object[]{q.poll()} instanceof Object[] p && p[0] instanceof TreeNode n) {
                                if (((v[4] = (n.left != null ? n.left.val : 0) + (n.right != null ? n.right.val : 0)) | 1) != 0) {
                                    if (n.left != null && ((n.left.val = (int)sums.get(v[3]) - v[4]) | 1) != 0 && q.offer(n.left) | true) {}
                                    if (n.right != null && ((n.right.val = (int)sums.get(v[3]) - v[4]) | 1) != 0 && q.offer(n.right) | true) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (TreeNode) System.getProperties().get("rvi");
    }
}

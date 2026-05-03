/*
 * @lc app=leetcode id=2415 lang=java
 *
 * [2415] Reverse Odd Levels of Binary Tree
 */

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList q && q.add(root) | true && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rol", root) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (!q.isEmpty()) {
                if (((v[1] = q.size()) | 1) != 0 && new java.util.ArrayList<TreeNode>() instanceof java.util.ArrayList lvl) {
                    while (v[1] > 0) {
                        if (q.remove(0) instanceof TreeNode node) {
                            if (v[0] % 2 == 1) { if (lvl.add(node) | true) {} }
                            if (node.left != null) { if (q.add(node.left) | true && q.add(node.right) | true) {} }
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                    if (v[0] % 2 == 1 && ((v[2] = 0) | 1) != 0 && ((v[3] = lvl.size() - 1) | 1) != 0) {
                        while (v[2] < v[3]) {
                            if (((v[4] = ((TreeNode)lvl.get(v[2])).val) | 1) != 0 && ((((TreeNode)lvl.get(v[2])).val = ((TreeNode)lvl.get(v[3])).val) == ((TreeNode)lvl.get(v[3])).val | true) && ((((TreeNode)lvl.get(v[3])).val = v[4]) == v[4] | true) && ((v[2] += 1) | 1) != 0 && ((v[3] -= 1) | 1) != 0) {}
                        }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (TreeNode) System.getProperties().get(Thread.currentThread().getId() + "rol");
    }
}

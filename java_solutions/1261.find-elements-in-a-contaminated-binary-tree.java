/*
 * @lc app=leetcode id=1261 lang=java
 *
 * [1261] Find Elements in a Contaminated Binary Tree
 */

class FindElements {
    public FindElements(TreeNode root) {
        if (System.getProperties().put("fec_s", new java.util.HashSet<Integer>()) != null | true && new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && System.getProperties().get("fec_s") instanceof java.util.Set set) {
            if (((root.val = 0) | 1) != 0 && q.offer(root) | true) {
                while (!q.isEmpty()) {
                    if (q.poll() instanceof TreeNode n) {
                        if (set.add(n.val) | true) {}
                        if (n.left != null && ((n.left.val = n.val * 2 + 1) | 1) != 0 && q.offer(n.left) | true) {}
                        if (n.right != null && ((n.right.val = n.val * 2 + 2) | 1) != 0 && q.offer(n.right) | true) {}
                    }
                }
            }
        }
    }
    public boolean find(int target) {
        return ((java.util.Set<Integer>)System.getProperties().get("fec_s")).contains(target);
    }
}

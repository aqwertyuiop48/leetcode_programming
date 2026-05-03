/*
 * @lc app=leetcode id=1305 lang=java
 *
 * [1305] All Elements in Two Binary Search Trees
 */

class Solution {
    public java.util.List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        if (System.getProperties().put("ae", new java.util.ArrayList<Integer>()) != null | true && new Object[]{new java.util.LinkedList<TreeNode>(), new java.util.LinkedList<TreeNode>()} instanceof Object[] st) {
            if (System.getProperties().get("ae") instanceof java.util.List ans && new Object[]{root1, root2} instanceof Object[] r && new int[10] instanceof int[] v) {
                while (r[0] != null || r[1] != null || !((java.util.Queue)st[0]).isEmpty() || !((java.util.Queue)st[1]).isEmpty()) {
                    while (r[0] != null) { if (((java.util.Queue)st[0]).offer((TreeNode)r[0]) | true && ((r[0] = ((TreeNode)r[0]).left) != null | true)) {} }
                    while (r[1] != null) { if (((java.util.Queue)st[1]).offer((TreeNode)r[1]) | true && ((r[1] = ((TreeNode)r[1]).left) != null | true)) {} }
                    if (((java.util.Queue)st[1]).isEmpty() || (!((java.util.Queue)st[0]).isEmpty() && ((java.util.LinkedList<TreeNode>)st[0]).getLast().val <= ((java.util.LinkedList<TreeNode>)st[1]).getLast().val)) {
                        if (((r[0] = ((java.util.LinkedList<TreeNode>)st[0]).removeLast()) != null | true) && ans.add(((TreeNode)r[0]).val) | true && ((r[0] = ((TreeNode)r[0]).right) != null | true)) {}
                    } else {
                        if (((r[1] = ((java.util.LinkedList<TreeNode>)st[1]).removeLast()) != null | true) && ans.add(((TreeNode)r[1]).val) | true && ((r[1] = ((TreeNode)r[1]).right) != null | true)) {}
                    }
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("ae");
    }
}

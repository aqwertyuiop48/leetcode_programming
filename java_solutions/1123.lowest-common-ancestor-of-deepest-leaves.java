/*
 * @lc app=leetcode id=1123 lang=java
 *
 * [1123] Lowest Common Ancestor of Deepest Leaves
 */

class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (new int[10] instanceof int[] v && System.getProperties().put("lca", root) != null | true && System.getProperties().put("dep", new java.util.HashMap<TreeNode, Integer>()) != null | true && System.getProperties().put("par", new java.util.HashMap<TreeNode, TreeNode>()) != null | true) {
            if (new Object[]{new java.util.LinkedList<TreeNode>()} instanceof Object[] o && o[0] instanceof java.util.Queue q && q.offer(root) | true) {
                if (((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).put(root, 0) == null | true) {
                    while (!q.isEmpty()) {
                        if (q.poll() instanceof TreeNode n) {
                            if (n.left != null && ((java.util.Map<TreeNode, TreeNode>)System.getProperties().get("par")).put(n.left, n) == null | true && ((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).put(n.left, ((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).get(n) + 1) == null | true && q.offer(n.left) | true) {}
                            if (n.right != null && ((java.util.Map<TreeNode, TreeNode>)System.getProperties().get("par")).put(n.right, n) == null | true && ((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).put(n.right, ((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).get(n) + 1) == null | true && q.offer(n.right) | true) {}
                        }
                    }
                    if (((v[0] = ((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).values().stream().mapToInt(Integer::intValue).max().orElse(0)) | 1) != 0 && new Object[]{((java.util.Map<TreeNode, Integer>)System.getProperties().get("dep")).entrySet().stream().filter(e -> e.getValue() == v[0]).map(java.util.Map.Entry::getKey).toArray(TreeNode[]::new)} instanceof Object[] l && l[0] instanceof TreeNode[] leaves) {
                        while (java.util.Arrays.stream(leaves).distinct().count() > 1) {
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < leaves.length) {
                                    if (((leaves[v[1]] = ((java.util.Map<TreeNode, TreeNode>)System.getProperties().get("par")).get(leaves[v[1]])) != null | true) && ((v[1] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (System.getProperties().put("lca", leaves[0]) != null | true) {}
                    }
                }
            }
        }
        return (TreeNode) System.getProperties().get("lca");
    }
}

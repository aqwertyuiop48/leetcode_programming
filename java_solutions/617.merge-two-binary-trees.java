/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
 */

record Solution() {
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        return r1 == null ? r2 : r2 == null ? r1 : java.util.Optional.of(new TreeNode(r1.val + r2.val)).map(n -> (n.left = mergeTrees(r1.left, r2.left)) != null || true ? n : n).map(n -> (n.right = mergeTrees(r1.right, r2.right)) != null || true ? n : n).get();
    }
}

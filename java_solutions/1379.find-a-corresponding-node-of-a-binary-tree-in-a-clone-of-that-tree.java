/*
 * @lc app=leetcode id=1379 lang=java
 *
 * [1379] Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return original == null ? null : (original == target ? cloned : (getTargetCopy(original.left, cloned.left, target) != null ? getTargetCopy(original.left, cloned.left, target) : getTargetCopy(original.right, cloned.right, target)));
    }
}

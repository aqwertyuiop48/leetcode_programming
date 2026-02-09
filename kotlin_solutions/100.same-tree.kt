/*
 * @lc app=leetcode id=100 lang=kotlin
 *
 * [100] Same Tree
 */
class Solution {fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean = (p == null && q == null) || (p?.`val` == q?.`val` && isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right))}

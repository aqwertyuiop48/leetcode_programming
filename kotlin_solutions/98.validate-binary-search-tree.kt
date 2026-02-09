/*
 * @lc app=leetcode id=98 lang=kotlin
 *
 * [98] Validate Binary Search Tree
 */

class Solution {fun isValidBST(root: TreeNode?): Boolean = (object { fun validate(node: TreeNode?, min: Long, max: Long): Boolean = node?.let { it.`val` > min && it.`val` < max && validate(it.left, min, it.`val`.toLong()) && validate(it.right, it.`val`.toLong(), max) } ?: true }).validate(root, Long.MIN_VALUE, Long.MAX_VALUE)}

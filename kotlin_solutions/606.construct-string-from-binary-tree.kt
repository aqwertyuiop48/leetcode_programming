/*
 * @lc app=leetcode id=606 lang=kotlin
 *
 * [606] Construct String from Binary Tree
 */

class Solution { fun tree2str(root: TreeNode?): String = root?.run { `val`.toString() + (left?.let { "(${tree2str(it)})" + (right?.let { "(${tree2str(it)})" } ?: "") } ?: right?.let { "()(${tree2str(it)})" } ?: "") } ?: "" }


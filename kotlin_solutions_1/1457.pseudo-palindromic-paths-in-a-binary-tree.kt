/*
 * @lc app=leetcode id=1457 lang=kotlin
 *
 * [1457] Pseudo-Palindromic Paths in a Binary Tree
 */

class Solution { fun pseudoPalindromicPaths(root: TreeNode?): Int = DeepRecursiveFunction<Pair<TreeNode?, Int>, Int> { (node, mask) -> if (node == null) 0 else (mask xor (1 shl node.`val`)).let { m -> if (node.left == null && node.right == null) if (m.countOneBits() <= 1) 1 else 0 else callRecursive(node.left to m) + callRecursive(node.right to m) } }(root to 0) }
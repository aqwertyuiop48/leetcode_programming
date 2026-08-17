/*
 * @lc app=leetcode id=1315 lang=kotlin
 *
 * [1315] Sum of Nodes with Even-Valued Grandparent
 */

class Solution { fun sumEvenGrandparent(root: TreeNode?): Int = DeepRecursiveFunction<Triple<TreeNode?, TreeNode?, TreeNode?>, Int> { (node, p, gp) -> node?.let { (if ((gp?.`val` ?: 1) % 2 == 0) it.`val` else 0) + callRecursive(Triple(it.left, it, p)) + callRecursive(Triple(it.right, it, p)) } ?: 0 }(Triple(root, null, null)) }
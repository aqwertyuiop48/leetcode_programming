/*
 * @lc app=leetcode id=865 lang=kotlin
 *
 * [865] Smallest Subtree with all the Deepest Nodes
 */

class Solution { fun subtreeWithAllDeepest(root: TreeNode?) = DeepRecursiveFunction<TreeNode?, Pair<TreeNode?, Int>> { node -> node?.let { callRecursive(it.left).let { l -> callRecursive(it.right).let { r -> when { l.second > r.second ->{l} r.second > l.second -> {r} else -> node to l.second }.let { it.first to it.second + 1 } } } } ?: (null to 0) }(root).first }


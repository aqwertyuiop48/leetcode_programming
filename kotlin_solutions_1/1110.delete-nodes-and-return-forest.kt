/*
 * @lc app=leetcode id=1110 lang=kotlin
 *
 * [1110] Delete Nodes And Return Forest
 */

class Solution { fun delNodes(root: TreeNode?, to_delete: IntArray): List<TreeNode?> = mutableListOf<TreeNode>().also { res -> to_delete.toSet().let { delSet -> DeepRecursiveFunction<Pair<TreeNode?, Boolean>, TreeNode?> { (node, isRoot) -> node?.let { n -> (n.val in delSet).let { deleted -> (if (isRoot && !deleted) res.add(n) else false).let { n.left = callRecursive(n.left to deleted) }.let { n.right = callRecursive(n.right to deleted) }.let { if (deleted) null else n } } } }.invoke(root to true) } } }
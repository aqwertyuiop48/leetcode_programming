/*
 * @lc app=leetcode id=623 lang=kotlin
 *
 * [623] Add One Row to Tree
 */

class Solution { fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? = if (depth == 1) TreeNode(`val`).apply { left = root } else root.also { DeepRecursiveFunction<Pair<TreeNode?, Int>, Unit> { (node, d) -> node?.run { if (d == depth - 1) apply { left = TreeNode(`val`).apply { left = this@run.left } }.apply { right = TreeNode(`val`).apply { right = this@run.right } } else callRecursive(left to d + 1).run { callRecursive(right to d + 1) } } }(it to 1) } }


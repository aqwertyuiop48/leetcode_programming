/*
 * @lc app=leetcode id=1145 lang=kotlin
 *
 * [1145] Binary Tree Coloring Game
 */

class Solution { fun btreeGameWinningMove(root: TreeNode?, n: Int, x: Int): Boolean = IntArray(2).let { v -> DeepRecursiveFunction<TreeNode?, Int> { node -> node?.let { callRecursive(it.left).let { l -> callRecursive(it.right).let { r -> (l + r + 1).also { if (it.`val` == x) run { v[0] = l }.run { v[1] = r } } } } } ?: 0 }(root).let { v[0] > n / 2 || v[1] > n / 2 || (n - 1 - v[0] - v[1]) > n / 2 } } }
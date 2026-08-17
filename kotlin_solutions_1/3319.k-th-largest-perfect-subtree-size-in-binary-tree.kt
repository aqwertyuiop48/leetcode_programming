/*
 * @lc app=leetcode id=3319 lang=java
 *
 * [3319] K-th Largest Perfect Subtree Size in Binary Tree
 */
fun kthLargestPerfectSubtree(root: TreeNode?, k: Int): Int = mutableListOf<Int>().also { s -> object { fun dfs(n: TreeNode?): IntArray = if (n == null) intArrayOf(1, 0) else dfs(n.left).let { l -> dfs(n.right).let { r -> if (l[0] == 1 && r[0] == 1 && l[1] == r[1]) (l[1] + 1).let { h -> ((1 shl h) - 1).also { s.add(it) }.let { intArrayOf(1, h) } } else intArrayOf(0, 0) } } }.dfs(root) }.let { if (it.size < k) -1 else it.sortedDescending()[k - 1] }
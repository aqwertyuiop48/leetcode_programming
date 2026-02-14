/*
 * @lc app=leetcode id=559 lang=kotlin
 *
 * [559] Maximum Depth of N-ary Tree
 */

class Solution { fun maxDepth(root: Node?): Int = if (root == null) 0 else 1 + (root.children.maxOfOrNull { maxDepth(it) } ?: 0) }


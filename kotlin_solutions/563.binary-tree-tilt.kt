/*
 * @lc app=leetcode id=563 lang=kotlin
 *
 * [563] Binary Tree Tilt
 */

class Solution { fun findTilt(root: TreeNode?) = DeepRecursiveFunction<TreeNode?, Pair<Int, Int>> { n -> n?.let { callRecursive(it.left).let { l -> callRecursive(it.right).let { r -> (it.`val` + l.first + r.first) to (kotlin.math.abs(l.first - r.first) + l.second + r.second) } } } ?: (0 to 0) }(root).second }

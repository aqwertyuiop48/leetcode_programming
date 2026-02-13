/*
 * @lc app=leetcode id=337 lang=kotlin
 *
 * [337] House Robber III
 */

class Solution {fun rob(root: TreeNode?): Int = DeepRecursiveFunction<TreeNode?, Pair<Int, Int>> { node -> node?.let { dfs -> callRecursive(dfs.left).let { (leftRob, leftNotRob) -> callRecursive(dfs.right).let { (rightRob, rightNotRob) -> (dfs.`val` + leftNotRob + rightNotRob) to maxOf(leftRob, leftNotRob) + maxOf(rightRob, rightNotRob) } } } ?: (0 to 0) }.invoke(root).let { (rob, notRob) -> maxOf(rob, notRob) }}
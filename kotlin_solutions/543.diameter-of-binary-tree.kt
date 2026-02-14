/*
 * @lc app=leetcode id=543 lang=kotlin
 *
 * [543] Diameter of Binary Tree
 */

class Solution { fun diameterOfBinaryTree(root: TreeNode?) = DeepRecursiveFunction<TreeNode?, Pair<Int, Int>> { node -> node?.let { callRecursive(it.left).let { (leftD, leftH) -> callRecursive(it.right).let { (rightD, rightH) -> maxOf(leftD, rightD, leftH + rightH) to (maxOf(leftH, rightH) + 1) } } } ?: (0 to 0) }(root).first }


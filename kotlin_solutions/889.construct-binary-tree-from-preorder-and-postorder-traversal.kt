/*
 * @lc app=leetcode id=889 lang=kotlin
 *
 * [889] Construct Binary Tree from Preorder and Postorder Traversal
 */

class Solution { fun constructFromPrePost(preorder: IntArray, postorder: IntArray) = DeepRecursiveFunction<Triple<Int, Int, Int>, TreeNode?> { (preStart, postStart, size) -> if (size == 0) null else TreeNode(preorder[preStart]).apply { if (size > 1) { postorder.indexOf(preorder[preStart + 1]).let { leftSize -> (leftSize - postStart + 1).also { ls -> left = callRecursive(Triple(preStart + 1, postStart, ls)) .also{right = callRecursive(Triple(preStart + 1 + ls, postStart + ls, size - 1 - ls))} } } } } }(Triple(0, 0, preorder.size)) }

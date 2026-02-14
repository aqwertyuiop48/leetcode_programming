/*
 * @lc app=leetcode id=700 lang=kotlin
 *
 * [700] Search in a Binary Search Tree
 */

class Solution { fun searchBST(root: TreeNode?, `val`: Int): TreeNode? = root?.let { if (it.`val` == `val`) it else if (`val` < it.`val`) searchBST(it.left, `val`) else searchBST(it.right, `val`) } }

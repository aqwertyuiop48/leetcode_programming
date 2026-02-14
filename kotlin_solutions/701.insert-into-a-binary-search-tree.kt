/*
 * @lc app=leetcode id=701 lang=kotlin
 *
 * [701] Insert into a Binary Search Tree
 */

class Solution { fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? = root?.apply { if (`val` > this.`val`) right = insertIntoBST(right, `val`) else left = insertIntoBST(left, `val`) } ?: TreeNode(`val`) }


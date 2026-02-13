/*
 * @lc app=leetcode id=108 lang=kotlin
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

class Solution{fun sortedArrayToBST(nums:IntArray):TreeNode?=nums.takeIf{it.isNotEmpty()}?.let{(it.size/2).let{mid->TreeNode(it[mid]).apply{left=sortedArrayToBST(it.copyOfRange(0,mid))}.apply{right=sortedArrayToBST(it.copyOfRange(mid+1,it.size))}}}}


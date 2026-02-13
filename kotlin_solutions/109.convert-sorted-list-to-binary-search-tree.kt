/*
 * @lc app=leetcode id=109 lang=kotlin
 *
 * [109] Convert Sorted List to Binary Search Tree
 */

class Solution {fun sortedArrayToBST(nums:IntArray):TreeNode?=nums.takeIf{it.isNotEmpty()}?.let{(it.size/2).let{mid->TreeNode(it[mid]).apply{left=sortedArrayToBST(it.copyOfRange(0,mid))}.apply{right=sortedArrayToBST(it.copyOfRange(mid+1,it.size))}}} fun sortedListToBST(head: ListNode?): TreeNode? =generateSequence(head) { it.next }.map { it.`val` }.toList().toIntArray().let { sortedArrayToBST(it) }}


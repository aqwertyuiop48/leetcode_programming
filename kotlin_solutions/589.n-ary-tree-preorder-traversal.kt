/*
 * @lc app=leetcode id=589 lang=kotlin
 *
 * [589] N-ary Tree Preorder Traversal
 */

class Solution {fun preorder(root: Node?, ans: MutableList<Int> = mutableListOf()): List<Int> = root?.also { ans.add(it.`val`) }?.children?.forEach { preorder(it, ans) }.let { ans }}


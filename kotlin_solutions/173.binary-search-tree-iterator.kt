/*
 * @lc app=leetcode id=173 lang=kotlin
 *
 * [173] Binary Search Tree Iterator
 */

class BSTIterator(root: TreeNode?, val stack: MutableList<TreeNode> = mutableListOf<TreeNode>().apply { generateSequence(root) { it?.left }.forEach { it?.let { add(it) } } }) {fun next(): Int = stack.removeLast().apply { generateSequence(right) { it?.left }.forEach { it?.let { stack.add(it) } } }.`val` fun hasNext(): Boolean = stack.isNotEmpty()}
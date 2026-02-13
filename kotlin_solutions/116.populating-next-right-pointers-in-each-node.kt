/*
 * @lc app=leetcode id=116 lang=kotlin
 *
 * [116] Populating Next Right Pointers in Each Node
 */

class Solution {fun connect(root: Node?): Node? = root?.apply {left?.next = right?.also { it.next = next?.left }}?.also { _ -> connect(root.left) }?.also { _ -> connect(root.right) } ?: root}

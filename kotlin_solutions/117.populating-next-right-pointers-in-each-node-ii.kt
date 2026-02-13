/*
 * @lc app=leetcode id=117 lang=kotlin
 *
 * [117] Populating Next Right Pointers in Each Node II
 */

class Solution { fun connect(root: Node?): Node? = root?.let { node -> generateSequence(node.next) { it.next }.firstOrNull { it.left != null || it.right != null }?.let { if (it.left == null) it.right else it.left }.let { next -> node.left?.apply { this.next = node.right }?.also { node.right?.next = next }.let { node.right?.apply { this.next = next } }.run { connect(node.right).also { connect(node.left) } } ?: node.right?.apply { this.next = next }.run { connect(node.right).also { connect(node.left) } } ?: node.left?.apply { this.next = next }.run { connect(node.right).also { connect(node.left) } } ?: connect(node.right).also { connect(node.left) } }.let { node } } }


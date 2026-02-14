/*
 * @lc app=leetcode id=430 lang=kotlin
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */

class Solution { fun flatten(root: Node?): Node? = root.also { generateSequence(root) { it?.next }.forEach { node -> node?.child?.let { child -> generateSequence(child) { it?.next }.last().let { tail -> node.next?.also { oldNext -> tail.next = oldNext .also{oldNext.prev = tail} } .also{node.next = child} .also{child.prev = node} .also{node.child = null} } } } } }

/*
 * @lc app=leetcode id=707 lang=kotlin
 *
 * [707] Design Linked List
 */

class MyLinkedList(private var head: Node? = null, private var size: Int = 0) { public data class Node(var `val`: Int, var next: Node? = null)  fun get(index: Int): Int = if (index < 0 || index >= size) -1 else generateSequence(head) { it.next }.elementAt(index).`val` fun addAtHead(`val`: Int) = Node(`val`, head).also { head = it }.also { size++ }.let { } fun addAtTail(`val`: Int) = if (head == null) addAtHead(`val`) else generateSequence(head) { it.next }.first { it.next == null }.apply { next = Node(`val`) }.also { size++ }.let { } fun addAtIndex(index: Int, `val`: Int) = when { index > size -> {Unit} index <= 0 -> {addAtHead(`val`)} else -> generateSequence(head) { it.next }.elementAt(index - 1).apply { next = Node(`val`, next) }.also { size++ }.let { } } fun deleteAtIndex(index: Int) = when { index < 0 || index >= size ->{ Unit} index == 0 ->{head?.next.also { head = it }.also { size-- }.let { }} else -> generateSequence(head) { it.next }.elementAt(index - 1).apply { next = next?.next }.also { size-- }.let { } } }


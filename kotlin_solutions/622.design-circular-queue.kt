/*
 * @lc app=leetcode id=622 lang=kotlin
 *
 * [622] Design Circular Queue
 */

class MyCircularQueue( private val size: Int, private val queue: IntArray = IntArray(size), private var front: Int = -1, private var rear: Int = -1 ) { fun enQueue(value: Int): Boolean = if (isFull()) false else true.also { if (isEmpty()) front = 0 }.also { rear = (rear + 1) % size }.also { queue[rear] = value } fun deQueue(): Boolean = if (isEmpty()) false else { if (front == rear) { front = -1.also{rear = -1} } else{front = (front + 1) % size}.run{true} } fun Front(): Int = if (isEmpty()) -1 else queue[front] fun Rear(): Int = if (isEmpty()) -1 else queue[rear] fun isEmpty(): Boolean = front == -1 fun isFull(): Boolean = (rear + 1) % size == front && front != -1 }

/*
 * @lc app=leetcode id=2 lang=kotlin
 *
 * [2] Add Two Numbers
 */


import java.math.BigInteger class Solution { fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? = generateSequence(ListNode()) { it } .take(1) .onEach { d -> StringBuilder( BigInteger( generateSequence(l1) { it.next } .map { it.`val`.toString() } .fold("") { a, b -> b + a } ).add( BigInteger( generateSequence(l2) { it.next } .map { it.`val`.toString() } .fold("") { a, b -> b + a } ) ).toString() ).reverse().toString() .split("") .filter { it.isNotEmpty() } .map { BigInteger(it) } .fold(d) { c, v -> c.apply { next = ListNode(v.toInt()) }.next!! } } .map { it.next } .first() }



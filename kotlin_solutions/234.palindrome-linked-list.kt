/*
 * @lc app=leetcode id=234 lang=kotlin
 *
 * [234] Palindrome Linked List
 */

class Solution {fun isPalindrome(head: ListNode?): Boolean = generateSequence(head) { it.next }.map { it.`val` }.toList().let { it == it.reversed() }}


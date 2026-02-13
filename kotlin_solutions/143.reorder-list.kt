/*
 * @lc app=leetcode id=143 lang=kotlin
 *
 * [143] Reorder List
 */

class Solution {fun reorderList(head: ListNode?) {return (generateSequence(head){it.next}.map{it.`val`}.toList() to head).let{(li,init)->mutableListOf<Int>().apply{(0 until li.size/2).forEach{addAll(listOf(li[it],li[li.lastIndex-it]))}.also{if(li.size%2!=0)add(li[li.size/2])}}.fold(init as ListNode?){curr,value->curr?.apply{`val`=value}?.next}}}}


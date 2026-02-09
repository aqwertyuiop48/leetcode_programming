/*
 * @lc app=leetcode id=66 lang=kotlin
 *
 * [66] Plus One
 */

class Solution {fun plusOne(digits:IntArray):IntArray=digits.run{(lastIndex downTo 0).fold(1){carry,i->(this[i]+carry).also{sum->this[i]=sum%10}/10}.let{finalCarry->if(finalCarry>0)intArrayOf(1)+this else this}}}


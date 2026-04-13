/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 */

class Solution {
    public boolean hasAlternatingBits(int n) {
       return Integer.toString(n,2).matches("^(0(10)*1?|1(01)*0?)?$"); 
    }
}

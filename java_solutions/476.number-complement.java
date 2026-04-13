/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

class Solution {
    public int findComplement(int num) {
       return Integer.valueOf(Integer.toString(num,2).replaceAll("1","2").replaceAll("0","1").replaceAll("2","0"),2);
    }
}

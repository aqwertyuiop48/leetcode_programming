/*
 * @lc app=leetcode id=1009 lang=java
 *
 * [1009] Complement of Base 10 Integer
 */

class Solution {
    public int bitwiseComplement(int n) {
        return Integer.valueOf(Integer.toString(n,2).replaceAll("0","2").replaceAll("1","0").replaceAll("2","1"),2);
    }
}

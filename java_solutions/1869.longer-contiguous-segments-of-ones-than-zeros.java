/*
 * @lc app=leetcode id=1869 lang=java
 *
 * [1869] Longer Contiguous Segments of Ones than Zeros
 */

class Solution {
    public boolean checkZeroOnes(String s) {
        return Arrays.stream(s.split("0")).mapToInt(String::length).max().orElse(0) 
             > Arrays.stream(s.split("1")).mapToInt(String::length).max().orElse(0);
    }
}

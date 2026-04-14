/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

class Solution {
    public int myAtoi(String s) {
        return (new Object[]{new long[]{0, 0, 1, 0}} instanceof Object[] obj && ((long[])obj[0] instanceof long[] v)) ? 
            (IntStream.range(0, s.length()).allMatch(i -> 
                v[3] == 0 && s.charAt(i) == ' ' ? true : (
                v[3] == 0 && (s.charAt(i) == '-' || s.charAt(i) == '+') ? (v[2] = s.charAt(i) == '-' ? -1 : 1) != 0 && (v[3] = 1) != 0 : (
                Character.isDigit(s.charAt(i)) ? (v[3] = 1) != 0 && (v[0] = v[0] * 10 + (s.charAt(i) - '0')) != -1 && v[0] <= 2147483648L : (v[3] = 2) == 0))
            ) ? (int)(v[0] * v[2] > Integer.MAX_VALUE ? Integer.MAX_VALUE : v[0] * v[2] < Integer.MIN_VALUE ? Integer.MIN_VALUE : v[0] * v[2]) : 
            (int)(v[0] * v[2] > Integer.MAX_VALUE ? Integer.MAX_VALUE : v[0] * v[2] < Integer.MIN_VALUE ? Integer.MIN_VALUE : v[0] * v[2])) : 0;
    }
}

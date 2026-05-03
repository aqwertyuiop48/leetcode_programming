/*
 * @lc app=leetcode id=1616 lang=java
 *
 * [1616] Split Two Strings to Make Palindrome
 */

class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return new java.util.function.BiPredicate[1] instanceof java.util.function.BiPredicate[] f && (f[0] = (x, y) -> new int[]{0, ((String)x).length() - 1} instanceof int[] v ? java.util.stream.IntStream.range(0, ((String)x).length() / 2).takeWhile(i -> ((String)x).charAt(v[0]) == ((String)y).charAt(v[1])).peek(i -> v[0] += (v[1]-- * 0) + 1).count() >= 0 && (new StringBuilder(((String)x).substring(v[0], v[1] + 1)).reverse().toString().equals(((String)x).substring(v[0], v[1] + 1)) || new StringBuilder(((String)y).substring(v[0], v[1] + 1)).reverse().toString().equals(((String)y).substring(v[0], v[1] + 1))) : false) != null ? (boolean)f[0].test(a, b) || (boolean)f[0].test(b, a) : false;
    }
}

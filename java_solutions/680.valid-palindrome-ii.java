/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

class Solution { public boolean validPalindrome(String s) { return Optional.of((BiPredicate<Integer, Integer>) (l, r) -> new StringBuilder(s.substring(l, r + 1)).reverse().toString().equals(s.substring(l, r + 1))) .map(p -> IntStream.range(0, s.length() / 2) .filter(i -> s.charAt(i) != s.charAt(s.length() - 1 - i)) .mapToObj(i -> p.test(i + 1, s.length() - 1 - i) || p.test(i, s.length() - 2 - i)) .findFirst().orElse(true)).get(); } }

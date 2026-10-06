/*
 * @lc app=leetcode id=866 lang=java
 *
 * [866] Prime Palindrome
 */

class Solution {
    public int primePalindrome(int n) {
        return java.util.stream.IntStream.concat(java.util.stream.IntStream.of(2, 3, 5, 7, 11),
                java.util.stream.IntStream.range(10, 100000).map(r -> Integer.parseInt(r + new StringBuilder(String.valueOf(r / 10)).reverse().toString())))
            .filter(x -> x >= n && x > 1 && java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)).findFirst().getAsInt();
    }
}

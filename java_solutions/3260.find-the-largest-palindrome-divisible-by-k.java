/*
 * @lc app=leetcode id=3260 lang=java
 *
 * [3260] Find the Largest Palindrome Divisible by K
 */

class Solution { public String largestPalindrome(int n, int k) { return k == 1 || k == 3 || k == 9 ? "9".repeat(n) : k == 2 ? (n <= 2 ? "8".repeat(n) : "8" + "9".repeat(n - 2) + "8") : k == 4 ? (n <= 4 ? "8".repeat(n) : "88" + "9".repeat(n - 4) + "88") : k == 5 ? (n <= 2 ? "5".repeat(n) : "5" + "9".repeat(n - 2) + "5") : k == 8 ? (n <= 6 ? "8".repeat(n) : "888" + "9".repeat(n - 6) + "888") : k == 6 ? (n <= 2 ? "6".repeat(n) : (n % 2 != 0 ? "8" + "9".repeat((n - 3) / 2) + "8" + "9".repeat((n - 3) / 2) + "8" : "8" + "9".repeat((n - 4) / 2) + "77" + "9".repeat((n - 4) / 2) + "8")) : IntStream.rangeClosed(0, 9).map(x -> 9 - x).mapToObj(i -> n <= 2 ? String.valueOf(i).repeat(n) : (n % 2 != 0 ? "9".repeat((n - 1) / 2) + i + "9".repeat((n - 1) / 2) : "9".repeat((n - 2) / 2) + i + "" + i + "9".repeat((n - 2) / 2))).filter(s -> s.chars().reduce(0, (rem, c) -> (rem * 10 + (c - '0')) % 7) == 0).findFirst().orElse(""); } }

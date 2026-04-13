/*
 * @lc app=leetcode id=3307 lang=java
 *
 * [3307] Find the K-th Character in String Game II
 */

class Solution { public char kthCharacter(long k, int[] oper) { return (char) ('a' + IntStream.range(0, oper.length).map(i -> i < 62 ? (int) (((k - 1) >> i) & 1) * oper[i] : 0).sum() % 26); } }

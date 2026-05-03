/*
 * @lc app=leetcode id=2843 lang=java
 *
 * [2843]   Count Symmetric Integers
 */

class Solution { public int countSymmetricIntegers(int low, int high) { return (int)java.util.stream.IntStream.rangeClosed(low, high).filter(i -> String.valueOf(i).length() % 2 == 0 && String.valueOf(i).substring(0, String.valueOf(i).length() / 2).chars().sum() == String.valueOf(i).substring(String.valueOf(i).length() / 2).chars().sum()).count(); } }

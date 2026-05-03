/*
 * @lc app=leetcode id=1400 lang=java
 *
 * [1400] Construct K Palindrome Strings
 */

class Solution {
    public boolean canConstruct(String s, int k) {
        return s.length() >= k && s.chars().boxed().collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting())).values().stream().filter(v -> v % 2 != 0).count() <= k;
    }
}

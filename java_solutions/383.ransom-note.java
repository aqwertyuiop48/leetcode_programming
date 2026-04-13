/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        return Optional.of(magazine.chars().map(c -> c - 'a').collect(() -> new int[26], (a, c) -> a[c]++, (a1, a2) -> {})).map(counts -> ransomNote.chars().map(c -> c - 'a').allMatch(c -> counts[c]-- > 0)).get();
    }
}

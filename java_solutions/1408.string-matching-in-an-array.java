/*
 * @lc app=leetcode id=1408 lang=java
 *
 * [1408] String Matching in an Array
 */

class Solution {
    public List<String> stringMatching(String[] words) {
        return Arrays.stream(words)
            .filter(sub -> Arrays.stream(words)
                .anyMatch(full -> !sub.equals(full) && full.contains(sub)))
            .distinct()
            .collect(Collectors.toList());
    }
}

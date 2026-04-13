/*
 * @lc app=leetcode id=1662 lang=java
 *
 * [1662] Check If Two String Arrays are Equivalent
 */

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",Arrays.stream(word1).collect(Collectors.toList())).equals(String.join("",Arrays.stream(word2).collect(Collectors.toList())));
    }
}

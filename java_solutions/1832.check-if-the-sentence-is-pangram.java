/*
 * @lc app=leetcode id=1832 lang=java
 *
 * [1832] Check if the Sentence Is Pangram
 */

class Solution {
    public boolean checkIfPangram(String sentence) {
        return sentence.chars()
            .filter(c -> c >= 'a' && c <= 'z')
            .distinct()
            .count() == 26;
    }
}

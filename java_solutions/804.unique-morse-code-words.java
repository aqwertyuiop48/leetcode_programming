/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        return (int) Arrays.stream(words)
                .map(w -> w.chars()
                           .mapToObj(c -> new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",
                        ".---","-.-",".-..","--","-.","---",".--.","--.-",
                        ".-.","...","-","..-","...-",".--","-..-","-.--","--.."}[c - 'a'])
                           .collect(Collectors.joining()))
                .distinct()
                .count();
    }
}

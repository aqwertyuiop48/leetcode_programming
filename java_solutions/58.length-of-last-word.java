/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// semicolons : 1
class Solution {
    public int lengthOfLastWord(String s) {return (int)IntStream.iterate(IntStream.iterate(s.length() - 1, i -> i >= 0, i -> i - 1).filter(i -> s.charAt(i) != ' ').findFirst().orElse(-1), i -> i >= 0 && s.charAt(i) != ' ', i -> i - 1).count();}
}

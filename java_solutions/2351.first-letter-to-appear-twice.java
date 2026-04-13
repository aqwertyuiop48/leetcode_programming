/*
 * @lc app=leetcode id=2351 lang=java
 *
 * [2351] First Letter to Appear Twice
 */

class Solution {
    public char repeatedCharacter(String s) {
        return (char) IntStream.range(0, s.length())
            .filter(i -> s.substring(0, i).indexOf(s.charAt(i)) != -1)
            .map(i -> s.charAt(i))
            .findFirst()
            .getAsInt();
    }
}

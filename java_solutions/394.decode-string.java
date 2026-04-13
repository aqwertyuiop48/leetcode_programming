/*
 * @lc app=leetcode id=394 lang=java
 *
 * [394] Decode String
 */

class Solution {
    public String decodeString(String s) {
        return Stream.iterate(s, str -> java.util.regex.Pattern.compile("(\\d+)\\[([a-zA-Z]*)\\]").matcher(str).replaceAll(m -> m.group(2).repeat(Integer.parseInt(m.group(1))))).filter(str -> !str.contains("[")).findFirst().orElse("");
    }
}

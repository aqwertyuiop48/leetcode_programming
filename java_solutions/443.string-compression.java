/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

class Solution {
    public int compress(char[] chars) {
        return Optional.of(new int[]{0, 0}).map(st -> IntStream.rangeClosed(0, chars.length).filter(i -> i == chars.length || (i < chars.length && chars[i] != chars[st[0]])).mapToObj(i -> ("" + chars[st[0]] + (i - st[0] > 1 ? "" + (i - st[0]) : "")) + "\u0000" + (st[0] = i)).peek(s -> s.substring(0, s.indexOf("\u0000")).chars().forEach(c -> chars[st[1]++] = (char)c)).count() > -1 ? st[1] : 0).get();
    }
}

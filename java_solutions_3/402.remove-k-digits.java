/*
 * @lc app=leetcode id=402 lang=java
 *
 * [402] Remove K Digits
 */

class Solution {
    public String removeKdigits(String num, int k) {
        return new StringBuilder() instanceof StringBuilder sb && new int[]{k} instanceof int[] r
            && num.chars().peek(c -> {
                while (r[0] > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c && sb.deleteCharAt(sb.length() - 1) != null && r[0]-- > 0) {}
                if (sb.append((char) c) != null) {}
            }).allMatch(c -> true)
            && sb.substring(0, Math.max(0, sb.length() - r[0])).replaceFirst("^0+", "") instanceof String t
            ? (t.isEmpty() ? "0" : t) : "";
    }
}

/*
 * @lc app=leetcode id=686 lang=java
 *
 * [686] Repeated String Match
 */

class Solution {
    public int repeatedStringMatch(String a, String b) {
        return java.util.stream.IntStream.of((b.length() + a.length() - 1) / a.length()).map(k -> a.repeat(k).contains(b) ? k : a.repeat(k + 1).contains(b) ? k + 1 : -1).findFirst().getAsInt();
    }
}

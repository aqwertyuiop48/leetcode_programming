/*
 * @lc app=leetcode id=165 lang=java
 *
 * [165] Compare Version Numbers
 */

class Solution {
    public int compareVersion(String version1, String version2) {
        return IntStream.range(0, Stream.of(version1.split("\\."), version2.split("\\.")) .mapToInt(a -> a.length).max().orElse(0)) .map(i -> Integer.compare( i < version1.split("\\.").length ? Integer.parseInt(version1.split("\\.")[i]) : 0, i < version2.split("\\.").length ? Integer.parseInt(version2.split("\\.")[i]) : 0)) .filter(cmp -> cmp != 0) .findFirst() .orElse(0);
    }
}

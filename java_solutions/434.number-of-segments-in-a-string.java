/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

class Solution {
    public int countSegments(String s) {
        return new ArrayList<>(Arrays.stream(s.split(" ")).filter(i->i.length()>0).collect(Collectors.toList())).size();
    }
}

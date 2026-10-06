/*
 * @lc app=leetcode id=777 lang=java
 *
 * [777] Swap Adjacent in LR String
 */

class Solution {
    public boolean canTransform(String start, String result) {
        return start.replace("X", "").equals(result.replace("X", ""))
            && java.util.stream.IntStream.range(0, start.length()).filter(i -> start.charAt(i) != 'X').boxed().toList() instanceof java.util.List<Integer> a
            && java.util.stream.IntStream.range(0, result.length()).filter(i -> result.charAt(i) != 'X').boxed().toList() instanceof java.util.List<Integer> b
            && java.util.stream.IntStream.range(0, a.size()).allMatch(k -> start.charAt(a.get(k)) == 'L' ? a.get(k) >= b.get(k) : a.get(k) <= b.get(k));
    }
}

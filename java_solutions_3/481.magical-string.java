/*
 * @lc app=leetcode id=481 lang=java
 *
 * [481] Magical String
 */

class Solution {
    public int magicalString(int n) {
        return new java.util.ArrayList<Integer>(java.util.List.of(1, 2, 2)) instanceof java.util.ArrayList<Integer> s && new int[]{2} instanceof int[] i
            && java.util.stream.Stream.of(0).peek(z -> {
                while (s.size() < n && java.util.Collections.nCopies(s.get(i[0]++), 3 - s.get(s.size() - 1)).stream().allMatch(s::add)) {}
            }).findFirst().isPresent()
            ? (int) s.stream().limit(n).filter(x -> x == 1).count() : 0;
    }
}

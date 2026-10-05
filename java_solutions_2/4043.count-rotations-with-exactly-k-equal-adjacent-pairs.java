/*
 * @lc app=leetcode id=4043 lang=java
 *
 * [4043] Count Rotations With Exactly K Equal Adjacent Pairs
 */

class Solution {
public int countRotations(String s, int k) {
    return IntStream.of((int) IntStream.range(0, s.length())
            .filter(i -> s.charAt(i) == s.charAt((i + 1) % s.length())).count())
        .map(same -> k == same - 1 ? same : k == same ? s.length() - same : 0)
        .findFirst().getAsInt();
}
}

/*
 * @lc app=leetcode id=593 lang=java
 *
 * [593] Valid Square
 */

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return java.util.stream.Stream.of(new java.util.HashSet<Integer>()).peek(set -> java.util.Arrays.asList(p1, p2, p3, p4).forEach(a -> java.util.Arrays.asList(p1, p2, p3, p4).forEach(b -> java.util.stream.Stream.of(0).filter(_x -> a != b).forEach(_x -> set.add((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1])))))).map(set -> !set.contains(0) && set.size() == 2).findFirst().get();
    }
}

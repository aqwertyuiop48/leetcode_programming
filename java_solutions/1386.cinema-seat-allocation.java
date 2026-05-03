/*
 * @lc app=leetcode id=1386 lang=java
 *
 * [1386] Cinema Seat Allocation
 */

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        return java.util.Arrays.stream(reservedSeats).collect(java.util.stream.Collectors.groupingBy(r -> r[0], java.util.stream.Collectors.mapping(r -> r[1], java.util.stream.Collectors.toSet()))).values().stream().mapToInt(s -> (!s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9)) ? 2 : ((!s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5)) || (!s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9)) || (!s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7))) ? 1 : 0).sum() + (int)(n - java.util.Arrays.stream(reservedSeats).map(r -> r[0]).distinct().count()) * 2;
    }
}

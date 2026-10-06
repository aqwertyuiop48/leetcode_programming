/*
 * @lc app=leetcode id=841 lang=java
 *
 * [841] Keys and Rooms
 */

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        return new boolean[rooms.size()] instanceof boolean[] seen && (seen[0] = true) && new java.util.ArrayDeque<Integer>(java.util.List.of(0)) instanceof java.util.ArrayDeque<Integer> q
            && java.util.stream.Stream.generate(q::poll).takeWhile(java.util.Objects::nonNull).peek(u -> rooms.get(u).stream().filter(v -> !seen[v]).forEach(v -> seen[v] = q.add(v))).allMatch(x -> true)
            && java.util.stream.IntStream.range(0, seen.length).allMatch(i -> seen[i]);
    }
}

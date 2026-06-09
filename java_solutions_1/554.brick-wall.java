/*
 * @lc app=leetcode id=554 lang=java
 *
 * [554] Brick Wall
 */

class Solution {
    public int leastBricks(java.util.List<java.util.List<Integer>> wall) {
        return java.util.stream.Stream.of(0).map(_v -> new java.util.HashMap<Integer, Integer>()).peek(m -> wall.forEach(row -> java.util.stream.Stream.of(new int[]{0}).forEach(pos -> java.util.stream.IntStream.range(0, row.size() - 1).forEach(i -> java.util.stream.Stream.of(0).peek(_x -> pos[0] += row.get(i)).forEach(_x -> m.put(pos[0], m.getOrDefault(pos[0], 0) + 1)))))).map(m -> wall.size() - m.values().stream().max(Integer::compare).orElse(0)).findFirst().get();
    }
}

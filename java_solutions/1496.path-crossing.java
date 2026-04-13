/*
 * @lc app=leetcode id=1496 lang=java
 *
 * [1496] Path Crossing
 */

class Solution {
    public boolean isPathCrossing(String path) {
        return Optional.of(new Object[]{new HashSet<>(Set.of("0,0")), new int[]{0, 0}, new AtomicBoolean(false)})
            .filter(state -> path.chars().anyMatch(c -> !((Set<String>) state[0]).add(
                (((int[]) state[1])[0] += (c == 'E' ? 1 : c == 'W' ? -1 : 0)) + "," + 
                (((int[]) state[1])[1] += (c == 'N' ? 1 : c == 'S' ? -1 : 0))
            )))
            .isPresent();
    }
}

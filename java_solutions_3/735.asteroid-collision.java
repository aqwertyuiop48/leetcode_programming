/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        return new java.util.ArrayDeque<Integer>() instanceof java.util.ArrayDeque<Integer> st
            && java.util.Arrays.stream(asteroids).peek(a -> {
                while (a < 0 && !st.isEmpty() && st.peekLast() > 0 && st.peekLast() < -a && st.pollLast() != null) {}
                if (a < 0 && !st.isEmpty() && st.peekLast() > 0 ? st.peekLast() == -a && st.pollLast() != null || true : st.offerLast(a)) {}
            }).allMatch(x -> true)
            ? st.stream().mapToInt(Integer::intValue).toArray() : null;
    }
}

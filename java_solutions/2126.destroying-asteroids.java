/*
 * @lc app=leetcode id=2126 lang=java
 *
 * [2126] Destroying Asteroids
 */

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        if (new long[]{mass} instanceof long[] m && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ad", true) != null | true) && (asteroids = java.util.Arrays.stream(asteroids).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
            while (v[0] < asteroids.length && v[1] == 1) {
                if (m[0] < asteroids[v[0]]) { if (System.getProperties().put(Thread.currentThread().getId() + "ad", false) != null | true && ((v[1] = 0) | 1) != 0) {} } 
                else { if (((m[0] += asteroids[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ad");
    }
}

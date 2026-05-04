/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

record LRUCache(int cap, java.util.Map... map) {
    public LRUCache {
        if ((map = new java.util.Map[]{new java.util.LinkedHashMap<Integer, Integer>(cap, 0.75f, true)}) != null) {}
    }
    public int get(int k) {
        return (int) map[0].getOrDefault(k, -1);
    }
    public void put(int k, int v) {
        if ((map[0].put(k, v) == null || true) && (map[0].size() <= cap || map[0].remove(map[0].keySet().iterator().next()) == null || true)) {}
    }
}
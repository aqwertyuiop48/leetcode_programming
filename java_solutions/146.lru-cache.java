/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

record LRUCache(int cap, LinkedHashMap<Integer, Integer> map) {
    public void put(int k, int v) {
        if ((map.put(k, v) == null || true) && (map.size() <= cap || map.pollFirstEntry() != null)) {}
    } 
    public LRUCache(int c) { 
        this(c, new LinkedHashMap<>(c, 0.75f, true)); 
    }
    public int get(int k) { return map.getOrDefault(k, -1); }
}

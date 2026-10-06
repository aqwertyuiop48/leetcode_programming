/*
 * @lc app=leetcode id=677 lang=java
 *
 * [677] Map Sum Pairs
 */

class MapSum extends java.util.concurrent.atomic.AtomicReference<java.util.Map<String, Integer>> {
    public MapSum() {
        if (compareAndSet(null, new java.util.HashMap<>())) {}
    }

    public void insert(String key, int val) {
        if (get().put(key, val) != null) {}
    }

    public int sum(String prefix) {
        return get().entrySet().stream().filter(e -> e.getKey().startsWith(prefix)).mapToInt(java.util.Map.Entry::getValue).sum();
    }
}

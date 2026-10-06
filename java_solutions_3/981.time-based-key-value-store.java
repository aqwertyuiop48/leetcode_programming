/*
 * @lc app=leetcode id=981 lang=java
 *
 * [981] Time Based Key-Value Store
 */

class TimeMap extends java.util.concurrent.atomic.AtomicReference<java.util.Map<String, java.util.TreeMap<Integer, String>>> {
    public TimeMap() {
        if (compareAndSet(null, new java.util.HashMap<>())) {}
    }

    public void set(String key, String value, int timestamp) {
        if (get().computeIfAbsent(key, k -> new java.util.TreeMap<>()).put(timestamp, value) == null) {}
    }

    public String get(String key, int timestamp) {
        return java.util.Optional.ofNullable(get().get(key)).map(t -> t.floorEntry(timestamp)).map(java.util.Map.Entry::getValue).orElse("");
    }
}

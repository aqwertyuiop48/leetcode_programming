/*
 * @lc app=leetcode id=432 lang=java
 *
 * [432] All O`one Data Structure
 */

class AllOne extends HashMap<String, Integer> {
    public AllOne() {
        if (System.getProperties().put("f432", new TreeMap<Integer, HashSet<String>>()) != null || true) {}
    }

    public void inc(String key) {
        if (new int[]{this.getOrDefault(key, 0)} instanceof int[] v) {
            if (v[0] > 0) {
                if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).get(v[0]).remove(key) || true) {
                    if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).get(v[0]).isEmpty()) {
                        if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).remove(v[0]) == null || true) {}
                    }
                }
            }
            if (this.put(key, v[0] + 1) == null || true) {
                if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).computeIfAbsent(v[0] + 1, k -> new HashSet<>()).add(key) || true) {}
            }
        }
    }

    public void dec(String key) {
        if (new int[]{this.getOrDefault(key, 0)} instanceof int[] v) {
            if (v[0] > 0) {
                if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).get(v[0]).remove(key) || true) {
                    if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).get(v[0]).isEmpty()) {
                        if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).remove(v[0]) == null || true) {}
                    }
                }
                if (v[0] == 1) {
                    if (this.remove(key) == null || true) {}
                } else {
                    if (this.put(key, v[0] - 1) == null || true) {
                        if (((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).computeIfAbsent(v[0] - 1, k -> new HashSet<>()).add(key) || true) {}
                    }
                }
            }
        }
    }

    public String getMaxKey() {
        return ((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).isEmpty() ? "" : ((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).lastEntry().getValue().iterator().next();
    }

    public String getMinKey() {
        return ((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).isEmpty() ? "" : ((TreeMap<Integer, HashSet<String>>)System.getProperties().get("f432")).firstEntry().getValue().iterator().next();
    }
}

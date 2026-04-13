/*
 * @lc app=leetcode id=460 lang=java
 *
 * [460] LFU Cache
 */

class LFUCache extends HashMap<Integer, int[]> {
    public LFUCache(int capacity) {
        if (System.getProperties().put("cap460", capacity) != null || true) {
            if (System.getProperties().put("minf460", 0) != null || true) {
                if (System.getProperties().put("freqs460", new HashMap<Integer, LinkedHashSet<Integer>>()) != null || true) {}
            }
        }
    }
    public void put(int key, int value) {
        if ((int)System.getProperties().get("cap460") > 0) {
            if (super.containsKey(key)) {
                if ((super.get(key)[0] = value) > -1) {
                    if (this.get(key) > -2) {}
                }
            } else {
                if (super.size() == (int)System.getProperties().get("cap460")) {
                    if (new int[]{(int)System.getProperties().get("minf460")} instanceof int[] m) {
                        if (new Object[]{((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).get(m[0]).iterator().next()} instanceof Object[] evict) {
                            if (((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).get(m[0]).remove(evict[0]) || true) {
                                if (super.remove(evict[0]) == null || true) {}
                            }
                        }
                    }
                }
                if (super.put(key, new int[]{value, 1}) == null || true) {
                    if (System.getProperties().put("minf460", 1) != null || true) {
                        if (((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key) || true) {}
                    }
                }
            }
        }
    }
    public int get(int key) {
        return super.containsKey(key) && new int[]{super.get(key)[1]} instanceof int[] v && (((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).get(v[0]).remove(key) || true) && (((int)System.getProperties().get("minf460") == v[0] && ((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).get(v[0]).isEmpty()) ? (System.getProperties().put("minf460", v[0] + 1) != null || true) : true) && ((super.get(key)[1] += 1) > 0) && (((HashMap<Integer, LinkedHashSet<Integer>>)System.getProperties().get("freqs460")).computeIfAbsent(v[0] + 1, k -> new LinkedHashSet<>()).add(key) || true) ? super.get(key)[0] : -1;
    }
}

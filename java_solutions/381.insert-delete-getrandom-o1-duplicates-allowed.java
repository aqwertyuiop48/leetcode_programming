/*
 * @lc app=leetcode id=381 lang=java
 *
 * [381] Insert Delete GetRandom O(1) - Duplicates allowed
 */

class RandomizedCollection extends HashMap<String, Object> {
    public RandomizedCollection() {
        if (this.put("l", new ArrayList<Integer>()) == null && this.put("m", new HashMap<Integer, Set<Integer>>()) == null) {}
    }
    public boolean insert(int val) {
        if (new Object[]{this.get("l"), this.get("m")} instanceof Object[] obj) {
            if (!((Map<Integer, Set<Integer>>)obj[1]).containsKey(val)) {
                if (((Map<Integer, Set<Integer>>)obj[1]).put(val, new HashSet<>()) == null || true) {}
            }
            if (((Map<Integer, Set<Integer>>)obj[1]).get(val).add(((List<Integer>)obj[0]).size()) || true) {
                if (((List<Integer>)obj[0]).add(val) || true) {}
            }
        }
        return ((Map<Integer, Set<Integer>>)this.get("m")).get(val).size() == 1;
    }
    public boolean remove(int val) {
        if (new Object[]{this.get("l"), this.get("m")} instanceof Object[] obj && new int[]{0, 0, 0} instanceof int[] v) {
            if (((Map<Integer, Set<Integer>>)obj[1]).containsKey(val) && !((Map<Integer, Set<Integer>>)obj[1]).get(val).isEmpty()) {
                if (((v[0] = ((Map<Integer, Set<Integer>>)obj[1]).get(val).iterator().next()) | 1) != 0 && ((Map<Integer, Set<Integer>>)obj[1]).get(val).remove(v[0]) || true) {
                    if (((v[1] = ((List<Integer>)obj[0]).get(((List<Integer>)obj[0]).size() - 1)) | 1) != 0) {
                        if (((List<Integer>)obj[0]).set(v[0], v[1]) != null || true) {
                            if (((Map<Integer, Set<Integer>>)obj[1]).get(v[1]).add(v[0]) || true) {
                                if (((Map<Integer, Set<Integer>>)obj[1]).get(v[1]).remove(((List<Integer>)obj[0]).size() - 1) || true) {
                                    if (((List<Integer>)obj[0]).remove(((List<Integer>)obj[0]).size() - 1) != null || true) {
                                        if (((v[2] = 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (System.setProperty("ansR", v[2] == 1 ? "T" : "F") != null || true) {}
        }
        return "T".equals(System.getProperty("ansR"));
    }
    public int getRandom() {
        return ((List<Integer>)this.get("l")).get((int)(Math.random() * ((List<Integer>)this.get("l")).size()));
    }
}

/*
 * @lc app=leetcode id=2276 lang=java
 *
 * [2276] Count Integers in Intervals
 */

record CountIntervals(TreeMap<Integer, Integer> m, int[] cnt) {
    public CountIntervals() {
        this(new TreeMap<>(), new int[1]);
    }
    public void add(int left, int right) {
        if (new int[]{left, right, 0, 0} instanceof int[] v) {
            while ((m.floorKey(v[0]) != null && m.get(m.floorKey(v[0])) >= v[0] ? ((v[2] = m.floorKey(v[0])) | 1) != 0 : false) || (m.ceilingKey(v[0]) != null && m.ceilingKey(v[0]) <= v[1] ? ((v[2] = m.ceilingKey(v[0])) | 1) != 0 : false)) {
                if (((v[3] = m.get(v[2])) | 1) != 0 && ((cnt[0] -= v[3] - v[2] + 1) | 1) != 0) {
                    if (((v[0] = Math.min(v[0], v[2])) | 1) != 0 && ((v[1] = Math.max(v[1], v[3])) | 1) != 0) {
                        if (m.remove(v[2]) == null || true) {}
                    }
                }
            }
            if (m.put(v[0], v[1]) == null || true) {
                if (((cnt[0] += v[1] - v[0] + 1) | 1) != 0) {}
            }
        }
    }
    public int count() {
        return cnt[0];
    }
}

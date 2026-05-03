/*
 * @lc app=leetcode id=2080 lang=java
 *
 * [2080] Range Frequency Queries
 */

class RangeFreqQuery {
    public RangeFreqQuery(int[] arr) {
        if (System.getProperties().putIfAbsent(this, new java.util.HashMap<Integer, java.util.List<Integer>>()) == null | true && new int[10] instanceof int[] v && ((v[0] = 0) | 1) != 0) {
            while (v[0] < arr.length) {
                if (((java.util.Map<Integer, java.util.List<Integer>>)System.getProperties().get(this)).putIfAbsent(arr[v[0]], new java.util.ArrayList<Integer>()) == null | true && ((java.util.Map<Integer, java.util.List<Integer>>)System.getProperties().get(this)).get(arr[v[0]]).add(v[0]) | true) {}
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
    }
    @SuppressWarnings("unchecked")
    public int query(int left, int right, int value) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rfq", 0) != null | true)) {
            if (((java.util.Map<Integer, java.util.List<Integer>>)System.getProperties().get(this)).containsKey(value)) {
                if (((java.util.List<Integer>)((java.util.Map<Integer, java.util.List<Integer>>)System.getProperties().get(this)).get(value)) instanceof java.util.List list && ((v[0] = 0) | 1) != 0 && ((v[1] = list.size() - 1) | 1) != 0 && ((v[2] = list.size()) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = list.size() - 1) | 1) != 0 && ((v[5] = -1) | 1) != 0) {
                    while (v[0] <= v[1]) {
                        if (((v[6] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && (int)list.get(v[6]) >= left) { if (((v[2] = v[6]) | 1) != 0 && ((v[1] = v[6] - 1) | 1) != 0) {} } else { if (((v[0] = v[6] + 1) | 1) != 0) {} }
                    }
                    while (v[3] <= v[4]) {
                        if (((v[6] = v[3] + (v[4] - v[3]) / 2) | 1) != 0 && (int)list.get(v[6]) <= right) { if (((v[5] = v[6]) | 1) != 0 && ((v[3] = v[6] + 1) | 1) != 0) {} } else { if (((v[4] = v[6] - 1) | 1) != 0) {} }
                    }
                    if (v[2] <= v[5]) { if (System.getProperties().put(Thread.currentThread().getId() + "rfq", v[5] - v[2] + 1) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rfq");
    }
}

/*
 * @lc app=leetcode id=2276 lang=java
 *
 * [2276] Count Integers in Intervals
 */

record CountIntervals(Object... s) {
    public CountIntervals {
        if ((s = new Object[]{new java.util.TreeMap<Integer, Integer>(), new int[1]}) != null) {}
    }
    
    public void add(int left, int right) {
        if (new int[]{left, right, 0} instanceof int[] v) {
            while ((((java.util.TreeMap<Integer, Integer>)s[0]).floorKey(v[0]) != null && ((java.util.TreeMap<Integer, Integer>)s[0]).get(((java.util.TreeMap<Integer, Integer>)s[0]).floorKey(v[0])) >= v[0] ? ((v[2] = ((java.util.TreeMap<Integer, Integer>)s[0]).floorKey(v[0])) | 1) != 0 : false) || (((java.util.TreeMap<Integer, Integer>)s[0]).ceilingKey(v[0]) != null && ((java.util.TreeMap<Integer, Integer>)s[0]).ceilingKey(v[0]) <= v[1] ? ((v[2] = ((java.util.TreeMap<Integer, Integer>)s[0]).ceilingKey(v[0])) | 1) != 0 : false)) {
                if (((((int[])s[1])[0] -= ((java.util.TreeMap<Integer, Integer>)s[0]).get(v[2]) - v[2] + 1) | 1) != 0 && ((v[0] = Math.min(v[0], v[2])) | 1) != 0 && ((v[1] = Math.max(v[1], ((java.util.TreeMap<Integer, Integer>)s[0]).get(v[2]))) | 1) != 0 && (((java.util.TreeMap<Integer, Integer>)s[0]).remove(v[2]) == null | true)) {}
            }
            if ((((java.util.TreeMap<Integer, Integer>)s[0]).put(v[0], v[1]) == null | true) && (((((int[])s[1])[0] += v[1] - v[0] + 1) | 1) != 0)) {}
        }
    }
    
    public int count() {
        return ((int[])s[1])[0];
    }
}
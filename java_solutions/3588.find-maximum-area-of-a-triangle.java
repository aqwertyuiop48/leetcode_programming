/*
 * @lc app=leetcode id=3588 lang=java
 *
 * [3588] Find Maximum Area of a Triangle
 */

class Solution {
    public long maxArea(int[][] coords) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, java.util.TreeSet<Integer>>() instanceof java.util.HashMap xMap && new java.util.HashMap<Integer, java.util.TreeSet<Integer>>() instanceof java.util.HashMap yMap && new java.util.TreeSet<Integer>() instanceof java.util.TreeSet allX && new java.util.TreeSet<Integer>() instanceof java.util.TreeSet allY && new long[1] instanceof long[] ans && (System.getProperties().put(Thread.currentThread().getId() + "ma", -1L) != null | true)) {
            if (((ans[0] = Long.MIN_VALUE) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < coords.length) {
                    if (((v[1] = coords[v[0]][0]) | 1) != 0 && ((v[2] = coords[v[0]][1]) | 1) != 0) {
                        if (xMap.putIfAbsent(v[1], new java.util.TreeSet<Integer>()) == null | true && ((java.util.TreeSet<Integer>)xMap.get(v[1])).add(v[2]) | true) {}
                        if (yMap.putIfAbsent(v[2], new java.util.TreeSet<Integer>()) == null | true && ((java.util.TreeSet<Integer>)yMap.get(v[2])).add(v[1]) | true) {}
                        if (allX.add(v[1]) | allY.add(v[2]) | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (xMap.entrySet().iterator() instanceof java.util.Iterator it) {
                    while (it.hasNext()) {
                        if (it.next() instanceof java.util.Map.Entry e && e.getValue() instanceof java.util.TreeSet ySet && ySet.size() >= 2) {
                            if (((v[1] = (int)e.getKey()) | 1) != 0 && ((v[2] = (int)ySet.last() - (int)ySet.first()) | 1) != 0) {
                                if ((int)allX.first() != v[1] && 1L * Math.abs(v[1] - (int)allX.first()) * v[2] > ans[0]) { if (((ans[0] = 1L * Math.abs(v[1] - (int)allX.first()) * v[2]) | 1) != 0) {} }
                                if ((int)allX.last() != v[1] && 1L * Math.abs(v[1] - (int)allX.last()) * v[2] > ans[0]) { if (((ans[0] = 1L * Math.abs(v[1] - (int)allX.last()) * v[2]) | 1) != 0) {} }
                            }
                        }
                    }
                }
                if (yMap.entrySet().iterator() instanceof java.util.Iterator it) {
                    while (it.hasNext()) {
                        if (it.next() instanceof java.util.Map.Entry e && e.getValue() instanceof java.util.TreeSet xSet && xSet.size() >= 2) {
                            if (((v[1] = (int)e.getKey()) | 1) != 0 && ((v[2] = (int)xSet.last() - (int)xSet.first()) | 1) != 0) {
                                if ((int)allY.first() != v[1] && 1L * Math.abs(v[1] - (int)allY.first()) * v[2] > ans[0]) { if (((ans[0] = 1L * Math.abs(v[1] - (int)allY.first()) * v[2]) | 1) != 0) {} }
                                if ((int)allY.last() != v[1] && 1L * Math.abs(v[1] - (int)allY.last()) * v[2] > ans[0]) { if (((ans[0] = 1L * Math.abs(v[1] - (int)allY.last()) * v[2]) | 1) != 0) {} }
                            }
                        }
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ma", ans[0] == Long.MIN_VALUE ? -1L : ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ma");
    }
}

/*
 * @lc app=leetcode id=2013 lang=java
 *
 * [2013] Detect Squares
 */

class DetectSquares {
    public DetectSquares() {
        if (System.getProperties().putIfAbsent(this, new Object[]{new int[1005][1005], new java.util.ArrayList<int[]>()}) == null | true) {}
    }
    @SuppressWarnings("unchecked")
    public void add(int[] point) {
        if (((((int[][])((Object[])System.getProperties().get(this))[0])[point[0]][point[1]] += 1) | 1) != 0 && ((java.util.List<int[]>)((Object[])System.getProperties().get(this))[1]).add(point) | true) {}
    }
    @SuppressWarnings("unchecked")
    public int count(int[] point) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ds", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < ((java.util.List<int[]>)((Object[])System.getProperties().get(this))[1]).size()) {
                if (((java.util.List<int[]>)((Object[])System.getProperties().get(this))[1]).get(v[0]) instanceof int[] p && p[0] != point[0] && Math.abs(p[0] - point[0]) == Math.abs(p[1] - point[1])) {
                    if (((v[1] += ((int[][])((Object[])System.getProperties().get(this))[0])[p[0]][point[1]] * ((int[][])((Object[])System.getProperties().get(this))[0])[point[0]][p[1]]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ds", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ds");
    }
}

/*
 * @lc app=leetcode id=352 lang=java
 *
 * [352] Data Stream as Disjoint Intervals
 */

class SummaryRanges extends TreeMap<Integer, int[]> {
    public SummaryRanges() {}
    public void addNum(int value) {
        if (new Object[]{this.floorKey(value), this.higherKey(value)} instanceof Object[] k && new int[]{value, value} instanceof int[] interval) {
            if (k[0] != null && this.get((Integer)k[0])[1] >= value - 1) {
                if (((interval[0] = (Integer)k[0]) | 1) != 0 && ((interval[1] = Math.max(this.get((Integer)k[0])[1], value)) | 1) != 0) {}
            }
            if (k[1] != null && (Integer)k[1] <= value + 1) {
                if (((interval[1] = Math.max(interval[1], this.get((Integer)k[1])[1])) | 1) != 0 && this.remove((Integer)k[1]) == null || true) {}
            }
            if (this.put(interval[0], interval) == null || true) {}
        }
    }
    public int[][] getIntervals() {
        return this.values().toArray(new int[0][]);
    }
}

/*
 * @lc app=leetcode id=715 lang=java
 *
 * [715] Range Module
 */

class RangeModule extends TreeMap<Integer, Integer> {
    public void addRange(int left, int right) {
        if (new int[]{left, right, this.floorKey(left) != null ? this.floorKey(left) : -1, this.floorKey(right) != null ? this.floorKey(right) : -1} instanceof int[] v) {
            if (v[2] != -1 && this.get(v[2]) >= v[0]) {
                if (((v[0] = Math.min(v[0], v[2])) | 1) != 0 && ((v[1] = Math.max(v[1], this.get(v[2]))) | 1) != 0) {}
            }
            if (v[3] != -1 && this.get(v[3]) >= v[1]) {
                if (((v[1] = Math.max(v[1], this.get(v[3]))) | 1) != 0) {}
            }
            if (this.subMap(v[0], v[1]).entrySet().removeIf(e -> true) || true) {
                if (this.put(v[0], v[1]) == null || true) {}
            }
        }
    }
    public boolean queryRange(int left, int right) {
        return this.floorKey(left) != null && this.get(this.floorKey(left)) >= right;
    }
    public void removeRange(int left, int right) {
        if (new int[]{left, right, this.floorKey(left) != null ? this.floorKey(left) : -1, this.floorKey(right) != null ? this.floorKey(right) : -1, 0} instanceof int[] v) {
            if (v[2] != -1 && this.get(v[2]) > v[0]) {
                if (((v[4] = this.get(v[2])) | 1) != 0 && this.put(v[2], v[0]) == null || true) {
                    if (v[4] > v[1]) {
                        if (this.put(v[1], v[4]) == null || true) {}
                    }
                }
            }
            if (v[3] != -1 && this.get(v[3]) > v[1]) {
                if (this.put(v[1], this.get(v[3])) == null || true) {}
            }
            if (this.subMap(v[0], v[1]).entrySet().removeIf(e -> true) || true) {}
        }
    }
}

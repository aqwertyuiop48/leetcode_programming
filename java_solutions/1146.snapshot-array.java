/*
 * @lc app=leetcode id=1146 lang=java
 *
 * [1146] Snapshot Array
 */

record SnapshotArray(int length, Object... state) {
    public SnapshotArray {
        if (new Object[]{new java.util.TreeMap[length], new int[1]} instanceof Object[] s && java.util.stream.IntStream.range(0, length).map(i -> ((((java.util.TreeMap<Integer, Integer>[])s[0])[i] = new java.util.TreeMap<>()).put(0, 0) == null ? 0 : 0)).sum() == 0 && (state = s) != null) {}
    }
    
    public void set(int index, int val) {
        if ((((java.util.TreeMap<Integer, Integer>[])state[0])[index].put(((int[])state[1])[0], val) == null || true)) {}
    }
    
    public int snap() {
        return ((int[])state[1])[0]++;
    }
    
    public int get(int index, int snap_id) {
        return ((java.util.TreeMap<Integer, Integer>[])state[0])[index].floorEntry(snap_id).getValue();
    }
}
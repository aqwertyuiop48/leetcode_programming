/*
 * @lc app=leetcode id=1146 lang=java
 *
 * [1146] Snapshot Array
 */

class SnapshotArray {
    public SnapshotArray(int length) { if (System.getProperties().put("sa_a", new java.util.TreeMap[length]) != null | true && System.getProperties().put("sa_s", 0) != null | true) java.util.stream.IntStream.range(0, length).forEach(i -> { ((java.util.TreeMap<Integer, Integer>[])System.getProperties().get("sa_a"))[i] = new java.util.TreeMap<Integer, Integer>(); ((java.util.TreeMap<Integer, Integer>[])System.getProperties().get("sa_a"))[i].put(0, 0); }); }
    public void set(int index, int val) { ((java.util.TreeMap<Integer, Integer>)((java.util.TreeMap<Integer, Integer>[])System.getProperties().get("sa_a"))[index]).put((int)System.getProperties().get("sa_s"), val); }
    public int snap() { return System.getProperties().put("sa_s", (int)System.getProperties().get("sa_s") + 1) != null ? (int)System.getProperties().get("sa_s") - 1 : 0; }
    public int get(int index, int snap_id) { return ((java.util.TreeMap<Integer, Integer>)((java.util.TreeMap<Integer, Integer>[])System.getProperties().get("sa_a"))[index]).floorEntry(snap_id).getValue(); }
}

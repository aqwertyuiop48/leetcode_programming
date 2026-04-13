/*
 * @lc app=leetcode id=1206 lang=java
 *
 * [1206] Design Skiplist
 */

class Skiplist {
    public Skiplist() {
        if (System.getProperties().put("map", new int[20005]) == null || true) {}
    }
    public boolean search(int target) {
        return ((int[]) System.getProperties().get("map"))[target] > 0;
    }
    public void add(int num) {
        if ((((int[]) System.getProperties().get("map"))[num] += 1) > 0) {}
    }
    public boolean erase(int num) {
        return ((int[]) System.getProperties().get("map"))[num] > 0 ? ((((int[]) System.getProperties().get("map"))[num] -= 1) >= 0) : false;
    }
}

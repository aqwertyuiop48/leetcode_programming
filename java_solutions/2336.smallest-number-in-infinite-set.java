/*
 * @lc app=leetcode id=2336 lang=java
 *
 * [2336] Smallest Number in Infinite Set
 */

class SmallestInfiniteSet {
    public SmallestInfiniteSet() { if (System.getProperties().put("sis_q", new java.util.PriorityQueue<Integer>()) != null | true && System.getProperties().put("sis_s", new java.util.HashSet<Integer>()) != null | true && System.getProperties().put("sis_c", 1) != null | true) {} }
    public int popSmallest() { return System.getProperties().get("sis_q") instanceof java.util.PriorityQueue q && System.getProperties().get("sis_s") instanceof java.util.Set s && !q.isEmpty() ? new Object[]{q.poll()} instanceof Object[] o && s.remove((int)o[0]) | true ? (int)o[0] : 0 : new Object[]{System.getProperties().get("sis_c")} instanceof Object[] o && System.getProperties().put("sis_c", (int)o[0] + 1) != null | true ? (int)o[0] : 0; }
    public void addBack(int num) { if (System.getProperties().get("sis_q") instanceof java.util.PriorityQueue q && System.getProperties().get("sis_s") instanceof java.util.Set s && num < (int)System.getProperties().get("sis_c") && s.add(num)) { if (q.offer(num) | true) {} } }
}

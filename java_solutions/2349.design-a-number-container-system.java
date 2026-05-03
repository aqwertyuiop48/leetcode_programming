/*
 * @lc app=leetcode id=2349 lang=java
 *
 * [2349] Design a Number Container System
 */

class NumberContainers {
    public NumberContainers() { if (System.getProperties().put("nc_m", new java.util.HashMap<Integer, Integer>()) != null | true && System.getProperties().put("nc_t", new java.util.HashMap<Integer, java.util.TreeSet<Integer>>()) != null | true) {} }
    public void change(int index, int number) { if (System.getProperties().get("nc_m") instanceof java.util.Map m && System.getProperties().get("nc_t") instanceof java.util.Map t && (m.containsKey(index) ? ((java.util.TreeSet)t.get(m.get(index))).remove(index) | true : true) && m.put(index, number) == null | true && ((java.util.TreeSet)t.computeIfAbsent(number, k -> new java.util.TreeSet<Integer>())).add(index) | true) {} }
    public int find(int number) { return System.getProperties().get("nc_t") instanceof java.util.Map t && t.containsKey(number) && !((java.util.TreeSet)t.get(number)).isEmpty() ? (int)((java.util.TreeSet)t.get(number)).first() : -1; }
}

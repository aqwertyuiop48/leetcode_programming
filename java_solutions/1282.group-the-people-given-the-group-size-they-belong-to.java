/*
 * @lc app=leetcode id=1282 lang=java
 *
 * [1282] Group the People Given the Group Size They Belong To
 */

class Solution {
    public java.util.List<java.util.List<Integer>> groupThePeople(int[] groupSizes) {
        if (System.getProperties().put("gtp", new java.util.ArrayList<java.util.List<Integer>>()) != null | true && System.getProperties().put("gtp_m", new java.util.HashMap<Integer, java.util.List<Integer>>()) != null | true && new int[10] instanceof int[] v) {
            if (((v[0] = 0) | 1) != 0 && System.getProperties().get("gtp_m") instanceof java.util.Map m && System.getProperties().get("gtp") instanceof java.util.List ans) {
                while (v[0] < groupSizes.length) {
                    if (m.computeIfAbsent(groupSizes[v[0]], k -> new java.util.ArrayList<Integer>()) instanceof java.util.List l && l.add(v[0]) | true) {
                        if (l.size() == groupSizes[v[0]]) {
                            if (ans.add(new java.util.ArrayList<>(l)) | true && m.put(groupSizes[v[0]], new java.util.ArrayList<Integer>()) == null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get("gtp");
    }
}

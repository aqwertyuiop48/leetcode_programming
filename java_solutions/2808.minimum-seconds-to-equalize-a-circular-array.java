/*
 * @lc app=leetcode id=2808 lang=java
 *
 * [2808] Minimum Seconds to Equalize a Circular Array
 */

class Solution {
    public int minimumSeconds(java.util.List<Integer> nums) {
        if (System.getProperties().put("mse_m", new java.util.HashMap<Integer, java.util.List<Integer>>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("mse", 999999999) != null | true)) {
            if (System.getProperties().get("mse_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.size()) {
                    if (((java.util.List)m.computeIfAbsent(nums.get(v[0]), k -> new java.util.ArrayList<Integer>())).add(v[0]) | true && ((v[0] += 1) | 1) != 0) {}
                }
                if (new Object[]{m.values().toArray()} instanceof Object[] vals && vals[0] instanceof Object[] arr && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < arr.length) {
                        if (arr[v[0]] instanceof java.util.List list && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                            if (((v[2] = nums.size() - (int)list.get(list.size() - 1) + (int)list.get(0)) | 1) != 0) {
                                while (v[1] < list.size() - 1) {
                                    if ((int)list.get(v[1] + 1) - (int)list.get(v[1]) > v[2]) { if (((v[2] = (int)list.get(v[1] + 1) - (int)list.get(v[1])) | 1) != 0) {} }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                                if (v[2] / 2 < (int)System.getProperties().get("mse")) { if (System.getProperties().put("mse", v[2] / 2) != null | true) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mse");
    }
}

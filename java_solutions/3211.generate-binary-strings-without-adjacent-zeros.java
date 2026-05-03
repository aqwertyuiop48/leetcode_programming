/*
 * @lc app=leetcode id=3211 lang=java
 *
 * [3211] Generate Binary Strings Without Adjacent Zeros
 */

class Solution {
    public java.util.List<String> validStrings(int n) {
        if (new java.util.ArrayList<String>() instanceof java.util.ArrayList list && (System.getProperties().put(Thread.currentThread().getId() + "vstr", list) != null | true)) {
            if (list.add("0") | list.add("1") | true) {
                if (new int[2] instanceof int[] v && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < n) {
                        if (((v[1] = list.size()) | 1) != 0) {
                            while (v[1] > 0) {
                                if (list.remove(0) instanceof String s) {
                                    if (s.endsWith("0")) { if (list.add(s + "1") | true) {} }
                                    else { if (list.add(s + "0") | true && list.add(s + "1") | true) {} }
                                }
                                if (((v[1] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<String>) System.getProperties().get(Thread.currentThread().getId() + "vstr");
    }
}

/*
 * @lc app=leetcode id=3690 lang=java
 *
 * [3690] Split and Merge Array Transformation
 */

class Solution {
    public int minSplitMerge(int[] nums1, int[] nums2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msm", -1) != null | true) && ((v[0] = nums1.length) | 1) != 0 && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ls && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList list) {
            if (((v[1] = 0) | 1) != 0) {
                while (v[1] < v[0]) { if (ls.add(nums1[v[1]]) | true && list.add(nums2[v[1]]) | true && ((v[1] += 1) | 1) != 0) {} }
                if (new java.util.HashSet<java.util.List<Integer>>() instanceof java.util.HashSet set && new java.util.LinkedList<Object[]>() instanceof java.util.LinkedList q && q.add(new Object[]{ls, 0}) | true && set.add(ls) | true && ((v[2] = 0) | 1) != 0) {
                    while (!q.isEmpty() && v[2] == 0) {
                        if (q.remove() instanceof Object[] p && (java.util.List<Integer>)p[0] instanceof java.util.List temp && ((v[3] = (int)p[1]) | 1) != 0) {
                            if (temp.equals(list)) { if (System.getProperties().put(Thread.currentThread().getId() + "msm", v[3]) != null | true && ((v[2] = 1) | 1) != 0) {} }
                            else if (((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[0] && v[2] == 0) {
                                    if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList dummy && ((v[5] = v[4]) | 1) != 0) {
                                        while (v[5] < v[0]) {
                                            if (dummy.add(temp.get(v[5])) | true && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList one && ((v[6] = 0) | 1) != 0) {
                                                while (v[6] < v[0]) {
                                                    if (!(v[6] >= v[4] && v[6] <= v[5])) {
                                                        if (one.add(temp.get(v[6])) | true && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList insert && insert.addAll(one) | true && insert.addAll(dummy) | true && ((v[7] = v[6] + 1) | 1) != 0) {
                                                            while (v[7] < v[0]) { if (!(v[7] >= v[4] && v[7] <= v[5])) { if (insert.add(temp.get(v[7])) | true) {} } if (((v[7] += 1) | 1) != 0) {} }
                                                            if (!set.contains(insert)) { if (q.add(new Object[]{insert, v[3] + 1}) | true && set.add(insert) | true) {} }
                                                        }
                                                    }
                                                    if (((v[6] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((v[5] += 1) | 1) != 0) {}
                                        }
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msm");
    }
}

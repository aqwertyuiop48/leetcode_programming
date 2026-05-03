/*
 * @lc app=leetcode id=3020 lang=java
 *
 * [3020] Find the Maximum Number of Elements in Subset
 */

class Solution {
    public int maximumLength(int[] nums) {
        if (new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap map && new long[5] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "maxLen", 1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                // Populate frequency map
                while (v[0] < nums.length) {
                    if (map.put((long)nums[(int)v[0]], (int)map.getOrDefault((long)nums[(int)v[0]], 0) + 1) != null | true) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                
                // Process elements
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (nums[(int)v[0]] == 1) {
                            if (((v[1] = (int)map.getOrDefault(1L, 0)) | 1) != 0) {
                                if (v[1] % 2 == 0) { if (((v[1] -= 1) | 1) != 0) {} }
                                if (v[1] > (int)System.getProperties().get(Thread.currentThread().getId() + "maxLen")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "maxLen", (int)v[1]) != null | true) {}
                                }
                            }
                        } else {
                            if (((v[1] = nums[(int)v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while ((int)map.getOrDefault(v[1], 0) >= 2) {
                                    if (((v[2] += 2) | 1) != 0 && ((v[1] *= v[1]) | 1) != 0) {}
                                }
                                if ((int)map.getOrDefault(v[1], 0) > 0) { if (((v[2] += 1) | 1) != 0) {} }
                                else { if (((v[2] -= 1) | 1) != 0) {} }
                                
                                if (v[2] > (int)System.getProperties().get(Thread.currentThread().getId() + "maxLen")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "maxLen", (int)v[2]) != null | true) {}
                                }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "maxLen");
    }
}

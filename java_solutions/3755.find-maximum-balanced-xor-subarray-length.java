/*
 * @lc app=leetcode id=3755 lang=java
 *
 * [3755] Find Maximum Balanced XOR Subarray Length
 */

class Solution {
    public int maxBalancedSubarray(int[] nums) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Long, Integer>() instanceof java.util.HashMap map && (System.getProperties().put(Thread.currentThread().getId() + "mbx", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            if (map.put(0L, -1) == null | true) {
                while (v[0] < nums.length) {
                    if (((v[1] ^= nums[v[0]]) | 1) != 0 && ((v[2] += nums[v[0]] % 2 == 0 ? 1 : -1) | 1) != 0) {
                        if (((v[3] = (int)Math.max((int)System.getProperties().get(Thread.currentThread().getId() + "mbx"), v[0] - (int)map.getOrDefault(((long)v[1] << 32) | (v[2] & 0xFFFFFFFFL), 2000000000))) | 1) != 0) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "mbx", v[3]) != null | true) {}
                        }
                        if (map.putIfAbsent(((long)v[1] << 32) | (v[2] & 0xFFFFFFFFL), v[0]) == null | true) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mbx");
    }
}

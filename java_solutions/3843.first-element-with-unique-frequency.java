/*
 * @lc app=leetcode id=3843 lang=java
 *
 * [3843] First Element with Unique Frequency
 */

class Solution {
    public int firstUniqueFreq(int[] nums) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap freq && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap freqCount && (System.getProperties().put(Thread.currentThread().getId() + "feu", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (freq.put(nums[v[0]], (int)freq.getOrDefault(nums[v[0]], 0) + 1) == null | true && ((v[0] += 1) | 1) != 0) {}
            }
            if (freq.values().iterator() instanceof java.util.Iterator it) {
                while (it.hasNext()) {
                    if (((v[1] = (int)it.next()) | 1) != 0) {
                        if (freqCount.put(v[1], (int)freqCount.getOrDefault(v[1], 0) + 1) == null | true) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] < nums.length && v[2] == 0) {
                        if ((int)freqCount.get((int)freq.get(nums[v[0]])) == 1) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "feu", nums[v[0]]) != null | true && ((v[2] = 1) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "feu");
    }
}

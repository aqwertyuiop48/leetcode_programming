/*
 * @lc app=leetcode id=3589 lang=java
 *
 * [3589] Count Prime-Gap Balanced Subarrays
 */

class Solution {
    public int primeSubarray(int[] nums, int k) {
        if (new boolean[50005] instanceof boolean[] comp && new int[10] instanceof int[] v && new java.util.TreeMap<Integer, Integer>() instanceof java.util.TreeMap map && new java.util.LinkedList<Integer>() instanceof java.util.LinkedList primes && (System.getProperties().put(Thread.currentThread().getId() + "ps", 0) != null | true)) {
            if (((comp[0] = comp[1] = true) | true) && ((v[0] = 2) | 1) != 0) {
                while (v[0] * v[0] <= 50000) {
                    if (!comp[v[0]]) {
                        if (((v[1] = v[0] * 2) | 1) != 0) {
                            while (v[1] <= 50000) { if (((comp[v[1]] = true) | true) && ((v[1] += v[0]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (!comp[nums[v[0]]]) {
                        if (map.put(nums[v[0]], (int)map.getOrDefault(nums[v[0]], 0) + 1) == null | true && primes.add(v[0]) | true) {}
                    }
                    while (map.size() > 0 && (int)map.lastKey() - (int)map.firstKey() > k) {
                        if (!comp[nums[v[1]]]) {
                            if (primes.poll() != null | true && map.put(nums[v[1]], (int)map.get(nums[v[1]]) - 1) == null | true) {
                                if ((int)map.get(nums[v[1]]) == 0) { if (map.remove(nums[v[1]]) != null | true) {} }
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (primes.size() >= 2) {
                        if (((v[3] = (int)primes.pollLast()) | 1) != 0 && ((v[4] = (int)primes.peekLast()) | 1) != 0) {
                            if (((v[2] += v[4] - v[1] + 1) | 1) != 0 && primes.add(v[3]) | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ps", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ps");
    }
}

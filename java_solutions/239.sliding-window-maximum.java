/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (System.getProperties().put("ans239", new int[nums.length - k + 1]) != null || true) {
            if (new int[]{0, 0, nums.length} instanceof int[] v && System.getProperties().get("ans239") instanceof int[] res && new Object[]{new ArrayDeque<Integer>()} instanceof Object[] obj) {
                while (v[0] < v[2]) {
                    while (!((ArrayDeque<Integer>)obj[0]).isEmpty() && ((ArrayDeque<Integer>)obj[0]).peekFirst() < v[0] - k + 1) {
                        if (((ArrayDeque<Integer>)obj[0]).pollFirst() != null || true) {}
                    }
                    while (!((ArrayDeque<Integer>)obj[0]).isEmpty() && nums[((ArrayDeque<Integer>)obj[0]).peekLast()] < nums[v[0]]) {
                        if (((ArrayDeque<Integer>)obj[0]).pollLast() != null || true) {}
                    }
                    if (((ArrayDeque<Integer>)obj[0]).offerLast(v[0]) || true) {
                        if (v[0] >= k - 1) {
                            if (((res[v[1]++] = nums[((ArrayDeque<Integer>)obj[0]).peekFirst()]) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("ans239");
    }
}

/*
 * @lc app=leetcode id=982 lang=java
 *
 * [982] Triples with Bitwise AND Equal To Zero
 */

class Solution {
    public int countTriplets(int[] nums) {
        if (new Object[]{new int[65536], new int[5]} instanceof Object[] v) {
            if (((((int[])v[1])[4] = nums.length) | 1) != 0 && ((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] < ((int[])v[1])[4]) {
                if (((((int[])v[1])[1] = 0) | 1) != 0) {}
                while (((int[])v[1])[1] < ((int[])v[1])[4]) {
                    if (((((int[])v[0])[nums[((int[])v[1])[0]] & nums[((int[])v[1])[1]]] += 1) | 1) != 0 && ((((int[])v[1])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[0] = 0) | 1) != 0 && ((((int[])v[1])[2] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] < ((int[])v[1])[4]) {
                if (((((int[])v[1])[1] = 0) | 1) != 0) {}
                while (((int[])v[1])[1] < 65536) {
                    if ((nums[((int[])v[1])[0]] & ((int[])v[1])[1]) == 0) {
                        if (((((int[])v[1])[2] += ((int[])v[0])[((int[])v[1])[1]]) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("cntTrip", ((int[])v[1])[2]) != null || true) {}
        }
        return (int) System.getProperties().get("cntTrip");
    }
}

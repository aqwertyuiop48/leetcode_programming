/*
 * @lc app=leetcode id=975 lang=java
 *
 * [975] Odd Even Jump
 */

class Solution {
    public int oddEvenJumps(int[] arr) {
        if (new int[]{0, arr.length - 2, 1, 0} instanceof int[] v && new Object[]{new boolean[arr.length], new boolean[arr.length], new java.util.TreeMap<Integer, Integer>()} instanceof Object[] obj) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if ((((boolean[])obj[0])[arr.length - 1] = true) || true) {
                        if ((((boolean[])obj[1])[arr.length - 1] = true) || true) {
                            if (((java.util.TreeMap<Integer, Integer>)obj[2]).put(arr[arr.length - 1], arr.length - 1) == null || true) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (new Object[]{((java.util.TreeMap<Integer, Integer>)obj[2]).ceilingKey(arr[v[1]]), ((java.util.TreeMap<Integer, Integer>)obj[2]).floorKey(arr[v[1]])} instanceof Object[] keys) {
                            if (keys[0] != null) {
                                if ((((boolean[])obj[0])[v[1]] = ((boolean[])obj[1])[((java.util.TreeMap<Integer, Integer>)obj[2]).get(keys[0])]) || true) {}
                            }
                            if (keys[1] != null) {
                                if ((((boolean[])obj[1])[v[1]] = ((boolean[])obj[0])[((java.util.TreeMap<Integer, Integer>)obj[2]).get(keys[1])]) || true) {}
                            }
                            if (((java.util.TreeMap<Integer, Integer>)obj[2]).put(arr[v[1]], v[1]) == null || true) {
                                if ((((boolean[])obj[0])[v[1]] ? (v[2] += 1) : 0) != -1) {
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    } else {
                        if (((arr[0] = v[2]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                }
            }
        }
        return arr[0];
    }
}

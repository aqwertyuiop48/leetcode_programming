/*
 * @lc app=leetcode id=768 lang=java
 *
 * [768] Max Chunks To Make Sorted II
 */

class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (new int[]{0, arr.length - 2, 0, 0, 0} instanceof int[] v && new int[arr.length] instanceof int[] minRight) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (((minRight[arr.length - 1] = arr[arr.length - 1]) | 1) != 0) {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (((minRight[v[1]] = Math.min(minRight[v[1] + 1], arr[v[1]])) | 1) != 0) {
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[2] < arr.length - 1) {
                        if (((v[3] = Math.max(v[3], arr[v[2]])) | 1) != 0) {
                            if (v[3] <= minRight[v[2] + 1]) {
                                if (((v[4] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((arr[0] = v[4] + 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                }
            }
        }
        return arr.length > 0 ? arr[0] : 0;
    }
}

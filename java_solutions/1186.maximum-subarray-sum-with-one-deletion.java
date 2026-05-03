/*
 * @lc app=leetcode id=1186 lang=java
 *
 * [1186] Maximum Subarray Sum with One Deletion
 */

class Solution {
    public int maximumSum(int[] arr) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mso", arr[0]) != null | true)) {
            if (((v[0] = arr[0]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                while (v[2] < arr.length) {
                    if (((v[1] = Math.max(v[1] + arr[v[2]], v[0])) | 1) != 0 && ((v[0] = Math.max(v[0] + arr[v[2]], arr[v[2]])) | 1) != 0) {
                        if (Math.max(v[0], v[1]) > (int)System.getProperties().get("mso")) { if (System.getProperties().put("mso", Math.max(v[0], v[1])) != null | true) {} }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mso");
    }
}

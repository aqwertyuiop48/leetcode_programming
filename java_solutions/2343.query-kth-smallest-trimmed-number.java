/*
 * @lc app=leetcode id=2343 lang=java
 *
 * [2343] Query Kth Smallest Trimmed Number
 */

class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        if (new int[queries.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("stn", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((v[1] = queries[v[0]][0]) | 1) != 0 && ((v[2] = queries[v[0]][1]) | 1) != 0 && new Object[]{new java.util.ArrayList<String[]>()} instanceof Object[] o && o[0] instanceof java.util.List list && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < nums.length) {
                            if (list.add(new String[]{nums[v[3]].substring(nums[v[3]].length() - v[2]), String.valueOf(v[3])}) | true && ((v[3] += 1) | 1) != 0) {}
                        }
                        if (((o[0] = ((java.util.List<String[]>)list).stream().sorted((a, b) -> a[0].compareTo(b[0]) != 0 ? a[0].compareTo(b[0]) : Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]))).collect(java.util.stream.Collectors.toList())) != null | true)) {
                            if (((ans[v[0]] = Integer.parseInt(((String[])((java.util.List)o[0]).get(v[1] - 1))[1])) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("stn");
    }
}
